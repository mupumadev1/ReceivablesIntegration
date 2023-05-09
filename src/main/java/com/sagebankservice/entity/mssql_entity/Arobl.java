package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@IdClass(AroblPK.class)
public class Arobl {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDCUST", nullable = false, length = 12)
    private String idcust;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDINVC", nullable = false, length = 22)
    private String idinvc;
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
    @Column(name = "IDRMIT", nullable = false, length = 24)
    private String idrmit;
    @Basic
    @Column(name = "IDORDERNBR", nullable = false, length = 22)
    private String idordernbr;
    @Basic
    @Column(name = "IDCUSTPO", nullable = false, length = 22)
    private String idcustpo;
    @Basic
    @Column(name = "DATEDUE", nullable = false, precision = 0)
    private int datedue;
    @Basic
    @Column(name = "IDNATACCT", nullable = false, length = 12)
    private String idnatacct;
    @Basic
    @Column(name = "IDCUSTSHPT", nullable = false, length = 6)
    private String idcustshpt;
    @Basic
    @Column(name = "TRXTYPEID", nullable = false)
    private short trxtypeid;
    @Basic
    @Column(name = "TRXTYPETXT", nullable = false)
    private short trxtypetxt;
    @Basic
    @Column(name = "DATEBTCH", nullable = false, precision = 0)
    private int datebtch;
    @Basic
    @Column(name = "CNTBTCH", nullable = false, precision = 0)
    private int cntbtch;
    @Basic
    @Column(name = "CNTITEM", nullable = false, precision = 0)
    private int cntitem;
    @Basic
    @Column(name = "IDGRP", nullable = false, length = 6)
    private String idgrp;
    @Basic
    @Column(name = "DESCINVC", nullable = false, length = 60)
    private String descinvc;
    @Basic
    @Column(name = "DATEINVC", nullable = false, precision = 0)
    private int dateinvc;
    @Basic
    @Column(name = "DATEASOF", nullable = false, precision = 0)
    private int dateasof;
    @Basic
    @Column(name = "CODETERM", nullable = false, length = 6)
    private String codeterm;
    @Basic
    @Column(name = "DATEDISC", nullable = false, precision = 0)
    private int datedisc;
    @Basic
    @Column(name = "CODECURN", nullable = false, length = 3)
    private String codecurn;
    @Basic
    @Column(name = "IDRATETYPE", nullable = false, length = 2)
    private String idratetype;
    @Basic
    @Column(name = "SWRATEOVRD", nullable = false)
    private short swrateovrd;
    @Basic
    @Column(name = "EXCHRATEHC", nullable = false, precision = 7)
    private BigDecimal exchratehc;
    @Basic
    @Column(name = "AMTINVCHC", nullable = false, precision = 3)
    private BigDecimal amtinvchc;
    @Basic
    @Column(name = "AMTDUEHC", nullable = false, precision = 3)
    private BigDecimal amtduehc;
    @Basic
    @Column(name = "AMTTXBLHC", nullable = false, precision = 3)
    private BigDecimal amttxblhc;
    @Basic
    @Column(name = "AMTNONTXHC", nullable = false, precision = 3)
    private BigDecimal amtnontxhc;
    @Basic
    @Column(name = "AMTTAXHC", nullable = false, precision = 3)
    private BigDecimal amttaxhc;
    @Basic
    @Column(name = "AMTDISCHC", nullable = false, precision = 3)
    private BigDecimal amtdischc;
    @Basic
    @Column(name = "AMTINVCTC", nullable = false, precision = 3)
    private BigDecimal amtinvctc;
    @Basic
    @Column(name = "AMTDUETC", nullable = false, precision = 3)
    private BigDecimal amtduetc;
    @Basic
    @Column(name = "AMTTXBLTC", nullable = false, precision = 3)
    private BigDecimal amttxbltc;
    @Basic
    @Column(name = "AMTNONTXTC", nullable = false, precision = 3)
    private BigDecimal amtnontxtc;
    @Basic
    @Column(name = "AMTTAXTC", nullable = false, precision = 3)
    private BigDecimal amttaxtc;
    @Basic
    @Column(name = "AMTDISCTC", nullable = false, precision = 3)
    private BigDecimal amtdisctc;
    @Basic
    @Column(name = "SWPAID", nullable = false)
    private short swpaid;
    @Basic
    @Column(name = "DATELSTACT", nullable = false, precision = 0)
    private int datelstact;
    @Basic
    @Column(name = "DATELSTSTM", nullable = false, precision = 0)
    private int datelststm;
    @Basic
    @Column(name = "DATELSTDLQ", nullable = false, precision = 0)
    private int datelstdlq;
    @Basic
    @Column(name = "CODEDLQSTS", nullable = false)
    private short codedlqsts;
    @Basic
    @Column(name = "CNTTOTPAYM", nullable = false, precision = 0)
    private int cnttotpaym;
    @Basic
    @Column(name = "CNTLSTPAID", nullable = false, precision = 0)
    private int cntlstpaid;
    @Basic
    @Column(name = "CNTLSTPYST", nullable = false, precision = 0)
    private int cntlstpyst;
    @Basic
    @Column(name = "AMTREMIT", nullable = false, precision = 3)
    private BigDecimal amtremit;
    @Basic
    @Column(name = "CNTLASTSEQ", nullable = false, precision = 0)
    private int cntlastseq;
    @Basic
    @Column(name = "SWTAXINPUT", nullable = false)
    private short swtaxinput;
    @Basic
    @Column(name = "CODETAX1", nullable = false, length = 12)
    private String codetax1;
    @Basic
    @Column(name = "CODETAX2", nullable = false, length = 12)
    private String codetax2;
    @Basic
    @Column(name = "CODETAX3", nullable = false, length = 12)
    private String codetax3;
    @Basic
    @Column(name = "CODETAX4", nullable = false, length = 12)
    private String codetax4;
    @Basic
    @Column(name = "CODETAX5", nullable = false, length = 12)
    private String codetax5;
    @Basic
    @Column(name = "AMTBASE1HC", nullable = false, precision = 3)
    private BigDecimal amtbase1Hc;
    @Basic
    @Column(name = "AMTBASE2HC", nullable = false, precision = 3)
    private BigDecimal amtbase2Hc;
    @Basic
    @Column(name = "AMTBASE3HC", nullable = false, precision = 3)
    private BigDecimal amtbase3Hc;
    @Basic
    @Column(name = "AMTBASE4HC", nullable = false, precision = 3)
    private BigDecimal amtbase4Hc;
    @Basic
    @Column(name = "AMTBASE5HC", nullable = false, precision = 3)
    private BigDecimal amtbase5Hc;
    @Basic
    @Column(name = "AMTTAX1HC", nullable = false, precision = 3)
    private BigDecimal amttax1Hc;
    @Basic
    @Column(name = "AMTTAX2HC", nullable = false, precision = 3)
    private BigDecimal amttax2Hc;
    @Basic
    @Column(name = "AMTTAX3HC", nullable = false, precision = 3)
    private BigDecimal amttax3Hc;
    @Basic
    @Column(name = "AMTTAX4HC", nullable = false, precision = 3)
    private BigDecimal amttax4Hc;
    @Basic
    @Column(name = "AMTTAX5HC", nullable = false, precision = 3)
    private BigDecimal amttax5Hc;
    @Basic
    @Column(name = "AMTBASE1TC", nullable = false, precision = 3)
    private BigDecimal amtbase1Tc;
    @Basic
    @Column(name = "AMTBASE2TC", nullable = false, precision = 3)
    private BigDecimal amtbase2Tc;
    @Basic
    @Column(name = "AMTBASE3TC", nullable = false, precision = 3)
    private BigDecimal amtbase3Tc;
    @Basic
    @Column(name = "AMTBASE4TC", nullable = false, precision = 3)
    private BigDecimal amtbase4Tc;
    @Basic
    @Column(name = "AMTBASE5TC", nullable = false, precision = 3)
    private BigDecimal amtbase5Tc;
    @Basic
    @Column(name = "AMTTAX1TC", nullable = false, precision = 3)
    private BigDecimal amttax1Tc;
    @Basic
    @Column(name = "AMTTAX2TC", nullable = false, precision = 3)
    private BigDecimal amttax2Tc;
    @Basic
    @Column(name = "AMTTAX3TC", nullable = false, precision = 3)
    private BigDecimal amttax3Tc;
    @Basic
    @Column(name = "AMTTAX4TC", nullable = false, precision = 3)
    private BigDecimal amttax4Tc;
    @Basic
    @Column(name = "AMTTAX5TC", nullable = false, precision = 3)
    private BigDecimal amttax5Tc;
    @Basic
    @Column(name = "CODESLSP1", nullable = false, length = 8)
    private String codeslsp1;
    @Basic
    @Column(name = "CODESLSP2", nullable = false, length = 8)
    private String codeslsp2;
    @Basic
    @Column(name = "CODESLSP3", nullable = false, length = 8)
    private String codeslsp3;
    @Basic
    @Column(name = "CODESLSP4", nullable = false, length = 8)
    private String codeslsp4;
    @Basic
    @Column(name = "CODESLSP5", nullable = false, length = 8)
    private String codeslsp5;
    @Basic
    @Column(name = "PCTSASPLT1", nullable = false, precision = 5)
    private BigDecimal pctsasplt1;
    @Basic
    @Column(name = "PCTSASPLT2", nullable = false, precision = 5)
    private BigDecimal pctsasplt2;
    @Basic
    @Column(name = "PCTSASPLT3", nullable = false, precision = 5)
    private BigDecimal pctsasplt3;
    @Basic
    @Column(name = "PCTSASPLT4", nullable = false, precision = 5)
    private BigDecimal pctsasplt4;
    @Basic
    @Column(name = "PCTSASPLT5", nullable = false, precision = 5)
    private BigDecimal pctsasplt5;
    @Basic
    @Column(name = "FISCYR", nullable = false, length = 4)
    private String fiscyr;
    @Basic
    @Column(name = "FISCPER", nullable = false, length = 2)
    private String fiscper;
    @Basic
    @Column(name = "IDPREPAID", nullable = false, length = 22)
    private String idprepaid;
    @Basic
    @Column(name = "DATEBUS", nullable = false, precision = 0)
    private int datebus;
    @Basic
    @Column(name = "RATEDATE", nullable = false, precision = 0)
    private int ratedate;
    @Basic
    @Column(name = "RATEOP", nullable = false)
    private short rateop;
    @Basic
    @Column(name = "YPLASTACT", nullable = false, length = 6)
    private String yplastact;
    @Basic
    @Column(name = "IDBANK", nullable = false, length = 8)
    private String idbank;
    @Basic
    @Column(name = "DEPSTNBR", nullable = false, precision = 0)
    private int depstnbr;
    @Basic
    @Column(name = "POSTSEQNCE", nullable = false, precision = 0)
    private int postseqnce;
    @Basic
    @Column(name = "SWJOB", nullable = false)
    private short swjob;
    @Basic
    @Column(name = "SWRTG", nullable = false)
    private short swrtg;
    @Basic
    @Column(name = "SWRTGOUT", nullable = false)
    private short swrtgout;
    @Basic
    @Column(name = "RTGDATEDUE", nullable = false, precision = 0)
    private int rtgdatedue;
    @Basic
    @Column(name = "RTGOAMTHC", nullable = false, precision = 3)
    private BigDecimal rtgoamthc;
    @Basic
    @Column(name = "RTGAMTHC", nullable = false, precision = 3)
    private BigDecimal rtgamthc;
    @Basic
    @Column(name = "RTGOAMTTC", nullable = false, precision = 3)
    private BigDecimal rtgoamttc;
    @Basic
    @Column(name = "RTGAMTTC", nullable = false, precision = 3)
    private BigDecimal rtgamttc;
    @Basic
    @Column(name = "RTGTERMS", nullable = false, length = 6)
    private String rtgterms;
    @Basic
    @Column(name = "SWRTGRATE", nullable = false)
    private short swrtgrate;
    @Basic
    @Column(name = "RTGAPPLYTO", nullable = false, length = 22)
    private String rtgapplyto;
    @Basic
    @Column(name = "VALUES", nullable = false)
    private int values;
    @Basic
    @Column(name = "SRCEAPPL", nullable = false, length = 2)
    private String srceappl;
    @Basic
    @Column(name = "ARVERSION", nullable = false, length = 3)
    private String arversion;
    @Basic
    @Column(name = "INVCTYPE", nullable = false)
    private short invctype;
    @Basic
    @Column(name = "DEPSEQ", nullable = false)
    private long depseq;
    @Basic
    @Column(name = "DEPLINE", nullable = false)
    private int depline;
    @Basic
    @Column(name = "TYPEBTCH", nullable = false, length = 2)
    private String typebtch;
    @Basic
    @Column(name = "CNTOBLJ", nullable = false)
    private int cntoblj;
    @Basic
    @Column(name = "CODECURNRC", nullable = false, length = 3)
    private String codecurnrc;
    @Basic
    @Column(name = "RATERC", nullable = false, precision = 7)
    private BigDecimal raterc;
    @Basic
    @Column(name = "RATETYPERC", nullable = false, length = 2)
    private String ratetyperc;
    @Basic
    @Column(name = "RATEDATERC", nullable = false, precision = 0)
    private int ratedaterc;
    @Basic
    @Column(name = "RATEOPRC", nullable = false)
    private short rateoprc;
    @Basic
    @Column(name = "SWRATERC", nullable = false)
    private short swraterc;
    @Basic
    @Column(name = "SWTXRTGRPT", nullable = false)
    private short swtxrtgrpt;
    @Basic
    @Column(name = "CODETAXGRP", nullable = false, length = 12)
    private String codetaxgrp;
    @Basic
    @Column(name = "TAXVERSION", nullable = false)
    private int taxversion;
    @Basic
    @Column(name = "SWTXCTLRC", nullable = false)
    private short swtxctlrc;
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
    @Column(name = "TXBSERT1TC", nullable = false, precision = 3)
    private BigDecimal txbsert1Tc;
    @Basic
    @Column(name = "TXBSERT2TC", nullable = false, precision = 3)
    private BigDecimal txbsert2Tc;
    @Basic
    @Column(name = "TXBSERT3TC", nullable = false, precision = 3)
    private BigDecimal txbsert3Tc;
    @Basic
    @Column(name = "TXBSERT4TC", nullable = false, precision = 3)
    private BigDecimal txbsert4Tc;
    @Basic
    @Column(name = "TXBSERT5TC", nullable = false, precision = 3)
    private BigDecimal txbsert5Tc;
    @Basic
    @Column(name = "TXAMTRT1TC", nullable = false, precision = 3)
    private BigDecimal txamtrt1Tc;
    @Basic
    @Column(name = "TXAMTRT2TC", nullable = false, precision = 3)
    private BigDecimal txamtrt2Tc;
    @Basic
    @Column(name = "TXAMTRT3TC", nullable = false, precision = 3)
    private BigDecimal txamtrt3Tc;
    @Basic
    @Column(name = "TXAMTRT4TC", nullable = false, precision = 3)
    private BigDecimal txamtrt4Tc;
    @Basic
    @Column(name = "TXAMTRT5TC", nullable = false, precision = 3)
    private BigDecimal txamtrt5Tc;
    @Basic
    @Column(name = "IDSHIPNBR", nullable = false, length = 22)
    private String idshipnbr;
    @Basic
    @Column(name = "DATEFRSTBK", nullable = false, precision = 0)
    private int datefrstbk;
    @Basic
    @Column(name = "DATELSTRVL", nullable = false, precision = 0)
    private int datelstrvl;
    @Basic
    @Column(name = "ORATE", nullable = false, precision = 7)
    private BigDecimal orate;
    @Basic
    @Column(name = "ORATETYPE", nullable = false, length = 2)
    private String oratetype;
    @Basic
    @Column(name = "ORATEDATE", nullable = false, precision = 0)
    private int oratedate;
    @Basic
    @Column(name = "ORATEOP", nullable = false)
    private short orateop;
    @Basic
    @Column(name = "OSWRATE", nullable = false)
    private short oswrate;
    @Basic
    @Column(name = "IDACCTSET", nullable = false, length = 6)
    private String idacctset;
    @Basic
    @Column(name = "DATEPAID", nullable = false, precision = 0)
    private int datepaid;
    @Basic
    @Column(name = "SWNONRCVBL", nullable = false)
    private short swnonrcvbl;
    @Basic
    @Column(name = "CODETERR", nullable = false, length = 6)
    private String codeterr;
    @Basic
    @Column(name = "OAMTWHT1TC", nullable = false, precision = 3)
    private BigDecimal oamtwht1Tc;
    @Basic
    @Column(name = "OAMTWHT2TC", nullable = false, precision = 3)
    private BigDecimal oamtwht2Tc;
    @Basic
    @Column(name = "OAMTWHT3TC", nullable = false, precision = 3)
    private BigDecimal oamtwht3Tc;
    @Basic
    @Column(name = "OAMTWHT4TC", nullable = false, precision = 3)
    private BigDecimal oamtwht4Tc;
    @Basic
    @Column(name = "OAMTWHT5TC", nullable = false, precision = 3)
    private BigDecimal oamtwht5Tc;

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

