package com.sagebankservice.service;

import com.sagebankservice.dto.Transactions;
import com.sagebankservice.entity.mssql_entity.*;
import com.sagebankservice.entity.mysql_entity.ProcessedTransactions;
import com.sagebankservice.repository.mssql_repo.*;
import com.sagebankservice.repository.mysql_repo.ProcessedTransactionsRespository;
import lombok.RequiredArgsConstructor;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;


@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final String bankCode = "16210";
    private final CbbctlRepository cbbctlRepository;
    private final CbbtdtRepository cbbtdtRepository;
    private final CbbthdRepository cbbthdRepository;
    private final CbbtmsRepository cbbtmsRepository;
    private final ProcessedTransactionsRespository processedTransactionsRespository;
    private final ArcusRepository arcusRepository;
    private final AroblRepository aroblRepository;
    private final CboptioRepository cboptioRepository;


    public Boolean checkDocumentsTransactionId(String transId) {
        String result;
        result = String.valueOf(aroblRepository.findDistinctByDescinvc(transId));
        if (result.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean checkCashbookTransactionId(String transId) {
        String result;
        result = String.valueOf(cbbthdRepository.findDistinctByReference(transId));
        if (result.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    public Boolean checkCustomerNumber(String customerNo){
        String result;
        result = String.valueOf(arcusRepository.findByIdcust(customerNo));
        if (result.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    //Function to update processed transactions table
    public void updateProcessedTransaction(Transactions transactions, int status, String message) {
        Optional<ProcessedTransactions> result = processedTransactionsRespository.findProcessedTransactionsByTransId(transactions.getTransId());
        if (result.isPresent()) {
            ProcessedTransactions processedTransactions = result.get();
            processedTransactions.setProcessed(message);
            processedTransactions.setStatus(status);
            processedTransactionsRespository.save(processedTransactions);
        }
    }

    public int getBatchID() {
        Long maxID = cbbctlRepository.findMaxBatchId();
        int maxId = maxID.intValue();
        return ++maxId;
    }

    public void updateCashbookOptions(String batch) {
        Optional<Cboptio> result = cboptioRepository.findByOptionid("CB01");
        if (result.isPresent()) {
            Cboptio cboptio = result.get();
            cboptio.setNbtchnum(Integer.parseInt(batch));
            cboptioRepository.save(cboptio);
        }

    }

    public int currentDate() {
        LocalDate date0 = LocalDate.now();
        String dateString = date0.toString();
        String cleanedDate = dateString.replaceAll(("-*"), "");
        int date = Integer.parseInt(cleanedDate);
        return date;
    }

    public String currentTime() {
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmssSS");
        String time1 = sdf.format(date1);
        String time = time1.substring(0, 8);
        return time;
    }

    public int[] getMonthYear() {
        LocalDate date0 = LocalDate.now();
        int[] monthYear = new int[2];
        monthYear[0] = date0.getMonthValue();
        monthYear[1] = date0.getYear();
        return monthYear;
    }

    public Boolean insertCbbthd(Transactions transactions, String batch) {
        BigDecimal amount = BigDecimal.valueOf(transactions.getAmount());
        int date = currentDate();
        String time = currentTime();
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];
        String period = Integer.toString(month);
        String fiscyr = Integer.toString(year);
        Cbbthd cbbthd = Cbbthd.builder()
                .batchid(batch)
                .entryno("00001")
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .entrytype((short) 2)
                .reference(transactions.getTransactionId())
                .period(period)
                .date(date)
                .datechqprn(0)
                .swchqprn((short) 0)
                .misccode(transactions.getId())
                .textdesc(transactions.getName())
                .distcode("")
                .chargecode("01")
                .chrgamount(BigDecimal.valueOf(0))
                .nodetails(1)
                .totamount(amount)
                .tottax(BigDecimal.valueOf(0))
                .taxpercnt(BigDecimal.valueOf(0))
                .bk2Glcurhm("ZMW")
                .bk2Glrttyp("SP")
                .bk2Glcursr("ZMW")
                .bk2Gldate(date)
                .bk2Glrate(BigDecimal.valueOf(1))
                .bk2Glsprd(BigDecimal.valueOf(0))
                .bk2Glop((short) 1)
                .bk2Gldtmth((short) 3)
                .bt2Glcurhm("ZMW")
                .bt2Glrttyp("SP")
                .bt2Glcursr("ZMW")
                .bt2Gldate(date)
                .bt2Glrate(BigDecimal.valueOf(1))
                .bt2Glsprd(BigDecimal.valueOf(0))
                .bt2Glop((short) 1)
                .bt2Gldtmth((short) 3)
                .ms2Glcurhm("ZMW")
                .ms2Glrttyp("SP")
                .ms2Glcursr("ZMW")
                .ms2Gldate(date)
                .ms2Glrate(BigDecimal.valueOf(1))
                .ms2Glsprd(BigDecimal.valueOf(0))
                .ms2Glop((short) 1)
                .ms2Gldtmth((short) 3)
                .swcash((short) 0)
                .btchnodec((short) 2)
                .miscnodec((short) 2)
                .taxgroup("")
                .custchqno(transactions.getTransId())
                .nosubdetl(0)
                .applamount(BigDecimal.valueOf(0))
                .appldisc(BigDecimal.valueOf(0))
                .acctnat("1")
                .adjamount(amount)
                .profileid("1")
                .swinterco((short) 1)
                .fiscyr(fiscyr)
                .cctype("")
                .ccnumber("")
                .ccname("")
                .ccexp(Integer.parseInt(""))
                .ccauthcode("")
                .xccnumber("")
                .serial(Integer.parseInt(""))
                .bankamount(amount)
                .btchamount(amount)
                .miscamount(amount)
                .funcamount(amount)
                .hdrdebit(amount)
                .hdrcredit(BigDecimal.valueOf(0))
                .taxauth1("")
                .taxauth2("")
                .taxauth3("")
                .taxauth4("")
                .taxauth5("")
                .txau1Desc("")
                .txau2Desc("")
                .txau3Desc("")
                .txau4Desc("")
                .txau5Desc("")
                .taxclass1((short) 1)
                .taxclass2((short) 1)
                .taxclass3((short) 1)
                .taxclass4((short) 1)
                .taxclass5((short) 1)
                .basetax1(BigDecimal.valueOf(0))
                .basetax2(BigDecimal.valueOf(0))
                .basetax3(BigDecimal.valueOf(0))
                .basetax4(BigDecimal.valueOf(0))
                .basetax5(BigDecimal.valueOf(0))
                .amttax1(BigDecimal.valueOf(0))
                .amttax2(BigDecimal.valueOf(0))
                .amttax3(BigDecimal.valueOf(0))
                .amttax4(BigDecimal.valueOf(0))
                .amttax5(BigDecimal.valueOf(0))
                .swtaxincl1((short) 0)
                .swtaxincl2((short) 0)
                .swtaxincl3((short) 0)
                .swtaxincl4((short) 0)
                .swtaxincl5((short) 0)
                .bankcode(bankCode)
                .swposted((short) 0)
                .values(0)
                .processcmd((short) 0)
                .totunappl(BigDecimal.valueOf(0))
                .totapplamt(BigDecimal.valueOf(0))
                .totappldsc(BigDecimal.valueOf(0))
                .allocmode((short) 0)
                .allocamt(BigDecimal.valueOf(0))
                .classtype(Short.parseShort(""))
                .classaxis(Short.parseShort(""))
                .datalevel(Short.parseShort(""))
                .recxcnter(0)
                .raterc(null)
                .ratetyperc("")
                .rateoprc((short) 0)
                .ratedaterc(Integer.parseInt(""))
                .codecurnrc("ZMW")
                .txamt1Rc(BigDecimal.valueOf(0))
                .txamt2Rc(BigDecimal.valueOf(0))
                .txamt3Rc(BigDecimal.valueOf(0))
                .txamt4Rc(BigDecimal.valueOf(0))
                .txamt5Rc(BigDecimal.valueOf(0))
                .txtotrc(BigDecimal.valueOf(0))
                .txallrc(BigDecimal.valueOf(0))
                .txexprc(BigDecimal.valueOf(0))
                .txrecrc(BigDecimal.valueOf(0))
                .amtrectax(amount)
                .amtexptax(BigDecimal.valueOf(0))
                .txbse1Hc(BigDecimal.valueOf(0))
                .txbse2Hc(BigDecimal.valueOf(0))
                .txbse3Hc(BigDecimal.valueOf(0))
                .txbse4Hc(BigDecimal.valueOf(0))
                .txbse5Hc(BigDecimal.valueOf(0))
                .txamt1Hc(BigDecimal.valueOf(0))
                .txamt2Hc(BigDecimal.valueOf(0))
                .txamt3Hc(BigDecimal.valueOf(0))
                .txamt4Hc(BigDecimal.valueOf(0))
                .txamt5Hc(BigDecimal.valueOf(0))
                .acctrec1("")
                .acctrec2("")
                .acctrec3("")
                .acctrec4("")
                .acctrec5("")
                .acctexp1("")
                .acctexp2("")
                .acctexp3("")
                .acctexp4("")
                .acctexp5("")
                .txexcltc(BigDecimal.valueOf(0))
                .txexclhc(BigDecimal.valueOf(0))
                .txexclbc(BigDecimal.valueOf(0))
                .txexclmc(BigDecimal.valueOf(0))
                .txincltc(BigDecimal.valueOf(0))
                .txinclhc(BigDecimal.valueOf(0))
                .txinclbc(BigDecimal.valueOf(0))
                .txinclmc(BigDecimal.valueOf(0))
                .arapbatch("")
                .arapentry("")
                .swcheque((short) 0)
                .sweft((short) 0)
                .rxmtchseq(Short.parseShort(""))
                .rxtrnscode("")
                .rxcategory("")
                .revuniq(Integer.parseInt(""))
                .newrevuniq(Integer.parseInt(""))
                .enteredby("ADMIN")
                .build();
        Cbbthd savedObject = cbbthdRepository.save(cbbthd);
        Optional<Cbbthd> fetchedObject = cbbthdRepository.findByBatchid(savedObject.getBatchid());
        if (fetchedObject.isPresent()){
            System.out.print("saved batch header");
            return true;

        }
        else {
            System.out.print("batch header not saved");
            return false;
        }
    }
    public Boolean insertCbbctl(Transactions transactions, String batch){
        int date = currentDate();
        BigDecimal amount = BigDecimal.valueOf(transactions.getAmount());
        String time = currentTime();
        String textdesc = "";
        if (transactions.getName().length() > 30) {
            textdesc =  transactions.getName().substring(0, 30);
        } else {
            textdesc =  transactions.getName();
        }
        Cbbctl cbbctl = Cbbctl.builder()
                .batchid(batch)
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .bankcode(bankCode)
                .activesw("A")
                .textdesc(textdesc)
                .srceledger("CB")
                .datecreate(date)
                .dateedited(date)
                .batchtype((short) 0)
                .entrytype((short) 2)
                .status((short) 0)
                .postseq(0)
                .totdebit(amount)
                .totcredit(BigDecimal.valueOf(0.0))
                .cntentry(1)
                .nextentry(2)
                .cnterror(0)
                .btchdec((short) 3)
                .swprintdep(Short.parseShort(""))
                .depno("DP")
                .deppref(String.valueOf(0))
                .swmultlock((short) 0)
                .datepost(date)
                .swtopost((short) 0)
                .adjamount(BigDecimal.valueOf(0.0))
                .userid("ADMIN")
                .singleref((short) 0)
                .noeftentry(0)
                .eftprodate(date)
                .build();
        Cbbctl savedObject = cbbctlRepository.save(cbbctl);
        Optional<Cbbctl> fetchedObject = cbbctlRepository.findByBatchid(savedObject.getBatchid());
        if (fetchedObject.isPresent()){
            System.out.print("saved cashbook line information");
            return true;

        }
        else{
            System.out.print("failed to save cashbook line information");
            return false;

        }
    }
    public Boolean insertCbbtdt(Transactions transactions, String batch){
        int date = currentDate();
        BigDecimal amount = BigDecimal.valueOf(transactions.getAmount());
        String time = currentTime();
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];
        String srce = transactions.getDepType();
        String transDate = "Receipt Processed on "+transactions.getTransDate().substring(0,10);
        Cbbtdt cbbtdt = Cbbtdt.builder()
                .batchid(batch)
                .entryno("00001")
                .detailno("0000000200")
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .srcecode(srce)
                .textdesc(transactions.getName())
                .acctid("40020")
                .taxcode("01")
                .taxtype((short) 0)
                .taxpercnt(BigDecimal.valueOf(0.0))
                .taxamount(BigDecimal.valueOf(0.0))
                .dtlamount(amount)
                .quantity(BigDecimal.valueOf(0.0))
                .comments(transDate)
                .rcptno("")
                .swcash((short) 0)
                .rcptdesc("")
                .misccode("")
                .miscbkline(Integer.parseInt(""))
                .rcptentry(String.valueOf(2))
                .acctiduf("")
                .allocmode((short) 0)
                .acctdesc("")
                .acctqtysw(Short.parseShort(""))
                .accttax("")
                .accttaxuf("")
                .taxdesc("")
                .taxqtysw((short) 0)
                .adjamount(BigDecimal.valueOf(0.0))
                .swjob(Short.parseShort(""))
                .debitamt(BigDecimal.valueOf(0.0))
                .creditamt(BigDecimal.valueOf(0.0))
                .swallocate((short) 1)
                .pjcamt(BigDecimal.valueOf(0.0))
                .pjcdisc(BigDecimal.valueOf(0.0))
                .entrytype((short) 2)
                .docnumber("")
                .tottax(BigDecimal.valueOf(0))
                .swmanltx(Short.parseShort(""))
                .basetax1(BigDecimal.valueOf(0.0))
                .basetax2(BigDecimal.valueOf(0.0))
                .basetax3(BigDecimal.valueOf(0.0))
                .basetax4(BigDecimal.valueOf(0.0))
                .basetax5(BigDecimal.valueOf(0.0))
                .taxclass1((short) 1)
                .taxclass2((short) 1)
                .taxclass3((short) 1)
                .taxclass4((short) 1)
                .taxclass5((short) 1)
                .swtaxincl1((short) 0)
                .swtaxincl2((short) 0)
                .swtaxincl3((short) 0)
                .swtaxincl4((short) 0)
                .swtaxincl5((short) 0)
                .ratetax1(BigDecimal.valueOf(1.0))
                .ratetax2(BigDecimal.valueOf(1.0))
                .ratetax3(BigDecimal.valueOf(1.0))
                .ratetax4(BigDecimal.valueOf(1.0))
                .ratetax5(BigDecimal.valueOf(1.0))
                .amttax1(BigDecimal.valueOf(0.0))
                .amttax2(BigDecimal.valueOf(0.0))
                .amttax3(BigDecimal.valueOf(0.0))
                .amttax4(BigDecimal.valueOf(0.0))
                .amttax5(BigDecimal.valueOf(0.0))
                .misctax1(BigDecimal.valueOf(0.0))
                .misctax2(BigDecimal.valueOf(0.0))
                .misctax3(BigDecimal.valueOf(0.0))
                .misctax4(BigDecimal.valueOf(0.0))
                .misctax5(BigDecimal.valueOf(0.0))
                .gltaxamt1(BigDecimal.valueOf(0.0))
                .gltaxamt2(BigDecimal.valueOf(0.0))
                .gltaxamt3(BigDecimal.valueOf(0.0))
                .gltaxamt4(BigDecimal.valueOf(0.0))
                .gltaxamt5(BigDecimal.valueOf(0.0))
                .bktaxamt1(BigDecimal.valueOf(0.0))
                .bktaxamt2(BigDecimal.valueOf(0.0))
                .bktaxamt3(BigDecimal.valueOf(0.0))
                .bktaxamt4(BigDecimal.valueOf(0.0))
                .bktaxamt5(BigDecimal.valueOf(0.0))
                .tcamtinctx(BigDecimal.valueOf(0.0))
                .glamtinctx(BigDecimal.valueOf(0.0))
                .bkamtinctx(BigDecimal.valueOf(0.0))
                .msamtinctx(BigDecimal.valueOf(0.0))
                .miscamount(amount)
                .glamount(amount)
                .bkamount(amount)
                .totapplamt(BigDecimal.valueOf(0.0))
                .totappldsc(BigDecimal.valueOf(0.0))
                .totunappl(BigDecimal.valueOf(0.0))
                .pjccost(BigDecimal.valueOf(0.0))
                .nosubdetl(0)
                .values(0)
                .processcmd((short) 0)
                .amttaxrec1(BigDecimal.valueOf(0.0))
                .amttaxrec2(BigDecimal.valueOf(0.0))
                .amttaxrec3(BigDecimal.valueOf(0.0))
                .amttaxrec4(BigDecimal.valueOf(0.0))
                .amttaxrec5(BigDecimal.valueOf(0.0))
                .amttaxexp1(BigDecimal.valueOf(0.0))
                .amttaxexp2(BigDecimal.valueOf(0.0))
                .amttaxexp3(BigDecimal.valueOf(0.0))
                .amttaxexp4(BigDecimal.valueOf(0.0))
                .amttaxexp5(BigDecimal.valueOf(0.0))
                .amttaxtobe(BigDecimal.valueOf(0.0))
                .txamt1Rc(BigDecimal.valueOf(0.0))
                .txamt2Rc(BigDecimal.valueOf(0.0))
                .txamt3Rc(BigDecimal.valueOf(0.0))
                .txamt4Rc(BigDecimal.valueOf(0.0))
                .txamt5Rc(BigDecimal.valueOf(0.0))
                .txtotrc(BigDecimal.valueOf(0.0))
                .txallrc(BigDecimal.valueOf(0.0))
                .txexp1Rc(BigDecimal.valueOf(0.0))
                .txexp2Rc(BigDecimal.valueOf(0.0))
                .txexp3Rc(BigDecimal.valueOf(0.0))
                .txexp4Rc(BigDecimal.valueOf(0.0))
                .txexp5Rc(BigDecimal.valueOf(0.0))
                .txrec1Rc(BigDecimal.valueOf(0.0))
                .txrec2Rc(BigDecimal.valueOf(0.0))
                .txrec3Rc(BigDecimal.valueOf(0.0))
                .txrec4Rc(BigDecimal.valueOf(0.0))
                .txrec5Rc(BigDecimal.valueOf(0.0))
                .txbse1Hc(BigDecimal.valueOf(0.0))
                .txbse2Hc(BigDecimal.valueOf(0.0))
                .txbse3Hc(BigDecimal.valueOf(0.0))
                .txbse4Hc(BigDecimal.valueOf(0.0))
                .txbse5Hc(BigDecimal.valueOf(0.0))
                .txrec1Hc(BigDecimal.valueOf(0.0))
                .txrec2Hc(BigDecimal.valueOf(0.0))
                .txrec3Hc(BigDecimal.valueOf(0.0))
                .txrec4Hc(BigDecimal.valueOf(0.0))
                .txrec5Hc(BigDecimal.valueOf(0.0))
                .txexp1Hc(BigDecimal.valueOf(0.0))
                .txexp2Hc(BigDecimal.valueOf(0.0))
                .txexp3Hc(BigDecimal.valueOf(0.0))
                .txexp4Hc(BigDecimal.valueOf(0.0))
                .txexp5Hc(BigDecimal.valueOf(0.0))
                .txallhc(BigDecimal.valueOf(0.0))
                .txall1Hc(BigDecimal.valueOf(0.0))
                .txall2Hc(BigDecimal.valueOf(0.0))
                .txall3Hc(BigDecimal.valueOf(0.0))
                .txall4Hc(BigDecimal.valueOf(0.0))
                .txall5Hc(BigDecimal.valueOf(0.0))
                .txall1Tc(BigDecimal.valueOf(0.0))
                .txall2Tc(BigDecimal.valueOf(0.0))
                .txall3Tc(BigDecimal.valueOf(0.0))
                .txall4Tc(BigDecimal.valueOf(0.0))
                .txall5Tc(BigDecimal.valueOf(0.0))
                .txexcltc(BigDecimal.valueOf(0.0))
                .txexclhc(BigDecimal.valueOf(0.0))
                .txexclbc(BigDecimal.valueOf(0.0))
                .txexclmc(BigDecimal.valueOf(0.0))
                .revuniq(0)
                .newrevuniq(0)
                .rvdetailno("")
                .build();
        Cbbtdt savedObject = cbbtdtRepository.save(cbbtdt);
        Optional<Cbbtdt> fetchObject = cbbtdtRepository.findByBatchid(savedObject.getBatchid());
        if (fetchObject.isPresent()){
            return true;
        }
        else{
            return false;
        }

    }
    public Boolean insertCbbtms(Transactions transactions, String batch){
        int date = currentDate();
        String time = currentTime();
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];

        Cbbtms cbbtms = Cbbtms.builder()
                .batchid(batch)
                .entryno("00001")
                .detailno("0000000200")
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .misccode(transactions.getId())
                .name(transactions.getName())
                .address1("")
                .address2("")
                .address3("")
                .address4("")
                .postcode("")
                .phone1("")
                .phone2("")
                .faxnumber("")
                .contact("")
                .comments("")
                .swkeeptot((short) 0)
                .acctrow(1)
                .acctname("")
                .acctno("")
                .city("")
                .state("")
                .country("")
                .emailaddr("")
                .urladdr("")
                .swapproved((short) 0)
                .eftdesc("")
                .bankname("")
                .account("")
                .branch("")
                .acctype(Short.parseShort(""))
                .bankid("")
                .swiftcty("")
                .paydetl("")
                .addinfo1("")
                .addinfo2("")
                .covertype(Short.parseShort(""))
                .coverinfo("")
                .bencode("")
                .eitype(Short.parseShort(""))
                .bopcatg("")
                .bopref("")
                .bopdesc("")
                .brn("")
                .idn("")
                .build();
        Cbbtms savedObject = cbbtmsRepository.save(cbbtms);
        Optional<Cbbtms> fetchedObject = cbbtmsRepository.findByBatchid(savedObject.getBatchid());
        if (fetchedObject.isPresent()){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean insertNcCbbthd(Transactions transactions, String batch) {
        int date = currentDate();
        BigDecimal amount = BigDecimal.valueOf(transactions.getAmount());
        String time = currentTime();
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];
        String period = Integer.toString(month);
        String fiscyr = Integer.toString(year);
        Cbbthd cbbthd = Cbbthd.builder()
                .batchid(batch)
                .entryno("00001")
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .entrytype((short) 2)
                .reference(transactions.getTransactionId())
                .period(period)
                .date(date)
                .datechqprn(0)
                .swchqprn((short) 0)
                .misccode("")
                .textdesc(transactions.getName())
                .distcode("")
                .chargecode("01")
                .chrgamount(BigDecimal.valueOf(0))
                .nodetails(1)
                .totamount(amount)
                .tottax(BigDecimal.valueOf(0))
                .taxpercnt(BigDecimal.valueOf(0))
                .bk2Glcurhm("ZMW")
                .bk2Glrttyp("SP")
                .bk2Glcursr("ZMW")
                .bk2Gldate(date)
                .bk2Glrate(BigDecimal.valueOf(1))
                .bk2Glsprd(BigDecimal.valueOf(0))
                .bk2Glop((short) 1)
                .bk2Gldtmth((short) 3)
                .bt2Glcurhm("ZMW")
                .bt2Glrttyp("SP")
                .bt2Glcursr("ZMW")
                .bt2Gldate(date)
                .bt2Glrate(BigDecimal.valueOf(1))
                .bt2Glsprd(BigDecimal.valueOf(0))
                .bt2Glop((short) 1)
                .bt2Gldtmth((short) 3)
                .ms2Glcurhm("ZMW")
                .ms2Glrttyp("SP")
                .ms2Glcursr("ZMW")
                .ms2Gldate(date)
                .ms2Glrate(BigDecimal.valueOf(1))
                .ms2Glsprd(BigDecimal.valueOf(0))
                .ms2Glop((short) 1)
                .ms2Gldtmth((short) 3)
                .swcash((short) 0)
                .btchnodec((short) 2)
                .miscnodec((short) 2)
                .taxgroup("")
                .custchqno("")
                .nosubdetl(0)
                .applamount(BigDecimal.valueOf(0))
                .appldisc(BigDecimal.valueOf(0))
                .acctnat("1")
                .adjamount(amount)
                .profileid("1")
                .swinterco((short) 1)
                .fiscyr(fiscyr)
                .cctype("")
                .ccnumber("")
                .ccname("")
                .ccexp(Integer.parseInt(""))
                .ccauthcode("")
                .xccnumber("")
                .serial(Integer.parseInt(""))
                .bankamount(amount)
                .btchamount(amount)
                .miscamount(amount)
                .funcamount(amount)
                .hdrdebit(amount)
                .hdrcredit(BigDecimal.valueOf(0))
                .taxauth1("")
                .taxauth2("")
                .taxauth3("")
                .taxauth4("")
                .taxauth5("")
                .txau1Desc("")
                .txau2Desc("")
                .txau3Desc("")
                .txau4Desc("")
                .txau5Desc("")
                .taxclass1((short) 1)
                .taxclass2((short) 1)
                .taxclass3((short) 1)
                .taxclass4((short) 1)
                .taxclass5((short) 1)
                .basetax1(BigDecimal.valueOf(0))
                .basetax2(BigDecimal.valueOf(0))
                .basetax3(BigDecimal.valueOf(0))
                .basetax4(BigDecimal.valueOf(0))
                .basetax5(BigDecimal.valueOf(0))
                .amttax1(BigDecimal.valueOf(0))
                .amttax2(BigDecimal.valueOf(0))
                .amttax3(BigDecimal.valueOf(0))
                .amttax4(BigDecimal.valueOf(0))
                .amttax5(BigDecimal.valueOf(0))
                .swtaxincl1((short) 0)
                .swtaxincl2((short) 0)
                .swtaxincl3((short) 0)
                .swtaxincl4((short) 0)
                .swtaxincl5((short) 0)
                .bankcode(bankCode)
                .swposted((short) 0)
                .values(0)
                .processcmd((short) 0)
                .totunappl(BigDecimal.valueOf(0))
                .totapplamt(BigDecimal.valueOf(0))
                .totappldsc(BigDecimal.valueOf(0))
                .allocmode((short) 0)
                .allocamt(BigDecimal.valueOf(0))
                .classtype(Short.parseShort(""))
                .classaxis(Short.parseShort(""))
                .datalevel(Short.parseShort(""))
                .recxcnter(0)
                .raterc(null)
                .ratetyperc("")
                .rateoprc((short) 0)
                .ratedaterc(Integer.parseInt(""))
                .codecurnrc("ZMW")
                .txamt1Rc(BigDecimal.valueOf(0))
                .txamt2Rc(BigDecimal.valueOf(0))
                .txamt3Rc(BigDecimal.valueOf(0))
                .txamt4Rc(BigDecimal.valueOf(0))
                .txamt5Rc(BigDecimal.valueOf(0))
                .txtotrc(BigDecimal.valueOf(0))
                .txallrc(BigDecimal.valueOf(0))
                .txexprc(BigDecimal.valueOf(0))
                .txrecrc(BigDecimal.valueOf(0))
                .amtrectax(amount)
                .amtexptax(BigDecimal.valueOf(0))
                .txbse1Hc(BigDecimal.valueOf(0))
                .txbse2Hc(BigDecimal.valueOf(0))
                .txbse3Hc(BigDecimal.valueOf(0))
                .txbse4Hc(BigDecimal.valueOf(0))
                .txbse5Hc(BigDecimal.valueOf(0))
                .txamt1Hc(BigDecimal.valueOf(0))
                .txamt2Hc(BigDecimal.valueOf(0))
                .txamt3Hc(BigDecimal.valueOf(0))
                .txamt4Hc(BigDecimal.valueOf(0))
                .txamt5Hc(BigDecimal.valueOf(0))
                .acctrec1("")
                .acctrec2("")
                .acctrec3("")
                .acctrec4("")
                .acctrec5("")
                .acctexp1("")
                .acctexp2("")
                .acctexp3("")
                .acctexp4("")
                .acctexp5("")
                .txexcltc(BigDecimal.valueOf(0))
                .txexclhc(BigDecimal.valueOf(0))
                .txexclbc(BigDecimal.valueOf(0))
                .txexclmc(BigDecimal.valueOf(0))
                .txincltc(BigDecimal.valueOf(0))
                .txinclhc(BigDecimal.valueOf(0))
                .txinclbc(BigDecimal.valueOf(0))
                .txinclmc(BigDecimal.valueOf(0))
                .arapbatch("")
                .arapentry("")
                .swcheque((short) 0)
                .sweft((short) 0)
                .rxmtchseq(Short.parseShort(""))
                .rxtrnscode("")
                .rxcategory("")
                .revuniq(Integer.parseInt(""))
                .newrevuniq(Integer.parseInt(""))
                .enteredby("ADMIN")
                .build();
        Cbbthd savedObject = cbbthdRepository.save(cbbthd);
        Optional<Cbbthd> fetchedObject = cbbthdRepository.findByBatchid(savedObject.getBatchid());
        if (fetchedObject.isPresent()){
            System.out.print("saved batch header");
            return true;

        }
        else {
            System.out.print("batch header not saved");
            return false;
        }
    }
    public Boolean insertNcCbbctl(Transactions transactions, String batch){
        BigDecimal amount = BigDecimal.valueOf(transactions.getAmount());
        int date = currentDate();
        String time = currentTime();
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];
        String textdesc = "";
        if (transactions.getName().length() > 30) {
            textdesc =  transactions.getName().substring(0, 30);
        } else {
            textdesc =  transactions.getName();
        }
        Cbbctl cbbctl = Cbbctl.builder()
                .batchid(batch)
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .bankcode(bankCode)
                .activesw("A")
                .textdesc(textdesc)
                .srceledger("CB")
                .datecreate(date)
                .dateedited(date)
                .batchtype((short) 0)
                .entrytype((short) 2)
                .status((short) 0)
                .postseq(0)
                .totdebit(amount)
                .totcredit(BigDecimal.valueOf(0.0))
                .cntentry(1)
                .nextentry(2)
                .cnterror(0)
                .btchdec((short) 3)
                .swprintdep(Short.parseShort(""))
                .depno("DP")
                .deppref(String.valueOf(0))
                .swmultlock((short) 0)
                .datepost(date)
                .swtopost((short) 0)
                .adjamount(BigDecimal.valueOf(0.0))
                .userid("ADMIN")
                .singleref((short) 0)
                .noeftentry(0)
                .eftprodate(date)
                .build();
        Cbbctl savedObject = cbbctlRepository.save(cbbctl);
        Optional<Cbbctl> fetchedObject = cbbctlRepository.findByBatchid(savedObject.getBatchid());
        if (fetchedObject.isPresent()){
            System.out.print("saved cashbook line information");
            return true;

        }
        else{
            System.out.print("failed to save cashbook line information");
            return false;

        }
    }
    public Boolean insertNcCbbtdt(Transactions transactions, String batch){
        int date = currentDate();
        String time = currentTime();
        BigDecimal amount = BigDecimal.valueOf(transactions.getAmount());
        String srce = transactions.getDepType();
        String transDate = "Receipt Processed on "+transactions.getTransDate().substring(0,10);
        Cbbtdt cbbtdt = Cbbtdt.builder()
                .batchid(batch)
                .entryno("00001")
                .detailno("0000000200")
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .srcecode(srce)
                .textdesc(transactions.getName())
                .acctid("40020")
                .taxcode("01")
                .taxtype((short) 0)
                .taxpercnt(BigDecimal.valueOf(0.0))
                .taxamount(BigDecimal.valueOf(0.0))
                .dtlamount(amount)
                .quantity(BigDecimal.valueOf(0.0))
                .comments(transDate)
                .rcptno("")
                .swcash((short) 0)
                .rcptdesc("")
                .misccode("")
                .miscbkline(Integer.parseInt(""))
                .rcptentry(String.valueOf(2))
                .acctiduf("")
                .allocmode((short) 0)
                .acctdesc("")
                .acctqtysw(Short.parseShort(""))
                .accttax("")
                .accttaxuf("")
                .taxdesc("")
                .taxqtysw((short) 0)
                .adjamount(BigDecimal.valueOf(0.0))
                .swjob(Short.parseShort(""))
                .debitamt(BigDecimal.valueOf(0.0))
                .creditamt(BigDecimal.valueOf(0.0))
                .swallocate((short) 1)
                .pjcamt(BigDecimal.valueOf(0.0))
                .pjcdisc(BigDecimal.valueOf(0.0))
                .entrytype((short) 2)
                .docnumber("")
                .tottax(BigDecimal.valueOf(0))
                .swmanltx(Short.parseShort(""))
                .basetax1(BigDecimal.valueOf(0.0))
                .basetax2(BigDecimal.valueOf(0.0))
                .basetax3(BigDecimal.valueOf(0.0))
                .basetax4(BigDecimal.valueOf(0.0))
                .basetax5(BigDecimal.valueOf(0.0))
                .taxclass1((short) 1)
                .taxclass2((short) 1)
                .taxclass3((short) 1)
                .taxclass4((short) 1)
                .taxclass5((short) 1)
                .swtaxincl1((short) 0)
                .swtaxincl2((short) 0)
                .swtaxincl3((short) 0)
                .swtaxincl4((short) 0)
                .swtaxincl5((short) 0)
                .ratetax1(BigDecimal.valueOf(1.0))
                .ratetax2(BigDecimal.valueOf(1.0))
                .ratetax3(BigDecimal.valueOf(1.0))
                .ratetax4(BigDecimal.valueOf(1.0))
                .ratetax5(BigDecimal.valueOf(1.0))
                .amttax1(BigDecimal.valueOf(0.0))
                .amttax2(BigDecimal.valueOf(0.0))
                .amttax3(BigDecimal.valueOf(0.0))
                .amttax4(BigDecimal.valueOf(0.0))
                .amttax5(BigDecimal.valueOf(0.0))
                .misctax1(BigDecimal.valueOf(0.0))
                .misctax2(BigDecimal.valueOf(0.0))
                .misctax3(BigDecimal.valueOf(0.0))
                .misctax4(BigDecimal.valueOf(0.0))
                .misctax5(BigDecimal.valueOf(0.0))
                .gltaxamt1(BigDecimal.valueOf(0.0))
                .gltaxamt2(BigDecimal.valueOf(0.0))
                .gltaxamt3(BigDecimal.valueOf(0.0))
                .gltaxamt4(BigDecimal.valueOf(0.0))
                .gltaxamt5(BigDecimal.valueOf(0.0))
                .bktaxamt1(BigDecimal.valueOf(0.0))
                .bktaxamt2(BigDecimal.valueOf(0.0))
                .bktaxamt3(BigDecimal.valueOf(0.0))
                .bktaxamt4(BigDecimal.valueOf(0.0))
                .bktaxamt5(BigDecimal.valueOf(0.0))
                .tcamtinctx(BigDecimal.valueOf(0.0))
                .glamtinctx(BigDecimal.valueOf(0.0))
                .bkamtinctx(BigDecimal.valueOf(0.0))
                .msamtinctx(BigDecimal.valueOf(0.0))
                .miscamount(amount)
                .glamount(amount)
                .bkamount(amount)
                .totapplamt(BigDecimal.valueOf(0.0))
                .totappldsc(BigDecimal.valueOf(0.0))
                .totunappl(BigDecimal.valueOf(0.0))
                .pjccost(BigDecimal.valueOf(0.0))
                .nosubdetl(0)
                .values(0)
                .processcmd((short) 0)
                .amttaxrec1(BigDecimal.valueOf(0.0))
                .amttaxrec2(BigDecimal.valueOf(0.0))
                .amttaxrec3(BigDecimal.valueOf(0.0))
                .amttaxrec4(BigDecimal.valueOf(0.0))
                .amttaxrec5(BigDecimal.valueOf(0.0))
                .amttaxexp1(BigDecimal.valueOf(0.0))
                .amttaxexp2(BigDecimal.valueOf(0.0))
                .amttaxexp3(BigDecimal.valueOf(0.0))
                .amttaxexp4(BigDecimal.valueOf(0.0))
                .amttaxexp5(BigDecimal.valueOf(0.0))
                .amttaxtobe(BigDecimal.valueOf(0.0))
                .txamt1Rc(BigDecimal.valueOf(0.0))
                .txamt2Rc(BigDecimal.valueOf(0.0))
                .txamt3Rc(BigDecimal.valueOf(0.0))
                .txamt4Rc(BigDecimal.valueOf(0.0))
                .txamt5Rc(BigDecimal.valueOf(0.0))
                .txtotrc(BigDecimal.valueOf(0.0))
                .txallrc(BigDecimal.valueOf(0.0))
                .txexp1Rc(BigDecimal.valueOf(0.0))
                .txexp2Rc(BigDecimal.valueOf(0.0))
                .txexp3Rc(BigDecimal.valueOf(0.0))
                .txexp4Rc(BigDecimal.valueOf(0.0))
                .txexp5Rc(BigDecimal.valueOf(0.0))
                .txrec1Rc(BigDecimal.valueOf(0.0))
                .txrec2Rc(BigDecimal.valueOf(0.0))
                .txrec3Rc(BigDecimal.valueOf(0.0))
                .txrec4Rc(BigDecimal.valueOf(0.0))
                .txrec5Rc(BigDecimal.valueOf(0.0))
                .txbse1Hc(BigDecimal.valueOf(0.0))
                .txbse2Hc(BigDecimal.valueOf(0.0))
                .txbse3Hc(BigDecimal.valueOf(0.0))
                .txbse4Hc(BigDecimal.valueOf(0.0))
                .txbse5Hc(BigDecimal.valueOf(0.0))
                .txrec1Hc(BigDecimal.valueOf(0.0))
                .txrec2Hc(BigDecimal.valueOf(0.0))
                .txrec3Hc(BigDecimal.valueOf(0.0))
                .txrec4Hc(BigDecimal.valueOf(0.0))
                .txrec5Hc(BigDecimal.valueOf(0.0))
                .txexp1Hc(BigDecimal.valueOf(0.0))
                .txexp2Hc(BigDecimal.valueOf(0.0))
                .txexp3Hc(BigDecimal.valueOf(0.0))
                .txexp4Hc(BigDecimal.valueOf(0.0))
                .txexp5Hc(BigDecimal.valueOf(0.0))
                .txallhc(BigDecimal.valueOf(0.0))
                .txall1Hc(BigDecimal.valueOf(0.0))
                .txall2Hc(BigDecimal.valueOf(0.0))
                .txall3Hc(BigDecimal.valueOf(0.0))
                .txall4Hc(BigDecimal.valueOf(0.0))
                .txall5Hc(BigDecimal.valueOf(0.0))
                .txall1Tc(BigDecimal.valueOf(0.0))
                .txall2Tc(BigDecimal.valueOf(0.0))
                .txall3Tc(BigDecimal.valueOf(0.0))
                .txall4Tc(BigDecimal.valueOf(0.0))
                .txall5Tc(BigDecimal.valueOf(0.0))
                .txexcltc(BigDecimal.valueOf(0.0))
                .txexclhc(BigDecimal.valueOf(0.0))
                .txexclbc(BigDecimal.valueOf(0.0))
                .txexclmc(BigDecimal.valueOf(0.0))
                .revuniq(0)
                .newrevuniq(0)
                .rvdetailno("")
                .build();
        Cbbtdt savedObject = cbbtdtRepository.save(cbbtdt);
        Optional<Cbbtdt> fetchObject = cbbtdtRepository.findByBatchid(savedObject.getBatchid());
        if (fetchObject.isPresent()){
            return true;
        }
        else{
            return false;
        }

    }
    public Boolean insertNcCbbtms(Transactions transactions, String batch){
        int date = currentDate();
        String time = currentTime();
        int month = getMonthYear()[0];
        int year = getMonthYear()[1];

        Cbbtms cbbtms = Cbbtms.builder()
                .batchid(batch)
                .entryno("00001")
                .detailno("0000000200")
                .audtdate(date)
                .audttime(Integer.parseInt(time))
                .audtuser("ADMIN")
                .audtorg("TSTDAT")
                .misccode(transactions.getId())
                .name(transactions.getName())
                .address1("")
                .address2("")
                .address3("")
                .address4("")
                .postcode("")
                .phone1("")
                .phone2("")
                .faxnumber("")
                .contact("")
                .comments("")
                .swkeeptot((short) 0)
                .acctrow(1)
                .acctname("")
                .acctno("")
                .city("")
                .state("")
                .country("")
                .emailaddr("")
                .urladdr("")
                .swapproved((short) 0)
                .eftdesc("")
                .bankname("")
                .account("")
                .branch("")
                .acctype(Short.parseShort(""))
                .bankid("")
                .swiftcty("")
                .paydetl("")
                .addinfo1("")
                .addinfo2("")
                .covertype(Short.parseShort(""))
                .coverinfo("")
                .bencode("")
                .eitype(Short.parseShort(""))
                .bopcatg("")
                .bopref("")
                .bopdesc("")
                .brn("")
                .idn("")
                .build();
        Cbbtms savedObject = cbbtmsRepository.save(cbbtms);
        Optional<Cbbtms> fetchedObject = cbbtmsRepository.findByBatchid(savedObject.getBatchid());
        if (fetchedObject.isPresent()){
            return true;
        }
        else {
            return false;
        }
    }
}