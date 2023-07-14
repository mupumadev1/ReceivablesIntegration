package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class CbbtmsPK implements Serializable {
    private String batchid;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
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

    private String entryno;

    public String getEntryno() {
        return entryno;
    }

    public void setEntryno(String entryno) {
        this.entryno = entryno;
    }


    private String detailno;

    public String getDetailno() {
        return detailno;
    }

    public void setDetailno(String detailno) {
        this.detailno = detailno;
    }
}
