package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@IdClass(CbbthdPK.class)
public class Cbbthd {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATCHID", nullable = false, length = 6)
    private String batchid;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ENTRYNO", nullable = false, length = 5)
    private String entryno;
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
    @Column(name = "ENTRYTYPE", nullable = false)
    private short entrytype;
    @Basic
    @Column(name = "REFERENCE", nullable = false, length = 12)
    private String reference;
    @Basic
    @Column(name = "PERIOD", nullable = false, length = 2)
    private String period;
    @Basic
    @Column(name = "DATE", nullable = false, precision = 0)
    private int date;
    @Basic
    @Column(name = "DATECHQPRN", nullable = false, precision = 0)
    private int datechqprn;
    @Basic
    @Column(name = "SWCHQPRN", nullable = false)
    private short swchqprn;
    @Basic
    @Column(name = "MISCCODE", nullable = false, length = 12)
    private String misccode;
    @Basic
    @Column(name = "TEXTDESC", nullable = false, length = 60)
    private String textdesc;
    @Basic
    @Column(name = "DISTCODE", nullable = false, length = 6)
    private String distcode;
    @Basic
    @Column(name = "CHARGECODE", nullable = false, length = 2)
    private String chargecode;
    @Basic
    @Column(name = "CHRGAMOUNT", nullable = false, precision = 3)
    private BigDecimal chrgamount;
    @Basic
    @Column(name = "NODETAILS", nullable = false)
    private int nodetails;
    @Basic
    @Column(name = "TOTAMOUNT", nullable = false, precision = 3)
    private BigDecimal totamount;
    @Basic
    @Column(name = "TOTTAX", nullable = false, precision = 3)
    private BigDecimal tottax;
    @Basic
    @Column(name = "TAXPERCNT", nullable = false, precision = 3)
    private BigDecimal taxpercnt;
    @Basic
    @Column(name = "BK2GLCURHM", nullable = false, length = 3)
    private String bk2Glcurhm;
    @Basic
    @Column(name = "BK2GLRTTYP", nullable = false, length = 2)
    private String bk2Glrttyp;
    @Basic
    @Column(name = "BK2GLCURSR", nullable = false, length = 3)
    private String bk2Glcursr;
    @Basic
    @Column(name = "BK2GLDATE", nullable = false, precision = 0)
    private int bk2Gldate;
    @Basic
    @Column(name = "BK2GLRATE", nullable = false, precision = 7)
    private BigDecimal bk2Glrate;
    @Basic
    @Column(name = "BK2GLSPRD", nullable = false, precision = 7)
    private BigDecimal bk2Glsprd;
    @Basic
    @Column(name = "BK2GLOP", nullable = false)
    private short bk2Glop;
    @Basic
    @Column(name = "BK2GLDTMTH", nullable = false)
    private short bk2Gldtmth;
    @Basic
    @Column(name = "BT2GLCURHM", nullable = false, length = 3)
    private String bt2Glcurhm;
    @Basic
    @Column(name = "BT2GLRTTYP", nullable = false, length = 2)
    private String bt2Glrttyp;
    @Basic
    @Column(name = "BT2GLCURSR", nullable = false, length = 3)
    private String bt2Glcursr;
    @Basic
    @Column(name = "BT2GLDATE", nullable = false, precision = 0)
    private int bt2Gldate;
    @Basic
    @Column(name = "BT2GLRATE", nullable = false, precision = 7)
    private BigDecimal bt2Glrate;
    @Basic
    @Column(name = "BT2GLSPRD", nullable = false, precision = 7)
    private BigDecimal bt2Glsprd;
    @Basic
    @Column(name = "BT2GLOP", nullable = false)
    private short bt2Glop;
    @Basic
    @Column(name = "BT2GLDTMTH", nullable = false)
    private short bt2Gldtmth;
    @Basic
    @Column(name = "MS2GLCURHM", nullable = false, length = 3)
    private String ms2Glcurhm;
    @Basic
    @Column(name = "MS2GLRTTYP", nullable = false, length = 2)
    private String ms2Glrttyp;
    @Basic
    @Column(name = "MS2GLCURSR", nullable = false, length = 3)
    private String ms2Glcursr;
    @Basic
    @Column(name = "MS2GLDATE", nullable = false, precision = 0)
    private int ms2Gldate;
    @Basic
    @Column(name = "MS2GLRATE", nullable = false, precision = 7)
    private BigDecimal ms2Glrate;
    @Basic
    @Column(name = "MS2GLSPRD", nullable = false, precision = 7)
    private BigDecimal ms2Glsprd;
    @Basic
    @Column(name = "MS2GLOP", nullable = false)
    private short ms2Glop;
    @Basic
    @Column(name = "MS2GLDTMTH", nullable = false)
    private short ms2Gldtmth;
    @Basic
    @Column(name = "SWCASH", nullable = false)
    private short swcash;
    @Basic
    @Column(name = "BTCHNODEC", nullable = false)
    private short btchnodec;
    @Basic
    @Column(name = "MISCNODEC", nullable = false)
    private short miscnodec;
    @Basic
    @Column(name = "TAXGROUP", nullable = false, length = 12)
    private String taxgroup;
    @Basic
    @Column(name = "CUSTCHQNO", nullable = false, length = 24)
    private String custchqno;
    @Basic
    @Column(name = "NOSUBDETL", nullable = false)
    private int nosubdetl;
    @Basic
    @Column(name = "APPLAMOUNT", nullable = false, precision = 3)
    private BigDecimal applamount;
    @Basic
    @Column(name = "APPLDISC", nullable = false, precision = 3)
    private BigDecimal appldisc;
    @Basic
    @Column(name = "ACCTNAT", nullable = false, length = 12)
    private String acctnat;
    @Basic
    @Column(name = "ADJAMOUNT", nullable = false, precision = 3)
    private BigDecimal adjamount;
    @Basic
    @Column(name = "PROFILEID", nullable = false, length = 8)
    private String profileid;
    @Basic
    @Column(name = "SWINTERCO", nullable = false)
    private short swinterco;
    @Basic
    @Column(name = "FISCYR", nullable = false, length = 4)
    private String fiscyr;
    @Basic
    @Column(name = "CCTYPE", nullable = false, length = 12)
    private String cctype;
    @Basic
    @Column(name = "CCNUMBER", nullable = false)
    private Object ccnumber;
    @Basic
    @Column(name = "CCNAME", nullable = false, length = 60)
    private String ccname;
    @Basic
    @Column(name = "CCEXP", nullable = false, precision = 0)
    private int ccexp;
    @Basic
    @Column(name = "CCAUTHCODE", nullable = false, length = 20)
    private String ccauthcode;
    @Basic
    @Column(name = "XCCNUMBER", nullable = false, length = 32)
    private String xccnumber;
    @Basic
    @Column(name = "SERIAL", nullable = false)
    private int serial;
    @Basic
    @Column(name = "BANKAMOUNT", nullable = false, precision = 3)
    private BigDecimal bankamount;
    @Basic
    @Column(name = "BTCHAMOUNT", nullable = false, precision = 3)
    private BigDecimal btchamount;
    @Basic
    @Column(name = "MISCAMOUNT", nullable = false, precision = 3)
    private BigDecimal miscamount;
    @Basic
    @Column(name = "FUNCAMOUNT", nullable = false, precision = 3)
    private BigDecimal funcamount;
    @Basic
    @Column(name = "HDRDEBIT", nullable = false, precision = 3)
    private BigDecimal hdrdebit;
    @Basic
    @Column(name = "HDRCREDIT", nullable = false, precision = 3)
    private BigDecimal hdrcredit;
    @Basic
    @Column(name = "TAXAUTH1", nullable = false, length = 12)
    private String taxauth1;
    @Basic
    @Column(name = "TAXAUTH2", nullable = false, length = 12)
    private String taxauth2;
    @Basic
    @Column(name = "TAXAUTH3", nullable = false, length = 12)
    private String taxauth3;
    @Basic
    @Column(name = "TAXAUTH4", nullable = false, length = 12)
    private String taxauth4;
    @Basic
    @Column(name = "TAXAUTH5", nullable = false, length = 12)
    private String taxauth5;
    @Basic
    @Column(name = "TXAU1DESC", nullable = false, length = 60)
    private String txau1Desc;
    @Basic
    @Column(name = "TXAU2DESC", nullable = false, length = 60)
    private String txau2Desc;
    @Basic
    @Column(name = "TXAU3DESC", nullable = false, length = 60)
    private String txau3Desc;
    @Basic
    @Column(name = "TXAU4DESC", nullable = false, length = 60)
    private String txau4Desc;
    @Basic
    @Column(name = "TXAU5DESC", nullable = false, length = 60)
    private String txau5Desc;
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
    @Column(name = "BANKCODE", nullable = false, length = 12)
    private String bankcode;
    @Basic
    @Column(name = "SWPOSTED", nullable = false)
    private short swposted;
    @Basic
    @Column(name = "VALUES", nullable = false)
    private int values;
    @Basic
    @Column(name = "PROCESSCMD", nullable = false)
    private short processcmd;
    @Basic
    @Column(name = "TOTUNAPPL", nullable = false, precision = 3)
    private BigDecimal totunappl;
    @Basic
    @Column(name = "TOTAPPLAMT", nullable = false, precision = 3)
    private BigDecimal totapplamt;
    @Basic
    @Column(name = "TOTAPPLDSC", nullable = false, precision = 3)
    private BigDecimal totappldsc;
    @Basic
    @Column(name = "ALLOCMODE", nullable = false)
    private short allocmode;
    @Basic
    @Column(name = "ALLOCAMT", nullable = false, precision = 3)
    private BigDecimal allocamt;
    @Basic
    @Column(name = "CLASSTYPE", nullable = false)
    private short classtype;
    @Basic
    @Column(name = "CLASSAXIS", nullable = false)
    private short classaxis;
    @Basic
    @Column(name = "DATALEVEL", nullable = false)
    private short datalevel;
    @Basic
    @Column(name = "RECXCNTER", nullable = false)
    private int recxcnter;
    @Basic
    @Column(name = "RATERC", nullable = false, precision = 7)
    private BigDecimal raterc;
    @Basic
    @Column(name = "RATETYPERC", nullable = false, length = 2)
    private String ratetyperc;
    @Basic
    @Column(name = "RATEOPRC", nullable = false)
    private short rateoprc;
    @Basic
    @Column(name = "RATEDATERC", nullable = false, precision = 0)
    private int ratedaterc;
    @Basic
    @Column(name = "CODECURNRC", nullable = false, length = 3)
    private String codecurnrc;
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
    @Column(name = "TXEXPRC", nullable = false, precision = 3)
    private BigDecimal txexprc;
    @Basic
    @Column(name = "TXRECRC", nullable = false, precision = 3)
    private BigDecimal txrecrc;
    @Basic
    @Column(name = "AMTRECTAX", nullable = false, precision = 3)
    private BigDecimal amtrectax;
    @Basic
    @Column(name = "AMTEXPTAX", nullable = false, precision = 3)
    private BigDecimal amtexptax;
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
    @Column(name = "TXAMT1HC", nullable = false, precision = 3)
    private BigDecimal txamt1Hc;
    @Basic
    @Column(name = "TXAMT2HC", nullable = false, precision = 3)
    private BigDecimal txamt2Hc;
    @Basic
    @Column(name = "TXAMT3HC", nullable = false, precision = 3)
    private BigDecimal txamt3Hc;
    @Basic
    @Column(name = "TXAMT4HC", nullable = false, precision = 3)
    private BigDecimal txamt4Hc;
    @Basic
    @Column(name = "TXAMT5HC", nullable = false, precision = 3)
    private BigDecimal txamt5Hc;
    @Basic
    @Column(name = "ACCTREC1", nullable = false, length = 45)
    private String acctrec1;
    @Basic
    @Column(name = "ACCTREC2", nullable = false, length = 45)
    private String acctrec2;
    @Basic
    @Column(name = "ACCTREC3", nullable = false, length = 45)
    private String acctrec3;
    @Basic
    @Column(name = "ACCTREC4", nullable = false, length = 45)
    private String acctrec4;
    @Basic
    @Column(name = "ACCTREC5", nullable = false, length = 45)
    private String acctrec5;
    @Basic
    @Column(name = "ACCTEXP1", nullable = false, length = 45)
    private String acctexp1;
    @Basic
    @Column(name = "ACCTEXP2", nullable = false, length = 45)
    private String acctexp2;
    @Basic
    @Column(name = "ACCTEXP3", nullable = false, length = 45)
    private String acctexp3;
    @Basic
    @Column(name = "ACCTEXP4", nullable = false, length = 45)
    private String acctexp4;
    @Basic
    @Column(name = "ACCTEXP5", nullable = false, length = 45)
    private String acctexp5;
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
    @Column(name = "TXINCLTC", nullable = false, precision = 3)
    private BigDecimal txincltc;
    @Basic
    @Column(name = "TXINCLHC", nullable = false, precision = 3)
    private BigDecimal txinclhc;
    @Basic
    @Column(name = "TXINCLBC", nullable = false, precision = 3)
    private BigDecimal txinclbc;
    @Basic
    @Column(name = "TXINCLMC", nullable = false, precision = 3)
    private BigDecimal txinclmc;
    @Basic
    @Column(name = "ARAPBATCH", nullable = false, length = 9)
    private String arapbatch;
    @Basic
    @Column(name = "ARAPENTRY", nullable = false, length = 9)
    private String arapentry;
    @Basic
    @Column(name = "SWCHEQUE", nullable = false)
    private short swcheque;
    @Basic
    @Column(name = "SWEFT", nullable = false)
    private short sweft;
    @Basic
    @Column(name = "RXMTCHSEQ", nullable = false)
    private short rxmtchseq;
    @Basic
    @Column(name = "RXTRNSCODE", nullable = false, length = 30)
    private String rxtrnscode;
    @Basic
    @Column(name = "RXCATEGORY", nullable = false, length = 12)
    private String rxcategory;
    @Basic
    @Column(name = "REVUNIQ", nullable = false)
    private int revuniq;
    @Basic
    @Column(name = "NEWREVUNIQ", nullable = false)
    private int newrevuniq;
    @Basic
    @Column(name = "ENTEREDBY", nullable = false, length = 8)
    private String enteredby;

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

