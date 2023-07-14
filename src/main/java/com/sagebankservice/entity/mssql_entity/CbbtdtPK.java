package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class CbbtdtPK implements Serializable {
    private String batchid;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }


    private String entryno;

    public String getEntryno() {
        return entryno;
    }

    public void setEntryno(String entryno) {
        this.entryno = entryno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CbbtdtPK cbbtdtPK = (CbbtdtPK) o;
        return Objects.equals(batchid, cbbtdtPK.batchid) && Objects.equals(entryno, cbbtdtPK.entryno) && Objects.equals(detailno, cbbtdtPK.detailno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, detailno);
    }

    private String detailno;

    public String getDetailno() {
        return detailno;
    }

    public void setDetailno(String detailno) {
        this.detailno = detailno;
    }
}
