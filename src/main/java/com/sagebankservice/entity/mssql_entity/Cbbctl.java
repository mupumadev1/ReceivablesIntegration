package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cbbctl {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATCHID")
    private String batchid;
    @Basic
    @Column(name = "AUDTDATE")
    private Integer audtdate;
    @Basic
    @Column(name = "AUDTTIME")
    private Integer audttime;
    @Basic
    @Column(name = "AUDTUSER")
    private String audtuser;
    @Basic
    @Column(name = "AUDTORG")
    private String audtorg;
    @Basic
    @Column(name = "BANKCODE")
    private String bankcode;
    @Basic
    @Column(name = "ACTIVESW")
    private String activesw;
    @Basic
    @Column(name = "TEXTDESC")
    private String textdesc;
    @Basic
    @Column(name = "SRCELEDGER")
    private String srceledger;
    @Basic
    @Column(name = "DATECREATE")
    private Integer datecreate;
    @Basic
    @Column(name = "DATEEDITED")
    private Integer dateedited;
    @Basic
    @Column(name = "BATCHTYPE")
    private Short batchtype;
    @Basic
    @Column(name = "ENTRYTYPE")
    private Short entrytype;
    @Basic
    @Column(name = "STATUS")
    private Short status;
    @Basic
    @Column(name = "POSTSEQ")
    private Integer postseq;
    @Basic
    @Column(name = "TOTDEBIT")
    private BigDecimal totdebit;
    @Basic
    @Column(name = "TOTCREDIT")
    private BigDecimal totcredit;
    @Basic
    @Column(name = "CNTENTRY")
    private Integer cntentry;
    @Basic
    @Column(name = "NEXTENTRY")
    private Integer nextentry;
    @Basic
    @Column(name = "CNTERROR")
    private Integer cnterror;
    @Basic
    @Column(name = "BTCHDEC")
    private Short btchdec;
    @Basic
    @Column(name = "SWPRINTDEP")
    private Short swprintdep;
    @Basic
    @Column(name = "DEPNO")
    private String depno;
    @Basic
    @Column(name = "DEPPREF")
    private String deppref;
    @Basic
    @Column(name = "SWMULTLOCK")
    private Short swmultlock;
    @Basic
    @Column(name = "DATEPOST")
    private Integer datepost;
    @Basic
    @Column(name = "SWTOPOST")
    private Short swtopost;
    @Basic
    @Column(name = "ADJAMOUNT")
    private BigDecimal adjamount;
    @Basic
    @Column(name = "USERID")
    private String userid;
    @Basic
    @Column(name = "SINGLEREF")
    private Short singleref;
    @Basic
    @Column(name = "NOEFTENTRY")
    private Integer noeftentry;
    @Basic
    @Column(name = "EFTPRODATE")
    private Integer eftprodate;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    public Integer getAudtdate() {
        return audtdate;
    }

    public void setAudtdate(Integer audtdate) {
        this.audtdate = audtdate;
    }

    public Integer getAudttime() {
        return audttime;
    }

    public void setAudttime(Integer audttime) {
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

    public Integer getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Integer datecreate) {
        this.datecreate = datecreate;
    }

    public Integer getDateedited() {
        return dateedited;
    }

    public void setDateedited(Integer dateedited) {
        this.dateedited = dateedited;
    }

    public Short getBatchtype() {
        return batchtype;
    }

    public void setBatchtype(Short batchtype) {
        this.batchtype = batchtype;
    }

    public Short getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(Short entrytype) {
        this.entrytype = entrytype;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getPostseq() {
        return postseq;
    }

    public void setPostseq(Integer postseq) {
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

    public Integer getCntentry() {
        return cntentry;
    }

    public void setCntentry(Integer cntentry) {
        this.cntentry = cntentry;
    }

    public Integer getNextentry() {
        return nextentry;
    }

    public void setNextentry(Integer nextentry) {
        this.nextentry = nextentry;
    }

    public Integer getCnterror() {
        return cnterror;
    }

    public void setCnterror(Integer cnterror) {
        this.cnterror = cnterror;
    }

    public Short getBtchdec() {
        return btchdec;
    }

    public void setBtchdec(Short btchdec) {
        this.btchdec = btchdec;
    }

    public Short getSwprintdep() {
        return swprintdep;
    }

    public void setSwprintdep(Short swprintdep) {
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

    public Short getSwmultlock() {
        return swmultlock;
    }

    public void setSwmultlock(Short swmultlock) {
        this.swmultlock = swmultlock;
    }

    public Integer getDatepost() {
        return datepost;
    }

    public void setDatepost(Integer datepost) {
        this.datepost = datepost;
    }

    public Short getSwtopost() {
        return swtopost;
    }

    public void setSwtopost(Short swtopost) {
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

    public Short getSingleref() {
        return singleref;
    }

    public void setSingleref(Short singleref) {
        this.singleref = singleref;
    }

    public Integer getNoeftentry() {
        return noeftentry;
    }

    public void setNoeftentry(Integer noeftentry) {
        this.noeftentry = noeftentry;
    }

    public Integer getEftprodate() {
        return eftprodate;
    }

    public void setEftprodate(Integer eftprodate) {
        this.eftprodate = eftprodate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cbbctl cbbctl = (Cbbctl) o;
        return Objects.equals(batchid, cbbctl.batchid) && Objects.equals(audtdate, cbbctl.audtdate) && Objects.equals(audttime, cbbctl.audttime) && Objects.equals(audtuser, cbbctl.audtuser) && Objects.equals(audtorg, cbbctl.audtorg) && Objects.equals(bankcode, cbbctl.bankcode) && Objects.equals(activesw, cbbctl.activesw) && Objects.equals(textdesc, cbbctl.textdesc) && Objects.equals(srceledger, cbbctl.srceledger) && Objects.equals(datecreate, cbbctl.datecreate) && Objects.equals(dateedited, cbbctl.dateedited) && Objects.equals(batchtype, cbbctl.batchtype) && Objects.equals(entrytype, cbbctl.entrytype) && Objects.equals(status, cbbctl.status) && Objects.equals(postseq, cbbctl.postseq) && Objects.equals(totdebit, cbbctl.totdebit) && Objects.equals(totcredit, cbbctl.totcredit) && Objects.equals(cntentry, cbbctl.cntentry) && Objects.equals(nextentry, cbbctl.nextentry) && Objects.equals(cnterror, cbbctl.cnterror) && Objects.equals(btchdec, cbbctl.btchdec) && Objects.equals(swprintdep, cbbctl.swprintdep) && Objects.equals(depno, cbbctl.depno) && Objects.equals(deppref, cbbctl.deppref) && Objects.equals(swmultlock, cbbctl.swmultlock) && Objects.equals(datepost, cbbctl.datepost) && Objects.equals(swtopost, cbbctl.swtopost) && Objects.equals(adjamount, cbbctl.adjamount) && Objects.equals(userid, cbbctl.userid) && Objects.equals(singleref, cbbctl.singleref) && Objects.equals(noeftentry, cbbctl.noeftentry) && Objects.equals(eftprodate, cbbctl.eftprodate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, audtdate, audttime, audtuser, audtorg, bankcode, activesw, textdesc, srceledger, datecreate, dateedited, batchtype, entrytype, status, postseq, totdebit, totcredit, cntentry, nextentry, cnterror, btchdec, swprintdep, depno, deppref, swmultlock, datepost, swtopost, adjamount, userid, singleref, noeftentry, eftprodate);
    }
}
