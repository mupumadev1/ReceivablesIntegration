package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
public class CbbthdPK implements Serializable {
    private String batchid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CbbthdPK cbbthdPK = (CbbthdPK) o;
        return Objects.equals(batchid, cbbthdPK.batchid) && Objects.equals(entryno, cbbthdPK.entryno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno);
    }

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
}