    public String getIdrmit() {
        return idrmit;
    }

    public void setIdrmit(String idrmit) {
        this.idrmit = idrmit;
    }

    public String getIdordernbr() {
        return idordernbr;
    }

    public void setIdordernbr(String idordernbr) {
        this.idordernbr = idordernbr;
    }

    public String getIdcustpo() {
        return idcustpo;
    }

    public void setIdcustpo(String idcustpo) {
        this.idcustpo = idcustpo;
    }

    public int getDatedue() {
        return datedue;
    }

    public void setDatedue(int datedue) {
        this.datedue = datedue;
    }

    public String getIdnatacct() {
        return idnatacct;
    }

    public void setIdnatacct(String idnatacct) {
        this.idnatacct = idnatacct;
    }

    public String getIdcustshpt() {
        return idcustshpt;
    }

    public void setIdcustshpt(String idcustshpt) {
        this.idcustshpt = idcustshpt;
    }

    public short getTrxtypeid() {
        return trxtypeid;
    }

    public void setTrxtypeid(short trxtypeid) {
        this.trxtypeid = trxtypeid;
    }

    public short getTrxtypetxt() {
        return trxtypetxt;
    }

    public void setTrxtypetxt(short trxtypetxt) {
        this.trxtypetxt = trxtypetxt;
    }