    public short getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(short entrytype) {
        this.entrytype = entrytype;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDatechqprn() {
        return datechqprn;
    }

    public void setDatechqprn(int datechqprn) {
        this.datechqprn = datechqprn;
    }

    public short getSwchqprn() {
        return swchqprn;
    }

    public void setSwchqprn(short swchqprn) {
        this.swchqprn = swchqprn;
    }

    public String getMisccode() {
        return misccode;
    }

    public void setMisccode(String misccode) {
        this.misccode = misccode;
    }

    public String getTextdesc() {
        return textdesc;
    }

    public void setTextdesc(String textdesc) {
        this.textdesc = textdesc;
    }

    public String getDistcode() {
        return distcode;
    }

    public void setDistcode(String distcode) {
        this.distcode = distcode;
    }

    public String getChargecode() {
        return chargecode;
    }

    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }

    public BigDecimal getChrgamount() {
        return chrgamount;
    }

    public void setChrgamount(BigDecimal chrgamount) {
        this.chrgamount = chrgamount;
    }

    public int getNodetails() {
        return nodetails;
    }

    public void setNodetails(int nodetails) {
        this.nodetails = nodetails;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public BigDecimal getTottax() {
        return tottax;
    }

    public void setTottax(BigDecimal tottax) {
        this.tottax = tottax;
    }

    public BigDecimal getTaxpercnt() {
        return taxpercnt;
    }

    public void setTaxpercnt(BigDecimal taxpercnt) {
        this.taxpercnt = taxpercnt;
    }

    public String getBk2Glcurhm() {
        return bk2Glcurhm;
    }

    public void setBk2Glcurhm(String bk2Glcurhm) {
        this.bk2Glcurhm = bk2Glcurhm;
    }

    public String getBk2Glrttyp() {
        return bk2Glrttyp;
    }

    public void setBk2Glrttyp(String bk2Glrttyp) {
        this.bk2Glrttyp = bk2Glrttyp;
    }

    public String getBk2Glcursr() {
        return bk2Glcursr;
    }

    public void setBk2Glcursr(String bk2Glcursr) {
        this.bk2Glcursr = bk2Glcursr;
    }

    public int getBk2Gldate() {
        return bk2Gldate;
    }

    public void setBk2Gldate(int bk2Gldate) {
        this.bk2Gldate = bk2Gldate;
    }

    public BigDecimal getBk2Glrate() {
        return bk2Glrate;
    }

    public void setBk2Glrate(BigDecimal bk2Glrate) {
        this.bk2Glrate = bk2Glrate;
    }

    public BigDecimal getBk2Glsprd() {
        return bk2Glsprd;
    }

    public void setBk2Glsprd(BigDecimal bk2Glsprd) {
        this.bk2Glsprd = bk2Glsprd;
    }

    public short getBk2Glop() {
        return bk2Glop;
    }

    public void setBk2Glop(short bk2Glop) {
        this.bk2Glop = bk2Glop;
    }

    public short getBk2Gldtmth() {
        return bk2Gldtmth;
    }

    public void setBk2Gldtmth(short bk2Gldtmth) {
        this.bk2Gldtmth = bk2Gldtmth;
    }

    public String getBt2Glcurhm() {
        return bt2Glcurhm;
    }

    public void setBt2Glcurhm(String bt2Glcurhm) {
        this.bt2Glcurhm = bt2Glcurhm;
    }

    public String getBt2Glrttyp() {
        return bt2Glrttyp;
    }

    public void setBt2Glrttyp(String bt2Glrttyp) {
        this.bt2Glrttyp = bt2Glrttyp;
    }

    public String getBt2Glcursr() {
        return bt2Glcursr;
    }

    public void setBt2Glcursr(String bt2Glcursr) {
        this.bt2Glcursr = bt2Glcursr;
    }

    public int getBt2Gldate() {
        return bt2Gldate;
    }

    public void setBt2Gldate(int bt2Gldate) {
        this.bt2Gldate = bt2Gldate;
    }

    public BigDecimal getBt2Glrate() {
        return bt2Glrate;
    }

    public void setBt2Glrate(BigDecimal bt2Glrate) {
        this.bt2Glrate = bt2Glrate;
    }

    public BigDecimal getBt2Glsprd() {
        return bt2Glsprd;
    }

    public void setBt2Glsprd(BigDecimal bt2Glsprd) {
        this.bt2Glsprd = bt2Glsprd;
    }

    public short getBt2Glop() {
        return bt2Glop;
    }

    public void setBt2Glop(short bt2Glop) {
        this.bt2Glop = bt2Glop;
    }

    public short getBt2Gldtmth() {
        return bt2Gldtmth;
    }

    public void setBt2Gldtmth(short bt2Gldtmth) {
        this.bt2Gldtmth = bt2Gldtmth;
    }

    public String getMs2Glcurhm() {
        return ms2Glcurhm;
    }

    public void setMs2Glcurhm(String ms2Glcurhm) {
        this.ms2Glcurhm = ms2Glcurhm;
    }

    public String getMs2Glrttyp() {
        return ms2Glrttyp;
    }

    public void setMs2Glrttyp(String ms2Glrttyp) {
        this.ms2Glrttyp = ms2Glrttyp;
    }

    public String getMs2Glcursr() {
        return ms2Glcursr;
    }

    public void setMs2Glcursr(String ms2Glcursr) {
        this.ms2Glcursr = ms2Glcursr;
    }

    public int getMs2Gldate() {
        return ms2Gldate;
    }

    public void setMs2Gldate(int ms2Gldate) {
        this.ms2Gldate = ms2Gldate;
    }

    public BigDecimal getMs2Glrate() {
        return ms2Glrate;
    }

    public void setMs2Glrate(BigDecimal ms2Glrate) {
        this.ms2Glrate = ms2Glrate;
    }

    public BigDecimal getMs2Glsprd() {
        return ms2Glsprd;
    }

    public void setMs2Glsprd(BigDecimal ms2Glsprd) {
        this.ms2Glsprd = ms2Glsprd;
    }

    public short getMs2Glop() {
        return ms2Glop;
    }

    public void setMs2Glop(short ms2Glop) {
        this.ms2Glop = ms2Glop;
    }

    public short getMs2Gldtmth() {
        return ms2Gldtmth;
    }

    public void setMs2Gldtmth(short ms2Gldtmth) {
        this.ms2Gldtmth = ms2Gldtmth;
    }

    public short getSwcash() {
        return swcash;
    }

    public void setSwcash(short swcash) {
        this.swcash = swcash;
    }

    public short getBtchnodec() {
        return btchnodec;
    }

    public void setBtchnodec(short btchnodec) {
        this.btchnodec = btchnodec;
    }

    public short getMiscnodec() {
        return miscnodec;
    }

    public void setMiscnodec(short miscnodec) {
        this.miscnodec = miscnodec;
    }

    public String getTaxgroup() {
        return taxgroup;
    }

    public void setTaxgroup(String taxgroup) {
        this.taxgroup = taxgroup;
    }

    public String getCustchqno() {
        return custchqno;
    }

    public void setCustchqno(String custchqno) {
        this.custchqno = custchqno;
    }

    public int getNosubdetl() {
        return nosubdetl;
    }

    public void setNosubdetl(int nosubdetl) {
        this.nosubdetl = nosubdetl;
    }

    public BigDecimal getApplamount() {
        return applamount;
    }

    public void setApplamount(BigDecimal applamount) {
        this.applamount = applamount;
    }

    public BigDecimal getAppldisc() {
        return appldisc;
    }

    public void setAppldisc(BigDecimal appldisc) {
        this.appldisc = appldisc;
    }

    public String getAcctnat() {
        return acctnat;
    }

    public void setAcctnat(String acctnat) {
        this.acctnat = acctnat;
    }

    public BigDecimal getAdjamount() {
        return adjamount;
    }

    public void setAdjamount(BigDecimal adjamount) {
        this.adjamount = adjamount;
    }

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }

