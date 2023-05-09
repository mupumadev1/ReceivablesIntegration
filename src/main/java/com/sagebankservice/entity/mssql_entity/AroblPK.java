package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class AroblPK implements Serializable {
    @Column(name = "IDCUST", nullable = false, length = 12)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idcust;
    @Column(name = "IDINVC", nullable = false, length = 22)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idinvc;

    public String getIdcust() {
        return idcust;
    }

    public void setIdcust(String idcust) {
        this.idcust = idcust;
    }

    public String getIdinvc() {
        return idinvc;
    }

    public void setIdinvc(String idinvc) {
        this.idinvc = idinvc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AroblPK aroblPK = (AroblPK) o;
        return Objects.equals(idcust, aroblPK.idcust) && Objects.equals(idinvc, aroblPK.idinvc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcust, idinvc);
    }
}