    public int getDatebtch() {
        return datebtch;
    }

    public void setDatebtch(int datebtch) {
        this.datebtch = datebtch;
    }

    public int getCntbtch() {
        return cntbtch;
    }

    public void setCntbtch(int cntbtch) {
        this.cntbtch = cntbtch;
    }

    public int getCntitem() {
        return cntitem;
    }

    public void setCntitem(int cntitem) {
        this.cntitem = cntitem;
    }

    public String getIdgrp() {
        return idgrp;
    }

    public void setIdgrp(String idgrp) {
        this.idgrp = idgrp;
    }

    public String getDescinvc() {
        return descinvc;
    }

    public void setDescinvc(String descinvc) {
        this.descinvc = descinvc;
    }

    public int getDateinvc() {
        return dateinvc;
    }

    public void setDateinvc(int dateinvc) {
        this.dateinvc = dateinvc;
    }

    public int getDateasof() {
        return dateasof;
    }

    public void setDateasof(int dateasof) {
        this.dateasof = dateasof;
    }

    public String getCodeterm() {
        return codeterm;
    }

    public void setCodeterm(String codeterm) {
        this.codeterm = codeterm;
    }

    public int getDatedisc() {
        return datedisc;
    }

    public void setDatedisc(int datedisc) {
        this.datedisc = datedisc;
    }

    public String getCodecurn() {
        return codecurn;
    }

    public void setCodecurn(String codecurn) {
        this.codecurn = codecurn;
    }

    public String getIdratetype() {
        return idratetype;
    }

    public void setIdratetype(String idratetype) {
        this.idratetype = idratetype;
    }

    public short getSwrateovrd() {
        return swrateovrd;
    }

