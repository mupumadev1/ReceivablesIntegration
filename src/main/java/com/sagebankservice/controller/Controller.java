package com.sagebankservice.controller;

import com.sagebankservice.dto.TransactionResponse;
import com.sagebankservice.dto.Transactions;
import com.sagebankservice.service.Service;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Objects;

@RestController
@AllArgsConstructor
@RequestMapping("/api/postCBTxn")
public class Controller {
    private HttpServletRequest request;
    private final JavaMailSender mailSender;
    private String getClientIp() {

        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }
    private final Service service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public TransactionResponse postTransaction(@RequestBody Transactions transactions){
        TransactionResponse transactionResponse = new TransactionResponse();
        try {
            if (!Objects.equals(transactions.getId(), "")) {
                if (!Objects.equals(transactions.getName(), "")){
                    if(!Objects.equals(transactions.getTransId(), "")){
                        if(!Objects.equals(transactions.getTransDate(), "")){
                            if (service.checkDocumentsTransactionId(transactions.getTransId())) {
                                if (service.checkCashbookTransactionId(transactions.getTransactionId())) {
                                    if (service.checkCustomerNumber(transactions.getId())) {
                                        int batch = service.getBatchID();
                                        if (service.insertCbbctl(transactions, String.valueOf(batch)) && service.insertCbbtdt(transactions, String.valueOf(batch)) && service.insertCbbthd(transactions, String.valueOf(batch))&&service.insertCbbtms(transactions, String.valueOf(batch)))
                                        {
                                            String Batch = Integer.toString(++batch);
                                            service.updateCashbookOptions(Batch);
                                            service.updateProcessedTransaction(transactions,1,"Succesfully Processed");
                                            transactionResponse.setResponseCode(200);
                                            transactionResponse.setResponseMessage("saved successfully");
                                            return transactionResponse;
                                        }
                                    }
                                    else {
                                        int ncbatch = service.getBatchID();
                                        if (service.insertNcCbbctl(transactions, String.valueOf(ncbatch))&&
                                        service.insertNcCbbtdt(transactions, String.valueOf(ncbatch))&&
                                        service.insertNcCbbthd(transactions, String.valueOf(ncbatch))&&
                                        service.insertNcCbbtms(transactions, String.valueOf(ncbatch))){
                                            final String Batch = Integer.toString(++ncbatch);
                                            service.updateCashbookOptions(Batch);
                                            service.updateProcessedTransaction(transactions,1,"Succesfully Processed");
                                            transactionResponse.setResponseCode(200);
                                            transactionResponse.setResponseMessage("saved successfully");
                                            return transactionResponse;
                                        }

                                    }
                                } else {

                                    service.updateProcessedTransaction(transactions,-1, "Transaction Already Processed");
                                    transactionResponse.setResponseCode(409);
                                    transactionResponse.setResponseMessage("Already Reported");
                                    return transactionResponse;
                                }
                            } else {

                                service.updateProcessedTransaction(transactions, -3, "Transaction ID Already Existed in Sage" );
                                transactionResponse.setResponseCode(409);
                                transactionResponse.setResponseMessage("Already Reported");
                                return transactionResponse;
                            }
                        }
                        else{

                            service.updateProcessedTransaction(transactions, 0, "Transaction information missing transaction date" );
                            transactionResponse.setResponseCode(403);
                            transactionResponse.setResponseMessage("Missing Information");
                            return transactionResponse;
                        }
                    }
                    else{
                        service.updateProcessedTransaction(transactions, 0,"Transaction information missing transaction ID");
                        transactionResponse.setResponseCode(403);
                        transactionResponse.setResponseMessage("Missing Information");
                        return transactionResponse;
                    }
                }
                else{

                    service.updateProcessedTransaction(transactions ,0, "Transaction information missing remarks" );
                    transactionResponse.setResponseCode(403);
                    transactionResponse.setResponseMessage("Missing Information");
                    return transactionResponse;
                }
            }

            else {


                service.updateProcessedTransaction(transactions, 0, "Transaction information missing customer number" );
                transactionResponse.setResponseCode(403);
                transactionResponse.setResponseMessage("Missing Information");
                return transactionResponse;
            }

        }
        catch (Exception e) {
            transactionResponse.setResponseCode(500);
            transactionResponse.setResponseMessage("Internal Server Error");
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setText("Error Code: 500 " +
                        "Error Details: "+e.getMessage());
            msg.setTo("seriterk@gmail.com");
            msg.setSubject("Bank Service Error");
            mailSender.send(msg);
            return transactionResponse;
        }
        return null;
    }

}