    public short getSwinterco() {
        return swinterco;
    }

    public void setSwinterco(short swinterco) {
        this.swinterco = swinterco;
    }

    public String getFiscyr() {
        return fiscyr;
    }

    public void setFiscyr(String fiscyr) {
        this.fiscyr = fiscyr;
    }

    public String getCctype() {
        return cctype;
    }

    public void setCctype(String cctype) {
        this.cctype = cctype;
    }

    public Object getCcnumber() {
        return ccnumber;
    }

    public void setCcnumber(Object ccnumber) {
        this.ccnumber = ccnumber;
    }

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    public int getCcexp() {
        return ccexp;
    }

    public void setCcexp(int ccexp) {
        this.ccexp = ccexp;
    }

    public String getCcauthcode() {
        return ccauthcode;
    }

    public void setCcauthcode(String ccauthcode) {
        this.ccauthcode = ccauthcode;
    }

    public String getXccnumber() {
        return xccnumber;
    }

    public void setXccnumber(String xccnumber) {
        this.xccnumber = xccnumber;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public BigDecimal getBankamount() {
        return bankamount;
    }

    public void setBankamount(BigDecimal bankamount) {
        this.bankamount = bankamount;
    }

    public BigDecimal getBtchamount() {
        return btchamount;
    }

    public void setBtchamount(BigDecimal btchamount) {
        this.btchamount = btchamount;
    }

    public BigDecimal getMiscamount() {
        return miscamount;
    }

    public void setMiscamount(BigDecimal miscamount) {
        this.miscamount = miscamount;
    }

    public BigDecimal getFuncamount() {
        return funcamount;
    }

    public void setFuncamount(BigDecimal funcamount) {
        this.funcamount = funcamount;
    }

    public BigDecimal getHdrdebit() {
        return hdrdebit;
    }

    public void setHdrdebit(BigDecimal hdrdebit) {
        this.hdrdebit = hdrdebit;
    }

    public BigDecimal getHdrcredit() {
        return hdrcredit;
    }

    public void setHdrcredit(BigDecimal hdrcredit) {
        this.hdrcredit = hdrcredit;
    }

    public String getTaxauth1() {
        return taxauth1;
    }

    public void setTaxauth1(String taxauth1) {
        this.taxauth1 = taxauth1;
    }

    public String getTaxauth2() {
        return taxauth2;
    }

    public void setTaxauth2(String taxauth2) {
        this.taxauth2 = taxauth2;
    }

    public String getTaxauth3() {
        return taxauth3;
    }

    public void setTaxauth3(String taxauth3) {
        this.taxauth3 = taxauth3;
    }

    public String getTaxauth4() {
        return taxauth4;
    }

    public void setTaxauth4(String taxauth4) {
        this.taxauth4 = taxauth4;
    }

    public String getTaxauth5() {
        return taxauth5;
    }

    public void setTaxauth5(String taxauth5) {
        this.taxauth5 = taxauth5;
    }

    public String getTxau1Desc() {
        return txau1Desc;
    }

    public void setTxau1Desc(String txau1Desc) {
        this.txau1Desc = txau1Desc;
    }

    public String getTxau2Desc() {
        return txau2Desc;
    }

    public void setTxau2Desc(String txau2Desc) {
        this.txau2Desc = txau2Desc;
    }

    public String getTxau3Desc() {
        return txau3Desc;
    }

    public void setTxau3Desc(String txau3Desc) {
        this.txau3Desc = txau3Desc;
    }

    public String getTxau4Desc() {
        return txau4Desc;
    }

    public void setTxau4Desc(String txau4Desc) {
        this.txau4Desc = txau4Desc;
    }

    public String getTxau5Desc() {
        return txau5Desc;
    }

    public void setTxau5Desc(String txau5Desc) {
        this.txau5Desc = txau5Desc;
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

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public short getSwposted() {
        return swposted;
    }

    public void setSwposted(short swposted) {
        this.swposted = swposted;
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

    public BigDecimal getTotunappl() {
        return totunappl;
    }

    public void setTotunappl(BigDecimal totunappl) {
        this.totunappl = totunappl;
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

    public short getAllocmode() {
        return allocmode;
    }

    public void setAllocmode(short allocmode) {
        this.allocmode = allocmode;
    }

    public BigDecimal getAllocamt() {
        return allocamt;
    }

    public void setAllocamt(BigDecimal allocamt) {
        this.allocamt = allocamt;
    }

    public short getClasstype() {
        return classtype;
    }

    public void setClasstype(short classtype) {
        this.classtype = classtype;
    }

    public short getClassaxis() {
        return classaxis;
    }

    public void setClassaxis(short classaxis) {
        this.classaxis = classaxis;
    }

    public short getDatalevel() {
        return datalevel;
    }

    public void setDatalevel(short datalevel) {
        this.datalevel = datalevel;
    }

    public int getRecxcnter() {
        return recxcnter;
    }

    public void setRecxcnter(int recxcnter) {
        this.recxcnter = recxcnter;
    }

    public BigDecimal getRaterc() {
        return raterc;
    }

    public void setRaterc(BigDecimal raterc) {
        this.raterc = raterc;
    }

    public String getRatetyperc() {
        return ratetyperc;
    }

    public void setRatetyperc(String ratetyperc) {
        this.ratetyperc = ratetyperc;
    }

    public short getRateoprc() {
        return rateoprc;
    }

    public void setRateoprc(short rateoprc) {
        this.rateoprc = rateoprc;
    }

    public int getRatedaterc() {
        return ratedaterc;
    }

    public void setRatedaterc(int ratedaterc) {
        this.ratedaterc = ratedaterc;
    }

    public String getCodecurnrc() {
        return codecurnrc;
    }

    public void setCodecurnrc(String codecurnrc) {
        this.codecurnrc = codecurnrc;
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

    public BigDecimal getTxexprc() {
        return txexprc;
    }

    public void setTxexprc(BigDecimal txexprc) {
        this.txexprc = txexprc;
    }

    public BigDecimal getTxrecrc() {
        return txrecrc;
    }

    public void setTxrecrc(BigDecimal txrecrc) {
        this.txrecrc = txrecrc;
    }

    public BigDecimal getAmtrectax() {
        return amtrectax;
    }

    public void setAmtrectax(BigDecimal amtrectax) {
        this.amtrectax = amtrectax;
    }

    public BigDecimal getAmtexptax() {
        return amtexptax;
    }

    public void setAmtexptax(BigDecimal amtexptax) {
        this.amtexptax = amtexptax;
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

    public BigDecimal getTxamt1Hc() {
        return txamt1Hc;
    }

    public void setTxamt1Hc(BigDecimal txamt1Hc) {
        this.txamt1Hc = txamt1Hc;
    }

    public BigDecimal getTxamt2Hc() {
        return txamt2Hc;
    }

    public void setTxamt2Hc(BigDecimal txamt2Hc) {
        this.txamt2Hc = txamt2Hc;
    }

    public BigDecimal getTxamt3Hc() {
        return txamt3Hc;
    }

    public void setTxamt3Hc(BigDecimal txamt3Hc) {
        this.txamt3Hc = txamt3Hc;
    }

    public BigDecimal getTxamt4Hc() {
        return txamt4Hc;
    }

    public void setTxamt4Hc(BigDecimal txamt4Hc) {
        this.txamt4Hc = txamt4Hc;
    }

    public BigDecimal getTxamt5Hc() {
        return txamt5Hc;
    }

    public void setTxamt5Hc(BigDecimal txamt5Hc) {
        this.txamt5Hc = txamt5Hc;
    }

    public String getAcctrec1() {
        return acctrec1;
    }

    public void setAcctrec1(String acctrec1) {
        this.acctrec1 = acctrec1;
    }

    public String getAcctrec2() {
        return acctrec2;
    }

    public void setAcctrec2(String acctrec2) {
        this.acctrec2 = acctrec2;
    }

    public String getAcctrec3() {
        return acctrec3;
    }

    public void setAcctrec3(String acctrec3) {
        this.acctrec3 = acctrec3;
    }

    public String getAcctrec4() {
        return acctrec4;
    }

    public void setAcctrec4(String acctrec4) {
        this.acctrec4 = acctrec4;
    }

    public String getAcctrec5() {
        return acctrec5;
    }

    public void setAcctrec5(String acctrec5) {
        this.acctrec5 = acctrec5;
    }

    public String getAcctexp1() {
        return acctexp1;
    }

    public void setAcctexp1(String acctexp1) {
        this.acctexp1 = acctexp1;
    }

    public String getAcctexp2() {
        return acctexp2;
    }

    public void setAcctexp2(String acctexp2) {
        this.acctexp2 = acctexp2;
    }

    public String getAcctexp3() {
        return acctexp3;
    }

    public void setAcctexp3(String acctexp3) {
        this.acctexp3 = acctexp3;
    }

    public String getAcctexp4() {
        return acctexp4;
    }

    public void setAcctexp4(String acctexp4) {
        this.acctexp4 = acctexp4;
    }

    public String getAcctexp5() {
        return acctexp5;
    }

    public void setAcctexp5(String acctexp5) {
        this.acctexp5 = acctexp5;
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

    public BigDecimal getTxincltc() {
        return txincltc;
    }

    public void setTxincltc(BigDecimal txincltc) {
        this.txincltc = txincltc;
    }

    public BigDecimal getTxinclhc() {
        return txinclhc;
    }

    public void setTxinclhc(BigDecimal txinclhc) {
        this.txinclhc = txinclhc;
    }

    public BigDecimal getTxinclbc() {
        return txinclbc;
    }

    public void setTxinclbc(BigDecimal txinclbc) {
        this.txinclbc = txinclbc;
    }

    public BigDecimal getTxinclmc() {
        return txinclmc;
    }

    public void setTxinclmc(BigDecimal txinclmc) {
        this.txinclmc = txinclmc;
    }

    public String getArapbatch() {
        return arapbatch;
    }

    public void setArapbatch(String arapbatch) {
        this.arapbatch = arapbatch;
    }

    public String getArapentry() {
        return arapentry;
    }

    public void setArapentry(String arapentry) {
        this.arapentry = arapentry;
    }

    public short getSwcheque() {
        return swcheque;
    }

    public void setSwcheque(short swcheque) {
        this.swcheque = swcheque;
    }

    public short getSweft() {
        return sweft;
    }

    public void setSweft(short sweft) {
        this.sweft = sweft;
    }

    public short getRxmtchseq() {
        return rxmtchseq;
    }

    public void setRxmtchseq(short rxmtchseq) {
        this.rxmtchseq = rxmtchseq;
    }

    public String getRxtrnscode() {
        return rxtrnscode;
    }

    public void setRxtrnscode(String rxtrnscode) {
        this.rxtrnscode = rxtrnscode;
    }

    public String getRxcategory() {
        return rxcategory;
    }

    public void setRxcategory(String rxcategory) {
        this.rxcategory = rxcategory;
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

    public String getEnteredby() {
        return enteredby;
    }

    public void setEnteredby(String enteredby) {
        this.enteredby = enteredby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cbbthd cbbthd = (Cbbthd) o;
        return audtdate == cbbthd.audtdate && audttime == cbbthd.audttime && entrytype == cbbthd.entrytype && date == cbbthd.date && datechqprn == cbbthd.datechqprn && swchqprn == cbbthd.swchqprn && nodetails == cbbthd.nodetails && bk2Gldate == cbbthd.bk2Gldate && bk2Glop == cbbthd.bk2Glop && bk2Gldtmth == cbbthd.bk2Gldtmth && bt2Gldate == cbbthd.bt2Gldate && bt2Glop == cbbthd.bt2Glop && bt2Gldtmth == cbbthd.bt2Gldtmth && ms2Gldate == cbbthd.ms2Gldate && ms2Glop == cbbthd.ms2Glop && ms2Gldtmth == cbbthd.ms2Gldtmth && swcash == cbbthd.swcash && btchnodec == cbbthd.btchnodec && miscnodec == cbbthd.miscnodec && nosubdetl == cbbthd.nosubdetl && swinterco == cbbthd.swinterco && ccexp == cbbthd.ccexp && serial == cbbthd.serial && taxclass1 == cbbthd.taxclass1 && taxclass2 == cbbthd.taxclass2 && taxclass3 == cbbthd.taxclass3 && taxclass4 == cbbthd.taxclass4 && taxclass5 == cbbthd.taxclass5 && swtaxincl1 == cbbthd.swtaxincl1 && swtaxincl2 == cbbthd.swtaxincl2 && swtaxincl3 == cbbthd.swtaxincl3 && swtaxincl4 == cbbthd.swtaxincl4 && swtaxincl5 == cbbthd.swtaxincl5 && swposted == cbbthd.swposted && values == cbbthd.values && processcmd == cbbthd.processcmd && allocmode == cbbthd.allocmode && classtype == cbbthd.classtype && classaxis == cbbthd.classaxis && datalevel == cbbthd.datalevel && recxcnter == cbbthd.recxcnter && rateoprc == cbbthd.rateoprc && ratedaterc == cbbthd.ratedaterc && swcheque == cbbthd.swcheque && sweft == cbbthd.sweft && rxmtchseq == cbbthd.rxmtchseq && revuniq == cbbthd.revuniq && newrevuniq == cbbthd.newrevuniq && Objects.equals(batchid, cbbthd.batchid) && Objects.equals(entryno, cbbthd.entryno) && Objects.equals(audtuser, cbbthd.audtuser) && Objects.equals(audtorg, cbbthd.audtorg) && Objects.equals(reference, cbbthd.reference) && Objects.equals(period, cbbthd.period) && Objects.equals(misccode, cbbthd.misccode) && Objects.equals(textdesc, cbbthd.textdesc) && Objects.equals(distcode, cbbthd.distcode) && Objects.equals(chargecode, cbbthd.chargecode) && Objects.equals(chrgamount, cbbthd.chrgamount) && Objects.equals(totamount, cbbthd.totamount) && Objects.equals(tottax, cbbthd.tottax) && Objects.equals(taxpercnt, cbbthd.taxpercnt) && Objects.equals(bk2Glcurhm, cbbthd.bk2Glcurhm) && Objects.equals(bk2Glrttyp, cbbthd.bk2Glrttyp) && Objects.equals(bk2Glcursr, cbbthd.bk2Glcursr) && Objects.equals(bk2Glrate, cbbthd.bk2Glrate) && Objects.equals(bk2Glsprd, cbbthd.bk2Glsprd) && Objects.equals(bt2Glcurhm, cbbthd.bt2Glcurhm) && Objects.equals(bt2Glrttyp, cbbthd.bt2Glrttyp) && Objects.equals(bt2Glcursr, cbbthd.bt2Glcursr) && Objects.equals(bt2Glrate, cbbthd.bt2Glrate) && Objects.equals(bt2Glsprd, cbbthd.bt2Glsprd) && Objects.equals(ms2Glcurhm, cbbthd.ms2Glcurhm) && Objects.equals(ms2Glrttyp, cbbthd.ms2Glrttyp) && Objects.equals(ms2Glcursr, cbbthd.ms2Glcursr) && Objects.equals(ms2Glrate, cbbthd.ms2Glrate) && Objects.equals(ms2Glsprd, cbbthd.ms2Glsprd) && Objects.equals(taxgroup, cbbthd.taxgroup) && Objects.equals(custchqno, cbbthd.custchqno) && Objects.equals(applamount, cbbthd.applamount) && Objects.equals(appldisc, cbbthd.appldisc) && Objects.equals(acctnat, cbbthd.acctnat) && Objects.equals(adjamount, cbbthd.adjamount) && Objects.equals(profileid, cbbthd.profileid) && Objects.equals(fiscyr, cbbthd.fiscyr) && Objects.equals(cctype, cbbthd.cctype) && Objects.equals(ccnumber, cbbthd.ccnumber) && Objects.equals(ccname, cbbthd.ccname) && Objects.equals(ccauthcode, cbbthd.ccauthcode) && Objects.equals(xccnumber, cbbthd.xccnumber) && Objects.equals(bankamount, cbbthd.bankamount) && Objects.equals(btchamount, cbbthd.btchamount) && Objects.equals(miscamount, cbbthd.miscamount) && Objects.equals(funcamount, cbbthd.funcamount) && Objects.equals(hdrdebit, cbbthd.hdrdebit) && Objects.equals(hdrcredit, cbbthd.hdrcredit) && Objects.equals(taxauth1, cbbthd.taxauth1) && Objects.equals(taxauth2, cbbthd.taxauth2) && Objects.equals(taxauth3, cbbthd.taxauth3) && Objects.equals(taxauth4, cbbthd.taxauth4) && Objects.equals(taxauth5, cbbthd.taxauth5) && Objects.equals(txau1Desc, cbbthd.txau1Desc) && Objects.equals(txau2Desc, cbbthd.txau2Desc) && Objects.equals(txau3Desc, cbbthd.txau3Desc) && Objects.equals(txau4Desc, cbbthd.txau4Desc) && Objects.equals(txau5Desc, cbbthd.txau5Desc) && Objects.equals(basetax1, cbbthd.basetax1) && Objects.equals(basetax2, cbbthd.basetax2) && Objects.equals(basetax3, cbbthd.basetax3) && Objects.equals(basetax4, cbbthd.basetax4) && Objects.equals(basetax5, cbbthd.basetax5) && Objects.equals(amttax1, cbbthd.amttax1) && Objects.equals(amttax2, cbbthd.amttax2) && Objects.equals(amttax3, cbbthd.amttax3) && Objects.equals(amttax4, cbbthd.amttax4) && Objects.equals(amttax5, cbbthd.amttax5) && Objects.equals(bankcode, cbbthd.bankcode) && Objects.equals(totunappl, cbbthd.totunappl) && Objects.equals(totapplamt, cbbthd.totapplamt) && Objects.equals(totappldsc, cbbthd.totappldsc) && Objects.equals(allocamt, cbbthd.allocamt) && Objects.equals(raterc, cbbthd.raterc) && Objects.equals(ratetyperc, cbbthd.ratetyperc) && Objects.equals(codecurnrc, cbbthd.codecurnrc) && Objects.equals(txamt1Rc, cbbthd.txamt1Rc) && Objects.equals(txamt2Rc, cbbthd.txamt2Rc) && Objects.equals(txamt3Rc, cbbthd.txamt3Rc) && Objects.equals(txamt4Rc, cbbthd.txamt4Rc) && Objects.equals(txamt5Rc, cbbthd.txamt5Rc) && Objects.equals(txtotrc, cbbthd.txtotrc) && Objects.equals(txallrc, cbbthd.txallrc) && Objects.equals(txexprc, cbbthd.txexprc) && Objects.equals(txrecrc, cbbthd.txrecrc) && Objects.equals(amtrectax, cbbthd.amtrectax) && Objects.equals(amtexptax, cbbthd.amtexptax) && Objects.equals(txbse1Hc, cbbthd.txbse1Hc) && Objects.equals(txbse2Hc, cbbthd.txbse2Hc) && Objects.equals(txbse3Hc, cbbthd.txbse3Hc) && Objects.equals(txbse4Hc, cbbthd.txbse4Hc) && Objects.equals(txbse5Hc, cbbthd.txbse5Hc) && Objects.equals(txamt1Hc, cbbthd.txamt1Hc) && Objects.equals(txamt2Hc, cbbthd.txamt2Hc) && Objects.equals(txamt3Hc, cbbthd.txamt3Hc) && Objects.equals(txamt4Hc, cbbthd.txamt4Hc) && Objects.equals(txamt5Hc, cbbthd.txamt5Hc) && Objects.equals(acctrec1, cbbthd.acctrec1) && Objects.equals(acctrec2, cbbthd.acctrec2) && Objects.equals(acctrec3, cbbthd.acctrec3) && Objects.equals(acctrec4, cbbthd.acctrec4) && Objects.equals(acctrec5, cbbthd.acctrec5) && Objects.equals(acctexp1, cbbthd.acctexp1) && Objects.equals(acctexp2, cbbthd.acctexp2) && Objects.equals(acctexp3, cbbthd.acctexp3) && Objects.equals(acctexp4, cbbthd.acctexp4) && Objects.equals(acctexp5, cbbthd.acctexp5) && Objects.equals(txexcltc, cbbthd.txexcltc) && Objects.equals(txexclhc, cbbthd.txexclhc) && Objects.equals(txexclbc, cbbthd.txexclbc) && Objects.equals(txexclmc, cbbthd.txexclmc) && Objects.equals(txincltc, cbbthd.txincltc) && Objects.equals(txinclhc, cbbthd.txinclhc) && Objects.equals(txinclbc, cbbthd.txinclbc) && Objects.equals(txinclmc, cbbthd.txinclmc) && Objects.equals(arapbatch, cbbthd.arapbatch) && Objects.equals(arapentry, cbbthd.arapentry) && Objects.equals(rxtrnscode, cbbthd.rxtrnscode) && Objects.equals(rxcategory, cbbthd.rxcategory) && Objects.equals(enteredby, cbbthd.enteredby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, audtdate, audttime, audtuser, audtorg, entrytype, reference, period, date, datechqprn, swchqprn, misccode, textdesc, distcode, chargecode, chrgamount, nodetails, totamount, tottax, taxpercnt, bk2Glcurhm, bk2Glrttyp, bk2Glcursr, bk2Gldate, bk2Glrate, bk2Glsprd, bk2Glop, bk2Gldtmth, bt2Glcurhm, bt2Glrttyp, bt2Glcursr, bt2Gldate, bt2Glrate, bt2Glsprd, bt2Glop, bt2Gldtmth, ms2Glcurhm, ms2Glrttyp, ms2Glcursr, ms2Gldate, ms2Glrate, ms2Glsprd, ms2Glop, ms2Gldtmth, swcash, btchnodec, miscnodec, taxgroup, custchqno, nosubdetl, applamount, appldisc, acctnat, adjamount, profileid, swinterco, fiscyr, cctype, ccnumber, ccname, ccexp, ccauthcode, xccnumber, serial, bankamount, btchamount, miscamount, funcamount, hdrdebit, hdrcredit, taxauth1, taxauth2, taxauth3, taxauth4, taxauth5, txau1Desc, txau2Desc, txau3Desc, txau4Desc, txau5Desc, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, basetax1, basetax2, basetax3, basetax4, basetax5, amttax1, amttax2, amttax3, amttax4, amttax5, swtaxincl1, swtaxincl2, swtaxincl3, swtaxincl4, swtaxincl5, bankcode, swposted, values, processcmd, totunappl, totapplamt, totappldsc, allocmode, allocamt, classtype, classaxis, datalevel, recxcnter, raterc, ratetyperc, rateoprc, ratedaterc, codecurnrc, txamt1Rc, txamt2Rc, txamt3Rc, txamt4Rc, txamt5Rc, txtotrc, txallrc, txexprc, txrecrc, amtrectax, amtexptax, txbse1Hc, txbse2Hc, txbse3Hc, txbse4Hc, txbse5Hc, txamt1Hc, txamt2Hc, txamt3Hc, txamt4Hc, txamt5Hc, acctrec1, acctrec2, acctrec3, acctrec4, acctrec5, acctexp1, acctexp2, acctexp3, acctexp4, acctexp5, txexcltc, txexclhc, txexclbc, txexclmc, txincltc, txinclhc, txinclbc, txinclmc, arapbatch, arapentry, swcheque, sweft, rxmtchseq, rxtrnscode, rxcategory, revuniq, newrevuniq, enteredby);
    }
}