    public void setSwrateovrd(short swrateovrd) {
        this.swrateovrd = swrateovrd;
    }

    public BigDecimal getExchratehc() {
        return exchratehc;
    }

    public void setExchratehc(BigDecimal exchratehc) {
        this.exchratehc = exchratehc;
    }

    public BigDecimal getAmtinvchc() {
        return amtinvchc;
    }

    public void setAmtinvchc(BigDecimal amtinvchc) {
        this.amtinvchc = amtinvchc;
    }

    public BigDecimal getAmtduehc() {
        return amtduehc;
    }

    public void setAmtduehc(BigDecimal amtduehc) {
        this.amtduehc = amtduehc;
    }

    public BigDecimal getAmttxblhc() {
        return amttxblhc;
    }

    public void setAmttxblhc(BigDecimal amttxblhc) {
        this.amttxblhc = amttxblhc;
    }

    public BigDecimal getAmtnontxhc() {
        return amtnontxhc;
    }

    public void setAmtnontxhc(BigDecimal amtnontxhc) {
        this.amtnontxhc = amtnontxhc;
    }

    public BigDecimal getAmttaxhc() {
        return amttaxhc;
    }

    public void setAmttaxhc(BigDecimal amttaxhc) {
        this.amttaxhc = amttaxhc;
    }

    public BigDecimal getAmtdischc() {
        return amtdischc;
    }

    public void setAmtdischc(BigDecimal amtdischc) {
        this.amtdischc = amtdischc;
    }

    public BigDecimal getAmtinvctc() {
        return amtinvctc;
    }

    public void setAmtinvctc(BigDecimal amtinvctc) {
        this.amtinvctc = amtinvctc;
    }

    public BigDecimal getAmtduetc() {
        return amtduetc;
    }

    public void setAmtduetc(BigDecimal amtduetc) {
        this.amtduetc = amtduetc;
    }

    public BigDecimal getAmttxbltc() {
        return amttxbltc;
    }

    public void setAmttxbltc(BigDecimal amttxbltc) {
        this.amttxbltc = amttxbltc;
    }

    public BigDecimal getAmtnontxtc() {
        return amtnontxtc;
    }

    public void setAmtnontxtc(BigDecimal amtnontxtc) {
        this.amtnontxtc = amtnontxtc;
    }

    public BigDecimal getAmttaxtc() {
        return amttaxtc;
    }

    public void setAmttaxtc(BigDecimal amttaxtc) {
        this.amttaxtc = amttaxtc;
    }

    public BigDecimal getAmtdisctc() {
        return amtdisctc;
    }

    public void setAmtdisctc(BigDecimal amtdisctc) {
        this.amtdisctc = amtdisctc;
    }

    public short getSwpaid() {
        return swpaid;
    }

    public void setSwpaid(short swpaid) {
        this.swpaid = swpaid;
    }

    public int getDatelstact() {
        return datelstact;
    }

    public void setDatelstact(int datelstact) {
        this.datelstact = datelstact;
    }

    public int getDatelststm() {
        return datelststm;
    }

    public void setDatelststm(int datelststm) {
        this.datelststm = datelststm;
    }

    public int getDatelstdlq() {
        return datelstdlq;
    }

    public void setDatelstdlq(int datelstdlq) {
        this.datelstdlq = datelstdlq;
    }

    public short getCodedlqsts() {
        return codedlqsts;
    }

    public void setCodedlqsts(short codedlqsts) {
        this.codedlqsts = codedlqsts;
    }

    public int getCnttotpaym() {
        return cnttotpaym;
    }

    public void setCnttotpaym(int cnttotpaym) {
        this.cnttotpaym = cnttotpaym;
    }

    public int getCntlstpaid() {
        return cntlstpaid;
    }

    public void setCntlstpaid(int cntlstpaid) {
        this.cntlstpaid = cntlstpaid;
    }

    public int getCntlstpyst() {
        return cntlstpyst;
    }

    public void setCntlstpyst(int cntlstpyst) {
        this.cntlstpyst = cntlstpyst;
    }

    public BigDecimal getAmtremit() {
        return amtremit;
    }

    public void setAmtremit(BigDecimal amtremit) {
        this.amtremit = amtremit;
    }

    public int getCntlastseq() {
        return cntlastseq;
    }

    public void setCntlastseq(int cntlastseq) {
        this.cntlastseq = cntlastseq;
    }

    public short getSwtaxinput() {
        return swtaxinput;
    }

    public void setSwtaxinput(short swtaxinput) {
        this.swtaxinput = swtaxinput;
    }

    public String getCodetax1() {
        return codetax1;
    }

    public void setCodetax1(String codetax1) {
        this.codetax1 = codetax1;
    }

    public String getCodetax2() {
        return codetax2;
    }

    public void setCodetax2(String codetax2) {
        this.codetax2 = codetax2;
    }

    public String getCodetax3() {
        return codetax3;
    }

    public void setCodetax3(String codetax3) {
        this.codetax3 = codetax3;
    }

    public String getCodetax4() {
        return codetax4;
    }

    public void setCodetax4(String codetax4) {
        this.codetax4 = codetax4;
    }

    public String getCodetax5() {
        return codetax5;
    }

    public void setCodetax5(String codetax5) {
        this.codetax5 = codetax5;
    }

    public BigDecimal getAmtbase1Hc() {
        return amtbase1Hc;
    }

    public void setAmtbase1Hc(BigDecimal amtbase1Hc) {
        this.amtbase1Hc = amtbase1Hc;
    }

    public BigDecimal getAmtbase2Hc() {
        return amtbase2Hc;
    }

    public void setAmtbase2Hc(BigDecimal amtbase2Hc) {
        this.amtbase2Hc = amtbase2Hc;
    }

    public BigDecimal getAmtbase3Hc() {
        return amtbase3Hc;
    }

    public void setAmtbase3Hc(BigDecimal amtbase3Hc) {
        this.amtbase3Hc = amtbase3Hc;
    }

    public BigDecimal getAmtbase4Hc() {
        return amtbase4Hc;
    }

    public void setAmtbase4Hc(BigDecimal amtbase4Hc) {
        this.amtbase4Hc = amtbase4Hc;
    }

    public BigDecimal getAmtbase5Hc() {
        return amtbase5Hc;
    }

    public void setAmtbase5Hc(BigDecimal amtbase5Hc) {
        this.amtbase5Hc = amtbase5Hc;
    }

    public BigDecimal getAmttax1Hc() {
        return amttax1Hc;
    }

    public void setAmttax1Hc(BigDecimal amttax1Hc) {
        this.amttax1Hc = amttax1Hc;
    }

    public BigDecimal getAmttax2Hc() {
        return amttax2Hc;
    }

    public void setAmttax2Hc(BigDecimal amttax2Hc) {
        this.amttax2Hc = amttax2Hc;
    }

