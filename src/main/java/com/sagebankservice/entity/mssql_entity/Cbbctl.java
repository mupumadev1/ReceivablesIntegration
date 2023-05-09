package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Cbbctl {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATCHID", nullable = false, length = 6)
    private String batchid;
    @Basic
    @Column(name = "AUDTDATE", nullable = false, precision = 0)
    private int audtdate;
    @Basic
    @Column(name = "AUDTTIME", nullable = false, precision = 0)
    private int audttime;
    @Basic
    @Column(name = "AUDTUSER", nullable = false, length = 8)
    private String audtuser;
    @Basic
    @Column(name = "AUDTORG", nullable = false, length = 6)
    private String audtorg;
    @Basic
    @Column(name = "BANKCODE", nullable = false, length = 12)
    private String bankcode;
    @Basic
    @Column(name = "ACTIVESW", nullable = false, length = 1)
    private String activesw;
    @Basic
    @Column(name = "TEXTDESC", nullable = false, length = 30)
    private String textdesc;
    @Basic
    @Column(name = "SRCELEDGER", nullable = false, length = 2)
    private String srceledger;
    @Basic
    @Column(name = "DATECREATE", nullable = false, precision = 0)
    private int datecreate;
    @Basic
    @Column(name = "DATEEDITED", nullable = false, precision = 0)
    private int dateedited;
    @Basic
    @Column(name = "BATCHTYPE", nullable = false)
    private short batchtype;
    @Basic
    @Column(name = "ENTRYTYPE", nullable = false)
    private short entrytype;
    @Basic
    @Column(name = "STATUS", nullable = false)
    private short status;
    @Basic
    @Column(name = "POSTSEQ", nullable = false)
    private int postseq;
    @Basic
    @Column(name = "TOTDEBIT", nullable = false, precision = 3)
    private BigDecimal totdebit;
    @Basic
    @Column(name = "TOTCREDIT", nullable = false, precision = 3)
    private BigDecimal totcredit;
    @Basic
    @Column(name = "CNTENTRY", nullable = false)
    private int cntentry;
    @Basic
    @Column(name = "NEXTENTRY", nullable = false)
    private int nextentry;
    @Basic
    @Column(name = "CNTERROR", nullable = false)
    private int cnterror;
    @Basic
    @Column(name = "BTCHDEC", nullable = false)
    private short btchdec;
    @Basic
    @Column(name = "SWPRINTDEP", nullable = false)
    private short swprintdep;
    @Basic
    @Column(name = "DEPNO", nullable = false, length = 12)
    private String depno;
    @Basic
    @Column(name = "DEPPREF", nullable = false, length = 2)
    private String deppref;
    @Basic
    @Column(name = "SWMULTLOCK", nullable = false)
    private short swmultlock;
    @Basic
    @Column(name = "DATEPOST", nullable = false, precision = 0)
    private int datepost;
    @Basic
    @Column(name = "SWTOPOST", nullable = false)
    private short swtopost;
    @Basic
    @Column(name = "ADJAMOUNT", nullable = false, precision = 3)
    private BigDecimal adjamount;
    @Basic
    @Column(name = "USERID", nullable = false, length = 8)
    private String userid;
    @Basic
    @Column(name = "SINGLEREF", nullable = false)
    private short singleref;
    @Basic
    @Column(name = "NOEFTENTRY", nullable = false)
    private int noeftentry;
    @Basic
    @Column(name = "EFTPRODATE", nullable = false, precision = 0)
    private int eftprodate;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public int getAudtdate() {
        return audtdate;
    }

    public void setAudtdate(int audtdate) {
        this.audtdate = audtdate;
    }

    public int getAudttime() {
        return audttime;
    }

    public void setAudttime(int audttime) {
        this.audttime = audttime;
    }

    public String getAudtuser() {
        return audtuser;
    }

    public void setAudtuser(String audtuser) {
        this.audtuser = audtuser;
    }

    public String getAudtorg() {
        return audtorg;
    }

    public void setAudtorg(String audtorg) {
        this.audtorg = audtorg;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getActivesw() {
        return activesw;
    }

    public void setActivesw(String activesw) {
        this.activesw = activesw;
    }

    public String getTextdesc() {
        return textdesc;
    }

    public void setTextdesc(String textdesc) {
        this.textdesc = textdesc;
    }

    public String getSrceledger() {
        return srceledger;
    }

    public void setSrceledger(String srceledger) {
        this.srceledger = srceledger;
    }

    public int getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(int datecreate) {
        this.datecreate = datecreate;
    }

    public int getDateedited() {
        return dateedited;
    }

    public void setDateedited(int dateedited) {
        this.dateedited = dateedited;
    }

    public short getBatchtype() {
        return batchtype;
    }

    public void setBatchtype(short batchtype) {
        this.batchtype = batchtype;
    }

    public short getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(short entrytype) {
        this.entrytype = entrytype;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public int getPostseq() {
        return postseq;
    }

    public void setPostseq(int postseq) {
        this.postseq = postseq;
    }

    public BigDecimal getTotdebit() {
        return totdebit;
    }

    public void setTotdebit(BigDecimal totdebit) {
        this.totdebit = totdebit;
    }

    public BigDecimal getTotcredit() {
        return totcredit;
    }

    public void setTotcredit(BigDecimal totcredit) {
        this.totcredit = totcredit;
    }

    public int getCntentry() {
        return cntentry;
    }

    public void setCntentry(int cntentry) {
        this.cntentry = cntentry;
    }

    public int getNextentry() {
        return nextentry;
    }

    public void setNextentry(int nextentry) {
        this.nextentry = nextentry;
    }

    public int getCnterror() {
        return cnterror;
    }

    public void setCnterror(int cnterror) {
        this.cnterror = cnterror;
    }

    public short getBtchdec() {
        return btchdec;
    }

    public void setBtchdec(short btchdec) {
        this.btchdec = btchdec;
    }

    public short getSwprintdep() {
        return swprintdep;
    }

    public void setSwprintdep(short swprintdep) {
        this.swprintdep = swprintdep;
    }

    public String getDepno() {
        return depno;
    }

    public void setDepno(String depno) {
        this.depno = depno;
    }

    public String getDeppref() {
        return deppref;
    }

    public void setDeppref(String deppref) {
        this.deppref = deppref;
    }

    public short getSwmultlock() {
        return swmultlock;
    }

    public void setSwmultlock(short swmultlock) {
        this.swmultlock = swmultlock;
    }

    public int getDatepost() {
        return datepost;
    }

    public void setDatepost(int datepost) {
        this.datepost = datepost;
    }

    public short getSwtopost() {
        return swtopost;
    }

    public void setSwtopost(short swtopost) {
        this.swtopost = swtopost;
    }

    public BigDecimal getAdjamount() {
        return adjamount;
    }

    public void setAdjamount(BigDecimal adjamount) {
        this.adjamount = adjamount;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public short getSingleref() {
        return singleref;
    }

    public void setSingleref(short singleref) {
        this.singleref = singleref;
    }

    public int getNoeftentry() {
        return noeftentry;
    }

    public void setNoeftentry(int noeftentry) {
        this.noeftentry = noeftentry;
    }

    public int getEftprodate() {
        return eftprodate;
    }

    public void setEftprodate(int eftprodate) {
        this.eftprodate = eftprodate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cbbctl cbbctl = (Cbbctl) o;
        return audtdate == cbbctl.audtdate && audttime == cbbctl.audttime && datecreate == cbbctl.datecreate && dateedited == cbbctl.dateedited && batchtype == cbbctl.batchtype && entrytype == cbbctl.entrytype && status == cbbctl.status && postseq == cbbctl.postseq && cntentry == cbbctl.cntentry && nextentry == cbbctl.nextentry && cnterror == cbbctl.cnterror && btchdec == cbbctl.btchdec && swprintdep == cbbctl.swprintdep && swmultlock == cbbctl.swmultlock && datepost == cbbctl.datepost && swtopost == cbbctl.swtopost && singleref == cbbctl.singleref && noeftentry == cbbctl.noeftentry && eftprodate == cbbctl.eftprodate && Objects.equals(batchid, cbbctl.batchid) && Objects.equals(audtuser, cbbctl.audtuser) && Objects.equals(audtorg, cbbctl.audtorg) && Objects.equals(bankcode, cbbctl.bankcode) && Objects.equals(activesw, cbbctl.activesw) && Objects.equals(textdesc, cbbctl.textdesc) && Objects.equals(srceledger, cbbctl.srceledger) && Objects.equals(totdebit, cbbctl.totdebit) && Objects.equals(totcredit, cbbctl.totcredit) && Objects.equals(depno, cbbctl.depno) && Objects.equals(deppref, cbbctl.deppref) && Objects.equals(adjamount, cbbctl.adjamount) && Objects.equals(userid, cbbctl.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, audtdate, audttime, audtuser, audtorg, bankcode, activesw, textdesc, srceledger, datecreate, dateedited, batchtype, entrytype, status, postseq, totdebit, totcredit, cntentry, nextentry, cnterror, btchdec, swprintdep, depno, deppref, swmultlock, datepost, swtopost, adjamount, userid, singleref, noeftentry, eftprodate);
    }
}
