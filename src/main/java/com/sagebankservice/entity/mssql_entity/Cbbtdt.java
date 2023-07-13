package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CbbtdtPK.class)
public class Cbbtdt {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATCHID", nullable = false, length = 6)
    private String batchid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ENTRYNO", nullable = false, length = 5)
    private String entryno;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DETAILNO", nullable = false, length = 10)
    private String detailno;
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
    @Column(name = "SRCECODE", nullable = false, length = 4)
    private String srcecode;
    @Basic
    @Column(name = "TEXTDESC", nullable = false, length = 60)
    private String textdesc;
    @Basic
    @Column(name = "ACCTID", nullable = false, length = 45)
    private String acctid;
    @Basic
    @Column(name = "TAXCODE", nullable = false, length = 2)
    private String taxcode;
    @Basic
    @Column(name = "TAXTYPE", nullable = false)
    private short taxtype;
    @Basic
    @Column(name = "TAXPERCNT", nullable = false, precision = 3)
    private BigDecimal taxpercnt;
    @Basic
    @Column(name = "TAXAMOUNT", nullable = false, precision = 3)
    private BigDecimal taxamount;
    @Basic
    @Column(name = "DTLAMOUNT", nullable = false, precision = 3)
    private BigDecimal dtlamount;
    @Basic
    @Column(name = "QUANTITY", nullable = false, precision = 3)
    private BigDecimal quantity;
    @Basic
    @Column(name = "COMMENTS", nullable = false, length = 120)
    private String comments;
    @Basic
    @Column(name = "RCPTNO", nullable = false, length = 12)
    private String rcptno;
    @Basic
    @Column(name = "SWCASH", nullable = false)
    private short swcash;
    @Basic
    @Column(name = "RCPTDESC", nullable = false, length = 60)
    private String rcptdesc;
    @Basic
    @Column(name = "MISCCODE", nullable = false, length = 12)
    private String misccode;
    @Basic
    @Column(name = "MISCBKLINE", nullable = false)
    private int miscbkline;
    @Basic
    @Column(name = "RCPTENTRY", nullable = false, length = 5)
    private String rcptentry;
    @Basic
    @Column(name = "ACCTIDUF", nullable = false, length = 45)
    private String acctiduf;
    @Basic
    @Column(name = "ALLOCMODE", nullable = false)
    private short allocmode;
    @Basic
    @Column(name = "ACCTDESC", nullable = false, length = 60)
    private String acctdesc;
    @Basic
    @Column(name = "ACCTQTYSW", nullable = false)
    private short acctqtysw;
    @Basic
    @Column(name = "ACCTTAX", nullable = false, length = 45)
    private String accttax;
    @Basic
    @Column(name = "ACCTTAXUF", nullable = false, length = 45)
    private String accttaxuf;
    @Basic
    @Column(name = "TAXDESC", nullable = false, length = 60)
    private String taxdesc;
    @Basic
    @Column(name = "TAXQTYSW", nullable = false)
    private short taxqtysw;
    @Basic
    @Column(name = "ADJAMOUNT", nullable = false, precision = 3)
    private BigDecimal adjamount;
    @Basic
    @Column(name = "SWJOB", nullable = false)
    private short swjob;
    @Basic
    @Column(name = "DEBITAMT", nullable = false, precision = 3)
    private BigDecimal debitamt;
    @Basic
    @Column(name = "CREDITAMT", nullable = false, precision = 3)
    private BigDecimal creditamt;
    @Basic
    @Column(name = "SWALLOCATE", nullable = false)
    private short swallocate;
    @Basic
    @Column(name = "PJCAMT", nullable = false, precision = 3)
    private BigDecimal pjcamt;
    @Basic
    @Column(name = "PJCDISC", nullable = false, precision = 3)
    private BigDecimal pjcdisc;
    @Basic
    @Column(name = "ENTRYTYPE", nullable = false)
    private short entrytype;
    @Basic
    @Column(name = "DOCNUMBER", nullable = false, length = 22)
    private String docnumber;
    @Basic
    @Column(name = "TOTTAX", nullable = false, precision = 3)
    private BigDecimal tottax;
    @Basic
    @Column(name = "SWMANLTX", nullable = false)
    private short swmanltx;
    @Basic
    @Column(name = "BASETAX1", nullable = false, precision = 3)
    private BigDecimal basetax1;
    @Basic
    @Column(name = "BASETAX2", nullable = false, precision = 3)
    private BigDecimal basetax2;
    @Basic
    @Column(name = "BASETAX3", nullable = false, precision = 3)
    private BigDecimal basetax3;
    @Basic
    @Column(name = "BASETAX4", nullable = false, precision = 3)
    private BigDecimal basetax4;
    @Basic
    @Column(name = "BASETAX5", nullable = false, precision = 3)
    private BigDecimal basetax5;
    @Basic
    @Column(name = "TAXCLASS1", nullable = false)
    private short taxclass1;
    @Basic
    @Column(name = "TAXCLASS2", nullable = false)
    private short taxclass2;
    @Basic
    @Column(name = "TAXCLASS3", nullable = false)
    private short taxclass3;
    @Basic
    @Column(name = "TAXCLASS4", nullable = false)
    private short taxclass4;
    @Basic
    @Column(name = "TAXCLASS5", nullable = false)
    private short taxclass5;
    @Basic
    @Column(name = "SWTAXINCL1", nullable = false)
    private short swtaxincl1;
    @Basic
    @Column(name = "SWTAXINCL2", nullable = false)
    private short swtaxincl2;
    @Basic
    @Column(name = "SWTAXINCL3", nullable = false)
    private short swtaxincl3;
    @Basic
    @Column(name = "SWTAXINCL4", nullable = false)
    private short swtaxincl4;
    @Basic
    @Column(name = "SWTAXINCL5", nullable = false)
    private short swtaxincl5;
    @Basic
    @Column(name = "RATETAX1", nullable = false, precision = 5)
    private BigDecimal ratetax1;
    @Basic
    @Column(name = "RATETAX2", nullable = false, precision = 5)
    private BigDecimal ratetax2;
    @Basic
    @Column(name = "RATETAX3", nullable = false, precision = 5)
    private BigDecimal ratetax3;
    @Basic
    @Column(name = "RATETAX4", nullable = false, precision = 5)
    private BigDecimal ratetax4;
    @Basic
    @Column(name = "RATETAX5", nullable = false, precision = 5)
    private BigDecimal ratetax5;
    @Basic
    @Column(name = "AMTTAX1", nullable = false, precision = 3)
    private BigDecimal amttax1;
    @Basic
    @Column(name = "AMTTAX2", nullable = false, precision = 3)
    private BigDecimal amttax2;
    @Basic
    @Column(name = "AMTTAX3", nullable = false, precision = 3)
    private BigDecimal amttax3;
    @Basic
    @Column(name = "AMTTAX4", nullable = false, precision = 3)
    private BigDecimal amttax4;
    @Basic
    @Column(name = "AMTTAX5", nullable = false, precision = 3)
    private BigDecimal amttax5;
    @Basic
    @Column(name = "MISCTAX1", nullable = false, precision = 3)
    private BigDecimal misctax1;
    @Basic
    @Column(name = "MISCTAX2", nullable = false, precision = 3)
    private BigDecimal misctax2;
    @Basic
    @Column(name = "MISCTAX3", nullable = false, precision = 3)
    private BigDecimal misctax3;
    @Basic
    @Column(name = "MISCTAX4", nullable = false, precision = 3)
    private BigDecimal misctax4;
    @Basic
    @Column(name = "MISCTAX5", nullable = false, precision = 3)
    private BigDecimal misctax5;
    @Basic
    @Column(name = "GLTAXAMT1", nullable = false, precision = 3)
    private BigDecimal gltaxamt1;
    @Basic
    @Column(name = "GLTAXAMT2", nullable = false, precision = 3)
    private BigDecimal gltaxamt2;
    @Basic
    @Column(name = "GLTAXAMT3", nullable = false, precision = 3)
    private BigDecimal gltaxamt3;
    @Basic
    @Column(name = "GLTAXAMT4", nullable = false, precision = 3)
    private BigDecimal gltaxamt4;
    @Basic
    @Column(name = "GLTAXAMT5", nullable = false, precision = 3)
    private BigDecimal gltaxamt5;
    @Basic
    @Column(name = "BKTAXAMT1", nullable = false, precision = 3)
    private BigDecimal bktaxamt1;
    @Basic
    @Column(name = "BKTAXAMT2", nullable = false, precision = 3)
    private BigDecimal bktaxamt2;
    @Basic
    @Column(name = "BKTAXAMT3", nullable = false, precision = 3)
    private BigDecimal bktaxamt3;
    @Basic
    @Column(name = "BKTAXAMT4", nullable = false, precision = 3)
    private BigDecimal bktaxamt4;
    @Basic
    @Column(name = "BKTAXAMT5", nullable = false, precision = 3)
    private BigDecimal bktaxamt5;
    @Basic
    @Column(name = "TCAMTINCTX", nullable = false, precision = 3)
    private BigDecimal tcamtinctx;
    @Basic
    @Column(name = "GLAMTINCTX", nullable = false, precision = 3)
    private BigDecimal glamtinctx;
    @Basic
    @Column(name = "BKAMTINCTX", nullable = false, precision = 3)
    private BigDecimal bkamtinctx;
    @Basic
    @Column(name = "MSAMTINCTX", nullable = false, precision = 3)
    private BigDecimal msamtinctx;
    @Basic
    @Column(name = "MISCAMOUNT", nullable = false, precision = 3)
    private BigDecimal miscamount;
    @Basic
    @Column(name = "GLAMOUNT", nullable = false, precision = 3)
    private BigDecimal glamount;
    @Basic
    @Column(name = "BKAMOUNT", nullable = false, precision = 3)
    private BigDecimal bkamount;
    @Basic
    @Column(name = "TOTAPPLAMT", nullable = false, precision = 3)
    private BigDecimal totapplamt;
    @Basic
    @Column(name = "TOTAPPLDSC", nullable = false, precision = 3)
    private BigDecimal totappldsc;
    @Basic
    @Column(name = "TOTUNAPPL", nullable = false, precision = 3)
    private BigDecimal totunappl;
    @Basic
    @Column(name = "PJCCOST", nullable = false, precision = 3)
    private BigDecimal pjccost;
    @Basic
    @Column(name = "NOSUBDETL", nullable = false)
    private int nosubdetl;
    @Basic
    @Column(name = "VALUES", nullable = false)
    private int values;
    @Basic
    @Column(name = "PROCESSCMD", nullable = false)
    private short processcmd;
    @Basic
    @Column(name = "AMTTAXREC1", nullable = false, precision = 3)
    private BigDecimal amttaxrec1;
    @Basic
    @Column(name = "AMTTAXREC2", nullable = false, precision = 3)
    private BigDecimal amttaxrec2;
    @Basic
    @Column(name = "AMTTAXREC3", nullable = false, precision = 3)
    private BigDecimal amttaxrec3;
    @Basic
    @Column(name = "AMTTAXREC4", nullable = false, precision = 3)
    private BigDecimal amttaxrec4;
    @Basic
    @Column(name = "AMTTAXREC5", nullable = false, precision = 3)
    private BigDecimal amttaxrec5;
    @Basic
    @Column(name = "AMTTAXEXP1", nullable = false, precision = 3)
    private BigDecimal amttaxexp1;
    @Basic
    @Column(name = "AMTTAXEXP2", nullable = false, precision = 3)
    private BigDecimal amttaxexp2;
    @Basic
    @Column(name = "AMTTAXEXP3", nullable = false, precision = 3)
    private BigDecimal amttaxexp3;
    @Basic
    @Column(name = "AMTTAXEXP4", nullable = false, precision = 3)
    private BigDecimal amttaxexp4;
    @Basic
    @Column(name = "AMTTAXEXP5", nullable = false, precision = 3)
    private BigDecimal amttaxexp5;
    @Basic
    @Column(name = "AMTTAXTOBE", nullable = false, precision = 3)
    private BigDecimal amttaxtobe;
    @Basic
    @Column(name = "TXAMT1RC", nullable = false, precision = 3)
    private BigDecimal txamt1Rc;
    @Basic
    @Column(name = "TXAMT2RC", nullable = false, precision = 3)
    private BigDecimal txamt2Rc;
    @Basic
    @Column(name = "TXAMT3RC", nullable = false, precision = 3)
    private BigDecimal txamt3Rc;
    @Basic
    @Column(name = "TXAMT4RC", nullable = false, precision = 3)
    private BigDecimal txamt4Rc;
    @Basic
    @Column(name = "TXAMT5RC", nullable = false, precision = 3)
    private BigDecimal txamt5Rc;
    @Basic
    @Column(name = "TXTOTRC", nullable = false, precision = 3)
    private BigDecimal txtotrc;
    @Basic
    @Column(name = "TXALLRC", nullable = false, precision = 3)
    private BigDecimal txallrc;
    @Basic
    @Column(name = "TXEXP1RC", nullable = false, precision = 3)
    private BigDecimal txexp1Rc;
    @Basic
    @Column(name = "TXEXP2RC", nullable = false, precision = 3)
    private BigDecimal txexp2Rc;
    @Basic
    @Column(name = "TXEXP3RC", nullable = false, precision = 3)
    private BigDecimal txexp3Rc;
    @Basic
    @Column(name = "TXEXP4RC", nullable = false, precision = 3)
    private BigDecimal txexp4Rc;
    @Basic
    @Column(name = "TXEXP5RC", nullable = false, precision = 3)
    private BigDecimal txexp5Rc;
    @Basic
    @Column(name = "TXREC1RC", nullable = false, precision = 3)
    private BigDecimal txrec1Rc;
    @Basic
    @Column(name = "TXREC2RC", nullable = false, precision = 3)
    private BigDecimal txrec2Rc;
    @Basic
    @Column(name = "TXREC3RC", nullable = false, precision = 3)
    private BigDecimal txrec3Rc;
    @Basic
    @Column(name = "TXREC4RC", nullable = false, precision = 3)
    private BigDecimal txrec4Rc;
    @Basic
    @Column(name = "TXREC5RC", nullable = false, precision = 3)
    private BigDecimal txrec5Rc;
    @Basic
    @Column(name = "TXBSE1HC", nullable = false, precision = 3)
    private BigDecimal txbse1Hc;
    @Basic
    @Column(name = "TXBSE2HC", nullable = false, precision = 3)
    private BigDecimal txbse2Hc;
    @Basic
    @Column(name = "TXBSE3HC", nullable = false, precision = 3)
    private BigDecimal txbse3Hc;
    @Basic
    @Column(name = "TXBSE4HC", nullable = false, precision = 3)
    private BigDecimal txbse4Hc;
    @Basic
    @Column(name = "TXBSE5HC", nullable = false, precision = 3)
    private BigDecimal txbse5Hc;
    @Basic
    @Column(name = "TXREC1HC", nullable = false, precision = 3)
    private BigDecimal txrec1Hc;
    @Basic
    @Column(name = "TXREC2HC", nullable = false, precision = 3)
    private BigDecimal txrec2Hc;
    @Basic
    @Column(name = "TXREC3HC", nullable = false, precision = 3)
    private BigDecimal txrec3Hc;
    @Basic
    @Column(name = "TXREC4HC", nullable = false, precision = 3)
    private BigDecimal txrec4Hc;
    @Basic
    @Column(name = "TXREC5HC", nullable = false, precision = 3)
    private BigDecimal txrec5Hc;
    @Basic
    @Column(name = "TXEXP1HC", nullable = false, precision = 3)
    private BigDecimal txexp1Hc;
    @Basic
    @Column(name = "TXEXP2HC", nullable = false, precision = 3)
    private BigDecimal txexp2Hc;
    @Basic
    @Column(name = "TXEXP3HC", nullable = false, precision = 3)
    private BigDecimal txexp3Hc;
    @Basic
    @Column(name = "TXEXP4HC", nullable = false, precision = 3)
    private BigDecimal txexp4Hc;
    @Basic
    @Column(name = "TXEXP5HC", nullable = false, precision = 3)
    private BigDecimal txexp5Hc;
    @Basic
    @Column(name = "TXALLHC", nullable = false, precision = 3)
    private BigDecimal txallhc;
    @Basic
    @Column(name = "TXALL1HC", nullable = false, precision = 3)
    private BigDecimal txall1Hc;
    @Basic
    @Column(name = "TXALL2HC", nullable = false, precision = 3)
    private BigDecimal txall2Hc;
    @Basic
    @Column(name = "TXALL3HC", nullable = false, precision = 3)
    private BigDecimal txall3Hc;
    @Basic
    @Column(name = "TXALL4HC", nullable = false, precision = 3)
    private BigDecimal txall4Hc;
    @Basic
    @Column(name = "TXALL5HC", nullable = false, precision = 3)
    private BigDecimal txall5Hc;
    @Basic
    @Column(name = "TXALL1TC", nullable = false, precision = 3)
    private BigDecimal txall1Tc;
    @Basic
    @Column(name = "TXALL2TC", nullable = false, precision = 3)
    private BigDecimal txall2Tc;
    @Basic
    @Column(name = "TXALL3TC", nullable = false, precision = 3)
    private BigDecimal txall3Tc;
    @Basic
    @Column(name = "TXALL4TC", nullable = false, precision = 3)
    private BigDecimal txall4Tc;
    @Basic
    @Column(name = "TXALL5TC", nullable = false, precision = 3)
    private BigDecimal txall5Tc;
    @Basic
    @Column(name = "TXEXCLTC", nullable = false, precision = 3)
    private BigDecimal txexcltc;
    @Basic
    @Column(name = "TXEXCLHC", nullable = false, precision = 3)
    private BigDecimal txexclhc;
    @Basic
    @Column(name = "TXEXCLBC", nullable = false, precision = 3)
    private BigDecimal txexclbc;
    @Basic
    @Column(name = "TXEXCLMC", nullable = false, precision = 3)
    private BigDecimal txexclmc;
    @Basic
    @Column(name = "REVUNIQ", nullable = false)
    private int revuniq;
    @Basic
    @Column(name = "NEWREVUNIQ", nullable = false)
    private int newrevuniq;
    @Basic
    @Column(name = "RVDETAILNO", nullable = false, length = 10)
    private String rvdetailno;

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

