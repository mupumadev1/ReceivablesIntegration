package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CBBCTL", schema = "dbo", catalog = "TSTDAT")
public class CbbctlEntity {
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
        CbbctlEntity that = (CbbctlEntity) o;
        return Objects.equals(batchid, that.batchid) && Objects.equals(audtdate, that.audtdate) && Objects.equals(audttime, that.audttime) && Objects.equals(audtuser, that.audtuser) && Objects.equals(audtorg, that.audtorg) && Objects.equals(bankcode, that.bankcode) && Objects.equals(activesw, that.activesw) && Objects.equals(textdesc, that.textdesc) && Objects.equals(srceledger, that.srceledger) && Objects.equals(datecreate, that.datecreate) && Objects.equals(dateedited, that.dateedited) && Objects.equals(batchtype, that.batchtype) && Objects.equals(entrytype, that.entrytype) && Objects.equals(status, that.status) && Objects.equals(postseq, that.postseq) && Objects.equals(totdebit, that.totdebit) && Objects.equals(totcredit, that.totcredit) && Objects.equals(cntentry, that.cntentry) && Objects.equals(nextentry, that.nextentry) && Objects.equals(cnterror, that.cnterror) && Objects.equals(btchdec, that.btchdec) && Objects.equals(swprintdep, that.swprintdep) && Objects.equals(depno, that.depno) && Objects.equals(deppref, that.deppref) && Objects.equals(swmultlock, that.swmultlock) && Objects.equals(datepost, that.datepost) && Objects.equals(swtopost, that.swtopost) && Objects.equals(adjamount, that.adjamount) && Objects.equals(userid, that.userid) && Objects.equals(singleref, that.singleref) && Objects.equals(noeftentry, that.noeftentry) && Objects.equals(eftprodate, that.eftprodate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, audtdate, audttime, audtuser, audtorg, bankcode, activesw, textdesc, srceledger, datecreate, dateedited, batchtype, entrytype, status, postseq, totdebit, totcredit, cntentry, nextentry, cnterror, btchdec, swprintdep, depno, deppref, swmultlock, datepost, swtopost, adjamount, userid, singleref, noeftentry, eftprodate);
    }
}
