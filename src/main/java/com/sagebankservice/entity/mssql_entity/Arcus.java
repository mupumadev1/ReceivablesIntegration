package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Arcus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDCUST", nullable = false, length = 12)
    private String idcust;
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
    @Column(name = "TEXTSNAM", nullable = false, length = 10)
    private String textsnam;
    @Basic
    @Column(name = "IDGRP", nullable = false, length = 6)
    private String idgrp;
    @Basic
    @Column(name = "IDNATACCT", nullable = false, length = 12)
    private String idnatacct;
    @Basic
    @Column(name = "SWACTV", nullable = false)
    private short swactv;
    @Basic
    @Column(name = "DATEINAC", nullable = false, precision = 0)
    private int dateinac;
    @Basic
    @Column(name = "DATELASTMN", nullable = false, precision = 0)
    private int datelastmn;
    @Basic
    @Column(name = "SWHOLD", nullable = false)
    private short swhold;
    @Basic
    @Column(name = "DATESTART", nullable = false, precision = 0)
    private int datestart;
    @Basic
    @Column(name = "IDPPNT", nullable = false, length = 12)
    private String idppnt;
    @Basic
    @Column(name = "CODEDAB", nullable = false, length = 9)
    private String codedab;
    @Basic
    @Column(name = "CODEDABRTG", nullable = false, length = 5)
    private String codedabrtg;
    @Basic
    @Column(name = "DATEDAB", nullable = false, precision = 0)
    private int datedab;
    @Basic
    @Column(name = "NAMECUST", nullable = false, length = 60)
    private String namecust;
    @Basic
    @Column(name = "TEXTSTRE1", nullable = false, length = 60)
    private String textstre1;
    @Basic
    @Column(name = "TEXTSTRE2", nullable = false, length = 60)
    private String textstre2;
    @Basic
    @Column(name = "TEXTSTRE3", nullable = false, length = 60)
    private String textstre3;
    @Basic
    @Column(name = "TEXTSTRE4", nullable = false, length = 60)
    private String textstre4;
    @Basic
    @Column(name = "NAMECITY", nullable = false, length = 30)
    private String namecity;
    @Basic
    @Column(name = "CODESTTE", nullable = false, length = 30)
    private String codestte;
    @Basic
    @Column(name = "CODEPSTL", nullable = false, length = 20)
    private String codepstl;
    @Basic
    @Column(name = "CODECTRY", nullable = false, length = 30)
    private String codectry;
    @Basic
    @Column(name = "NAMECTAC", nullable = false, length = 60)
    private String namectac;
    @Basic
    @Column(name = "TEXTPHON1", nullable = false, length = 30)
    private String textphon1;
    @Basic
    @Column(name = "TEXTPHON2", nullable = false, length = 30)
    private String textphon2;
    @Basic
    @Column(name = "CODETERR", nullable = false, length = 6)
    private String codeterr;
    @Basic
    @Column(name = "IDACCTSET", nullable = false, length = 6)
    private String idacctset;
    @Basic
    @Column(name = "IDAUTOCASH", nullable = false, length = 6)
    private String idautocash;
    @Basic
    @Column(name = "IDBILLCYCL", nullable = false, length = 6)
    private String idbillcycl;
    @Basic
    @Column(name = "IDSVCCHRG", nullable = false, length = 6)
    private String idsvcchrg;
    @Basic
    @Column(name = "IDDLNQ", nullable = false, length = 6)
    private String iddlnq;
    @Basic
    @Column(name = "CODECURN", nullable = false, length = 3)
    private String codecurn;
    @Basic
    @Column(name = "SWPRTSTMT", nullable = false)
    private short swprtstmt;
    @Basic
    @Column(name = "SWPRTDLNQ", nullable = false)
    private short swprtdlnq;
    @Basic
    @Column(name = "SWBALFWD", nullable = false)
    private short swbalfwd;
    @Basic
    @Column(name = "CODETERM", nullable = false, length = 6)
    private String codeterm;
    @Basic
    @Column(name = "IDRATETYPE", nullable = false, length = 2)
    private String idratetype;
    @Basic
    @Column(name = "CODETAXGRP", nullable = false, length = 12)
    private String codetaxgrp;
    @Basic
    @Column(name = "IDTAXREGI1", nullable = false, length = 20)
    private String idtaxregi1;
    @Basic
    @Column(name = "IDTAXREGI2", nullable = false, length = 20)
    private String idtaxregi2;
    @Basic
    @Column(name = "IDTAXREGI3", nullable = false, length = 20)
    private String idtaxregi3;
    @Basic
    @Column(name = "IDTAXREGI4", nullable = false, length = 20)
    private String idtaxregi4;
    @Basic
    @Column(name = "IDTAXREGI5", nullable = false, length = 20)
    private String idtaxregi5;
    @Basic
    @Column(name = "TAXSTTS1", nullable = false)
    private short taxstts1;
    @Basic
    @Column(name = "TAXSTTS2", nullable = false)
    private short taxstts2;
    @Basic
    @Column(name = "TAXSTTS3", nullable = false)
    private short taxstts3;
    @Basic
    @Column(name = "TAXSTTS4", nullable = false)
    private short taxstts4;
    @Basic
    @Column(name = "TAXSTTS5", nullable = false)
    private short taxstts5;
    @Basic
    @Column(name = "AMTCRLIMT", nullable = false, precision = 3)
    private BigDecimal amtcrlimt;
    @Basic
    @Column(name = "AMTBALDUET", nullable = false, precision = 3)
    private BigDecimal amtbalduet;
    @Basic
    @Column(name = "AMTBALDUEH", nullable = false, precision = 3)
    private BigDecimal amtbaldueh;
    @Basic
    @Column(name = "DATELASTST", nullable = false, precision = 0)
    private int datelastst;
    @Basic
    @Column(name = "AMTLASTSTT", nullable = false, precision = 3)
    private BigDecimal amtlaststt;
    @Basic
    @Column(name = "AMTLASTSTH", nullable = false, precision = 3)
    private BigDecimal amtlaststh;
    @Basic
    @Column(name = "DTBEGBALFW", nullable = false, precision = 0)
    private int dtbegbalfw;
    @Basic
    @Column(name = "AMTBALFWDT", nullable = false, precision = 3)
    private BigDecimal amtbalfwdt;
    @Basic
    @Column(name = "AMTBALFWDH", nullable = false, precision = 3)
    private BigDecimal amtbalfwdh;
    @Basic
    @Column(name = "DTLASTRVAL", nullable = false, precision = 0)
    private int dtlastrval;
    @Basic
    @Column(name = "AMTBALLARV", nullable = false, precision = 3)
    private BigDecimal amtballarv;
    @Basic
    @Column(name = "CNTOPENINV", nullable = false, precision = 0)
    private int cntopeninv;
    @Basic
    @Column(name = "CNTINVPAID", nullable = false, precision = 0)
    private int cntinvpaid;
    @Basic
    @Column(name = "DAYSTOPAY", nullable = false, precision = 0)
    private int daystopay;
    @Basic
    @Column(name = "DATEINVCHI", nullable = false, precision = 0)
    private int dateinvchi;
    @Basic
    @Column(name = "DATEBALHI", nullable = false, precision = 0)
    private int datebalhi;
    @Basic
    @Column(name = "DATEINVHIL", nullable = false, precision = 0)
    private int dateinvhil;
    @Basic
    @Column(name = "DATEBALHIL", nullable = false, precision = 0)
    private int datebalhil;
    @Basic
    @Column(name = "DATELASTAC", nullable = false, precision = 0)
    private int datelastac;
    @Basic
    @Column(name = "DATELASTIV", nullable = false, precision = 0)
    private int datelastiv;
    @Basic
    @Column(name = "DATELASTCR", nullable = false, precision = 0)
    private int datelastcr;
    @Basic
    @Column(name = "DATELASTDR", nullable = false, precision = 0)
    private int datelastdr;
    @Basic
    @Column(name = "DATELASTPA", nullable = false, precision = 0)
    private int datelastpa;
    @Basic
    @Column(name = "DATELASTDI", nullable = false, precision = 0)
    private int datelastdi;
    @Basic
    @Column(name = "DATELASTAD", nullable = false, precision = 0)
    private int datelastad;
    @Basic
    @Column(name = "DATELASTWR", nullable = false, precision = 0)
    private int datelastwr;
    @Basic
    @Column(name = "DATELASTRI", nullable = false, precision = 0)
    private int datelastri;
    @Basic
    @Column(name = "DATELASTIN", nullable = false, precision = 0)
    private int datelastin;
    @Basic
    @Column(name = "DATELASTDQ", nullable = false, precision = 0)
    private int datelastdq;
    @Basic
    @Column(name = "IDINVCHI", nullable = false, length = 22)
    private String idinvchi;
    @Basic
    @Column(name = "IDINVCHILY", nullable = false, length = 22)
    private String idinvchily;
    @Basic
    @Column(name = "AMTINVHIT", nullable = false, precision = 3)
    private BigDecimal amtinvhit;
    @Basic
    @Column(name = "AMTBALHIT", nullable = false, precision = 3)
    private BigDecimal amtbalhit;
    @Basic
    @Column(name = "AMTINVHILT", nullable = false, precision = 3)
    private BigDecimal amtinvhilt;
    @Basic
    @Column(name = "AMTBALHILT", nullable = false, precision = 3)
    private BigDecimal amtbalhilt;
    @Basic
    @Column(name = "AMTLASTIVT", nullable = false, precision = 3)
    private BigDecimal amtlastivt;
    @Basic
    @Column(name = "AMTLASTCRT", nullable = false, precision = 3)
    private BigDecimal amtlastcrt;
    @Basic
    @Column(name = "AMTLASTDRT", nullable = false, precision = 3)
    private BigDecimal amtlastdrt;
    @Basic
    @Column(name = "AMTLASTPYT", nullable = false, precision = 3)
    private BigDecimal amtlastpyt;
    @Basic
    @Column(name = "AMTLASTDIT", nullable = false, precision = 3)
    private BigDecimal amtlastdit;
    @Basic
    @Column(name = "AMTLASTADT", nullable = false, precision = 3)
    private BigDecimal amtlastadt;
    @Basic
    @Column(name = "AMTLASTWRT", nullable = false, precision = 3)
    private BigDecimal amtlastwrt;
    @Basic
    @Column(name = "AMTLASTRIT", nullable = false, precision = 3)
    private BigDecimal amtlastrit;
    @Basic
    @Column(name = "AMTLASTINT", nullable = false, precision = 3)
    private BigDecimal amtlastint;
    @Basic
    @Column(name = "AMTINVHIH", nullable = false, precision = 3)
    private BigDecimal amtinvhih;
    @Basic
    @Column(name = "AMTBALHIH", nullable = false, precision = 3)
    private BigDecimal amtbalhih;
    @Basic
    @Column(name = "AMTINVHILH", nullable = false, precision = 3)
    private BigDecimal amtinvhilh;
    @Basic
    @Column(name = "AMTBALHILH", nullable = false, precision = 3)
    private BigDecimal amtbalhilh;
    @Basic
    @Column(name = "AMTLASTIVH", nullable = false, precision = 3)
    private BigDecimal amtlastivh;
    @Basic
    @Column(name = "AMTLASTCRH", nullable = false, precision = 3)
    private BigDecimal amtlastcrh;
    @Basic
    @Column(name = "AMTLASTDRH", nullable = false, precision = 3)
    private BigDecimal amtlastdrh;
    @Basic
    @Column(name = "AMTLASTPYH", nullable = false, precision = 3)
    private BigDecimal amtlastpyh;
    @Basic
    @Column(name = "AMTLASTDIH", nullable = false, precision = 3)
    private BigDecimal amtlastdih;
    @Basic
    @Column(name = "AMTLASTADH", nullable = false, precision = 3)
    private BigDecimal amtlastadh;
    @Basic
    @Column(name = "AMTLASTWRH", nullable = false, precision = 3)
    private BigDecimal amtlastwrh;
    @Basic
    @Column(name = "AMTLASTRIH", nullable = false, precision = 3)
    private BigDecimal amtlastrih;
    @Basic
    @Column(name = "AMTLASTINH", nullable = false, precision = 3)
    private BigDecimal amtlastinh;
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
    @Column(name = "PRICLIST", nullable = false, length = 6)
    private String priclist;
    @Basic
    @Column(name = "CUSTTYPE", nullable = false)
    private short custtype;
    @Basic
    @Column(name = "AMTPDUE", nullable = false, precision = 3)
    private BigDecimal amtpdue;
    @Basic
    @Column(name = "EMAIL1", nullable = false, length = 50)
    private String email1;
    @Basic
    @Column(name = "EMAIL2", nullable = false, length = 50)
    private String email2;
    @Basic
    @Column(name = "WEBSITE", nullable = false, length = 100)
    private String website;
    @Basic
    @Column(name = "BILLMETHOD", nullable = false)
    private short billmethod;
    @Basic
    @Column(name = "PAYMCODE", nullable = false, length = 12)
    private String paymcode;
    @Basic
    @Column(name = "FOB", nullable = false, length = 60)
    private String fob;
    @Basic
    @Column(name = "SHPVIACODE", nullable = false, length = 6)
    private String shpviacode;
    @Basic
    @Column(name = "SHPVIADESC", nullable = false, length = 60)
    private String shpviadesc;
    @Basic
    @Column(name = "DELMETHOD", nullable = false)
    private short delmethod;
    @Basic
    @Column(name = "PRIMSHIPTO", nullable = false, length = 6)
    private String primshipto;
    @Basic
    @Column(name = "CTACPHONE", nullable = false, length = 30)
    private String ctacphone;
    @Basic
    @Column(name = "CTACFAX", nullable = false, length = 30)
    private String ctacfax;
    @Basic
    @Column(name = "SWPARTSHIP", nullable = false)
    private short swpartship;
    @Basic
    @Column(name = "SWWEBSHOP", nullable = false)
    private short swwebshop;
    @Basic
    @Column(name = "RTGPERCENT", nullable = false, precision = 5)
    private BigDecimal rtgpercent;
    @Basic
    @Column(name = "RTGDAYS", nullable = false)
    private short rtgdays;
    @Basic
    @Column(name = "RTGTERMS", nullable = false, length = 6)
    private String rtgterms;
    @Basic
    @Column(name = "RTGAMTTC", nullable = false, precision = 3)
    private BigDecimal rtgamttc;
    @Basic
    @Column(name = "RTGAMTHC", nullable = false, precision = 3)
    private BigDecimal rtgamthc;
    @Basic
    @Column(name = "VALUES", nullable = false)
    private int values;
    @Basic
    @Column(name = "CNTPPDINVC", nullable = false, precision = 0)
    private int cntppdinvc;
    @Basic
    @Column(name = "AMTPPDINVT", nullable = false, precision = 3)
    private BigDecimal amtppdinvt;
    @Basic
    @Column(name = "AMTPPDINVH", nullable = false, precision = 3)
    private BigDecimal amtppdinvh;
    @Basic
    @Column(name = "DATELASTRF", nullable = false, precision = 0)
    private int datelastrf;
    @Basic
    @Column(name = "AMTLASTRFT", nullable = false, precision = 3)
    private BigDecimal amtlastrft;
    @Basic
    @Column(name = "AMTLASTRFH", nullable = false, precision = 3)
    private BigDecimal amtlastrfh;
    @Basic
    @Column(name = "CODECHECK", nullable = false, length = 3)
    private String codecheck;
    @Basic
    @Column(name = "NEXTCUID", nullable = false)
    private int nextcuid;
    @Basic
    @Column(name = "LOCATION", nullable = false, length = 6)
    private String location;
    @Basic
    @Column(name = "SWCHKLIMIT", nullable = false)
    private short swchklimit;
    @Basic
    @Column(name = "SWCHKOVER", nullable = false)
    private short swchkover;
    @Basic
    @Column(name = "OVERDAYS", nullable = false)
    private short overdays;
    @Basic
    @Column(name = "OVERAMT", nullable = false, precision = 3)
    private BigDecimal overamt;
    @Basic
    @Column(name = "SWBACKORDR", nullable = false)
    private short swbackordr;
    @Basic
    @Column(name = "SWCHKDUPPO", nullable = false)
    private short swchkduppo;
    @Basic
    @Column(name = "CATEGORY", nullable = false)
    private short category;
    @Basic
    @Column(name = "BRN", nullable = false, length = 30)
    private String brn;

    public String getIdcust() {
        return idcust;
    }

    public void setIdcust(String idcust) {
        this.idcust = idcust;
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

    public String getTextsnam() {
        return textsnam;
    }

    public void setTextsnam(String textsnam) {
        this.textsnam = textsnam;
    }

    public String getIdgrp() {
        return idgrp;
    }

    public void setIdgrp(String idgrp) {
        this.idgrp = idgrp;
    }

    public String getIdnatacct() {
        return idnatacct;
    }

    public void setIdnatacct(String idnatacct) {
        this.idnatacct = idnatacct;
    }

    public short getSwactv() {
        return swactv;
    }

    public void setSwactv(short swactv) {
        this.swactv = swactv;
    }

    public int getDateinac() {
        return dateinac;
    }

    public void setDateinac(int dateinac) {
        this.dateinac = dateinac;
    }

    public int getDatelastmn() {
        return datelastmn;
    }

    public void setDatelastmn(int datelastmn) {
        this.datelastmn = datelastmn;
    }

    public short getSwhold() {
        return swhold;
    }

    public void setSwhold(short swhold) {
        this.swhold = swhold;
    }

    public int getDatestart() {
        return datestart;
    }

    public void setDatestart(int datestart) {
        this.datestart = datestart;
    }

    public String getIdppnt() {
        return idppnt;
    }

    public void setIdppnt(String idppnt) {
        this.idppnt = idppnt;
    }

    public String getCodedab() {
        return codedab;
    }

    public void setCodedab(String codedab) {
        this.codedab = codedab;
    }

    public String getCodedabrtg() {
        return codedabrtg;
    }

    public void setCodedabrtg(String codedabrtg) {
        this.codedabrtg = codedabrtg;
    }

    public int getDatedab() {
        return datedab;
    }

    public void setDatedab(int datedab) {
        this.datedab = datedab;
    }

    public String getNamecust() {
        return namecust;
    }

    public void setNamecust(String namecust) {
        this.namecust = namecust;
    }

    public String getTextstre1() {
        return textstre1;
    }

    public void setTextstre1(String textstre1) {
        this.textstre1 = textstre1;
    }

    public String getTextstre2() {
        return textstre2;
    }

    public void setTextstre2(String textstre2) {
        this.textstre2 = textstre2;
    }

    public String getTextstre3() {
        return textstre3;
    }

    public void setTextstre3(String textstre3) {
        this.textstre3 = textstre3;
    }

    public String getTextstre4() {
        return textstre4;
    }

    public void setTextstre4(String textstre4) {
        this.textstre4 = textstre4;
    }

    public String getNamecity() {
        return namecity;
    }

    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }

    public String getCodestte() {
        return codestte;
    }

    public void setCodestte(String codestte) {
        this.codestte = codestte;
    }

    public String getCodepstl() {
        return codepstl;
    }

    public void setCodepstl(String codepstl) {
        this.codepstl = codepstl;
    }

    public String getCodectry() {
        return codectry;
    }

    public void setCodectry(String codectry) {
        this.codectry = codectry;
    }

    public String getNamectac() {
        return namectac;
    }

    public void setNamectac(String namectac) {
        this.namectac = namectac;
    }

    public String getTextphon1() {
        return textphon1;
    }

    public void setTextphon1(String textphon1) {
        this.textphon1 = textphon1;
    }

    public String getTextphon2() {
        return textphon2;
    }

    public void setTextphon2(String textphon2) {
        this.textphon2 = textphon2;
    }

    public String getCodeterr() {
        return codeterr;
    }

    public void setCodeterr(String codeterr) {
        this.codeterr = codeterr;
    }

    public String getIdacctset() {
        return idacctset;
    }

    public void setIdacctset(String idacctset) {
        this.idacctset = idacctset;
    }

    public String getIdautocash() {
        return idautocash;
    }

    public void setIdautocash(String idautocash) {
        this.idautocash = idautocash;
    }

    public String getIdbillcycl() {
        return idbillcycl;
    }

    public void setIdbillcycl(String idbillcycl) {
        this.idbillcycl = idbillcycl;
    }

    public String getIdsvcchrg() {
        return idsvcchrg;
    }

    public void setIdsvcchrg(String idsvcchrg) {
        this.idsvcchrg = idsvcchrg;
    }

    public String getIddlnq() {
        return iddlnq;
    }

    public void setIddlnq(String iddlnq) {
        this.iddlnq = iddlnq;
    }

    public String getCodecurn() {
        return codecurn;
    }

    public void setCodecurn(String codecurn) {
        this.codecurn = codecurn;
    }

    public short getSwprtstmt() {
        return swprtstmt;
    }

    public void setSwprtstmt(short swprtstmt) {
        this.swprtstmt = swprtstmt;
    }

    public short getSwprtdlnq() {
        return swprtdlnq;
    }

    public void setSwprtdlnq(short swprtdlnq) {
        this.swprtdlnq = swprtdlnq;
    }

    public short getSwbalfwd() {
        return swbalfwd;
    }

    public void setSwbalfwd(short swbalfwd) {
        this.swbalfwd = swbalfwd;
    }

    public String getCodeterm() {
        return codeterm;
    }

    public void setCodeterm(String codeterm) {
        this.codeterm = codeterm;
    }

    public String getIdratetype() {
        return idratetype;
    }

    public void setIdratetype(String idratetype) {
        this.idratetype = idratetype;
    }

    public String getCodetaxgrp() {
        return codetaxgrp;
    }

    public void setCodetaxgrp(String codetaxgrp) {
        this.codetaxgrp = codetaxgrp;
    }

    public String getIdtaxregi1() {
        return idtaxregi1;
    }

    public void setIdtaxregi1(String idtaxregi1) {
        this.idtaxregi1 = idtaxregi1;
    }

    public String getIdtaxregi2() {
        return idtaxregi2;
    }

    public void setIdtaxregi2(String idtaxregi2) {
        this.idtaxregi2 = idtaxregi2;
    }

    public String getIdtaxregi3() {
        return idtaxregi3;
    }

    public void setIdtaxregi3(String idtaxregi3) {
        this.idtaxregi3 = idtaxregi3;
    }

    public String getIdtaxregi4() {
        return idtaxregi4;
    }

    public void setIdtaxregi4(String idtaxregi4) {
        this.idtaxregi4 = idtaxregi4;
    }

    public String getIdtaxregi5() {
        return idtaxregi5;
    }

    public void setIdtaxregi5(String idtaxregi5) {
        this.idtaxregi5 = idtaxregi5;
    }

    public short getTaxstts1() {
        return taxstts1;
    }

    public void setTaxstts1(short taxstts1) {
        this.taxstts1 = taxstts1;
    }

    public short getTaxstts2() {
        return taxstts2;
    }

    public void setTaxstts2(short taxstts2) {
        this.taxstts2 = taxstts2;
    }

    public short getTaxstts3() {
        return taxstts3;
    }

    public void setTaxstts3(short taxstts3) {
        this.taxstts3 = taxstts3;
    }

    public short getTaxstts4() {
        return taxstts4;
    }

    public void setTaxstts4(short taxstts4) {
        this.taxstts4 = taxstts4;
    }

    public short getTaxstts5() {
        return taxstts5;
    }

    public void setTaxstts5(short taxstts5) {
        this.taxstts5 = taxstts5;
    }

    public BigDecimal getAmtcrlimt() {
        return amtcrlimt;
    }

    public void setAmtcrlimt(BigDecimal amtcrlimt) {
        this.amtcrlimt = amtcrlimt;
    }

    public BigDecimal getAmtbalduet() {
        return amtbalduet;
    }

    public void setAmtbalduet(BigDecimal amtbalduet) {
        this.amtbalduet = amtbalduet;
    }

    public BigDecimal getAmtbaldueh() {
        return amtbaldueh;
    }

    public void setAmtbaldueh(BigDecimal amtbaldueh) {
        this.amtbaldueh = amtbaldueh;
    }

    public int getDatelastst() {
        return datelastst;
    }

    public void setDatelastst(int datelastst) {
        this.datelastst = datelastst;
    }

    public BigDecimal getAmtlaststt() {
        return amtlaststt;
    }

    public void setAmtlaststt(BigDecimal amtlaststt) {
        this.amtlaststt = amtlaststt;
    }

    public BigDecimal getAmtlaststh() {
        return amtlaststh;
    }

    public void setAmtlaststh(BigDecimal amtlaststh) {
        this.amtlaststh = amtlaststh;
    }

    public int getDtbegbalfw() {
        return dtbegbalfw;
    }

    public void setDtbegbalfw(int dtbegbalfw) {
        this.dtbegbalfw = dtbegbalfw;
    }

    public BigDecimal getAmtbalfwdt() {
        return amtbalfwdt;
    }

    public void setAmtbalfwdt(BigDecimal amtbalfwdt) {
        this.amtbalfwdt = amtbalfwdt;
    }

    public BigDecimal getAmtbalfwdh() {
        return amtbalfwdh;
    }

    public void setAmtbalfwdh(BigDecimal amtbalfwdh) {
        this.amtbalfwdh = amtbalfwdh;
    }

    public int getDtlastrval() {
        return dtlastrval;
    }

    public void setDtlastrval(int dtlastrval) {
        this.dtlastrval = dtlastrval;
    }

    public BigDecimal getAmtballarv() {
        return amtballarv;
    }

    public void setAmtballarv(BigDecimal amtballarv) {
        this.amtballarv = amtballarv;
    }

    public int getCntopeninv() {
        return cntopeninv;
    }

    public void setCntopeninv(int cntopeninv) {
        this.cntopeninv = cntopeninv;
    }

    public int getCntinvpaid() {
        return cntinvpaid;
    }

    public void setCntinvpaid(int cntinvpaid) {
        this.cntinvpaid = cntinvpaid;
    }

    public int getDaystopay() {
        return daystopay;
    }

    public void setDaystopay(int daystopay) {
        this.daystopay = daystopay;
    }

    public int getDateinvchi() {
        return dateinvchi;
    }

    public void setDateinvchi(int dateinvchi) {
        this.dateinvchi = dateinvchi;
    }

    public int getDatebalhi() {
        return datebalhi;
    }

    public void setDatebalhi(int datebalhi) {
        this.datebalhi = datebalhi;
    }

    public int getDateinvhil() {
        return dateinvhil;
    }

    public void setDateinvhil(int dateinvhil) {
        this.dateinvhil = dateinvhil;
    }

    public int getDatebalhil() {
        return datebalhil;
    }

    public void setDatebalhil(int datebalhil) {
        this.datebalhil = datebalhil;
    }

    public int getDatelastac() {
        return datelastac;
    }

    public void setDatelastac(int datelastac) {
        this.datelastac = datelastac;
    }

    public int getDatelastiv() {
        return datelastiv;
    }

    public void setDatelastiv(int datelastiv) {
        this.datelastiv = datelastiv;
    }

    public int getDatelastcr() {
        return datelastcr;
    }

    public void setDatelastcr(int datelastcr) {
        this.datelastcr = datelastcr;
    }

    public int getDatelastdr() {
        return datelastdr;
    }

    public void setDatelastdr(int datelastdr) {
        this.datelastdr = datelastdr;
    }

    public int getDatelastpa() {
        return datelastpa;
    }

    public void setDatelastpa(int datelastpa) {
        this.datelastpa = datelastpa;
    }

    public int getDatelastdi() {
        return datelastdi;
    }

    public void setDatelastdi(int datelastdi) {
        this.datelastdi = datelastdi;
    }

    public int getDatelastad() {
        return datelastad;
    }

    public void setDatelastad(int datelastad) {
        this.datelastad = datelastad;
    }

    public int getDatelastwr() {
        return datelastwr;
    }

    public void setDatelastwr(int datelastwr) {
        this.datelastwr = datelastwr;
    }

    public int getDatelastri() {
        return datelastri;
    }

    public void setDatelastri(int datelastri) {
        this.datelastri = datelastri;
    }

    public int getDatelastin() {
        return datelastin;
    }

    public void setDatelastin(int datelastin) {
        this.datelastin = datelastin;
    }

    public int getDatelastdq() {
        return datelastdq;
    }

    public void setDatelastdq(int datelastdq) {
        this.datelastdq = datelastdq;
    }

    public String getIdinvchi() {
        return idinvchi;
    }

    public void setIdinvchi(String idinvchi) {
        this.idinvchi = idinvchi;
    }

    public String getIdinvchily() {
        return idinvchily;
    }

    public void setIdinvchily(String idinvchily) {
        this.idinvchily = idinvchily;
    }

    public BigDecimal getAmtinvhit() {
        return amtinvhit;
    }

    public void setAmtinvhit(BigDecimal amtinvhit) {
        this.amtinvhit = amtinvhit;
    }

    public BigDecimal getAmtbalhit() {
        return amtbalhit;
    }

    public void setAmtbalhit(BigDecimal amtbalhit) {
        this.amtbalhit = amtbalhit;
    }

    public BigDecimal getAmtinvhilt() {
        return amtinvhilt;
    }

    public void setAmtinvhilt(BigDecimal amtinvhilt) {
        this.amtinvhilt = amtinvhilt;
    }

    public BigDecimal getAmtbalhilt() {
        return amtbalhilt;
    }

    public void setAmtbalhilt(BigDecimal amtbalhilt) {
        this.amtbalhilt = amtbalhilt;
    }

    public BigDecimal getAmtlastivt() {
        return amtlastivt;
    }

    public void setAmtlastivt(BigDecimal amtlastivt) {
        this.amtlastivt = amtlastivt;
    }

    public BigDecimal getAmtlastcrt() {
        return amtlastcrt;
    }

    public void setAmtlastcrt(BigDecimal amtlastcrt) {
        this.amtlastcrt = amtlastcrt;
    }

    public BigDecimal getAmtlastdrt() {
        return amtlastdrt;
    }

    public void setAmtlastdrt(BigDecimal amtlastdrt) {
        this.amtlastdrt = amtlastdrt;
    }

    public BigDecimal getAmtlastpyt() {
        return amtlastpyt;
    }

    public void setAmtlastpyt(BigDecimal amtlastpyt) {
        this.amtlastpyt = amtlastpyt;
    }

    public BigDecimal getAmtlastdit() {
        return amtlastdit;
    }

    public void setAmtlastdit(BigDecimal amtlastdit) {
        this.amtlastdit = amtlastdit;
    }

    public BigDecimal getAmtlastadt() {
        return amtlastadt;
    }

    public void setAmtlastadt(BigDecimal amtlastadt) {
        this.amtlastadt = amtlastadt;
    }

    public BigDecimal getAmtlastwrt() {
        return amtlastwrt;
    }

    public void setAmtlastwrt(BigDecimal amtlastwrt) {
        this.amtlastwrt = amtlastwrt;
    }

    public BigDecimal getAmtlastrit() {
        return amtlastrit;
    }

    public void setAmtlastrit(BigDecimal amtlastrit) {
        this.amtlastrit = amtlastrit;
    }

    public BigDecimal getAmtlastint() {
        return amtlastint;
    }

    public void setAmtlastint(BigDecimal amtlastint) {
        this.amtlastint = amtlastint;
    }

    public BigDecimal getAmtinvhih() {
        return amtinvhih;
    }

    public void setAmtinvhih(BigDecimal amtinvhih) {
        this.amtinvhih = amtinvhih;
    }

    public BigDecimal getAmtbalhih() {
        return amtbalhih;
    }

    public void setAmtbalhih(BigDecimal amtbalhih) {
        this.amtbalhih = amtbalhih;
    }

    public BigDecimal getAmtinvhilh() {
        return amtinvhilh;
    }

    public void setAmtinvhilh(BigDecimal amtinvhilh) {
        this.amtinvhilh = amtinvhilh;
    }

    public BigDecimal getAmtbalhilh() {
        return amtbalhilh;
    }

    public void setAmtbalhilh(BigDecimal amtbalhilh) {
        this.amtbalhilh = amtbalhilh;
    }

    public BigDecimal getAmtlastivh() {
        return amtlastivh;
    }

    public void setAmtlastivh(BigDecimal amtlastivh) {
        this.amtlastivh = amtlastivh;
    }

    public BigDecimal getAmtlastcrh() {
        return amtlastcrh;
    }

    public void setAmtlastcrh(BigDecimal amtlastcrh) {
        this.amtlastcrh = amtlastcrh;
    }

    public BigDecimal getAmtlastdrh() {
        return amtlastdrh;
    }

    public void setAmtlastdrh(BigDecimal amtlastdrh) {
        this.amtlastdrh = amtlastdrh;
    }

    public BigDecimal getAmtlastpyh() {
        return amtlastpyh;
    }

    public void setAmtlastpyh(BigDecimal amtlastpyh) {
        this.amtlastpyh = amtlastpyh;
    }

    public BigDecimal getAmtlastdih() {
        return amtlastdih;
    }

    public void setAmtlastdih(BigDecimal amtlastdih) {
        this.amtlastdih = amtlastdih;
    }

    public BigDecimal getAmtlastadh() {
        return amtlastadh;
    }

    public void setAmtlastadh(BigDecimal amtlastadh) {
        this.amtlastadh = amtlastadh;
    }

    public BigDecimal getAmtlastwrh() {
        return amtlastwrh;
    }

    public void setAmtlastwrh(BigDecimal amtlastwrh) {
        this.amtlastwrh = amtlastwrh;
    }

    public BigDecimal getAmtlastrih() {
        return amtlastrih;
    }

    public void setAmtlastrih(BigDecimal amtlastrih) {
        this.amtlastrih = amtlastrih;
    }

    public BigDecimal getAmtlastinh() {
        return amtlastinh;
    }

    public void setAmtlastinh(BigDecimal amtlastinh) {
        this.amtlastinh = amtlastinh;
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

    public String getPriclist() {
        return priclist;
    }

    public void setPriclist(String priclist) {
        this.priclist = priclist;
    }

    public short getCusttype() {
        return custtype;
    }

    public void setCusttype(short custtype) {
        this.custtype = custtype;
    }

    public BigDecimal getAmtpdue() {
        return amtpdue;
    }

    public void setAmtpdue(BigDecimal amtpdue) {
        this.amtpdue = amtpdue;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public short getBillmethod() {
        return billmethod;
    }

    public void setBillmethod(short billmethod) {
        this.billmethod = billmethod;
    }

    public String getPaymcode() {
        return paymcode;
    }

    public void setPaymcode(String paymcode) {
        this.paymcode = paymcode;
    }

    public String getFob() {
        return fob;
    }

    public void setFob(String fob) {
        this.fob = fob;
    }

    public String getShpviacode() {
        return shpviacode;
    }

    public void setShpviacode(String shpviacode) {
        this.shpviacode = shpviacode;
    }

    public String getShpviadesc() {
        return shpviadesc;
    }

    public void setShpviadesc(String shpviadesc) {
        this.shpviadesc = shpviadesc;
    }

    public short getDelmethod() {
        return delmethod;
    }

    public void setDelmethod(short delmethod) {
        this.delmethod = delmethod;
    }

    public String getPrimshipto() {
        return primshipto;
    }

    public void setPrimshipto(String primshipto) {
        this.primshipto = primshipto;
    }

    public String getCtacphone() {
        return ctacphone;
    }

    public void setCtacphone(String ctacphone) {
        this.ctacphone = ctacphone;
    }

    public String getCtacfax() {
        return ctacfax;
    }

    public void setCtacfax(String ctacfax) {
        this.ctacfax = ctacfax;
    }

    public short getSwpartship() {
        return swpartship;
    }

    public void setSwpartship(short swpartship) {
        this.swpartship = swpartship;
    }

    public short getSwwebshop() {
        return swwebshop;
    }

    public void setSwwebshop(short swwebshop) {
        this.swwebshop = swwebshop;
    }

    public BigDecimal getRtgpercent() {
        return rtgpercent;
    }

    public void setRtgpercent(BigDecimal rtgpercent) {
        this.rtgpercent = rtgpercent;
    }

    public short getRtgdays() {
        return rtgdays;
    }

    public void setRtgdays(short rtgdays) {
        this.rtgdays = rtgdays;
    }

    public String getRtgterms() {
        return rtgterms;
    }

    public void setRtgterms(String rtgterms) {
        this.rtgterms = rtgterms;
    }

    public BigDecimal getRtgamttc() {
        return rtgamttc;
    }

    public void setRtgamttc(BigDecimal rtgamttc) {
        this.rtgamttc = rtgamttc;
    }

    public BigDecimal getRtgamthc() {
        return rtgamthc;
    }

    public void setRtgamthc(BigDecimal rtgamthc) {
        this.rtgamthc = rtgamthc;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public int getCntppdinvc() {
        return cntppdinvc;
    }

    public void setCntppdinvc(int cntppdinvc) {
        this.cntppdinvc = cntppdinvc;
    }

    public BigDecimal getAmtppdinvt() {
        return amtppdinvt;
    }

    public void setAmtppdinvt(BigDecimal amtppdinvt) {
        this.amtppdinvt = amtppdinvt;
    }

    public BigDecimal getAmtppdinvh() {
        return amtppdinvh;
    }

    public void setAmtppdinvh(BigDecimal amtppdinvh) {
        this.amtppdinvh = amtppdinvh;
    }

    public int getDatelastrf() {
        return datelastrf;
    }

    public void setDatelastrf(int datelastrf) {
        this.datelastrf = datelastrf;
    }

    public BigDecimal getAmtlastrft() {
        return amtlastrft;
    }

    public void setAmtlastrft(BigDecimal amtlastrft) {
        this.amtlastrft = amtlastrft;
    }

    public BigDecimal getAmtlastrfh() {
        return amtlastrfh;
    }

    public void setAmtlastrfh(BigDecimal amtlastrfh) {
        this.amtlastrfh = amtlastrfh;
    }

    public String getCodecheck() {
        return codecheck;
    }

    public void setCodecheck(String codecheck) {
        this.codecheck = codecheck;
    }

    public int getNextcuid() {
        return nextcuid;
    }

    public void setNextcuid(int nextcuid) {
        this.nextcuid = nextcuid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public short getSwchklimit() {
        return swchklimit;
    }

    public void setSwchklimit(short swchklimit) {
        this.swchklimit = swchklimit;
    }

    public short getSwchkover() {
        return swchkover;
    }

    public void setSwchkover(short swchkover) {
        this.swchkover = swchkover;
    }

    public short getOverdays() {
        return overdays;
    }

    public void setOverdays(short overdays) {
        this.overdays = overdays;
    }

    public BigDecimal getOveramt() {
        return overamt;
    }

    public void setOveramt(BigDecimal overamt) {
        this.overamt = overamt;
    }

    public short getSwbackordr() {
        return swbackordr;
    }

    public void setSwbackordr(short swbackordr) {
        this.swbackordr = swbackordr;
    }

    public short getSwchkduppo() {
        return swchkduppo;
    }

    public void setSwchkduppo(short swchkduppo) {
        this.swchkduppo = swchkduppo;
    }

    public short getCategory() {
        return category;
    }

    public void setCategory(short category) {
        this.category = category;
    }

    public String getBrn() {
        return brn;
    }

    public void setBrn(String brn) {
        this.brn = brn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arcus arcus = (Arcus) o;
        return audtdate == arcus.audtdate && audttime == arcus.audttime && swactv == arcus.swactv && dateinac == arcus.dateinac && datelastmn == arcus.datelastmn && swhold == arcus.swhold && datestart == arcus.datestart && datedab == arcus.datedab && swprtstmt == arcus.swprtstmt && swprtdlnq == arcus.swprtdlnq && swbalfwd == arcus.swbalfwd && taxstts1 == arcus.taxstts1 && taxstts2 == arcus.taxstts2 && taxstts3 == arcus.taxstts3 && taxstts4 == arcus.taxstts4 && taxstts5 == arcus.taxstts5 && datelastst == arcus.datelastst && dtbegbalfw == arcus.dtbegbalfw && dtlastrval == arcus.dtlastrval && cntopeninv == arcus.cntopeninv && cntinvpaid == arcus.cntinvpaid && daystopay == arcus.daystopay && dateinvchi == arcus.dateinvchi && datebalhi == arcus.datebalhi && dateinvhil == arcus.dateinvhil && datebalhil == arcus.datebalhil && datelastac == arcus.datelastac && datelastiv == arcus.datelastiv && datelastcr == arcus.datelastcr && datelastdr == arcus.datelastdr && datelastpa == arcus.datelastpa && datelastdi == arcus.datelastdi && datelastad == arcus.datelastad && datelastwr == arcus.datelastwr && datelastri == arcus.datelastri && datelastin == arcus.datelastin && datelastdq == arcus.datelastdq && custtype == arcus.custtype && billmethod == arcus.billmethod && delmethod == arcus.delmethod && swpartship == arcus.swpartship && swwebshop == arcus.swwebshop && rtgdays == arcus.rtgdays && values == arcus.values && cntppdinvc == arcus.cntppdinvc && datelastrf == arcus.datelastrf && nextcuid == arcus.nextcuid && swchklimit == arcus.swchklimit && swchkover == arcus.swchkover && overdays == arcus.overdays && swbackordr == arcus.swbackordr && swchkduppo == arcus.swchkduppo && category == arcus.category && Objects.equals(idcust, arcus.idcust) && Objects.equals(audtuser, arcus.audtuser) && Objects.equals(audtorg, arcus.audtorg) && Objects.equals(textsnam, arcus.textsnam) && Objects.equals(idgrp, arcus.idgrp) && Objects.equals(idnatacct, arcus.idnatacct) && Objects.equals(idppnt, arcus.idppnt) && Objects.equals(codedab, arcus.codedab) && Objects.equals(codedabrtg, arcus.codedabrtg) && Objects.equals(namecust, arcus.namecust) && Objects.equals(textstre1, arcus.textstre1) && Objects.equals(textstre2, arcus.textstre2) && Objects.equals(textstre3, arcus.textstre3) && Objects.equals(textstre4, arcus.textstre4) && Objects.equals(namecity, arcus.namecity) && Objects.equals(codestte, arcus.codestte) && Objects.equals(codepstl, arcus.codepstl) && Objects.equals(codectry, arcus.codectry) && Objects.equals(namectac, arcus.namectac) && Objects.equals(textphon1, arcus.textphon1) && Objects.equals(textphon2, arcus.textphon2) && Objects.equals(codeterr, arcus.codeterr) && Objects.equals(idacctset, arcus.idacctset) && Objects.equals(idautocash, arcus.idautocash) && Objects.equals(idbillcycl, arcus.idbillcycl) && Objects.equals(idsvcchrg, arcus.idsvcchrg) && Objects.equals(iddlnq, arcus.iddlnq) && Objects.equals(codecurn, arcus.codecurn) && Objects.equals(codeterm, arcus.codeterm) && Objects.equals(idratetype, arcus.idratetype) && Objects.equals(codetaxgrp, arcus.codetaxgrp) && Objects.equals(idtaxregi1, arcus.idtaxregi1) && Objects.equals(idtaxregi2, arcus.idtaxregi2) && Objects.equals(idtaxregi3, arcus.idtaxregi3) && Objects.equals(idtaxregi4, arcus.idtaxregi4) && Objects.equals(idtaxregi5, arcus.idtaxregi5) && Objects.equals(amtcrlimt, arcus.amtcrlimt) && Objects.equals(amtbalduet, arcus.amtbalduet) && Objects.equals(amtbaldueh, arcus.amtbaldueh) && Objects.equals(amtlaststt, arcus.amtlaststt) && Objects.equals(amtlaststh, arcus.amtlaststh) && Objects.equals(amtbalfwdt, arcus.amtbalfwdt) && Objects.equals(amtbalfwdh, arcus.amtbalfwdh) && Objects.equals(amtballarv, arcus.amtballarv) && Objects.equals(idinvchi, arcus.idinvchi) && Objects.equals(idinvchily, arcus.idinvchily) && Objects.equals(amtinvhit, arcus.amtinvhit) && Objects.equals(amtbalhit, arcus.amtbalhit) && Objects.equals(amtinvhilt, arcus.amtinvhilt) && Objects.equals(amtbalhilt, arcus.amtbalhilt) && Objects.equals(amtlastivt, arcus.amtlastivt) && Objects.equals(amtlastcrt, arcus.amtlastcrt) && Objects.equals(amtlastdrt, arcus.amtlastdrt) && Objects.equals(amtlastpyt, arcus.amtlastpyt) && Objects.equals(amtlastdit, arcus.amtlastdit) && Objects.equals(amtlastadt, arcus.amtlastadt) && Objects.equals(amtlastwrt, arcus.amtlastwrt) && Objects.equals(amtlastrit, arcus.amtlastrit) && Objects.equals(amtlastint, arcus.amtlastint) && Objects.equals(amtinvhih, arcus.amtinvhih) && Objects.equals(amtbalhih, arcus.amtbalhih) && Objects.equals(amtinvhilh, arcus.amtinvhilh) && Objects.equals(amtbalhilh, arcus.amtbalhilh) && Objects.equals(amtlastivh, arcus.amtlastivh) && Objects.equals(amtlastcrh, arcus.amtlastcrh) && Objects.equals(amtlastdrh, arcus.amtlastdrh) && Objects.equals(amtlastpyh, arcus.amtlastpyh) && Objects.equals(amtlastdih, arcus.amtlastdih) && Objects.equals(amtlastadh, arcus.amtlastadh) && Objects.equals(amtlastwrh, arcus.amtlastwrh) && Objects.equals(amtlastrih, arcus.amtlastrih) && Objects.equals(amtlastinh, arcus.amtlastinh) && Objects.equals(codeslsp1, arcus.codeslsp1) && Objects.equals(codeslsp2, arcus.codeslsp2) && Objects.equals(codeslsp3, arcus.codeslsp3) && Objects.equals(codeslsp4, arcus.codeslsp4) && Objects.equals(codeslsp5, arcus.codeslsp5) && Objects.equals(pctsasplt1, arcus.pctsasplt1) && Objects.equals(pctsasplt2, arcus.pctsasplt2) && Objects.equals(pctsasplt3, arcus.pctsasplt3) && Objects.equals(pctsasplt4, arcus.pctsasplt4) && Objects.equals(pctsasplt5, arcus.pctsasplt5) && Objects.equals(priclist, arcus.priclist) && Objects.equals(amtpdue, arcus.amtpdue) && Objects.equals(email1, arcus.email1) && Objects.equals(email2, arcus.email2) && Objects.equals(website, arcus.website) && Objects.equals(paymcode, arcus.paymcode) && Objects.equals(fob, arcus.fob) && Objects.equals(shpviacode, arcus.shpviacode) && Objects.equals(shpviadesc, arcus.shpviadesc) && Objects.equals(primshipto, arcus.primshipto) && Objects.equals(ctacphone, arcus.ctacphone) && Objects.equals(ctacfax, arcus.ctacfax) && Objects.equals(rtgpercent, arcus.rtgpercent) && Objects.equals(rtgterms, arcus.rtgterms) && Objects.equals(rtgamttc, arcus.rtgamttc) && Objects.equals(rtgamthc, arcus.rtgamthc) && Objects.equals(amtppdinvt, arcus.amtppdinvt) && Objects.equals(amtppdinvh, arcus.amtppdinvh) && Objects.equals(amtlastrft, arcus.amtlastrft) && Objects.equals(amtlastrfh, arcus.amtlastrfh) && Objects.equals(codecheck, arcus.codecheck) && Objects.equals(location, arcus.location) && Objects.equals(overamt, arcus.overamt) && Objects.equals(brn, arcus.brn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcust, audtdate, audttime, audtuser, audtorg, textsnam, idgrp, idnatacct, swactv, dateinac, datelastmn, swhold, datestart, idppnt, codedab, codedabrtg, datedab, namecust, textstre1, textstre2, textstre3, textstre4, namecity, codestte, codepstl, codectry, namectac, textphon1, textphon2, codeterr, idacctset, idautocash, idbillcycl, idsvcchrg, iddlnq, codecurn, swprtstmt, swprtdlnq, swbalfwd, codeterm, idratetype, codetaxgrp, idtaxregi1, idtaxregi2, idtaxregi3, idtaxregi4, idtaxregi5, taxstts1, taxstts2, taxstts3, taxstts4, taxstts5, amtcrlimt, amtbalduet, amtbaldueh, datelastst, amtlaststt, amtlaststh, dtbegbalfw, amtbalfwdt, amtbalfwdh, dtlastrval, amtballarv, cntopeninv, cntinvpaid, daystopay, dateinvchi, datebalhi, dateinvhil, datebalhil, datelastac, datelastiv, datelastcr, datelastdr, datelastpa, datelastdi, datelastad, datelastwr, datelastri, datelastin, datelastdq, idinvchi, idinvchily, amtinvhit, amtbalhit, amtinvhilt, amtbalhilt, amtlastivt, amtlastcrt, amtlastdrt, amtlastpyt, amtlastdit, amtlastadt, amtlastwrt, amtlastrit, amtlastint, amtinvhih, amtbalhih, amtinvhilh, amtbalhilh, amtlastivh, amtlastcrh, amtlastdrh, amtlastpyh, amtlastdih, amtlastadh, amtlastwrh, amtlastrih, amtlastinh, codeslsp1, codeslsp2, codeslsp3, codeslsp4, codeslsp5, pctsasplt1, pctsasplt2, pctsasplt3, pctsasplt4, pctsasplt5, priclist, custtype, amtpdue, email1, email2, website, billmethod, paymcode, fob, shpviacode, shpviadesc, delmethod, primshipto, ctacphone, ctacfax, swpartship, swwebshop, rtgpercent, rtgdays, rtgterms, rtgamttc, rtgamthc, values, cntppdinvc, amtppdinvt, amtppdinvh, datelastrf, amtlastrft, amtlastrfh, codecheck, nextcuid, location, swchklimit, swchkover, overdays, overamt, swbackordr, swchkduppo, category, brn);
    }
}