    public BigDecimal getAmttax3Hc() {
        return amttax3Hc;
    }

    public void setAmttax3Hc(BigDecimal amttax3Hc) {
        this.amttax3Hc = amttax3Hc;
    }

    public BigDecimal getAmttax4Hc() {
        return amttax4Hc;
    }

    public void setAmttax4Hc(BigDecimal amttax4Hc) {
        this.amttax4Hc = amttax4Hc;
    }

    public BigDecimal getAmttax5Hc() {
        return amttax5Hc;
    }

    public void setAmttax5Hc(BigDecimal amttax5Hc) {
        this.amttax5Hc = amttax5Hc;
    }

    public BigDecimal getAmtbase1Tc() {
        return amtbase1Tc;
    }

    public void setAmtbase1Tc(BigDecimal amtbase1Tc) {
        this.amtbase1Tc = amtbase1Tc;
    }

    public BigDecimal getAmtbase2Tc() {
        return amtbase2Tc;
    }

    public void setAmtbase2Tc(BigDecimal amtbase2Tc) {
        this.amtbase2Tc = amtbase2Tc;
    }

    public BigDecimal getAmtbase3Tc() {
        return amtbase3Tc;
    }

    public void setAmtbase3Tc(BigDecimal amtbase3Tc) {
        this.amtbase3Tc = amtbase3Tc;
    }

    public BigDecimal getAmtbase4Tc() {
        return amtbase4Tc;
    }

    public void setAmtbase4Tc(BigDecimal amtbase4Tc) {
        this.amtbase4Tc = amtbase4Tc;
    }

    public BigDecimal getAmtbase5Tc() {
        return amtbase5Tc;
    }

    public void setAmtbase5Tc(BigDecimal amtbase5Tc) {
        this.amtbase5Tc = amtbase5Tc;
    }

    public BigDecimal getAmttax1Tc() {
        return amttax1Tc;
    }

    public void setAmttax1Tc(BigDecimal amttax1Tc) {
        this.amttax1Tc = amttax1Tc;
    }

    public BigDecimal getAmttax2Tc() {
        return amttax2Tc;
    }

    public void setAmttax2Tc(BigDecimal amttax2Tc) {
        this.amttax2Tc = amttax2Tc;
    }

    public BigDecimal getAmttax3Tc() {
        return amttax3Tc;
    }

    public void setAmttax3Tc(BigDecimal amttax3Tc) {
        this.amttax3Tc = amttax3Tc;
    }

    public BigDecimal getAmttax4Tc() {
        return amttax4Tc;
    }

    public void setAmttax4Tc(BigDecimal amttax4Tc) {
        this.amttax4Tc = amttax4Tc;
    }

    public BigDecimal getAmttax5Tc() {
        return amttax5Tc;
    }

    public void setAmttax5Tc(BigDecimal amttax5Tc) {
        this.amttax5Tc = amttax5Tc;
    }

    public String getCodeslsp1() {
        return codeslsp1;
    }

    public void setCodeslsp1(String codeslsp1) {
        this.codeslsp1 = codeslsp1;
    }

    public String getCodeslsp2() {
        return codeslsp2;
    }

    public void setCodeslsp2(String codeslsp2) {
        this.codeslsp2 = codeslsp2;
    }

    public String getCodeslsp3() {
        return codeslsp3;
    }

    public void setCodeslsp3(String codeslsp3) {
        this.codeslsp3 = codeslsp3;
    }

    public String getCodeslsp4() {
        return codeslsp4;
    }

    public void setCodeslsp4(String codeslsp4) {
        this.codeslsp4 = codeslsp4;
    }

    public String getCodeslsp5() {
        return codeslsp5;
    }

    public void setCodeslsp5(String codeslsp5) {
        this.codeslsp5 = codeslsp5;
    }

    public BigDecimal getPctsasplt1() {
        return pctsasplt1;
    }

    public void setPctsasplt1(BigDecimal pctsasplt1) {
        this.pctsasplt1 = pctsasplt1;
    }

    public BigDecimal getPctsasplt2() {
        return pctsasplt2;
    }

    public void setPctsasplt2(BigDecimal pctsasplt2) {
        this.pctsasplt2 = pctsasplt2;
    }

    public BigDecimal getPctsasplt3() {
        return pctsasplt3;
    }

    public void setPctsasplt3(BigDecimal pctsasplt3) {
        this.pctsasplt3 = pctsasplt3;
    }

    public BigDecimal getPctsasplt4() {
        return pctsasplt4;
    }

    public void setPctsasplt4(BigDecimal pctsasplt4) {
        this.pctsasplt4 = pctsasplt4;
    }

    public BigDecimal getPctsasplt5() {
        return pctsasplt5;
    }

    public void setPctsasplt5(BigDecimal pctsasplt5) {
        this.pctsasplt5 = pctsasplt5;
    }

    public String getFiscyr() {
        return fiscyr;
    }

    public void setFiscyr(String fiscyr) {
        this.fiscyr = fiscyr;
    }

    public String getFiscper() {
        return fiscper;
    }

    public void setFiscper(String fiscper) {
        this.fiscper = fiscper;
    }

    public String getIdprepaid() {
        return idprepaid;
    }

    public void setIdprepaid(String idprepaid) {
        this.idprepaid = idprepaid;
    }

    public int getDatebus() {
        return datebus;
    }

    public void setDatebus(int datebus) {
        this.datebus = datebus;
    }

    public int getRatedate() {
        return ratedate;
    }

    public void setRatedate(int ratedate) {
        this.ratedate = ratedate;
    }

    public short getRateop() {
        return rateop;
    }

    public void setRateop(short rateop) {
        this.rateop = rateop;
    }

    public String getYplastact() {
        return yplastact;
    }

    public void setYplastact(String yplastact) {
        this.yplastact = yplastact;
    }

    public String getIdbank() {
        return idbank;
    }

    public void setIdbank(String idbank) {
        this.idbank = idbank;
    }

    public int getDepstnbr() {
        return depstnbr;
    }

    public void setDepstnbr(int depstnbr) {
        this.depstnbr = depstnbr;
    }

    public int getPostseqnce() {
        return postseqnce;
    }

    public void setPostseqnce(int postseqnce) {
        this.postseqnce = postseqnce;
    }

    public short getSwjob() {
        return swjob;
    }

    public void setSwjob(short swjob) {
        this.swjob = swjob;
    }

    public short getSwrtg() {
        return swrtg;
    }

    public void setSwrtg(short swrtg) {
        this.swrtg = swrtg;
    }

    public short getSwrtgout() {
        return swrtgout;
    }

    public void setSwrtgout(short swrtgout) {
        this.swrtgout = swrtgout;
    }

    public int getRtgdatedue() {
        return rtgdatedue;
    }

    public void setRtgdatedue(int rtgdatedue) {
        this.rtgdatedue = rtgdatedue;
    }

