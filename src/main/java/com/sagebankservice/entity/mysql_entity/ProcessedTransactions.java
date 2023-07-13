package com.sagebankservice.entity.mysql_entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "processed_transactions", schema = "sageservice", catalog = "")
public class ProcessedTransactions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "processed", nullable = false, length = -1)
    private String processed;
    @Basic
    @Column(name = "status", nullable = true)
    private Integer status;
    @Basic
    @Column(name = "customerName", nullable = true, length = 255)
    private String customerName;
    @Basic
    @Column(name = "customer_no", nullable = false, length = 255)
    private String customerNo;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "amount", nullable = false, length = 255)
    private String amount;
    @Basic
    @Column(name = "transId", nullable = false, length = 255)
    private String transId;
    @Basic
    @Column(name = "transDate", nullable = false, length = 255)
    private String transDate;
    @Basic
    @Column(name = "entryDate", nullable = false)
    private Timestamp entryDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessed() {
        return processed;
    }

    public void setProcessed(String processed) {
        this.processed = processed;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public Timestamp getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Timestamp entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessedTransactions that = (ProcessedTransactions) o;
        return id == that.id && Objects.equals(processed, that.processed) && Objects.equals(status, that.status) && Objects.equals(customerName, that.customerName) && Objects.equals(customerNo, that.customerNo) && Objects.equals(name, that.name) && Objects.equals(amount, that.amount) && Objects.equals(transId, that.transId) && Objects.equals(transDate, that.transDate) && Objects.equals(entryDate, that.entryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processed, status, customerName, customerNo, name, amount, transId, transDate, entryDate);
    }
}