    public String getSrcecode() {
        return srcecode;
    }

    public void setSrcecode(String srcecode) {
        this.srcecode = srcecode;
    }

    public String getTextdesc() {
        return textdesc;
    }

    public void setTextdesc(String textdesc) {
        this.textdesc = textdesc;
    }

    public String getAcctid() {
        return acctid;
    }

    public void setAcctid(String acctid) {
        this.acctid = acctid;
    }

    public String getTaxcode() {
        return taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public short getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(short taxtype) {
        this.taxtype = taxtype;
    }

    public BigDecimal getTaxpercnt() {
        return taxpercnt;
    }

    public void setTaxpercnt(BigDecimal taxpercnt) {
        this.taxpercnt = taxpercnt;
    }

    public BigDecimal getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(BigDecimal taxamount) {
        this.taxamount = taxamount;
    }

    public BigDecimal getDtlamount() {
        return dtlamount;
    }

    public void setDtlamount(BigDecimal dtlamount) {
        this.dtlamount = dtlamount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRcptno() {
        return rcptno;
    }

    public void setRcptno(String rcptno) {
        this.rcptno = rcptno;
    }

    public short getSwcash() {
        return swcash;
    }

    public void setSwcash(short swcash) {
        this.swcash = swcash;
    }

    public String getRcptdesc() {
        return rcptdesc;
    }

    public void setRcptdesc(String rcptdesc) {
        this.rcptdesc = rcptdesc;
    }

    public String getMisccode() {
        return misccode;
    }

    public void setMisccode(String misccode) {
        this.misccode = misccode;
    }

    public int getMiscbkline() {
        return miscbkline;
    }

    public void setMiscbkline(int miscbkline) {
        this.miscbkline = miscbkline;
    }

    public String getRcptentry() {
        return rcptentry;
    }

    public void setRcptentry(String rcptentry) {
        this.rcptentry = rcptentry;
    }

    public String getAcctiduf() {
        return acctiduf;
    }

    public void setAcctiduf(String acctiduf) {
        this.acctiduf = acctiduf;
    }

    public short getAllocmode() {
        return allocmode;
    }

    public void setAllocmode(short allocmode) {
        this.allocmode = allocmode;
    }

    public String getAcctdesc() {
        return acctdesc;
    }

    public void setAcctdesc(String acctdesc) {
        this.acctdesc = acctdesc;
    }

    public short getAcctqtysw() {
        return acctqtysw;
    }

    public void setAcctqtysw(short acctqtysw) {
        this.acctqtysw = acctqtysw;
    }

    public String getAccttax() {
        return accttax;
    }

    public void setAccttax(String accttax) {
        this.accttax = accttax;
    }

    public String getAccttaxuf() {
        return accttaxuf;
    }

    public void setAccttaxuf(String accttaxuf) {
        this.accttaxuf = accttaxuf;
    }

    public String getTaxdesc() {
        return taxdesc;
    }

    public void setTaxdesc(String taxdesc) {
        this.taxdesc = taxdesc;
    }

    public short getTaxqtysw() {
        return taxqtysw;
    }

    public void setTaxqtysw(short taxqtysw) {
        this.taxqtysw = taxqtysw;
    }

    public BigDecimal getAdjamount() {
        return adjamount;
    }

    public void setAdjamount(BigDecimal adjamount) {
        this.adjamount = adjamount;
    }

    public short getSwjob() {
        return swjob;
    }

    public void setSwjob(short swjob) {
        this.swjob = swjob;
    }

    public BigDecimal getDebitamt() {
        return debitamt;
    }

    public void setDebitamt(BigDecimal debitamt) {
        this.debitamt = debitamt;
    }

    public BigDecimal getCreditamt() {
        return creditamt;
    }

    public void setCreditamt(BigDecimal creditamt) {
        this.creditamt = creditamt;
    }

    public short getSwallocate() {
        return swallocate;
    }

    public void setSwallocate(short swallocate) {
        this.swallocate = swallocate;
    }

    public BigDecimal getPjcamt() {
        return pjcamt;
    }

    public void setPjcamt(BigDecimal pjcamt) {
        this.pjcamt = pjcamt;
    }

    public BigDecimal getPjcdisc() {
        return pjcdisc;
    }

    public void setPjcdisc(BigDecimal pjcdisc) {
        this.pjcdisc = pjcdisc;
    }

    public short getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(short entrytype) {
        this.entrytype = entrytype;
    }

    public String getDocnumber() {
        return docnumber;
    }

    public void setDocnumber(String docnumber) {
        this.docnumber = docnumber;
    }

    public BigDecimal getTottax() {
        return tottax;
    }

    public void setTottax(BigDecimal tottax) {
        this.tottax = tottax;
    }

    public short getSwmanltx() {
        return swmanltx;
    }

    public void setSwmanltx(short swmanltx) {
        this.swmanltx = swmanltx;
    }

    public BigDecimal getBasetax1() {
        return basetax1;
    }

    public void setBasetax1(BigDecimal basetax1) {
        this.basetax1 = basetax1;
    }

    public BigDecimal getBasetax2() {
        return basetax2;
    }

    public void setBasetax2(BigDecimal basetax2) {
        this.basetax2 = basetax2;
    }

    public BigDecimal getBasetax3() {
        return basetax3;
    }

    public void setBasetax3(BigDecimal basetax3) {
        this.basetax3 = basetax3;
    }

    public BigDecimal getBasetax4() {
        return basetax4;
    }

    public void setBasetax4(BigDecimal basetax4) {
        this.basetax4 = basetax4;
    }

    public BigDecimal getBasetax5() {
        return basetax5;
    }

    public void setBasetax5(BigDecimal basetax5) {
        this.basetax5 = basetax5;
    }

    public short getTaxclass1() {
        return taxclass1;
    }

    public void setTaxclass1(short taxclass1) {
        this.taxclass1 = taxclass1;
    }

    public short getTaxclass2() {
        return taxclass2;
    }

    public void setTaxclass2(short taxclass2) {
        this.taxclass2 = taxclass2;
    }

    public short getTaxclass3() {
        return taxclass3;
    }

    public void setTaxclass3(short taxclass3) {
        this.taxclass3 = taxclass3;
    }

    public short getTaxclass4() {
        return taxclass4;
    }

    public void setTaxclass4(short taxclass4) {
        this.taxclass4 = taxclass4;
    }

    public short getTaxclass5() {
        return taxclass5;
    }

    public void setTaxclass5(short taxclass5) {
        this.taxclass5 = taxclass5;
    }

    public short getSwtaxincl1() {
        return swtaxincl1;
    }

    public void setSwtaxincl1(short swtaxincl1) {
        this.swtaxincl1 = swtaxincl1;
    }

    public short getSwtaxincl2() {
        return swtaxincl2;
    }

    public void setSwtaxincl2(short swtaxincl2) {
        this.swtaxincl2 = swtaxincl2;
    }

    public short getSwtaxincl3() {
        return swtaxincl3;
    }

    public void setSwtaxincl3(short swtaxincl3) {
        this.swtaxincl3 = swtaxincl3;
    }

    public short getSwtaxincl4() {
        return swtaxincl4;
    }

    public void setSwtaxincl4(short swtaxincl4) {
        this.swtaxincl4 = swtaxincl4;
    }

    public short getSwtaxincl5() {
        return swtaxincl5;
    }

    public void setSwtaxincl5(short swtaxincl5) {
        this.swtaxincl5 = swtaxincl5;
    }

    public BigDecimal getRatetax1() {
        return ratetax1;
    }

    public void setRatetax1(BigDecimal ratetax1) {
        this.ratetax1 = ratetax1;
    }

    public BigDecimal getRatetax2() {
        return ratetax2;
    }

    public void setRatetax2(BigDecimal ratetax2) {
        this.ratetax2 = ratetax2;
    }

    public BigDecimal getRatetax3() {
        return ratetax3;
    }

    public void setRatetax3(BigDecimal ratetax3) {
        this.ratetax3 = ratetax3;
    }

    public BigDecimal getRatetax4() {
        return ratetax4;
    }

    public void setRatetax4(BigDecimal ratetax4) {
        this.ratetax4 = ratetax4;
    }

    public BigDecimal getRatetax5() {
        return ratetax5;
    }

    public void setRatetax5(BigDecimal ratetax5) {
        this.ratetax5 = ratetax5;
    }

    public BigDecimal getAmttax1() {
        return amttax1;
    }

    public void setAmttax1(BigDecimal amttax1) {
        this.amttax1 = amttax1;
    }

    public BigDecimal getAmttax2() {
        return amttax2;
    }

    public void setAmttax2(BigDecimal amttax2) {
        this.amttax2 = amttax2;
    }

    public BigDecimal getAmttax3() {
        return amttax3;
    }

    public void setAmttax3(BigDecimal amttax3) {
        this.amttax3 = amttax3;
    }

    public BigDecimal getAmttax4() {
        return amttax4;
    }

    public void setAmttax4(BigDecimal amttax4) {
        this.amttax4 = amttax4;
    }

    public BigDecimal getAmttax5() {
        return amttax5;
    }

    public void setAmttax5(BigDecimal amttax5) {
        this.amttax5 = amttax5;
    }

    public BigDecimal getMisctax1() {
        return misctax1;
    }

    public void setMisctax1(BigDecimal misctax1) {
        this.misctax1 = misctax1;
    }

    public BigDecimal getMisctax2() {
        return misctax2;
    }

    public void setMisctax2(BigDecimal misctax2) {
        this.misctax2 = misctax2;
    }

    public BigDecimal getMisctax3() {
        return misctax3;
    }

    public void setMisctax3(BigDecimal misctax3) {
        this.misctax3 = misctax3;
    }

    public BigDecimal getMisctax4() {
        return misctax4;
    }

    public void setMisctax4(BigDecimal misctax4) {
        this.misctax4 = misctax4;
    }

    public BigDecimal getMisctax5() {
        return misctax5;
    }

    public void setMisctax5(BigDecimal misctax5) {
        this.misctax5 = misctax5;
    }

    public BigDecimal getGltaxamt1() {
        return gltaxamt1;
    }

    public void setGltaxamt1(BigDecimal gltaxamt1) {
        this.gltaxamt1 = gltaxamt1;
    }

    public BigDecimal getGltaxamt2() {
        return gltaxamt2;
    }

    public void setGltaxamt2(BigDecimal gltaxamt2) {
        this.gltaxamt2 = gltaxamt2;
    }

    public BigDecimal getGltaxamt3() {
        return gltaxamt3;
    }

    public void setGltaxamt3(BigDecimal gltaxamt3) {
        this.gltaxamt3 = gltaxamt3;
    }

    public BigDecimal getGltaxamt4() {
        return gltaxamt4;
    }

    public void setGltaxamt4(BigDecimal gltaxamt4) {
        this.gltaxamt4 = gltaxamt4;
    }

    public BigDecimal getGltaxamt5() {
        return gltaxamt5;
    }

    public void setGltaxamt5(BigDecimal gltaxamt5) {
        this.gltaxamt5 = gltaxamt5;
    }

    public BigDecimal getBktaxamt1() {
        return bktaxamt1;
    }

    public void setBktaxamt1(BigDecimal bktaxamt1) {
        this.bktaxamt1 = bktaxamt1;
    }

    public BigDecimal getBktaxamt2() {
        return bktaxamt2;
    }

    public void setBktaxamt2(BigDecimal bktaxamt2) {
        this.bktaxamt2 = bktaxamt2;
    }

    public BigDecimal getBktaxamt3() {
        return bktaxamt3;
    }

    public void setBktaxamt3(BigDecimal bktaxamt3) {
        this.bktaxamt3 = bktaxamt3;
    }

    public BigDecimal getBktaxamt4() {
        return bktaxamt4;
    }

    public void setBktaxamt4(BigDecimal bktaxamt4) {
        this.bktaxamt4 = bktaxamt4;
    }

    public BigDecimal getBktaxamt5() {
        return bktaxamt5;
    }

    public void setBktaxamt5(BigDecimal bktaxamt5) {
        this.bktaxamt5 = bktaxamt5;
    }

    public BigDecimal getTcamtinctx() {
        return tcamtinctx;
    }

    public void setTcamtinctx(BigDecimal tcamtinctx) {
        this.tcamtinctx = tcamtinctx;
    }

    public BigDecimal getGlamtinctx() {
        return glamtinctx;
    }

    public void setGlamtinctx(BigDecimal glamtinctx) {
        this.glamtinctx = glamtinctx;
    }

    public BigDecimal getBkamtinctx() {
        return bkamtinctx;
    }

    public void setBkamtinctx(BigDecimal bkamtinctx) {
        this.bkamtinctx = bkamtinctx;
    }

    public BigDecimal getMsamtinctx() {
        return msamtinctx;
    }

    public void setMsamtinctx(BigDecimal msamtinctx) {
        this.msamtinctx = msamtinctx;
    }

    public BigDecimal getMiscamount() {
        return miscamount;
    }

    public void setMiscamount(BigDecimal miscamount) {
        this.miscamount = miscamount;
    }

    public BigDecimal getGlamount() {
        return glamount;
    }

    public void setGlamount(BigDecimal glamount) {
        this.glamount = glamount;
    }

    public BigDecimal getBkamount() {
        return bkamount;
    }

    public void setBkamount(BigDecimal bkamount) {
        this.bkamount = bkamount;
    }

    public BigDecimal getTotapplamt() {
        return totapplamt;
    }

    public void setTotapplamt(BigDecimal totapplamt) {
        this.totapplamt = totapplamt;
    }

    public BigDecimal getTotappldsc() {
        return totappldsc;
    }

    public void setTotappldsc(BigDecimal totappldsc) {
        this.totappldsc = totappldsc;
    }

    public BigDecimal getTotunappl() {
        return totunappl;
    }

    public void setTotunappl(BigDecimal totunappl) {
        this.totunappl = totunappl;
    }

    public BigDecimal getPjccost() {
        return pjccost;
    }

    public void setPjccost(BigDecimal pjccost) {
        this.pjccost = pjccost;
    }

    public int getNosubdetl() {
        return nosubdetl;
    }

    public void setNosubdetl(int nosubdetl) {
        this.nosubdetl = nosubdetl;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public short getProcesscmd() {
        return processcmd;
    }

    public void setProcesscmd(short processcmd) {
        this.processcmd = processcmd;
    }

    public BigDecimal getAmttaxrec1() {
        return amttaxrec1;
    }

    public void setAmttaxrec1(BigDecimal amttaxrec1) {
        this.amttaxrec1 = amttaxrec1;
    }

    public BigDecimal getAmttaxrec2() {
        return amttaxrec2;
    }

    public void setAmttaxrec2(BigDecimal amttaxrec2) {
        this.amttaxrec2 = amttaxrec2;
    }

    public BigDecimal getAmttaxrec3() {
        return amttaxrec3;
    }

    public void setAmttaxrec3(BigDecimal amttaxrec3) {
        this.amttaxrec3 = amttaxrec3;
    }

    public BigDecimal getAmttaxrec4() {
        return amttaxrec4;
    }

    public void setAmttaxrec4(BigDecimal amttaxrec4) {
        this.amttaxrec4 = amttaxrec4;
    }

    public BigDecimal getAmttaxrec5() {
        return amttaxrec5;
    }

    public void setAmttaxrec5(BigDecimal amttaxrec5) {
        this.amttaxrec5 = amttaxrec5;
    }

    public BigDecimal getAmttaxexp1() {
        return amttaxexp1;
    }

    public void setAmttaxexp1(BigDecimal amttaxexp1) {
        this.amttaxexp1 = amttaxexp1;
    }

    public BigDecimal getAmttaxexp2() {
        return amttaxexp2;
    }

    public void setAmttaxexp2(BigDecimal amttaxexp2) {
        this.amttaxexp2 = amttaxexp2;
    }

    public BigDecimal getAmttaxexp3() {
        return amttaxexp3;
    }

    public void setAmttaxexp3(BigDecimal amttaxexp3) {
        this.amttaxexp3 = amttaxexp3;
    }

    public BigDecimal getAmttaxexp4() {
        return amttaxexp4;
    }

    public void setAmttaxexp4(BigDecimal amttaxexp4) {
        this.amttaxexp4 = amttaxexp4;
    }

    public BigDecimal getAmttaxexp5() {
        return amttaxexp5;
    }

    public void setAmttaxexp5(BigDecimal amttaxexp5) {
        this.amttaxexp5 = amttaxexp5;
    }

    public BigDecimal getAmttaxtobe() {
        return amttaxtobe;
    }

    public void setAmttaxtobe(BigDecimal amttaxtobe) {
        this.amttaxtobe = amttaxtobe;
    }

    public BigDecimal getTxamt1Rc() {
        return txamt1Rc;
    }

    public void setTxamt1Rc(BigDecimal txamt1Rc) {
        this.txamt1Rc = txamt1Rc;
    }

    public BigDecimal getTxamt2Rc() {
        return txamt2Rc;
    }

    public void setTxamt2Rc(BigDecimal txamt2Rc) {
        this.txamt2Rc = txamt2Rc;
    }

    public BigDecimal getTxamt3Rc() {
        return txamt3Rc;
    }

    public void setTxamt3Rc(BigDecimal txamt3Rc) {
        this.txamt3Rc = txamt3Rc;
    }

    public BigDecimal getTxamt4Rc() {
        return txamt4Rc;
    }

    public void setTxamt4Rc(BigDecimal txamt4Rc) {
        this.txamt4Rc = txamt4Rc;
    }

    public BigDecimal getTxamt5Rc() {
        return txamt5Rc;
    }

    public void setTxamt5Rc(BigDecimal txamt5Rc) {
        this.txamt5Rc = txamt5Rc;
    }

    public BigDecimal getTxtotrc() {
        return txtotrc;
    }

    public void setTxtotrc(BigDecimal txtotrc) {
        this.txtotrc = txtotrc;
    }

    public BigDecimal getTxallrc() {
        return txallrc;
    }

    public void setTxallrc(BigDecimal txallrc) {
        this.txallrc = txallrc;
    }

    public BigDecimal getTxexp1Rc() {
        return txexp1Rc;
    }

    public void setTxexp1Rc(BigDecimal txexp1Rc) {
        this.txexp1Rc = txexp1Rc;
    }

    public BigDecimal getTxexp2Rc() {
        return txexp2Rc;
    }

    public void setTxexp2Rc(BigDecimal txexp2Rc) {
        this.txexp2Rc = txexp2Rc;
    }

    public BigDecimal getTxexp3Rc() {
        return txexp3Rc;
    }

    public void setTxexp3Rc(BigDecimal txexp3Rc) {
        this.txexp3Rc = txexp3Rc;
    }

    public BigDecimal getTxexp4Rc() {
        return txexp4Rc;
    }

    public void setTxexp4Rc(BigDecimal txexp4Rc) {
        this.txexp4Rc = txexp4Rc;
    }

    public BigDecimal getTxexp5Rc() {
        return txexp5Rc;
    }

    public void setTxexp5Rc(BigDecimal txexp5Rc) {
        this.txexp5Rc = txexp5Rc;
    }

    public BigDecimal getTxrec1Rc() {
        return txrec1Rc;
    }

    public void setTxrec1Rc(BigDecimal txrec1Rc) {
        this.txrec1Rc = txrec1Rc;
    }

    public BigDecimal getTxrec2Rc() {
        return txrec2Rc;
    }

    public void setTxrec2Rc(BigDecimal txrec2Rc) {
        this.txrec2Rc = txrec2Rc;
    }

    public BigDecimal getTxrec3Rc() {
        return txrec3Rc;
    }

    public void setTxrec3Rc(BigDecimal txrec3Rc) {
        this.txrec3Rc = txrec3Rc;
    }

    public BigDecimal getTxrec4Rc() {
        return txrec4Rc;
    }

    public void setTxrec4Rc(BigDecimal txrec4Rc) {
        this.txrec4Rc = txrec4Rc;
    }

    public BigDecimal getTxrec5Rc() {
        return txrec5Rc;
    }

    public void setTxrec5Rc(BigDecimal txrec5Rc) {
        this.txrec5Rc = txrec5Rc;
    }

    public BigDecimal getTxbse1Hc() {
        return txbse1Hc;
    }

    public void setTxbse1Hc(BigDecimal txbse1Hc) {
        this.txbse1Hc = txbse1Hc;
    }

    public BigDecimal getTxbse2Hc() {
        return txbse2Hc;
    }

    public void setTxbse2Hc(BigDecimal txbse2Hc) {
        this.txbse2Hc = txbse2Hc;
    }

    public BigDecimal getTxbse3Hc() {
        return txbse3Hc;
    }

    public void setTxbse3Hc(BigDecimal txbse3Hc) {
        this.txbse3Hc = txbse3Hc;
    }

    public BigDecimal getTxbse4Hc() {
        return txbse4Hc;
    }

    public void setTxbse4Hc(BigDecimal txbse4Hc) {
        this.txbse4Hc = txbse4Hc;
    }

    public BigDecimal getTxbse5Hc() {
        return txbse5Hc;
    }

    public void setTxbse5Hc(BigDecimal txbse5Hc) {
        this.txbse5Hc = txbse5Hc;
    }

    public BigDecimal getTxrec1Hc() {
        return txrec1Hc;
    }

    public void setTxrec1Hc(BigDecimal txrec1Hc) {
        this.txrec1Hc = txrec1Hc;
    }

    public BigDecimal getTxrec2Hc() {
        return txrec2Hc;
    }

    public void setTxrec2Hc(BigDecimal txrec2Hc) {
        this.txrec2Hc = txrec2Hc;
    }

    public BigDecimal getTxrec3Hc() {
        return txrec3Hc;
    }

    public void setTxrec3Hc(BigDecimal txrec3Hc) {
        this.txrec3Hc = txrec3Hc;
    }

    public BigDecimal getTxrec4Hc() {
        return txrec4Hc;
    }

    public void setTxrec4Hc(BigDecimal txrec4Hc) {
        this.txrec4Hc = txrec4Hc;
    }

    public BigDecimal getTxrec5Hc() {
        return txrec5Hc;
    }

    public void setTxrec5Hc(BigDecimal txrec5Hc) {
        this.txrec5Hc = txrec5Hc;
    }

    public BigDecimal getTxexp1Hc() {
        return txexp1Hc;
    }

    public void setTxexp1Hc(BigDecimal txexp1Hc) {
        this.txexp1Hc = txexp1Hc;
    }

    public BigDecimal getTxexp2Hc() {
        return txexp2Hc;
    }

    public void setTxexp2Hc(BigDecimal txexp2Hc) {
        this.txexp2Hc = txexp2Hc;
    }

    public BigDecimal getTxexp3Hc() {
        return txexp3Hc;
    }

    public void setTxexp3Hc(BigDecimal txexp3Hc) {
        this.txexp3Hc = txexp3Hc;
    }

    public BigDecimal getTxexp4Hc() {
        return txexp4Hc;
    }

    public void setTxexp4Hc(BigDecimal txexp4Hc) {
        this.txexp4Hc = txexp4Hc;
    }

    public BigDecimal getTxexp5Hc() {
        return txexp5Hc;
    }

    public void setTxexp5Hc(BigDecimal txexp5Hc) {
        this.txexp5Hc = txexp5Hc;
    }

    public BigDecimal getTxallhc() {
        return txallhc;
    }

    public void setTxallhc(BigDecimal txallhc) {
        this.txallhc = txallhc;
    }

    public BigDecimal getTxall1Hc() {
        return txall1Hc;
    }

    public void setTxall1Hc(BigDecimal txall1Hc) {
        this.txall1Hc = txall1Hc;
    }

    public BigDecimal getTxall2Hc() {
        return txall2Hc;
    }

    public void setTxall2Hc(BigDecimal txall2Hc) {
        this.txall2Hc = txall2Hc;
    }

    public BigDecimal getTxall3Hc() {
        return txall3Hc;
    }

    public void setTxall3Hc(BigDecimal txall3Hc) {
        this.txall3Hc = txall3Hc;
    }

    public BigDecimal getTxall4Hc() {
        return txall4Hc;
    }

    public void setTxall4Hc(BigDecimal txall4Hc) {
        this.txall4Hc = txall4Hc;
    }

    public BigDecimal getTxall5Hc() {
        return txall5Hc;
    }

    public void setTxall5Hc(BigDecimal txall5Hc) {
        this.txall5Hc = txall5Hc;
    }

    public BigDecimal getTxall1Tc() {
        return txall1Tc;
    }

    public void setTxall1Tc(BigDecimal txall1Tc) {
        this.txall1Tc = txall1Tc;
    }

    public BigDecimal getTxall2Tc() {
        return txall2Tc;
    }

    public void setTxall2Tc(BigDecimal txall2Tc) {
        this.txall2Tc = txall2Tc;
    }

    public BigDecimal getTxall3Tc() {
        return txall3Tc;
    }

    public void setTxall3Tc(BigDecimal txall3Tc) {
        this.txall3Tc = txall3Tc;
    }

    public BigDecimal getTxall4Tc() {
        return txall4Tc;
    }

    public void setTxall4Tc(BigDecimal txall4Tc) {
        this.txall4Tc = txall4Tc;
    }

    public BigDecimal getTxall5Tc() {
        return txall5Tc;
    }

    public void setTxall5Tc(BigDecimal txall5Tc) {
        this.txall5Tc = txall5Tc;
    }

    public BigDecimal getTxexcltc() {
        return txexcltc;
    }

    public void setTxexcltc(BigDecimal txexcltc) {
        this.txexcltc = txexcltc;
    }

    public BigDecimal getTxexclhc() {
        return txexclhc;
    }

    public void setTxexclhc(BigDecimal txexclhc) {
        this.txexclhc = txexclhc;
    }

    public BigDecimal getTxexclbc() {
        return txexclbc;
    }

    public void setTxexclbc(BigDecimal txexclbc) {
        this.txexclbc = txexclbc;
    }

    public BigDecimal getTxexclmc() {
        return txexclmc;
    }

    public void setTxexclmc(BigDecimal txexclmc) {
        this.txexclmc = txexclmc;
    }

    public int getRevuniq() {
        return revuniq;
    }

    public void setRevuniq(int revuniq) {
        this.revuniq = revuniq;
    }

    public int getNewrevuniq() {
        return newrevuniq;
    }

    public void setNewrevuniq(int newrevuniq) {
        this.newrevuniq = newrevuniq;
    }

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
        return audtdate == cbbtdt.audtdate && audttime == cbbtdt.audttime && taxtype == cbbtdt.taxtype && swcash == cbbtdt.swcash && miscbkline == cbbtdt.miscbkline && allocmode == cbbtdt.allocmode && acctqtysw == cbbtdt.acctqtysw && taxqtysw == cbbtdt.taxqtysw && swjob == cbbtdt.swjob && swallocate == cbbtdt.swallocate && entrytype == cbbtdt.entrytype && swmanltx == cbbtdt.swmanltx && taxclass1 == cbbtdt.taxclass1 && taxclass2 == cbbtdt.taxclass2 && taxclass3 == cbbtdt.taxclass3 && taxclass4 == cbbtdt.taxclass4 && taxclass5 == cbbtdt.taxclass5 && swtaxincl1 == cbbtdt.swtaxincl1 && swtaxincl2 == cbbtdt.swtaxincl2 && swtaxincl3 == cbbtdt.swtaxincl3 && swtaxincl4 == cbbtdt.swtaxincl4 && swtaxincl5 == cbbtdt.swtaxincl5 && nosubdetl == cbbtdt.nosubdetl && values == cbbtdt.values && processcmd == cbbtdt.processcmd && revuniq == cbbtdt.revuniq && newrevuniq == cbbtdt.newrevuniq && Objects.equals(batchid, cbbtdt.batchid) && Objects.equals(entryno, cbbtdt.entryno) && Objects.equals(detailno, cbbtdt.detailno) && Objects.equals(audtuser, cbbtdt.audtuser) && Objects.equals(audtorg, cbbtdt.audtorg) && Objects.equals(srcecode, cbbtdt.srcecode) && Objects.equals(textdesc, cbbtdt.textdesc) && Objects.equals(acctid, cbbtdt.acctid) && Objects.equals(taxcode, cbbtdt.taxcode) && Objects.equals(taxpercnt, cbbtdt.taxpercnt) && Objects.equals(taxamount, cbbtdt.taxamount) && Objects.equals(dtlamount, cbbtdt.dtlamount) && Objects.equals(quantity, cbbtdt.quantity) && Objects.equals(comments, cbbtdt.comments) && Objects.equals(rcptno, cbbtdt.rcptno) && Objects.equals(rcptdesc, cbbtdt.rcptdesc) && Objects.equals(misccode, cbbtdt.misccode) && Objects.equals(rcptentry, cbbtdt.rcptentry) && Objects.equals(acctiduf, cbbtdt.acctiduf) && Objects.equals(acctdesc, cbbtdt.acctdesc) && Objects.equals(accttax, cbbtdt.accttax) && Objects.equals(accttaxuf, cbbtdt.accttaxuf) && Objects.equals(taxdesc, cbbtdt.taxdesc) && Objects.equals(adjamount, cbbtdt.adjamount) && Objects.equals(debitamt, cbbtdt.debitamt) && Objects.equals(creditamt, cbbtdt.creditamt) && Objects.equals(pjcamt, cbbtdt.pjcamt) && Objects.equals(pjcdisc, cbbtdt.pjcdisc) && Objects.equals(docnumber, cbbtdt.docnumber) && Objects.equals(tottax, cbbtdt.tottax) && Objects.equals(basetax1, cbbtdt.basetax1) && Objects.equals(basetax2, cbbtdt.basetax2) && Objects.equals(basetax3, cbbtdt.basetax3) && Objects.equals(basetax4, cbbtdt.basetax4) && Objects.equals(basetax5, cbbtdt.basetax5) && Objects.equals(ratetax1, cbbtdt.ratetax1) && Objects.equals(ratetax2, cbbtdt.ratetax2) && Objects.equals(ratetax3, cbbtdt.ratetax3) && Objects.equals(ratetax4, cbbtdt.ratetax4) && Objects.equals(ratetax5, cbbtdt.ratetax5) && Objects.equals(amttax1, cbbtdt.amttax1) && Objects.equals(amttax2, cbbtdt.amttax2) && Objects.equals(amttax3, cbbtdt.amttax3) && Objects.equals(amttax4, cbbtdt.amttax4) && Objects.equals(amttax5, cbbtdt.amttax5) && Objects.equals(misctax1, cbbtdt.misctax1) && Objects.equals(misctax2, cbbtdt.misctax2) && Objects.equals(misctax3, cbbtdt.misctax3) && Objects.equals(misctax4, cbbtdt.misctax4) && Objects.equals(misctax5, cbbtdt.misctax5) && Objects.equals(gltaxamt1, cbbtdt.gltaxamt1) && Objects.equals(gltaxamt2, cbbtdt.gltaxamt2) && Objects.equals(gltaxamt3, cbbtdt.gltaxamt3) && Objects.equals(gltaxamt4, cbbtdt.gltaxamt4) && Objects.equals(gltaxamt5, cbbtdt.gltaxamt5) && Objects.equals(bktaxamt1, cbbtdt.bktaxamt1) && Objects.equals(bktaxamt2, cbbtdt.bktaxamt2) && Objects.equals(bktaxamt3, cbbtdt.bktaxamt3) && Objects.equals(bktaxamt4, cbbtdt.bktaxamt4) && Objects.equals(bktaxamt5, cbbtdt.bktaxamt5) && Objects.equals(tcamtinctx, cbbtdt.tcamtinctx) && Objects.equals(glamtinctx, cbbtdt.glamtinctx) && Objects.equals(bkamtinctx, cbbtdt.bkamtinctx) && Objects.equals(msamtinctx, cbbtdt.msamtinctx) && Objects.equals(miscamount, cbbtdt.miscamount) && Objects.equals(glamount, cbbtdt.glamount) && Objects.equals(bkamount, cbbtdt.bkamount) && Objects.equals(totapplamt, cbbtdt.totapplamt) && Objects.equals(totappldsc, cbbtdt.totappldsc) && Objects.equals(totunappl, cbbtdt.totunappl) && Objects.equals(pjccost, cbbtdt.pjccost) && Objects.equals(amttaxrec1, cbbtdt.amttaxrec1) && Objects.equals(amttaxrec2, cbbtdt.amttaxrec2) && Objects.equals(amttaxrec3, cbbtdt.amttaxrec3) && Objects.equals(amttaxrec4, cbbtdt.amttaxrec4) && Objects.equals(amttaxrec5, cbbtdt.amttaxrec5) && Objects.equals(amttaxexp1, cbbtdt.amttaxexp1) && Objects.equals(amttaxexp2, cbbtdt.amttaxexp2) && Objects.equals(amttaxexp3, cbbtdt.amttaxexp3) && Objects.equals(amttaxexp4, cbbtdt.amttaxexp4) && Objects.equals(amttaxexp5, cbbtdt.amttaxexp5) && Objects.equals(amttaxtobe, cbbtdt.amttaxtobe) && Objects.equals(txamt1Rc, cbbtdt.txamt1Rc) && Objects.equals(txamt2Rc, cbbtdt.txamt2Rc) && Objects.equals(txamt3Rc, cbbtdt.txamt3Rc) && Objects.equals(txamt4Rc, cbbtdt.txamt4Rc) && Objects.equals(txamt5Rc, cbbtdt.txamt5Rc) && Objects.equals(txtotrc, cbbtdt.txtotrc) && Objects.equals(txallrc, cbbtdt.txallrc) && Objects.equals(txexp1Rc, cbbtdt.txexp1Rc) && Objects.equals(txexp2Rc, cbbtdt.txexp2Rc) && Objects.equals(txexp3Rc, cbbtdt.txexp3Rc) && Objects.equals(txexp4Rc, cbbtdt.txexp4Rc) && Objects.equals(txexp5Rc, cbbtdt.txexp5Rc) && Objects.equals(txrec1Rc, cbbtdt.txrec1Rc) && Objects.equals(txrec2Rc, cbbtdt.txrec2Rc) && Objects.equals(txrec3Rc, cbbtdt.txrec3Rc) && Objects.equals(txrec4Rc, cbbtdt.txrec4Rc) && Objects.equals(txrec5Rc, cbbtdt.txrec5Rc) && Objects.equals(txbse1Hc, cbbtdt.txbse1Hc) && Objects.equals(txbse2Hc, cbbtdt.txbse2Hc) && Objects.equals(txbse3Hc, cbbtdt.txbse3Hc) && Objects.equals(txbse4Hc, cbbtdt.txbse4Hc) && Objects.equals(txbse5Hc, cbbtdt.txbse5Hc) && Objects.equals(txrec1Hc, cbbtdt.txrec1Hc) && Objects.equals(txrec2Hc, cbbtdt.txrec2Hc) && Objects.equals(txrec3Hc, cbbtdt.txrec3Hc) && Objects.equals(txrec4Hc, cbbtdt.txrec4Hc) && Objects.equals(txrec5Hc, cbbtdt.txrec5Hc) && Objects.equals(txexp1Hc, cbbtdt.txexp1Hc) && Objects.equals(txexp2Hc, cbbtdt.txexp2Hc) && Objects.equals(txexp3Hc, cbbtdt.txexp3Hc) && Objects.equals(txexp4Hc, cbbtdt.txexp4Hc) && Objects.equals(txexp5Hc, cbbtdt.txexp5Hc) && Objects.equals(txallhc, cbbtdt.txallhc) && Objects.equals(txall1Hc, cbbtdt.txall1Hc) && Objects.equals(txall2Hc, cbbtdt.txall2Hc) && Objects.equals(txall3Hc, cbbtdt.txall3Hc) && Objects.equals(txall4Hc, cbbtdt.txall4Hc) && Objects.equals(txall5Hc, cbbtdt.txall5Hc) && Objects.equals(txall1Tc, cbbtdt.txall1Tc) && Objects.equals(txall2Tc, cbbtdt.txall2Tc) && Objects.equals(txall3Tc, cbbtdt.txall3Tc) && Objects.equals(txall4Tc, cbbtdt.txall4Tc) && Objects.equals(txall5Tc, cbbtdt.txall5Tc) && Objects.equals(txexcltc, cbbtdt.txexcltc) && Objects.equals(txexclhc, cbbtdt.txexclhc) && Objects.equals(txexclbc, cbbtdt.txexclbc) && Objects.equals(txexclmc, cbbtdt.txexclmc) && Objects.equals(rvdetailno, cbbtdt.rvdetailno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, detailno, audtdate, audttime, audtuser, audtorg, srcecode, textdesc, acctid, taxcode, taxtype, taxpercnt, taxamount, dtlamount, quantity, comments, rcptno, swcash, rcptdesc, misccode, miscbkline, rcptentry, acctiduf, allocmode, acctdesc, acctqtysw, accttax, accttaxuf, taxdesc, taxqtysw, adjamount, swjob, debitamt, creditamt, swallocate, pjcamt, pjcdisc, entrytype, docnumber, tottax, swmanltx, basetax1, basetax2, basetax3, basetax4, basetax5, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, swtaxincl1, swtaxincl2, swtaxincl3, swtaxincl4, swtaxincl5, ratetax1, ratetax2, ratetax3, ratetax4, ratetax5, amttax1, amttax2, amttax3, amttax4, amttax5, misctax1, misctax2, misctax3, misctax4, misctax5, gltaxamt1, gltaxamt2, gltaxamt3, gltaxamt4, gltaxamt5, bktaxamt1, bktaxamt2, bktaxamt3, bktaxamt4, bktaxamt5, tcamtinctx, glamtinctx, bkamtinctx, msamtinctx, miscamount, glamount, bkamount, totapplamt, totappldsc, totunappl, pjccost, nosubdetl, values, processcmd, amttaxrec1, amttaxrec2, amttaxrec3, amttaxrec4, amttaxrec5, amttaxexp1, amttaxexp2, amttaxexp3, amttaxexp4, amttaxexp5, amttaxtobe, txamt1Rc, txamt2Rc, txamt3Rc, txamt4Rc, txamt5Rc, txtotrc, txallrc, txexp1Rc, txexp2Rc, txexp3Rc, txexp4Rc, txexp5Rc, txrec1Rc, txrec2Rc, txrec3Rc, txrec4Rc, txrec5Rc, txbse1Hc, txbse2Hc, txbse3Hc, txbse4Hc, txbse5Hc, txrec1Hc, txrec2Hc, txrec3Hc, txrec4Hc, txrec5Hc, txexp1Hc, txexp2Hc, txexp3Hc, txexp4Hc, txexp5Hc, txallhc, txall1Hc, txall2Hc, txall3Hc, txall4Hc, txall5Hc, txall1Tc, txall2Tc, txall3Tc, txall4Tc, txall5Tc, txexcltc, txexclhc, txexclbc, txexclmc, revuniq, newrevuniq, rvdetailno);
    }
}
