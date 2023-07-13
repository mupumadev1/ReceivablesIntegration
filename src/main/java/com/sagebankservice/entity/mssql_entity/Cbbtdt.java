package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@IdClass(com.sagebankservice.entity.mssql_entity.CbbtdtPK.class)
public class Cbbtdt {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "BATCHID")
    private String batchid;

    public String getBatchid() {
        return batchid;
    }

    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "ENTRYNO")
    private String entryno;

    public String getEntryno() {
        return entryno;
    }

    public void setEntryno(String entryno) {
        this.entryno = entryno;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "DETAILNO")
    private String detailno;

    public String getDetailno() {
        return detailno;
    }

    public void setDetailno(String detailno) {
        this.detailno = detailno;
    }

    @Basic
    @Column(name = "AUDTDATE")
    private Integer audtdate;

    public Integer getAudtdate() {
        return audtdate;
    }

    public void setAudtdate(Integer audtdate) {
        this.audtdate = audtdate;
    }

    @Basic
    @Column(name = "AUDTTIME")
    private Integer audttime;

    public Integer getAudttime() {
        return audttime;
    }

    public void setAudttime(Integer audttime) {
        this.audttime = audttime;
    }

    @Basic
    @Column(name = "AUDTUSER")
    private String audtuser;

    public String getAudtuser() {
        return audtuser;
    }

    public void setAudtuser(String audtuser) {
        this.audtuser = audtuser;
    }

    @Basic
    @Column(name = "AUDTORG")
    private String audtorg;

    public String getAudtorg() {
        return audtorg;
    }

    public void setAudtorg(String audtorg) {
        this.audtorg = audtorg;
    }

    @Basic
    @Column(name = "SRCECODE")
    private String srcecode;

    public String getSrcecode() {
        return srcecode;
    }

    public void setSrcecode(String srcecode) {
        this.srcecode = srcecode;
    }

    @Basic
    @Column(name = "TEXTDESC")
    private String textdesc;

    public String getTextdesc() {
        return textdesc;
    }

    public void setTextdesc(String textdesc) {
        this.textdesc = textdesc;
    }

    @Basic
    @Column(name = "ACCTID")
    private String acctid;

    public String getAcctid() {
        return acctid;
    }

    public void setAcctid(String acctid) {
        this.acctid = acctid;
    }

    @Basic
    @Column(name = "TAXCODE")
    private String taxcode;

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    @Basic
    @Column(name = "TAXTYPE")
    private Short taxtype;

    public Short getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(Short taxtype) {
        this.taxtype = taxtype;
    }

    @Basic
    @Column(name = "TAXPERCNT")
    private BigDecimal taxpercnt;

    public BigDecimal getTaxpercnt() {
        return taxpercnt;
    }

    public void setTaxpercnt(BigDecimal taxpercnt) {
        this.taxpercnt = taxpercnt;
    }

    @Basic
    @Column(name = "TAXAMOUNT")
    private BigDecimal taxamount;

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    @Basic
    @Column(name = "DTLAMOUNT")
    private BigDecimal dtlamount;

    public BigDecimal getDtlamount() {
        return dtlamount;
    }

    public void setDtlamount(BigDecimal dtlamount) {
        this.dtlamount = dtlamount;
    }

    @Basic
    @Column(name = "QUANTITY")
    private BigDecimal quantity;

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "COMMENTS")
    private String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "RCPTNO")
    private String rcptno;

    public String getRcptno() {
        return rcptno;
    }

    public void setRcptno(String rcptno) {
        this.rcptno = rcptno;
    }

    @Basic
    @Column(name = "SWCASH")
    private Short swcash;

    public Short getSwcash() {
        return swcash;
    }

    public void setSwcash(Short swcash) {
        this.swcash = swcash;
    }

    @Basic
    @Column(name = "RCPTDESC")
    private String rcptdesc;

    public String getRcptdesc() {
        return rcptdesc;
    }

    public void setRcptdesc(String rcptdesc) {
        this.rcptdesc = rcptdesc;
    }

    @Basic
    @Column(name = "MISCCODE")
    private String misccode;

    public String getMisccode() {
        return misccode;
    }

    public void setMisccode(String misccode) {
        this.misccode = misccode;
    }

    @Basic
    @Column(name = "MISCBKLINE")
    private Integer miscbkline;

    public Integer getMiscbkline() {
        return miscbkline;
    }

    public void setMiscbkline(Integer miscbkline) {
        this.miscbkline = miscbkline;
    }

    @Basic
    @Column(name = "RCPTENTRY")
    private String rcptentry;

    public String getRcptentry() {
        return rcptentry;
    }

    public void setRcptentry(String rcptentry) {
        this.rcptentry = rcptentry;
    }

    @Basic
    @Column(name = "ACCTIDUF")
    private String acctiduf;

    public String getAcctiduf() {
        return acctiduf;
    }

    public void setAcctiduf(String acctiduf) {
        this.acctiduf = acctiduf;
    }

    @Basic
    @Column(name = "ALLOCMODE")
    private Short allocmode;

    public Short getAllocmode() {
        return allocmode;
    }

    public void setAllocmode(Short allocmode) {
        this.allocmode = allocmode;
    }

    @Basic
    @Column(name = "ACCTDESC")
    private String acctdesc;

    public String getAcctdesc() {
        return acctdesc;
    }

    public void setAcctdesc(String acctdesc) {
        this.acctdesc = acctdesc;
    }

    @Basic
    @Column(name = "ACCTQTYSW")
    private Short acctqtysw;

    public Short getAcctqtysw() {
        return acctqtysw;
    }

    public void setAcctqtysw(Short acctqtysw) {
        this.acctqtysw = acctqtysw;
    }

    @Basic
    @Column(name = "ACCTTAX")
    private String accttax;

    public String getAccttax() {
        return accttax;
    }

    public void setAccttax(String accttax) {
        this.accttax = accttax;
    }

    @Basic
    @Column(name = "ACCTTAXUF")
    private String accttaxuf;

    public String getAccttaxuf() {
        return accttaxuf;
    }

    public void setAccttaxuf(String accttaxuf) {
        this.accttaxuf = accttaxuf;
    }

    @Basic
    @Column(name = "TAXDESC")
    private String taxdesc;

    public String getTaxdesc() {
        return taxdesc;
    }

    public void setTaxdesc(String taxdesc) {
        this.taxdesc = taxdesc;
    }

    @Basic
    @Column(name = "TAXQTYSW")
    private Short taxqtysw;

    public Short getTaxqtysw() {
        return taxqtysw;
    }

    public void setTaxqtysw(Short taxqtysw) {
        this.taxqtysw = taxqtysw;
    }

    @Basic
    @Column(name = "ADJAMOUNT")
    private BigDecimal adjamount;

    public BigDecimal getAdjamount() {
        return adjamount;
    }

    public void setAdjamount(BigDecimal adjamount) {
        this.adjamount = adjamount;
    }

    @Basic
    @Column(name = "SWJOB")
    private Short swjob;

    public Short getSwjob() {
        return swjob;
    }

    public void setSwjob(Short swjob) {
        this.swjob = swjob;
    }

    @Basic
    @Column(name = "DEBITAMT")
    private BigDecimal debitamt;

    public BigDecimal getDebitamt() {
        return debitamt;
    }

    public void setDebitamt(BigDecimal debitamt) {
        this.debitamt = debitamt;
    }

    @Basic
    @Column(name = "CREDITAMT")
    private BigDecimal creditamt;

    public BigDecimal getCreditamt() {
        return creditamt;
    }

    public void setCreditamt(BigDecimal creditamt) {
        this.creditamt = creditamt;
    }

    @Basic
    @Column(name = "SWALLOCATE")
    private Short swallocate;

    public Short getSwallocate() {
        return swallocate;
    }

    public void setSwallocate(Short swallocate) {
        this.swallocate = swallocate;
    }

    @Basic
    @Column(name = "PJCAMT")
    private BigDecimal pjcamt;

    public BigDecimal getPjcamt() {
        return pjcamt;
    }

    public void setPjcamt(BigDecimal pjcamt) {
        this.pjcamt = pjcamt;
    }

    @Basic
    @Column(name = "PJCDISC")
    private BigDecimal pjcdisc;

    public BigDecimal getPjcdisc() {
        return pjcdisc;
    }

    public void setPjcdisc(BigDecimal pjcdisc) {
        this.pjcdisc = pjcdisc;
    }

    @Basic
    @Column(name = "ENTRYTYPE")
    private Short entrytype;

    public Short getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(Short entrytype) {
        this.entrytype = entrytype;
    }

    @Basic
    @Column(name = "DOCNUMBER")
    private String docnumber;

    public String getDocnumber() {
        return docnumber;
    }

    public void setDocnumber(String docnumber) {
        this.docnumber = docnumber;
    }

    @Basic
    @Column(name = "TOTTAX")
    private BigDecimal tottax;

    public BigDecimal getTottax() {
        return tottax;
    }

    public void setTottax(BigDecimal tottax) {
        this.tottax = tottax;
    }

    @Basic
    @Column(name = "SWMANLTX")
    private Short swmanltx;

    public Short getSwmanltx() {
        return swmanltx;
    }

    public void setSwmanltx(Short swmanltx) {
        this.swmanltx = swmanltx;
    }

    @Basic
    @Column(name = "BASETAX1")
    private BigDecimal basetax1;

    public BigDecimal getBasetax1() {
        return basetax1;
    }

    public void setBasetax1(BigDecimal basetax1) {
        this.basetax1 = basetax1;
    }

    @Basic
    @Column(name = "BASETAX2")
    private BigDecimal basetax2;

    public BigDecimal getBasetax2() {
        return basetax2;
    }

    public void setBasetax2(BigDecimal basetax2) {
        this.basetax2 = basetax2;
    }

    @Basic
    @Column(name = "BASETAX3")
    private BigDecimal basetax3;

    public BigDecimal getBasetax3() {
        return basetax3;
    }

    public void setBasetax3(BigDecimal basetax3) {
        this.basetax3 = basetax3;
    }

    @Basic
    @Column(name = "BASETAX4")
    private BigDecimal basetax4;

    public BigDecimal getBasetax4() {
        return basetax4;
    }

    public void setBasetax4(BigDecimal basetax4) {
        this.basetax4 = basetax4;
    }

    @Basic
    @Column(name = "BASETAX5")
    private BigDecimal basetax5;

    public BigDecimal getBasetax5() {
        return basetax5;
    }

    public void setBasetax5(BigDecimal basetax5) {
        this.basetax5 = basetax5;
    }

    @Basic
    @Column(name = "TAXCLASS1")
    private Short taxclass1;

    public Short getTaxclass1() {
        return taxclass1;
    }

    public void setTaxclass1(Short taxclass1) {
        this.taxclass1 = taxclass1;
    }

    @Basic
    @Column(name = "TAXCLASS2")
    private Short taxclass2;

    public Short getTaxclass2() {
        return taxclass2;
    }

    public void setTaxclass2(Short taxclass2) {
        this.taxclass2 = taxclass2;
    }

    @Basic
    @Column(name = "TAXCLASS3")
    private Short taxclass3;

    public Short getTaxclass3() {
        return taxclass3;
    }

    public void setTaxclass3(Short taxclass3) {
        this.taxclass3 = taxclass3;
    }

    @Basic
    @Column(name = "TAXCLASS4")
    private Short taxclass4;

    public Short getTaxclass4() {
        return taxclass4;
    }

    public void setTaxclass4(Short taxclass4) {
        this.taxclass4 = taxclass4;
    }

    @Basic
    @Column(name = "TAXCLASS5")
    private Short taxclass5;

    public Short getTaxclass5() {
        return taxclass5;
    }

    public void setTaxclass5(Short taxclass5) {
        this.taxclass5 = taxclass5;
    }

    @Basic
    @Column(name = "SWTAXINCL1")
    private Short swtaxincl1;

    public Short getSwtaxincl1() {
        return swtaxincl1;
    }

    public void setSwtaxincl1(Short swtaxincl1) {
        this.swtaxincl1 = swtaxincl1;
    }

    @Basic
    @Column(name = "SWTAXINCL2")
    private Short swtaxincl2;

    public Short getSwtaxincl2() {
        return swtaxincl2;
    }

    public void setSwtaxincl2(Short swtaxincl2) {
        this.swtaxincl2 = swtaxincl2;
    }

    @Basic
    @Column(name = "SWTAXINCL3")
    private Short swtaxincl3;

    public Short getSwtaxincl3() {
        return swtaxincl3;
    }

    public void setSwtaxincl3(Short swtaxincl3) {
        this.swtaxincl3 = swtaxincl3;
    }

    @Basic
    @Column(name = "SWTAXINCL4")
    private Short swtaxincl4;

    public Short getSwtaxincl4() {
        return swtaxincl4;
    }

    public void setSwtaxincl4(Short swtaxincl4) {
        this.swtaxincl4 = swtaxincl4;
    }

    @Basic
    @Column(name = "SWTAXINCL5")
    private Short swtaxincl5;

    public Short getSwtaxincl5() {
        return swtaxincl5;
    }

    public void setSwtaxincl5(Short swtaxincl5) {
        this.swtaxincl5 = swtaxincl5;
    }

    @Basic
    @Column(name = "RATETAX1")
    private BigDecimal ratetax1;

    public BigDecimal getRatetax1() {
        return ratetax1;
    }

    public void setRatetax1(BigDecimal ratetax1) {
        this.ratetax1 = ratetax1;
    }

    @Basic
    @Column(name = "RATETAX2")
    private BigDecimal ratetax2;

    public BigDecimal getRatetax2() {
        return ratetax2;
    }

    public void setRatetax2(BigDecimal ratetax2) {
        this.ratetax2 = ratetax2;
    }

    @Basic
    @Column(name = "RATETAX3")
    private BigDecimal ratetax3;

    public BigDecimal getRatetax3() {
        return ratetax3;
    }

    public void setRatetax3(BigDecimal ratetax3) {
        this.ratetax3 = ratetax3;
    }

    @Basic
    @Column(name = "RATETAX4")
    private BigDecimal ratetax4;

    public BigDecimal getRatetax4() {
        return ratetax4;
    }

    public void setRatetax4(BigDecimal ratetax4) {
        this.ratetax4 = ratetax4;
    }

    @Basic
    @Column(name = "RATETAX5")
    private BigDecimal ratetax5;

    public BigDecimal getRatetax5() {
        return ratetax5;
    }

    public void setRatetax5(BigDecimal ratetax5) {
        this.ratetax5 = ratetax5;
    }

    @Basic
    @Column(name = "AMTTAX1")
    private BigDecimal amttax1;

    public BigDecimal getAmttax1() {
        return amttax1;
    }

    public void setAmttax1(BigDecimal amttax1) {
        this.amttax1 = amttax1;
    }

    @Basic
    @Column(name = "AMTTAX2")
    private BigDecimal amttax2;

    public BigDecimal getAmttax2() {
        return amttax2;
    }

    public void setAmttax2(BigDecimal amttax2) {
        this.amttax2 = amttax2;
    }

    @Basic
    @Column(name = "AMTTAX3")
    private BigDecimal amttax3;

    public BigDecimal getAmttax3() {
        return amttax3;
    }

    public void setAmttax3(BigDecimal amttax3) {
        this.amttax3 = amttax3;
    }

    @Basic
    @Column(name = "AMTTAX4")
    private BigDecimal amttax4;

    public BigDecimal getAmttax4() {
        return amttax4;
    }

    public void setAmttax4(BigDecimal amttax4) {
        this.amttax4 = amttax4;
    }

    @Basic
    @Column(name = "AMTTAX5")
    private BigDecimal amttax5;

    public BigDecimal getAmttax5() {
        return amttax5;
    }

    public void setAmttax5(BigDecimal amttax5) {
        this.amttax5 = amttax5;
    }

    @Basic
    @Column(name = "MISCTAX1")
    private BigDecimal misctax1;

    public BigDecimal getMisctax1() {
        return misctax1;
    }

    public void setMisctax1(BigDecimal misctax1) {
        this.misctax1 = misctax1;
    }

    @Basic
    @Column(name = "MISCTAX2")
    private BigDecimal misctax2;

    public BigDecimal getMisctax2() {
        return misctax2;
    }

    public void setMisctax2(BigDecimal misctax2) {
        this.misctax2 = misctax2;
    }

    @Basic
    @Column(name = "MISCTAX3")
    private BigDecimal misctax3;

    public BigDecimal getMisctax3() {
        return misctax3;
    }

    public void setMisctax3(BigDecimal misctax3) {
        this.misctax3 = misctax3;
    }

    @Basic
    @Column(name = "MISCTAX4")
    private BigDecimal misctax4;

    public BigDecimal getMisctax4() {
        return misctax4;
    }

    public void setMisctax4(BigDecimal misctax4) {
        this.misctax4 = misctax4;
    }

    @Basic
    @Column(name = "MISCTAX5")
    private BigDecimal misctax5;

    public BigDecimal getMisctax5() {
        return misctax5;
    }

    public void setMisctax5(BigDecimal misctax5) {
        this.misctax5 = misctax5;
    }

    @Basic
    @Column(name = "GLTAXAMT1")
    private BigDecimal gltaxamt1;

    public BigDecimal getGltaxamt1() {
        return gltaxamt1;
    }

    public void setGltaxamt1(BigDecimal gltaxamt1) {
        this.gltaxamt1 = gltaxamt1;
    }

    @Basic
    @Column(name = "GLTAXAMT2")
    private BigDecimal gltaxamt2;

    public BigDecimal getGltaxamt2() {
        return gltaxamt2;
    }

    public void setGltaxamt2(BigDecimal gltaxamt2) {
        this.gltaxamt2 = gltaxamt2;
    }

    @Basic
    @Column(name = "GLTAXAMT3")
    private BigDecimal gltaxamt3;

    public BigDecimal getGltaxamt3() {
        return gltaxamt3;
    }

    public void setGltaxamt3(BigDecimal gltaxamt3) {
        this.gltaxamt3 = gltaxamt3;
    }

    @Basic
    @Column(name = "GLTAXAMT4")
    private BigDecimal gltaxamt4;

    public BigDecimal getGltaxamt4() {
        return gltaxamt4;
    }

    public void setGltaxamt4(BigDecimal gltaxamt4) {
        this.gltaxamt4 = gltaxamt4;
    }

    @Basic
    @Column(name = "GLTAXAMT5")
    private BigDecimal gltaxamt5;

    public BigDecimal getGltaxamt5() {
        return gltaxamt5;
    }

    public void setGltaxamt5(BigDecimal gltaxamt5) {
        this.gltaxamt5 = gltaxamt5;
    }

    @Basic
    @Column(name = "BKTAXAMT1")
    private BigDecimal bktaxamt1;

    public BigDecimal getBktaxamt1() {
        return bktaxamt1;
    }

    public void setBktaxamt1(BigDecimal bktaxamt1) {
        this.bktaxamt1 = bktaxamt1;
    }

    @Basic
    @Column(name = "BKTAXAMT2")
    private BigDecimal bktaxamt2;

    public BigDecimal getBktaxamt2() {
        return bktaxamt2;
    }

    public void setBktaxamt2(BigDecimal bktaxamt2) {
        this.bktaxamt2 = bktaxamt2;
    }

    @Basic
    @Column(name = "BKTAXAMT3")
    private BigDecimal bktaxamt3;

    public BigDecimal getBktaxamt3() {
        return bktaxamt3;
    }

    public void setBktaxamt3(BigDecimal bktaxamt3) {
        this.bktaxamt3 = bktaxamt3;
    }

    @Basic
    @Column(name = "BKTAXAMT4")
    private BigDecimal bktaxamt4;

    public BigDecimal getBktaxamt4() {
        return bktaxamt4;
    }

    public void setBktaxamt4(BigDecimal bktaxamt4) {
        this.bktaxamt4 = bktaxamt4;
    }

    @Basic
    @Column(name = "BKTAXAMT5")
    private BigDecimal bktaxamt5;

    public BigDecimal getBktaxamt5() {
        return bktaxamt5;
    }

    public void setBktaxamt5(BigDecimal bktaxamt5) {
        this.bktaxamt5 = bktaxamt5;
    }

    @Basic
    @Column(name = "TCAMTINCTX")
    private BigDecimal tcamtinctx;

    public BigDecimal getTcamtinctx() {
        return tcamtinctx;
    }

    public void setTcamtinctx(BigDecimal tcamtinctx) {
        this.tcamtinctx = tcamtinctx;
    }

    @Basic
    @Column(name = "GLAMTINCTX")
    private BigDecimal glamtinctx;

    public BigDecimal getGlamtinctx() {
        return glamtinctx;
    }

    public void setGlamtinctx(BigDecimal glamtinctx) {
        this.glamtinctx = glamtinctx;
    }

    @Basic
    @Column(name = "BKAMTINCTX")
    private BigDecimal bkamtinctx;

    public BigDecimal getBkamtinctx() {
        return bkamtinctx;
    }

    public void setBkamtinctx(BigDecimal bkamtinctx) {
        this.bkamtinctx = bkamtinctx;
    }

    @Basic
    @Column(name = "MSAMTINCTX")
    private BigDecimal msamtinctx;

    public BigDecimal getMsamtinctx() {
        return msamtinctx;
    }

    public void setMsamtinctx(BigDecimal msamtinctx) {
        this.msamtinctx = msamtinctx;
    }

    @Basic
    @Column(name = "MISCAMOUNT")
    private BigDecimal miscamount;

    public BigDecimal getMiscamount() {
        return miscamount;
    }

    public void setMiscamount(BigDecimal miscamount) {
        this.miscamount = miscamount;
    }

    @Basic
    @Column(name = "GLAMOUNT")
    private BigDecimal glamount;

    public BigDecimal getGlamount() {
        return glamount;
    }

    public void setGlamount(BigDecimal glamount) {
        this.glamount = glamount;
    }

    @Basic
    @Column(name = "BKAMOUNT")
    private BigDecimal bkamount;

    public BigDecimal getBkamount() {
        return bkamount;
    }

    public void setBkamount(BigDecimal bkamount) {
        this.bkamount = bkamount;
    }

    @Basic
    @Column(name = "TOTAPPLAMT")
    private BigDecimal totapplamt;

    public BigDecimal getTotapplamt() {
        return totapplamt;
    }

    public void setTotapplamt(BigDecimal totapplamt) {
        this.totapplamt = totapplamt;
    }

    @Basic
    @Column(name = "TOTAPPLDSC")
    private BigDecimal totappldsc;

    public BigDecimal getTotappldsc() {
        return totappldsc;
    }

    public void setTotappldsc(BigDecimal totappldsc) {
        this.totappldsc = totappldsc;
    }

    @Basic
    @Column(name = "TOTUNAPPL")
    private BigDecimal totunappl;

    public BigDecimal getTotunappl() {
        return totunappl;
    }

    public void setTotunappl(BigDecimal totunappl) {
        this.totunappl = totunappl;
    }

    @Basic
    @Column(name = "PJCCOST")
    private BigDecimal pjccost;

    public BigDecimal getPjccost() {
        return pjccost;
    }

    public void setPjccost(BigDecimal pjccost) {
        this.pjccost = pjccost;
    }

    @Basic
    @Column(name = "NOSUBDETL")
    private Integer nosubdetl;

    public Integer getNosubdetl() {
        return nosubdetl;
    }

    public void setNosubdetl(Integer nosubdetl) {
        this.nosubdetl = nosubdetl;
    }

    @Basic
    @Column(name = "VALUES")
    private Integer values;

    public Integer getValues() {
        return values;
    }

    public void setValues(Integer values) {
        this.values = values;
    }

    @Basic
    @Column(name = "PROCESSCMD")
    private Short processcmd;

    public Short getProcesscmd() {
        return processcmd;
    }

    public void setProcesscmd(Short processcmd) {
        this.processcmd = processcmd;
    }

    @Basic
    @Column(name = "AMTTAXREC1")
    private BigDecimal amttaxrec1;

    public BigDecimal getAmttaxrec1() {
        return amttaxrec1;
    }

    public void setAmttaxrec1(BigDecimal amttaxrec1) {
        this.amttaxrec1 = amttaxrec1;
    }

    @Basic
    @Column(name = "AMTTAXREC2")
    private BigDecimal amttaxrec2;

    public BigDecimal getAmttaxrec2() {
        return amttaxrec2;
    }

    public void setAmttaxrec2(BigDecimal amttaxrec2) {
        this.amttaxrec2 = amttaxrec2;
    }

    @Basic
    @Column(name = "AMTTAXREC3")
    private BigDecimal amttaxrec3;

    public BigDecimal getAmttaxrec3() {
        return amttaxrec3;
    }

    public void setAmttaxrec3(BigDecimal amttaxrec3) {
        this.amttaxrec3 = amttaxrec3;
    }

    @Basic
    @Column(name = "AMTTAXREC4")
    private BigDecimal amttaxrec4;

    public BigDecimal getAmttaxrec4() {
        return amttaxrec4;
    }

    public void setAmttaxrec4(BigDecimal amttaxrec4) {
        this.amttaxrec4 = amttaxrec4;
    }

    @Basic
    @Column(name = "AMTTAXREC5")
    private BigDecimal amttaxrec5;

    public BigDecimal getAmttaxrec5() {
        return amttaxrec5;
    }

    public void setAmttaxrec5(BigDecimal amttaxrec5) {
        this.amttaxrec5 = amttaxrec5;
    }

    @Basic
    @Column(name = "AMTTAXEXP1")
    private BigDecimal amttaxexp1;

    public BigDecimal getAmttaxexp1() {
        return amttaxexp1;
    }

    public void setAmttaxexp1(BigDecimal amttaxexp1) {
        this.amttaxexp1 = amttaxexp1;
    }

    @Basic
    @Column(name = "AMTTAXEXP2")
    private BigDecimal amttaxexp2;

    public BigDecimal getAmttaxexp2() {
        return amttaxexp2;
    }

    public void setAmttaxexp2(BigDecimal amttaxexp2) {
        this.amttaxexp2 = amttaxexp2;
    }

    @Basic
    @Column(name = "AMTTAXEXP3")
    private BigDecimal amttaxexp3;

    public BigDecimal getAmttaxexp3() {
        return amttaxexp3;
    }

    public void setAmttaxexp3(BigDecimal amttaxexp3) {
        this.amttaxexp3 = amttaxexp3;
    }

    @Basic
    @Column(name = "AMTTAXEXP4")
    private BigDecimal amttaxexp4;

    public BigDecimal getAmttaxexp4() {
        return amttaxexp4;
    }

    public void setAmttaxexp4(BigDecimal amttaxexp4) {
        this.amttaxexp4 = amttaxexp4;
    }

    @Basic
    @Column(name = "AMTTAXEXP5")
    private BigDecimal amttaxexp5;

    public BigDecimal getAmttaxexp5() {
        return amttaxexp5;
    }

    public void setAmttaxexp5(BigDecimal amttaxexp5) {
        this.amttaxexp5 = amttaxexp5;
    }

    @Basic
    @Column(name = "AMTTAXTOBE")
    private BigDecimal amttaxtobe;

    public BigDecimal getAmttaxtobe() {
        return amttaxtobe;
    }

    public void setAmttaxtobe(BigDecimal amttaxtobe) {
        this.amttaxtobe = amttaxtobe;
    }

    @Basic
    @Column(name = "TXAMT1RC")
    private BigDecimal txamt1Rc;

    public BigDecimal getTxamt1Rc() {
        return txamt1Rc;
    }

    public void setTxamt1Rc(BigDecimal txamt1Rc) {
        this.txamt1Rc = txamt1Rc;
    }

    @Basic
    @Column(name = "TXAMT2RC")
    private BigDecimal txamt2Rc;

    public BigDecimal getTxamt2Rc() {
        return txamt2Rc;
    }

    public void setTxamt2Rc(BigDecimal txamt2Rc) {
        this.txamt2Rc = txamt2Rc;
    }

    @Basic
    @Column(name = "TXAMT3RC")
    private BigDecimal txamt3Rc;

    public BigDecimal getTxamt3Rc() {
        return txamt3Rc;
    }

    public void setTxamt3Rc(BigDecimal txamt3Rc) {
        this.txamt3Rc = txamt3Rc;
    }

    @Basic
    @Column(name = "TXAMT4RC")
    private BigDecimal txamt4Rc;

    public BigDecimal getTxamt4Rc() {
        return txamt4Rc;
    }

    public void setTxamt4Rc(BigDecimal txamt4Rc) {
        this.txamt4Rc = txamt4Rc;
    }

    @Basic
    @Column(name = "TXAMT5RC")
    private BigDecimal txamt5Rc;

    public BigDecimal getTxamt5Rc() {
        return txamt5Rc;
    }

    public void setTxamt5Rc(BigDecimal txamt5Rc) {
        this.txamt5Rc = txamt5Rc;
    }

    @Basic
    @Column(name = "TXTOTRC")
    private BigDecimal txtotrc;

    public BigDecimal getTxtotrc() {
        return txtotrc;
    }

    public void setTxtotrc(BigDecimal txtotrc) {
        this.txtotrc = txtotrc;
    }

    @Basic
    @Column(name = "TXALLRC")
    private BigDecimal txallrc;

    public BigDecimal getTxallrc() {
        return txallrc;
    }

    public void setTxallrc(BigDecimal txallrc) {
        this.txallrc = txallrc;
    }

    @Basic
    @Column(name = "TXEXP1RC")
    private BigDecimal txexp1Rc;

    public BigDecimal getTxexp1Rc() {
        return txexp1Rc;
    }

    public void setTxexp1Rc(BigDecimal txexp1Rc) {
        this.txexp1Rc = txexp1Rc;
    }

    @Basic
    @Column(name = "TXEXP2RC")
    private BigDecimal txexp2Rc;

    public BigDecimal getTxexp2Rc() {
        return txexp2Rc;
    }

    public void setTxexp2Rc(BigDecimal txexp2Rc) {
        this.txexp2Rc = txexp2Rc;
    }

    @Basic
    @Column(name = "TXEXP3RC")
    private BigDecimal txexp3Rc;

    public BigDecimal getTxexp3Rc() {
        return txexp3Rc;
    }

    public void setTxexp3Rc(BigDecimal txexp3Rc) {
        this.txexp3Rc = txexp3Rc;
    }

    @Basic
    @Column(name = "TXEXP4RC")
    private BigDecimal txexp4Rc;

    public BigDecimal getTxexp4Rc() {
        return txexp4Rc;
    }

    public void setTxexp4Rc(BigDecimal txexp4Rc) {
        this.txexp4Rc = txexp4Rc;
    }

    @Basic
    @Column(name = "TXEXP5RC")
    private BigDecimal txexp5Rc;

    public BigDecimal getTxexp5Rc() {
        return txexp5Rc;
    }

    public void setTxexp5Rc(BigDecimal txexp5Rc) {
        this.txexp5Rc = txexp5Rc;
    }

    @Basic
    @Column(name = "TXREC1RC")
    private BigDecimal txrec1Rc;

    public BigDecimal getTxrec1Rc() {
        return txrec1Rc;
    }

    public void setTxrec1Rc(BigDecimal txrec1Rc) {
        this.txrec1Rc = txrec1Rc;
    }

    @Basic
    @Column(name = "TXREC2RC")
    private BigDecimal txrec2Rc;

    public BigDecimal getTxrec2Rc() {
        return txrec2Rc;
    }

    public void setTxrec2Rc(BigDecimal txrec2Rc) {
        this.txrec2Rc = txrec2Rc;
    }

    @Basic
    @Column(name = "TXREC3RC")
    private BigDecimal txrec3Rc;

    public BigDecimal getTxrec3Rc() {
        return txrec3Rc;
    }

    public void setTxrec3Rc(BigDecimal txrec3Rc) {
        this.txrec3Rc = txrec3Rc;
    }

    @Basic
    @Column(name = "TXREC4RC")
    private BigDecimal txrec4Rc;

    public BigDecimal getTxrec4Rc() {
        return txrec4Rc;
    }

    public void setTxrec4Rc(BigDecimal txrec4Rc) {
        this.txrec4Rc = txrec4Rc;
    }

    @Basic
    @Column(name = "TXREC5RC")
    private BigDecimal txrec5Rc;

    public BigDecimal getTxrec5Rc() {
        return txrec5Rc;
    }

    public void setTxrec5Rc(BigDecimal txrec5Rc) {
        this.txrec5Rc = txrec5Rc;
    }

    @Basic
    @Column(name = "TXBSE1HC")
    private BigDecimal txbse1Hc;

    public BigDecimal getTxbse1Hc() {
        return txbse1Hc;
    }

    public void setTxbse1Hc(BigDecimal txbse1Hc) {
        this.txbse1Hc = txbse1Hc;
    }

    @Basic
    @Column(name = "TXBSE2HC")
    private BigDecimal txbse2Hc;

    public BigDecimal getTxbse2Hc() {
        return txbse2Hc;
    }

    public void setTxbse2Hc(BigDecimal txbse2Hc) {
        this.txbse2Hc = txbse2Hc;
    }

    @Basic
    @Column(name = "TXBSE3HC")
    private BigDecimal txbse3Hc;

    public BigDecimal getTxbse3Hc() {
        return txbse3Hc;
    }

    public void setTxbse3Hc(BigDecimal txbse3Hc) {
        this.txbse3Hc = txbse3Hc;
    }

    @Basic
    @Column(name = "TXBSE4HC")
    private BigDecimal txbse4Hc;

    public BigDecimal getTxbse4Hc() {
        return txbse4Hc;
    }

    public void setTxbse4Hc(BigDecimal txbse4Hc) {
        this.txbse4Hc = txbse4Hc;
    }

    @Basic
    @Column(name = "TXBSE5HC")
    private BigDecimal txbse5Hc;

    public BigDecimal getTxbse5Hc() {
        return txbse5Hc;
    }

    public void setTxbse5Hc(BigDecimal txbse5Hc) {
        this.txbse5Hc = txbse5Hc;
    }

    @Basic
    @Column(name = "TXREC1HC")
    private BigDecimal txrec1Hc;

    public BigDecimal getTxrec1Hc() {
        return txrec1Hc;
    }

    public void setTxrec1Hc(BigDecimal txrec1Hc) {
        this.txrec1Hc = txrec1Hc;
    }

    @Basic
    @Column(name = "TXREC2HC")
    private BigDecimal txrec2Hc;

    public BigDecimal getTxrec2Hc() {
        return txrec2Hc;
    }

    public void setTxrec2Hc(BigDecimal txrec2Hc) {
        this.txrec2Hc = txrec2Hc;
    }

    @Basic
    @Column(name = "TXREC3HC")
    private BigDecimal txrec3Hc;

    public BigDecimal getTxrec3Hc() {
        return txrec3Hc;
    }

    public void setTxrec3Hc(BigDecimal txrec3Hc) {
        this.txrec3Hc = txrec3Hc;
    }

    @Basic
    @Column(name = "TXREC4HC")
    private BigDecimal txrec4Hc;

    public BigDecimal getTxrec4Hc() {
        return txrec4Hc;
    }

    public void setTxrec4Hc(BigDecimal txrec4Hc) {
        this.txrec4Hc = txrec4Hc;
    }

    @Basic
    @Column(name = "TXREC5HC")
    private BigDecimal txrec5Hc;

    public BigDecimal getTxrec5Hc() {
        return txrec5Hc;
    }

    public void setTxrec5Hc(BigDecimal txrec5Hc) {
        this.txrec5Hc = txrec5Hc;
    }

    @Basic
    @Column(name = "TXEXP1HC")
    private BigDecimal txexp1Hc;

    public BigDecimal getTxexp1Hc() {
        return txexp1Hc;
    }

    public void setTxexp1Hc(BigDecimal txexp1Hc) {
        this.txexp1Hc = txexp1Hc;
    }

    @Basic
    @Column(name = "TXEXP2HC")
    private BigDecimal txexp2Hc;

    public BigDecimal getTxexp2Hc() {
        return txexp2Hc;
    }

    public void setTxexp2Hc(BigDecimal txexp2Hc) {
        this.txexp2Hc = txexp2Hc;
    }

    @Basic
    @Column(name = "TXEXP3HC")
    private BigDecimal txexp3Hc;

    public BigDecimal getTxexp3Hc() {
        return txexp3Hc;
    }

    public void setTxexp3Hc(BigDecimal txexp3Hc) {
        this.txexp3Hc = txexp3Hc;
    }

    @Basic
    @Column(name = "TXEXP4HC")
    private BigDecimal txexp4Hc;

    public BigDecimal getTxexp4Hc() {
        return txexp4Hc;
    }

    public void setTxexp4Hc(BigDecimal txexp4Hc) {
        this.txexp4Hc = txexp4Hc;
    }

    @Basic
    @Column(name = "TXEXP5HC")
    private BigDecimal txexp5Hc;

    public BigDecimal getTxexp5Hc() {
        return txexp5Hc;
    }

    public void setTxexp5Hc(BigDecimal txexp5Hc) {
        this.txexp5Hc = txexp5Hc;
    }

    @Basic
    @Column(name = "TXALLHC")
    private BigDecimal txallhc;

    public BigDecimal getTxallhc() {
        return txallhc;
    }

    public void setTxallhc(BigDecimal txallhc) {
        this.txallhc = txallhc;
    }

    @Basic
    @Column(name = "TXALL1HC")
    private BigDecimal txall1Hc;

    public BigDecimal getTxall1Hc() {
        return txall1Hc;
    }

    public void setTxall1Hc(BigDecimal txall1Hc) {
        this.txall1Hc = txall1Hc;
    }

    @Basic
    @Column(name = "TXALL2HC")
    private BigDecimal txall2Hc;

    public BigDecimal getTxall2Hc() {
        return txall2Hc;
    }

    public void setTxall2Hc(BigDecimal txall2Hc) {
        this.txall2Hc = txall2Hc;
    }

    @Basic
    @Column(name = "TXALL3HC")
    private BigDecimal txall3Hc;

    public BigDecimal getTxall3Hc() {
        return txall3Hc;
    }

    public void setTxall3Hc(BigDecimal txall3Hc) {
        this.txall3Hc = txall3Hc;
    }

    @Basic
    @Column(name = "TXALL4HC")
    private BigDecimal txall4Hc;

    public BigDecimal getTxall4Hc() {
        return txall4Hc;
    }

    public void setTxall4Hc(BigDecimal txall4Hc) {
        this.txall4Hc = txall4Hc;
    }

    @Basic
    @Column(name = "TXALL5HC")
    private BigDecimal txall5Hc;

    public BigDecimal getTxall5Hc() {
        return txall5Hc;
    }

    public void setTxall5Hc(BigDecimal txall5Hc) {
        this.txall5Hc = txall5Hc;
    }

    @Basic
    @Column(name = "TXALL1TC")
    private BigDecimal txall1Tc;

    public BigDecimal getTxall1Tc() {
        return txall1Tc;
    }

    public void setTxall1Tc(BigDecimal txall1Tc) {
        this.txall1Tc = txall1Tc;
    }

    @Basic
    @Column(name = "TXALL2TC")
    private BigDecimal txall2Tc;

    public BigDecimal getTxall2Tc() {
        return txall2Tc;
    }

    public void setTxall2Tc(BigDecimal txall2Tc) {
        this.txall2Tc = txall2Tc;
    }

    @Basic
    @Column(name = "TXALL3TC")
    private BigDecimal txall3Tc;

    public BigDecimal getTxall3Tc() {
        return txall3Tc;
    }

    public void setTxall3Tc(BigDecimal txall3Tc) {
        this.txall3Tc = txall3Tc;
    }

    @Basic
    @Column(name = "TXALL4TC")
    private BigDecimal txall4Tc;

    public BigDecimal getTxall4Tc() {
        return txall4Tc;
    }

    public void setTxall4Tc(BigDecimal txall4Tc) {
        this.txall4Tc = txall4Tc;
    }

    @Basic
    @Column(name = "TXALL5TC")
    private BigDecimal txall5Tc;

    public BigDecimal getTxall5Tc() {
        return txall5Tc;
    }

    public void setTxall5Tc(BigDecimal txall5Tc) {
        this.txall5Tc = txall5Tc;
    }

    @Basic
    @Column(name = "TXEXCLTC")
    private BigDecimal txexcltc;

    public BigDecimal getTxexcltc() {
        return txexcltc;
    }

    public void setTxexcltc(BigDecimal txexcltc) {
        this.txexcltc = txexcltc;
    }

    @Basic
    @Column(name = "TXEXCLHC")
    private BigDecimal txexclhc;

    public BigDecimal getTxexclhc() {
        return txexclhc;
    }

    public void setTxexclhc(BigDecimal txexclhc) {
        this.txexclhc = txexclhc;
    }

    @Basic
    @Column(name = "TXEXCLBC")
    private BigDecimal txexclbc;

    public BigDecimal getTxexclbc() {
        return txexclbc;
    }

    public void setTxexclbc(BigDecimal txexclbc) {
        this.txexclbc = txexclbc;
    }

    @Basic
    @Column(name = "TXEXCLMC")
    private BigDecimal txexclmc;

    public BigDecimal getTxexclmc() {
        return txexclmc;
    }

    public void setTxexclmc(BigDecimal txexclmc) {
        this.txexclmc = txexclmc;
    }

    @Basic
    @Column(name = "REVUNIQ")
    private Integer revuniq;

    public Integer getRevuniq() {
        return revuniq;
    }

    public void setRevuniq(Integer revuniq) {
        this.revuniq = revuniq;
    }

    @Basic
    @Column(name = "NEWREVUNIQ")
    private Integer newrevuniq;

    public Integer getNewrevuniq() {
        return newrevuniq;
    }

    public void setNewrevuniq(Integer newrevuniq) {
        this.newrevuniq = newrevuniq;
    }

    @Basic
    @Column(name = "RVDETAILNO")
    private String rvdetailno;

    public String getRvdetailno() {
        return rvdetailno;
    }

    public void setRvdetailno(String rvdetailno) {
        this.rvdetailno = rvdetailno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cbbtdt cbbtdt = (Cbbtdt) o;
        return Objects.equals(batchid, cbbtdt.batchid) && Objects.equals(entryno, cbbtdt.entryno) && Objects.equals(detailno, cbbtdt.detailno) && Objects.equals(audtdate, cbbtdt.audtdate) && Objects.equals(audttime, cbbtdt.audttime) && Objects.equals(audtuser, cbbtdt.audtuser) && Objects.equals(audtorg, cbbtdt.audtorg) && Objects.equals(srcecode, cbbtdt.srcecode) && Objects.equals(textdesc, cbbtdt.textdesc) && Objects.equals(acctid, cbbtdt.acctid) && Objects.equals(taxcode, cbbtdt.taxcode) && Objects.equals(taxtype, cbbtdt.taxtype) && Objects.equals(taxpercnt, cbbtdt.taxpercnt) && Objects.equals(taxamount, cbbtdt.taxamount) && Objects.equals(dtlamount, cbbtdt.dtlamount) && Objects.equals(quantity, cbbtdt.quantity) && Objects.equals(comments, cbbtdt.comments) && Objects.equals(rcptno, cbbtdt.rcptno) && Objects.equals(swcash, cbbtdt.swcash) && Objects.equals(rcptdesc, cbbtdt.rcptdesc) && Objects.equals(misccode, cbbtdt.misccode) && Objects.equals(miscbkline, cbbtdt.miscbkline) && Objects.equals(rcptentry, cbbtdt.rcptentry) && Objects.equals(acctiduf, cbbtdt.acctiduf) && Objects.equals(allocmode, cbbtdt.allocmode) && Objects.equals(acctdesc, cbbtdt.acctdesc) && Objects.equals(acctqtysw, cbbtdt.acctqtysw) && Objects.equals(accttax, cbbtdt.accttax) && Objects.equals(accttaxuf, cbbtdt.accttaxuf) && Objects.equals(taxdesc, cbbtdt.taxdesc) && Objects.equals(taxqtysw, cbbtdt.taxqtysw) && Objects.equals(adjamount, cbbtdt.adjamount) && Objects.equals(swjob, cbbtdt.swjob) && Objects.equals(debitamt, cbbtdt.debitamt) && Objects.equals(creditamt, cbbtdt.creditamt) && Objects.equals(swallocate, cbbtdt.swallocate) && Objects.equals(pjcamt, cbbtdt.pjcamt) && Objects.equals(pjcdisc, cbbtdt.pjcdisc) && Objects.equals(entrytype, cbbtdt.entrytype) && Objects.equals(docnumber, cbbtdt.docnumber) && Objects.equals(tottax, cbbtdt.tottax) && Objects.equals(swmanltx, cbbtdt.swmanltx) && Objects.equals(basetax1, cbbtdt.basetax1) && Objects.equals(basetax2, cbbtdt.basetax2) && Objects.equals(basetax3, cbbtdt.basetax3) && Objects.equals(basetax4, cbbtdt.basetax4) && Objects.equals(basetax5, cbbtdt.basetax5) && Objects.equals(taxclass1, cbbtdt.taxclass1) && Objects.equals(taxclass2, cbbtdt.taxclass2) && Objects.equals(taxclass3, cbbtdt.taxclass3) && Objects.equals(taxclass4, cbbtdt.taxclass4) && Objects.equals(taxclass5, cbbtdt.taxclass5) && Objects.equals(swtaxincl1, cbbtdt.swtaxincl1) && Objects.equals(swtaxincl2, cbbtdt.swtaxincl2) && Objects.equals(swtaxincl3, cbbtdt.swtaxincl3) && Objects.equals(swtaxincl4, cbbtdt.swtaxincl4) && Objects.equals(swtaxincl5, cbbtdt.swtaxincl5) && Objects.equals(ratetax1, cbbtdt.ratetax1) && Objects.equals(ratetax2, cbbtdt.ratetax2) && Objects.equals(ratetax3, cbbtdt.ratetax3) && Objects.equals(ratetax4, cbbtdt.ratetax4) && Objects.equals(ratetax5, cbbtdt.ratetax5) && Objects.equals(amttax1, cbbtdt.amttax1) && Objects.equals(amttax2, cbbtdt.amttax2) && Objects.equals(amttax3, cbbtdt.amttax3) && Objects.equals(amttax4, cbbtdt.amttax4) && Objects.equals(amttax5, cbbtdt.amttax5) && Objects.equals(misctax1, cbbtdt.misctax1) && Objects.equals(misctax2, cbbtdt.misctax2) && Objects.equals(misctax3, cbbtdt.misctax3) && Objects.equals(misctax4, cbbtdt.misctax4) && Objects.equals(misctax5, cbbtdt.misctax5) && Objects.equals(gltaxamt1, cbbtdt.gltaxamt1) && Objects.equals(gltaxamt2, cbbtdt.gltaxamt2) && Objects.equals(gltaxamt3, cbbtdt.gltaxamt3) && Objects.equals(gltaxamt4, cbbtdt.gltaxamt4) && Objects.equals(gltaxamt5, cbbtdt.gltaxamt5) && Objects.equals(bktaxamt1, cbbtdt.bktaxamt1) && Objects.equals(bktaxamt2, cbbtdt.bktaxamt2) && Objects.equals(bktaxamt3, cbbtdt.bktaxamt3) && Objects.equals(bktaxamt4, cbbtdt.bktaxamt4) && Objects.equals(bktaxamt5, cbbtdt.bktaxamt5) && Objects.equals(tcamtinctx, cbbtdt.tcamtinctx) && Objects.equals(glamtinctx, cbbtdt.glamtinctx) && Objects.equals(bkamtinctx, cbbtdt.bkamtinctx) && Objects.equals(msamtinctx, cbbtdt.msamtinctx) && Objects.equals(miscamount, cbbtdt.miscamount) && Objects.equals(glamount, cbbtdt.glamount) && Objects.equals(bkamount, cbbtdt.bkamount) && Objects.equals(totapplamt, cbbtdt.totapplamt) && Objects.equals(totappldsc, cbbtdt.totappldsc) && Objects.equals(totunappl, cbbtdt.totunappl) && Objects.equals(pjccost, cbbtdt.pjccost) && Objects.equals(nosubdetl, cbbtdt.nosubdetl) && Objects.equals(values, cbbtdt.values) && Objects.equals(processcmd, cbbtdt.processcmd) && Objects.equals(amttaxrec1, cbbtdt.amttaxrec1) && Objects.equals(amttaxrec2, cbbtdt.amttaxrec2) && Objects.equals(amttaxrec3, cbbtdt.amttaxrec3) && Objects.equals(amttaxrec4, cbbtdt.amttaxrec4) && Objects.equals(amttaxrec5, cbbtdt.amttaxrec5) && Objects.equals(amttaxexp1, cbbtdt.amttaxexp1) && Objects.equals(amttaxexp2, cbbtdt.amttaxexp2) && Objects.equals(amttaxexp3, cbbtdt.amttaxexp3) && Objects.equals(amttaxexp4, cbbtdt.amttaxexp4) && Objects.equals(amttaxexp5, cbbtdt.amttaxexp5) && Objects.equals(amttaxtobe, cbbtdt.amttaxtobe) && Objects.equals(txamt1Rc, cbbtdt.txamt1Rc) && Objects.equals(txamt2Rc, cbbtdt.txamt2Rc) && Objects.equals(txamt3Rc, cbbtdt.txamt3Rc) && Objects.equals(txamt4Rc, cbbtdt.txamt4Rc) && Objects.equals(txamt5Rc, cbbtdt.txamt5Rc) && Objects.equals(txtotrc, cbbtdt.txtotrc) && Objects.equals(txallrc, cbbtdt.txallrc) && Objects.equals(txexp1Rc, cbbtdt.txexp1Rc) && Objects.equals(txexp2Rc, cbbtdt.txexp2Rc) && Objects.equals(txexp3Rc, cbbtdt.txexp3Rc) && Objects.equals(txexp4Rc, cbbtdt.txexp4Rc) && Objects.equals(txexp5Rc, cbbtdt.txexp5Rc) && Objects.equals(txrec1Rc, cbbtdt.txrec1Rc) && Objects.equals(txrec2Rc, cbbtdt.txrec2Rc) && Objects.equals(txrec3Rc, cbbtdt.txrec3Rc) && Objects.equals(txrec4Rc, cbbtdt.txrec4Rc) && Objects.equals(txrec5Rc, cbbtdt.txrec5Rc) && Objects.equals(txbse1Hc, cbbtdt.txbse1Hc) && Objects.equals(txbse2Hc, cbbtdt.txbse2Hc) && Objects.equals(txbse3Hc, cbbtdt.txbse3Hc) && Objects.equals(txbse4Hc, cbbtdt.txbse4Hc) && Objects.equals(txbse5Hc, cbbtdt.txbse5Hc) && Objects.equals(txrec1Hc, cbbtdt.txrec1Hc) && Objects.equals(txrec2Hc, cbbtdt.txrec2Hc) && Objects.equals(txrec3Hc, cbbtdt.txrec3Hc) && Objects.equals(txrec4Hc, cbbtdt.txrec4Hc) && Objects.equals(txrec5Hc, cbbtdt.txrec5Hc) && Objects.equals(txexp1Hc, cbbtdt.txexp1Hc) && Objects.equals(txexp2Hc, cbbtdt.txexp2Hc) && Objects.equals(txexp3Hc, cbbtdt.txexp3Hc) && Objects.equals(txexp4Hc, cbbtdt.txexp4Hc) && Objects.equals(txexp5Hc, cbbtdt.txexp5Hc) && Objects.equals(txallhc, cbbtdt.txallhc) && Objects.equals(txall1Hc, cbbtdt.txall1Hc) && Objects.equals(txall2Hc, cbbtdt.txall2Hc) && Objects.equals(txall3Hc, cbbtdt.txall3Hc) && Objects.equals(txall4Hc, cbbtdt.txall4Hc) && Objects.equals(txall5Hc, cbbtdt.txall5Hc) && Objects.equals(txall1Tc, cbbtdt.txall1Tc) && Objects.equals(txall2Tc, cbbtdt.txall2Tc) && Objects.equals(txall3Tc, cbbtdt.txall3Tc) && Objects.equals(txall4Tc, cbbtdt.txall4Tc) && Objects.equals(txall5Tc, cbbtdt.txall5Tc) && Objects.equals(txexcltc, cbbtdt.txexcltc) && Objects.equals(txexclhc, cbbtdt.txexclhc) && Objects.equals(txexclbc, cbbtdt.txexclbc) && Objects.equals(txexclmc, cbbtdt.txexclmc) && Objects.equals(revuniq, cbbtdt.revuniq) && Objects.equals(newrevuniq, cbbtdt.newrevuniq) && Objects.equals(rvdetailno, cbbtdt.rvdetailno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, detailno, audtdate, audttime, audtuser, audtorg, srcecode, textdesc, acctid, taxcode, taxtype, taxpercnt, taxamount, dtlamount, quantity, comments, rcptno, swcash, rcptdesc, misccode, miscbkline, rcptentry, acctiduf, allocmode, acctdesc, acctqtysw, accttax, accttaxuf, taxdesc, taxqtysw, adjamount, swjob, debitamt, creditamt, swallocate, pjcamt, pjcdisc, entrytype, docnumber, tottax, swmanltx, basetax1, basetax2, basetax3, basetax4, basetax5, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, swtaxincl1, swtaxincl2, swtaxincl3, swtaxincl4, swtaxincl5, ratetax1, ratetax2, ratetax3, ratetax4, ratetax5, amttax1, amttax2, amttax3, amttax4, amttax5, misctax1, misctax2, misctax3, misctax4, misctax5, gltaxamt1, gltaxamt2, gltaxamt3, gltaxamt4, gltaxamt5, bktaxamt1, bktaxamt2, bktaxamt3, bktaxamt4, bktaxamt5, tcamtinctx, glamtinctx, bkamtinctx, msamtinctx, miscamount, glamount, bkamount, totapplamt, totappldsc, totunappl, pjccost, nosubdetl, values, processcmd, amttaxrec1, amttaxrec2, amttaxrec3, amttaxrec4, amttaxrec5, amttaxexp1, amttaxexp2, amttaxexp3, amttaxexp4, amttaxexp5, amttaxtobe, txamt1Rc, txamt2Rc, txamt3Rc, txamt4Rc, txamt5Rc, txtotrc, txallrc, txexp1Rc, txexp2Rc, txexp3Rc, txexp4Rc, txexp5Rc, txrec1Rc, txrec2Rc, txrec3Rc, txrec4Rc, txrec5Rc, txbse1Hc, txbse2Hc, txbse3Hc, txbse4Hc, txbse5Hc, txrec1Hc, txrec2Hc, txrec3Hc, txrec4Hc, txrec5Hc, txexp1Hc, txexp2Hc, txexp3Hc, txexp4Hc, txexp5Hc, txallhc, txall1Hc, txall2Hc, txall3Hc, txall4Hc, txall5Hc, txall1Tc, txall2Tc, txall3Tc, txall4Tc, txall5Tc, txexcltc, txexclhc, txexclbc, txexclmc, revuniq, newrevuniq, rvdetailno);
    }
}
