package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class CbbtmsPK implements Serializable {
    @Column(name = "BATCHID", nullable = false, length = 6)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String batchid;
    @Column(name = "ENTRYNO", nullable = false, length = 5)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String entryno;
    @Column(name = "DETAILNO", nullable = false, length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String detailno;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public String getEntryno() {
        return entryno;
    }

    public void setEntryno(String entryno) {
        this.entryno = entryno;
    }

    public String getDetailno() {
        return detailno;
    }

    public void setDetailno(String detailno) {
        this.detailno = detailno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CbbtmsPK cbbtmsPK = (CbbtmsPK) o;
        return Objects.equals(batchid, cbbtmsPK.batchid) && Objects.equals(entryno, cbbtmsPK.entryno) && Objects.equals(detailno, cbbtmsPK.detailno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, detailno);
    }
}