    public BigDecimal getRtgoamthc() {
        return rtgoamthc;
    }

    public void setRtgoamthc(BigDecimal rtgoamthc) {
        this.rtgoamthc = rtgoamthc;
    }

    public BigDecimal getRtgamthc() {
        return rtgamthc;
    }

    public void setRtgamthc(BigDecimal rtgamthc) {
        this.rtgamthc = rtgamthc;
    }

    public BigDecimal getRtgoamttc() {
        return rtgoamttc;
    }

    public void setRtgoamttc(BigDecimal rtgoamttc) {
        this.rtgoamttc = rtgoamttc;
    }

    public BigDecimal getRtgamttc() {
        return rtgamttc;
    }

    public void setRtgamttc(BigDecimal rtgamttc) {
        this.rtgamttc = rtgamttc;
    }

    public String getRtgterms() {
        return rtgterms;
    }

    public void setRtgterms(String rtgterms) {
        this.rtgterms = rtgterms;
    }

    public short getSwrtgrate() {
        return swrtgrate;
    }

    public void setSwrtgrate(short swrtgrate) {
        this.swrtgrate = swrtgrate;
    }

    public String getRtgapplyto() {
        return rtgapplyto;
    }

    public void setRtgapplyto(String rtgapplyto) {
        this.rtgapplyto = rtgapplyto;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public String getSrceappl() {
        return srceappl;
    }

    public void setSrceappl(String srceappl) {
        this.srceappl = srceappl;
    }

    public String getArversion() {
        return arversion;
    }

    public void setArversion(String arversion) {
        this.arversion = arversion;
    }

    public short getInvctype() {
        return invctype;
    }

    public void setInvctype(short invctype) {
        this.invctype = invctype;
    }

    public long getDepseq() {
        return depseq;
    }

    public void setDepseq(long depseq) {
        this.depseq = depseq;
    }

    public int getDepline() {
        return depline;
    }

    public void setDepline(int depline) {
        this.depline = depline;
    }

    public String getTypebtch() {
        return typebtch;
    }

    public void setTypebtch(String typebtch) {
        this.typebtch = typebtch;
    }

    public int getCntoblj() {
        return cntoblj;
    }

    public void setCntoblj(int cntoblj) {
        this.cntoblj = cntoblj;
    }

    public String getCodecurnrc() {
        return codecurnrc;
    }

    public void setCodecurnrc(String codecurnrc) {
        this.codecurnrc = codecurnrc;
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

    public int getRatedaterc() {
        return ratedaterc;
    }

    public void setRatedaterc(int ratedaterc) {
        this.ratedaterc = ratedaterc;
    }

    public short getRateoprc() {
        return rateoprc;
    }

    public void setRateoprc(short rateoprc) {
        this.rateoprc = rateoprc;
    }

    public short getSwraterc() {
        return swraterc;
    }

    public void setSwraterc(short swraterc) {
        this.swraterc = swraterc;
    }

    public short getSwtxrtgrpt() {
        return swtxrtgrpt;
    }

    public void setSwtxrtgrpt(short swtxrtgrpt) {
        this.swtxrtgrpt = swtxrtgrpt;
    }

    public String getCodetaxgrp() {
        return codetaxgrp;
    }

    public void setCodetaxgrp(String codetaxgrp) {
        this.codetaxgrp = codetaxgrp;
    }

    public int getTaxversion() {
        return taxversion;
    }

    public void setTaxversion(int taxversion) {
        this.taxversion = taxversion;
    }

    public short getSwtxctlrc() {
        return swtxctlrc;
    }

    public void setSwtxctlrc(short swtxctlrc) {
        this.swtxctlrc = swtxctlrc;
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

    public BigDecimal getTxbsert1Tc() {
        return txbsert1Tc;
    }

    public void setTxbsert1Tc(BigDecimal txbsert1Tc) {
        this.txbsert1Tc = txbsert1Tc;
    }

    public BigDecimal getTxbsert2Tc() {
        return txbsert2Tc;
    }

    public void setTxbsert2Tc(BigDecimal txbsert2Tc) {
        this.txbsert2Tc = txbsert2Tc;
    }

    public BigDecimal getTxbsert3Tc() {
        return txbsert3Tc;
    }

    public void setTxbsert3Tc(BigDecimal txbsert3Tc) {
        this.txbsert3Tc = txbsert3Tc;
    }

    public BigDecimal getTxbsert4Tc() {
        return txbsert4Tc;
    }

    public void setTxbsert4Tc(BigDecimal txbsert4Tc) {
        this.txbsert4Tc = txbsert4Tc;
    }

    public BigDecimal getTxbsert5Tc() {
        return txbsert5Tc;
    }

    public void setTxbsert5Tc(BigDecimal txbsert5Tc) {
        this.txbsert5Tc = txbsert5Tc;
    }

    public BigDecimal getTxamtrt1Tc() {
        return txamtrt1Tc;
    }

    public void setTxamtrt1Tc(BigDecimal txamtrt1Tc) {
        this.txamtrt1Tc = txamtrt1Tc;
    }

    public BigDecimal getTxamtrt2Tc() {
        return txamtrt2Tc;
    }

    public void setTxamtrt2Tc(BigDecimal txamtrt2Tc) {
        this.txamtrt2Tc = txamtrt2Tc;
    }

    public BigDecimal getTxamtrt3Tc() {
        return txamtrt3Tc;
    }

    public void setTxamtrt3Tc(BigDecimal txamtrt3Tc) {
        this.txamtrt3Tc = txamtrt3Tc;
    }

    public BigDecimal getTxamtrt4Tc() {
        return txamtrt4Tc;
    }

    public void setTxamtrt4Tc(BigDecimal txamtrt4Tc) {
        this.txamtrt4Tc = txamtrt4Tc;
    }

    public BigDecimal getTxamtrt5Tc() {
        return txamtrt5Tc;
    }

    public void setTxamtrt5Tc(BigDecimal txamtrt5Tc) {
        this.txamtrt5Tc = txamtrt5Tc;
    }

    public String getIdshipnbr() {
        return idshipnbr;
    }

    public void setIdshipnbr(String idshipnbr) {
        this.idshipnbr = idshipnbr;
    }

    public int getDatefrstbk() {
        return datefrstbk;
    }

    public void setDatefrstbk(int datefrstbk) {
        this.datefrstbk = datefrstbk;
    }

    public int getDatelstrvl() {
        return datelstrvl;
    }

    public void setDatelstrvl(int datelstrvl) {
        this.datelstrvl = datelstrvl;
    }

    public BigDecimal getOrate() {
        return orate;
    }

    public void setOrate(BigDecimal orate) {
        this.orate = orate;
    }

    public String getOratetype() {
        return oratetype;
    }

    public void setOratetype(String oratetype) {
        this.oratetype = oratetype;
    }

    public int getOratedate() {
        return oratedate;
    }

    public void setOratedate(int oratedate) {
        this.oratedate = oratedate;
    }

    public short getOrateop() {
        return orateop;
    }

    public void setOrateop(short orateop) {
        this.orateop = orateop;
    }

    public short getOswrate() {
        return oswrate;
    }

    public void setOswrate(short oswrate) {
        this.oswrate = oswrate;
    }

    public String getIdacctset() {
        return idacctset;
    }

    public void setIdacctset(String idacctset) {
        this.idacctset = idacctset;
    }

    public int getDatepaid() {
        return datepaid;
    }

    public void setDatepaid(int datepaid) {
        this.datepaid = datepaid;
    }

    public short getSwnonrcvbl() {
        return swnonrcvbl;
    }

    public void setSwnonrcvbl(short swnonrcvbl) {
        this.swnonrcvbl = swnonrcvbl;
    }

    public String getCodeterr() {
        return codeterr;
    }

    public void setCodeterr(String codeterr) {
        this.codeterr = codeterr;
    }

    public BigDecimal getOamtwht1Tc() {
        return oamtwht1Tc;
    }

    public void setOamtwht1Tc(BigDecimal oamtwht1Tc) {
        this.oamtwht1Tc = oamtwht1Tc;
    }

    public BigDecimal getOamtwht2Tc() {
        return oamtwht2Tc;
    }

    public void setOamtwht2Tc(BigDecimal oamtwht2Tc) {
        this.oamtwht2Tc = oamtwht2Tc;
    }

    public BigDecimal getOamtwht3Tc() {
        return oamtwht3Tc;
    }

    public void setOamtwht3Tc(BigDecimal oamtwht3Tc) {
        this.oamtwht3Tc = oamtwht3Tc;
    }

    public BigDecimal getOamtwht4Tc() {
        return oamtwht4Tc;
    }

    public void setOamtwht4Tc(BigDecimal oamtwht4Tc) {
        this.oamtwht4Tc = oamtwht4Tc;
    }

    public BigDecimal getOamtwht5Tc() {
        return oamtwht5Tc;
    }

    public void setOamtwht5Tc(BigDecimal oamtwht5Tc) {
        this.oamtwht5Tc = oamtwht5Tc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arobl arobl = (Arobl) o;
        return audtdate == arobl.audtdate && audttime == arobl.audttime && datedue == arobl.datedue && trxtypeid == arobl.trxtypeid && trxtypetxt == arobl.trxtypetxt && datebtch == arobl.datebtch && cntbtch == arobl.cntbtch && cntitem == arobl.cntitem && dateinvc == arobl.dateinvc && dateasof == arobl.dateasof && datedisc == arobl.datedisc && swrateovrd == arobl.swrateovrd && swpaid == arobl.swpaid && datelstact == arobl.datelstact && datelststm == arobl.datelststm && datelstdlq == arobl.datelstdlq && codedlqsts == arobl.codedlqsts && cnttotpaym == arobl.cnttotpaym && cntlstpaid == arobl.cntlstpaid && cntlstpyst == arobl.cntlstpyst && cntlastseq == arobl.cntlastseq && swtaxinput == arobl.swtaxinput && datebus == arobl.datebus && ratedate == arobl.ratedate && rateop == arobl.rateop && depstnbr == arobl.depstnbr && postseqnce == arobl.postseqnce && swjob == arobl.swjob && swrtg == arobl.swrtg && swrtgout == arobl.swrtgout && rtgdatedue == arobl.rtgdatedue && swrtgrate == arobl.swrtgrate && values == arobl.values && invctype == arobl.invctype && depseq == arobl.depseq && depline == arobl.depline && cntoblj == arobl.cntoblj && ratedaterc == arobl.ratedaterc && rateoprc == arobl.rateoprc && swraterc == arobl.swraterc && swtxrtgrpt == arobl.swtxrtgrpt && taxversion == arobl.taxversion && swtxctlrc == arobl.swtxctlrc && taxclass1 == arobl.taxclass1 && taxclass2 == arobl.taxclass2 && taxclass3 == arobl.taxclass3 && taxclass4 == arobl.taxclass4 && taxclass5 == arobl.taxclass5 && datefrstbk == arobl.datefrstbk && datelstrvl == arobl.datelstrvl && oratedate == arobl.oratedate && orateop == arobl.orateop && oswrate == arobl.oswrate && datepaid == arobl.datepaid && swnonrcvbl == arobl.swnonrcvbl && Objects.equals(idcust, arobl.idcust) && Objects.equals(idinvc, arobl.idinvc) && Objects.equals(audtuser, arobl.audtuser) && Objects.equals(audtorg, arobl.audtorg) && Objects.equals(idrmit, arobl.idrmit) && Objects.equals(idordernbr, arobl.idordernbr) && Objects.equals(idcustpo, arobl.idcustpo) && Objects.equals(idnatacct, arobl.idnatacct) && Objects.equals(idcustshpt, arobl.idcustshpt) && Objects.equals(idgrp, arobl.idgrp) && Objects.equals(descinvc, arobl.descinvc) && Objects.equals(codeterm, arobl.codeterm) && Objects.equals(codecurn, arobl.codecurn) && Objects.equals(idratetype, arobl.idratetype) && Objects.equals(exchratehc, arobl.exchratehc) && Objects.equals(amtinvchc, arobl.amtinvchc) && Objects.equals(amtduehc, arobl.amtduehc) && Objects.equals(amttxblhc, arobl.amttxblhc) && Objects.equals(amtnontxhc, arobl.amtnontxhc) && Objects.equals(amttaxhc, arobl.amttaxhc) && Objects.equals(amtdischc, arobl.amtdischc) && Objects.equals(amtinvctc, arobl.amtinvctc) && Objects.equals(amtduetc, arobl.amtduetc) && Objects.equals(amttxbltc, arobl.amttxbltc) && Objects.equals(amtnontxtc, arobl.amtnontxtc) && Objects.equals(amttaxtc, arobl.amttaxtc) && Objects.equals(amtdisctc, arobl.amtdisctc) && Objects.equals(amtremit, arobl.amtremit) && Objects.equals(codetax1, arobl.codetax1) && Objects.equals(codetax2, arobl.codetax2) && Objects.equals(codetax3, arobl.codetax3) && Objects.equals(codetax4, arobl.codetax4) && Objects.equals(codetax5, arobl.codetax5) && Objects.equals(amtbase1Hc, arobl.amtbase1Hc) && Objects.equals(amtbase2Hc, arobl.amtbase2Hc) && Objects.equals(amtbase3Hc, arobl.amtbase3Hc) && Objects.equals(amtbase4Hc, arobl.amtbase4Hc) && Objects.equals(amtbase5Hc, arobl.amtbase5Hc) && Objects.equals(amttax1Hc, arobl.amttax1Hc) && Objects.equals(amttax2Hc, arobl.amttax2Hc) && Objects.equals(amttax3Hc, arobl.amttax3Hc) && Objects.equals(amttax4Hc, arobl.amttax4Hc) && Objects.equals(amttax5Hc, arobl.amttax5Hc) && Objects.equals(amtbase1Tc, arobl.amtbase1Tc) && Objects.equals(amtbase2Tc, arobl.amtbase2Tc) && Objects.equals(amtbase3Tc, arobl.amtbase3Tc) && Objects.equals(amtbase4Tc, arobl.amtbase4Tc) && Objects.equals(amtbase5Tc, arobl.amtbase5Tc) && Objects.equals(amttax1Tc, arobl.amttax1Tc) && Objects.equals(amttax2Tc, arobl.amttax2Tc) && Objects.equals(amttax3Tc, arobl.amttax3Tc) && Objects.equals(amttax4Tc, arobl.amttax4Tc) && Objects.equals(amttax5Tc, arobl.amttax5Tc) && Objects.equals(codeslsp1, arobl.codeslsp1) && Objects.equals(codeslsp2, arobl.codeslsp2) && Objects.equals(codeslsp3, arobl.codeslsp3) && Objects.equals(codeslsp4, arobl.codeslsp4) && Objects.equals(codeslsp5, arobl.codeslsp5) && Objects.equals(pctsasplt1, arobl.pctsasplt1) && Objects.equals(pctsasplt2, arobl.pctsasplt2) && Objects.equals(pctsasplt3, arobl.pctsasplt3) && Objects.equals(pctsasplt4, arobl.pctsasplt4) && Objects.equals(pctsasplt5, arobl.pctsasplt5) && Objects.equals(fiscyr, arobl.fiscyr) && Objects.equals(fiscper, arobl.fiscper) && Objects.equals(idprepaid, arobl.idprepaid) && Objects.equals(yplastact, arobl.yplastact) && Objects.equals(idbank, arobl.idbank) && Objects.equals(rtgoamthc, arobl.rtgoamthc) && Objects.equals(rtgamthc, arobl.rtgamthc) && Objects.equals(rtgoamttc, arobl.rtgoamttc) && Objects.equals(rtgamttc, arobl.rtgamttc) && Objects.equals(rtgterms, arobl.rtgterms) && Objects.equals(rtgapplyto, arobl.rtgapplyto) && Objects.equals(srceappl, arobl.srceappl) && Objects.equals(arversion, arobl.arversion) && Objects.equals(typebtch, arobl.typebtch) && Objects.equals(codecurnrc, arobl.codecurnrc) && Objects.equals(raterc, arobl.raterc) && Objects.equals(ratetyperc, arobl.ratetyperc) && Objects.equals(codetaxgrp, arobl.codetaxgrp) && Objects.equals(txbsert1Tc, arobl.txbsert1Tc) && Objects.equals(txbsert2Tc, arobl.txbsert2Tc) && Objects.equals(txbsert3Tc, arobl.txbsert3Tc) && Objects.equals(txbsert4Tc, arobl.txbsert4Tc) && Objects.equals(txbsert5Tc, arobl.txbsert5Tc) && Objects.equals(txamtrt1Tc, arobl.txamtrt1Tc) && Objects.equals(txamtrt2Tc, arobl.txamtrt2Tc) && Objects.equals(txamtrt3Tc, arobl.txamtrt3Tc) && Objects.equals(txamtrt4Tc, arobl.txamtrt4Tc) && Objects.equals(txamtrt5Tc, arobl.txamtrt5Tc) && Objects.equals(idshipnbr, arobl.idshipnbr) && Objects.equals(orate, arobl.orate) && Objects.equals(oratetype, arobl.oratetype) && Objects.equals(idacctset, arobl.idacctset) && Objects.equals(codeterr, arobl.codeterr) && Objects.equals(oamtwht1Tc, arobl.oamtwht1Tc) && Objects.equals(oamtwht2Tc, arobl.oamtwht2Tc) && Objects.equals(oamtwht3Tc, arobl.oamtwht3Tc) && Objects.equals(oamtwht4Tc, arobl.oamtwht4Tc) && Objects.equals(oamtwht5Tc, arobl.oamtwht5Tc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcust, idinvc, audtdate, audttime, audtuser, audtorg, idrmit, idordernbr, idcustpo, datedue, idnatacct, idcustshpt, trxtypeid, trxtypetxt, datebtch, cntbtch, cntitem, idgrp, descinvc, dateinvc, dateasof, codeterm, datedisc, codecurn, idratetype, swrateovrd, exchratehc, amtinvchc, amtduehc, amttxblhc, amtnontxhc, amttaxhc, amtdischc, amtinvctc, amtduetc, amttxbltc, amtnontxtc, amttaxtc, amtdisctc, swpaid, datelstact, datelststm, datelstdlq, codedlqsts, cnttotpaym, cntlstpaid, cntlstpyst, amtremit, cntlastseq, swtaxinput, codetax1, codetax2, codetax3, codetax4, codetax5, amtbase1Hc, amtbase2Hc, amtbase3Hc, amtbase4Hc, amtbase5Hc, amttax1Hc, amttax2Hc, amttax3Hc, amttax4Hc, amttax5Hc, amtbase1Tc, amtbase2Tc, amtbase3Tc, amtbase4Tc, amtbase5Tc, amttax1Tc, amttax2Tc, amttax3Tc, amttax4Tc, amttax5Tc, codeslsp1, codeslsp2, codeslsp3, codeslsp4, codeslsp5, pctsasplt1, pctsasplt2, pctsasplt3, pctsasplt4, pctsasplt5, fiscyr, fiscper, idprepaid, datebus, ratedate, rateop, yplastact, idbank, depstnbr, postseqnce, swjob, swrtg, swrtgout, rtgdatedue, rtgoamthc, rtgamthc, rtgoamttc, rtgamttc, rtgterms, swrtgrate, rtgapplyto, values, srceappl, arversion, invctype, depseq, depline, typebtch, cntoblj, codecurnrc, raterc, ratetyperc, ratedaterc, rateoprc, swraterc, swtxrtgrpt, codetaxgrp, taxversion, swtxctlrc, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, txbsert1Tc, txbsert2Tc, txbsert3Tc, txbsert4Tc, txbsert5Tc, txamtrt1Tc, txamtrt2Tc, txamtrt3Tc, txamtrt4Tc, txamtrt5Tc, idshipnbr, datefrstbk, datelstrvl, orate, oratetype, oratedate, orateop, oswrate, idacctset, datepaid, swnonrcvbl, codeterr, oamtwht1Tc, oamtwht2Tc, oamtwht3Tc, oamtwht4Tc, oamtwht5Tc);
    }
}
