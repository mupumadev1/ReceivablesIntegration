package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Arcus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDCUST")
    private String idcust;
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
    @Column(name = "TEXTSNAM")
    private String textsnam;
    @Basic
    @Column(name = "IDGRP")
    private String idgrp;
    @Basic
    @Column(name = "IDNATACCT")
    private String idnatacct;
    @Basic
    @Column(name = "SWACTV")
    private Short swactv;
    @Basic
    @Column(name = "DATEINAC")
    private Integer dateinac;
    @Basic
    @Column(name = "DATELASTMN")
    private Integer datelastmn;
    @Basic
    @Column(name = "SWHOLD")
    private Short swhold;
    @Basic
    @Column(name = "DATESTART")
    private Integer datestart;
    @Basic
    @Column(name = "IDPPNT")
    private String idppnt;
    @Basic
    @Column(name = "CODEDAB")
    private String codedab;
    @Basic
    @Column(name = "CODEDABRTG")
    private String codedabrtg;
    @Basic
    @Column(name = "DATEDAB")
    private Integer datedab;
    @Basic
    @Column(name = "NAMECUST")
    private String namecust;
    @Basic
    @Column(name = "TEXTSTRE1")
    private String textstre1;
    @Basic
    @Column(name = "TEXTSTRE2")
    private String textstre2;
    @Basic
    @Column(name = "TEXTSTRE3")
    private String textstre3;
    @Basic
    @Column(name = "TEXTSTRE4")
    private String textstre4;
    @Basic
    @Column(name = "NAMECITY")
    private String namecity;
    @Basic
    @Column(name = "CODESTTE")
    private String codestte;
    @Basic
    @Column(name = "CODEPSTL")
    private String codepstl;
    @Basic
    @Column(name = "CODECTRY")
    private String codectry;
    @Basic
    @Column(name = "NAMECTAC")
    private String namectac;
    @Basic
    @Column(name = "TEXTPHON1")
    private String textphon1;
    @Basic
    @Column(name = "TEXTPHON2")
    private String textphon2;
    @Basic
    @Column(name = "CODETERR")
    private String codeterr;
    @Basic
    @Column(name = "IDACCTSET")
    private String idacctset;
    @Basic
    @Column(name = "IDAUTOCASH")
    private String idautocash;
    @Basic
    @Column(name = "IDBILLCYCL")
    private String idbillcycl;
    @Basic
    @Column(name = "IDSVCCHRG")
    private String idsvcchrg;
    @Basic
    @Column(name = "IDDLNQ")
    private String iddlnq;
    @Basic
    @Column(name = "CODECURN")
    private String codecurn;
    @Basic
    @Column(name = "SWPRTSTMT")
    private Short swprtstmt;
    @Basic
    @Column(name = "SWPRTDLNQ")
    private Short swprtdlnq;
    @Basic
    @Column(name = "SWBALFWD")
    private Short swbalfwd;
    @Basic
    @Column(name = "CODETERM")
    private String codeterm;
    @Basic
    @Column(name = "IDRATETYPE")
    private String idratetype;
    @Basic
    @Column(name = "CODETAXGRP")
    private String codetaxgrp;
    @Basic
    @Column(name = "IDTAXREGI1")
    private String idtaxregi1;
    @Basic
    @Column(name = "IDTAXREGI2")
    private String idtaxregi2;
    @Basic
    @Column(name = "IDTAXREGI3")
    private String idtaxregi3;
    @Basic
    @Column(name = "IDTAXREGI4")
    private String idtaxregi4;
    @Basic
    @Column(name = "IDTAXREGI5")
    private String idtaxregi5;
    @Basic
    @Column(name = "TAXSTTS1")
    private Short taxstts1;
    @Basic
    @Column(name = "TAXSTTS2")
    private Short taxstts2;
    @Basic
    @Column(name = "TAXSTTS3")
    private Short taxstts3;
    @Basic
    @Column(name = "TAXSTTS4")
    private Short taxstts4;
    @Basic
    @Column(name = "TAXSTTS5")
    private Short taxstts5;
    @Basic
    @Column(name = "AMTCRLIMT")
    private BigDecimal amtcrlimt;
    @Basic
    @Column(name = "AMTBALDUET")
    private BigDecimal amtbalduet;
    @Basic
    @Column(name = "AMTBALDUEH")
    private BigDecimal amtbaldueh;
    @Basic
    @Column(name = "DATELASTST")
    private Integer datelastst;
    @Basic
    @Column(name = "AMTLASTSTT")
    private BigDecimal amtlaststt;
    @Basic
    @Column(name = "AMTLASTSTH")
    private BigDecimal amtlaststh;
    @Basic
    @Column(name = "DTBEGBALFW")
    private Integer dtbegbalfw;
    @Basic
    @Column(name = "AMTBALFWDT")
    private BigDecimal amtbalfwdt;
    @Basic
    @Column(name = "AMTBALFWDH")
    private BigDecimal amtbalfwdh;
    @Basic
    @Column(name = "DTLASTRVAL")
    private Integer dtlastrval;
    @Basic
    @Column(name = "AMTBALLARV")
    private BigDecimal amtballarv;
    @Basic
    @Column(name = "CNTOPENINV")
    private Integer cntopeninv;
    @Basic
    @Column(name = "CNTINVPAID")
    private Integer cntinvpaid;
    @Basic
    @Column(name = "DAYSTOPAY")
    private Integer daystopay;
    @Basic
    @Column(name = "DATEINVCHI")
    private Integer dateinvchi;
    @Basic
    @Column(name = "DATEBALHI")
    private Integer datebalhi;
    @Basic
    @Column(name = "DATEINVHIL")
    private Integer dateinvhil;
    @Basic
    @Column(name = "DATEBALHIL")
    private Integer datebalhil;
    @Basic
    @Column(name = "DATELASTAC")
    private Integer datelastac;
    @Basic
    @Column(name = "DATELASTIV")
    private Integer datelastiv;
    @Basic
    @Column(name = "DATELASTCR")
    private Integer datelastcr;
    @Basic
    @Column(name = "DATELASTDR")
    private Integer datelastdr;
    @Basic
    @Column(name = "DATELASTPA")
    private Integer datelastpa;
    @Basic
    @Column(name = "DATELASTDI")
    private Integer datelastdi;
    @Basic
    @Column(name = "DATELASTAD")
    private Integer datelastad;
    @Basic
    @Column(name = "DATELASTWR")
    private Integer datelastwr;
    @Basic
    @Column(name = "DATELASTRI")
    private Integer datelastri;
    @Basic
    @Column(name = "DATELASTIN")
    private Integer datelastin;
    @Basic
    @Column(name = "DATELASTDQ")
    private Integer datelastdq;
    @Basic
    @Column(name = "IDINVCHI")
    private String idinvchi;
    @Basic
    @Column(name = "IDINVCHILY")
    private String idinvchily;
    @Basic
    @Column(name = "AMTINVHIT")
    private BigDecimal amtinvhit;
    @Basic
    @Column(name = "AMTBALHIT")
    private BigDecimal amtbalhit;
    @Basic
    @Column(name = "AMTINVHILT")
    private BigDecimal amtinvhilt;
    @Basic
    @Column(name = "AMTBALHILT")
    private BigDecimal amtbalhilt;
    @Basic
    @Column(name = "AMTLASTIVT")
    private BigDecimal amtlastivt;
    @Basic
    @Column(name = "AMTLASTCRT")
    private BigDecimal amtlastcrt;
    @Basic
    @Column(name = "AMTLASTDRT")
    private BigDecimal amtlastdrt;
    @Basic
    @Column(name = "AMTLASTPYT")
    private BigDecimal amtlastpyt;
    @Basic
    @Column(name = "AMTLASTDIT")
    private BigDecimal amtlastdit;
    @Basic
    @Column(name = "AMTLASTADT")
    private BigDecimal amtlastadt;
    @Basic
    @Column(name = "AMTLASTWRT")
    private BigDecimal amtlastwrt;
    @Basic
    @Column(name = "AMTLASTRIT")
    private BigDecimal amtlastrit;
    @Basic
    @Column(name = "AMTLASTINT")
    private BigDecimal amtlastint;
    @Basic
    @Column(name = "AMTINVHIH")
    private BigDecimal amtinvhih;
    @Basic
    @Column(name = "AMTBALHIH")
    private BigDecimal amtbalhih;
    @Basic
    @Column(name = "AMTINVHILH")
    private BigDecimal amtinvhilh;
    @Basic
    @Column(name = "AMTBALHILH")
    private BigDecimal amtbalhilh;
    @Basic
    @Column(name = "AMTLASTIVH")
    private BigDecimal amtlastivh;
    @Basic
    @Column(name = "AMTLASTCRH")
    private BigDecimal amtlastcrh;
    @Basic
    @Column(name = "AMTLASTDRH")
    private BigDecimal amtlastdrh;
    @Basic
    @Column(name = "AMTLASTPYH")
    private BigDecimal amtlastpyh;
    @Basic
    @Column(name = "AMTLASTDIH")
    private BigDecimal amtlastdih;
    @Basic
    @Column(name = "AMTLASTADH")
    private BigDecimal amtlastadh;
    @Basic
    @Column(name = "AMTLASTWRH")
    private BigDecimal amtlastwrh;
    @Basic
    @Column(name = "AMTLASTRIH")
    private BigDecimal amtlastrih;
    @Basic
    @Column(name = "AMTLASTINH")
    private BigDecimal amtlastinh;
    @Basic
    @Column(name = "CODESLSP1")
    private String codeslsp1;
    @Basic
    @Column(name = "CODESLSP2")
    private String codeslsp2;
    @Basic
    @Column(name = "CODESLSP3")
    private String codeslsp3;
    @Basic
    @Column(name = "CODESLSP4")
    private String codeslsp4;
    @Basic
    @Column(name = "CODESLSP5")
    private String codeslsp5;
    @Basic
    @Column(name = "PCTSASPLT1")
    private BigDecimal pctsasplt1;
    @Basic
    @Column(name = "PCTSASPLT2")
    private BigDecimal pctsasplt2;
    @Basic
    @Column(name = "PCTSASPLT3")
    private BigDecimal pctsasplt3;
    @Basic
    @Column(name = "PCTSASPLT4")
    private BigDecimal pctsasplt4;
    @Basic
    @Column(name = "PCTSASPLT5")
    private BigDecimal pctsasplt5;
    @Basic
    @Column(name = "PRICLIST")
    private String priclist;
    @Basic
    @Column(name = "CUSTTYPE")
    private Short custtype;
    @Basic
    @Column(name = "AMTPDUE")
    private BigDecimal amtpdue;
    @Basic
    @Column(name = "EMAIL1")
    private String email1;
    @Basic
    @Column(name = "EMAIL2")
    private String email2;
    @Basic
    @Column(name = "WEBSITE")
    private String website;
    @Basic
    @Column(name = "BILLMETHOD")
    private Short billmethod;
    @Basic
    @Column(name = "PAYMCODE")
    private String paymcode;
    @Basic
    @Column(name = "FOB")
    private String fob;
    @Basic
    @Column(name = "SHPVIACODE")
    private String shpviacode;
    @Basic
    @Column(name = "SHPVIADESC")
    private String shpviadesc;
    @Basic
    @Column(name = "DELMETHOD")
    private Short delmethod;
    @Basic
    @Column(name = "PRIMSHIPTO")
    private String primshipto;
    @Basic
    @Column(name = "CTACPHONE")
    private String ctacphone;
    @Basic
    @Column(name = "CTACFAX")
    private String ctacfax;
    @Basic
    @Column(name = "SWPARTSHIP")
    private Short swpartship;
    @Basic
    @Column(name = "SWWEBSHOP")
    private Short swwebshop;
    @Basic
    @Column(name = "RTGPERCENT")
    private BigDecimal rtgpercent;
    @Basic
    @Column(name = "RTGDAYS")
    private Short rtgdays;
    @Basic
    @Column(name = "RTGTERMS")
    private String rtgterms;
    @Basic
    @Column(name = "RTGAMTTC")
    private BigDecimal rtgamttc;
    @Basic
    @Column(name = "RTGAMTHC")
    private BigDecimal rtgamthc;
    @Basic
    @Column(name = "VALUES")
    private Integer values;
    @Basic
    @Column(name = "CNTPPDINVC")
    private Integer cntppdinvc;
    @Basic
    @Column(name = "AMTPPDINVT")
    private BigDecimal amtppdinvt;
    @Basic
    @Column(name = "AMTPPDINVH")
    private BigDecimal amtppdinvh;
    @Basic
    @Column(name = "DATELASTRF")
    private Integer datelastrf;
    @Basic
    @Column(name = "AMTLASTRFT")
    private BigDecimal amtlastrft;
    @Basic
    @Column(name = "AMTLASTRFH")
    private BigDecimal amtlastrfh;
    @Basic
    @Column(name = "CODECHECK")
    private String codecheck;
    @Basic
    @Column(name = "NEXTCUID")
    private Integer nextcuid;
    @Basic
    @Column(name = "LOCATION")
    private String location;
    @Basic
    @Column(name = "SWCHKLIMIT")
    private Short swchklimit;
    @Basic
    @Column(name = "SWCHKOVER")
    private Short swchkover;
    @Basic
    @Column(name = "OVERDAYS")
    private Short overdays;
    @Basic
    @Column(name = "OVERAMT")
    private BigDecimal overamt;
    @Basic
    @Column(name = "SWBACKORDR")
    private Short swbackordr;
    @Basic
    @Column(name = "SWCHKDUPPO")
    private Short swchkduppo;
    @Basic
    @Column(name = "CATEGORY")
    private Short category;
    @Basic
    @Column(name = "BRN")
    private String brn;

    public String getIdcust() {
        return idcust;
    }

    public void setIdcust(String idcust) {
        this.idcust = idcust;
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

    public Short getSwactv() {
        return swactv;
    }

    public void setSwactv(Short swactv) {
        this.swactv = swactv;
    }

    public Integer getDateinac() {
        return dateinac;
    }

    public void setDateinac(Integer dateinac) {
        this.dateinac = dateinac;
    }

    public Integer getDatelastmn() {
        return datelastmn;
    }

    public void setDatelastmn(Integer datelastmn) {
        this.datelastmn = datelastmn;
    }

    public Short getSwhold() {
        return swhold;
    }

    public void setSwhold(Short swhold) {
        this.swhold = swhold;
    }

    public Integer getDatestart() {
        return datestart;
    }

    public void setDatestart(Integer datestart) {
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

    public Integer getDatedab() {
        return datedab;
    }

    public void setDatedab(Integer datedab) {
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

    public Short getSwprtstmt() {
        return swprtstmt;
    }

    public void setSwprtstmt(Short swprtstmt) {
        this.swprtstmt = swprtstmt;
    }

    public Short getSwprtdlnq() {
        return swprtdlnq;
    }

    public void setSwprtdlnq(Short swprtdlnq) {
        this.swprtdlnq = swprtdlnq;
    }

    public Short getSwbalfwd() {
        return swbalfwd;
    }

    public void setSwbalfwd(Short swbalfwd) {
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

    public Short getTaxstts1() {
        return taxstts1;
    }

    public void setTaxstts1(Short taxstts1) {
        this.taxstts1 = taxstts1;
    }

    public Short getTaxstts2() {
        return taxstts2;
    }

    public void setTaxstts2(Short taxstts2) {
        this.taxstts2 = taxstts2;
    }

    public Short getTaxstts3() {
        return taxstts3;
    }

    public void setTaxstts3(Short taxstts3) {
        this.taxstts3 = taxstts3;
    }

    public Short getTaxstts4() {
        return taxstts4;
    }

    public void setTaxstts4(Short taxstts4) {
        this.taxstts4 = taxstts4;
    }

    public Short getTaxstts5() {
        return taxstts5;
    }

    public void setTaxstts5(Short taxstts5) {
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

    public Integer getDatelastst() {
        return datelastst;
    }

    public void setDatelastst(Integer datelastst) {
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

    public Integer getDtbegbalfw() {
        return dtbegbalfw;
    }

    public void setDtbegbalfw(Integer dtbegbalfw) {
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

    public Integer getDtlastrval() {
        return dtlastrval;
    }

    public void setDtlastrval(Integer dtlastrval) {
        this.dtlastrval = dtlastrval;
    }

    public BigDecimal getAmtballarv() {
        return amtballarv;
    }

    public void setAmtballarv(BigDecimal amtballarv) {
        this.amtballarv = amtballarv;
    }

    public Integer getCntopeninv() {
        return cntopeninv;
    }

    public void setCntopeninv(Integer cntopeninv) {
        this.cntopeninv = cntopeninv;
    }

    public Integer getCntinvpaid() {
        return cntinvpaid;
    }

    public void setCntinvpaid(Integer cntinvpaid) {
        this.cntinvpaid = cntinvpaid;
    }

    public Integer getDaystopay() {
        return daystopay;
    }

    public void setDaystopay(Integer daystopay) {
        this.daystopay = daystopay;
    }

    public Integer getDateinvchi() {
        return dateinvchi;
    }

    public void setDateinvchi(Integer dateinvchi) {
        this.dateinvchi = dateinvchi;
    }

    public Integer getDatebalhi() {
        return datebalhi;
    }

    public void setDatebalhi(Integer datebalhi) {
        this.datebalhi = datebalhi;
    }

    public Integer getDateinvhil() {
        return dateinvhil;
    }

    public void setDateinvhil(Integer dateinvhil) {
        this.dateinvhil = dateinvhil;
    }

    public Integer getDatebalhil() {
        return datebalhil;
    }

    public void setDatebalhil(Integer datebalhil) {
        this.datebalhil = datebalhil;
    }

    public Integer getDatelastac() {
        return datelastac;
    }

    public void setDatelastac(Integer datelastac) {
        this.datelastac = datelastac;
    }

    public Integer getDatelastiv() {
        return datelastiv;
    }

    public void setDatelastiv(Integer datelastiv) {
        this.datelastiv = datelastiv;
    }

    public Integer getDatelastcr() {
        return datelastcr;
    }

    public void setDatelastcr(Integer datelastcr) {
        this.datelastcr = datelastcr;
    }

    public Integer getDatelastdr() {
        return datelastdr;
    }

    public void setDatelastdr(Integer datelastdr) {
        this.datelastdr = datelastdr;
    }

    public Integer getDatelastpa() {
        return datelastpa;
    }

    public void setDatelastpa(Integer datelastpa) {
        this.datelastpa = datelastpa;
    }

    public Integer getDatelastdi() {
        return datelastdi;
    }

    public void setDatelastdi(Integer datelastdi) {
        this.datelastdi = datelastdi;
    }

    public Integer getDatelastad() {
        return datelastad;
    }

    public void setDatelastad(Integer datelastad) {
        this.datelastad = datelastad;
    }

    public Integer getDatelastwr() {
        return datelastwr;
    }

    public void setDatelastwr(Integer datelastwr) {
        this.datelastwr = datelastwr;
    }

    public Integer getDatelastri() {
        return datelastri;
    }

    public void setDatelastri(Integer datelastri) {
        this.datelastri = datelastri;
    }

    public Integer getDatelastin() {
        return datelastin;
    }

    public void setDatelastin(Integer datelastin) {
        this.datelastin = datelastin;
    }

    public Integer getDatelastdq() {
        return datelastdq;
    }

    public void setDatelastdq(Integer datelastdq) {
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

    public Short getCusttype() {
        return custtype;
    }

    public void setCusttype(Short custtype) {
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

    public Short getBillmethod() {
        return billmethod;
    }

    public void setBillmethod(Short billmethod) {
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

    public Short getDelmethod() {
        return delmethod;
    }

    public void setDelmethod(Short delmethod) {
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

    public Short getSwpartship() {
        return swpartship;
    }

    public void setSwpartship(Short swpartship) {
        this.swpartship = swpartship;
    }

    public Short getSwwebshop() {
        return swwebshop;
    }

    public void setSwwebshop(Short swwebshop) {
        this.swwebshop = swwebshop;
    }

    public BigDecimal getRtgpercent() {
        return rtgpercent;
    }

    public void setRtgpercent(BigDecimal rtgpercent) {
        this.rtgpercent = rtgpercent;
    }

    public Short getRtgdays() {
        return rtgdays;
    }

    public void setRtgdays(Short rtgdays) {
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

    public Integer getValues() {
        return values;
    }

    public void setValues(Integer values) {
        this.values = values;
    }

    public Integer getCntppdinvc() {
        return cntppdinvc;
    }

    public void setCntppdinvc(Integer cntppdinvc) {
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

    public Integer getDatelastrf() {
        return datelastrf;
    }

    public void setDatelastrf(Integer datelastrf) {
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

    public Integer getNextcuid() {
        return nextcuid;
    }

    public void setNextcuid(Integer nextcuid) {
        this.nextcuid = nextcuid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Short getSwchklimit() {
        return swchklimit;
    }

    public void setSwchklimit(Short swchklimit) {
        this.swchklimit = swchklimit;
    }

    public Short getSwchkover() {
        return swchkover;
    }

    public void setSwchkover(Short swchkover) {
        this.swchkover = swchkover;
    }

    public Short getOverdays() {
        return overdays;
    }

    public void setOverdays(Short overdays) {
        this.overdays = overdays;
    }

    public BigDecimal getOveramt() {
        return overamt;
    }

    public void setOveramt(BigDecimal overamt) {
        this.overamt = overamt;
    }

    public Short getSwbackordr() {
        return swbackordr;
    }

    public void setSwbackordr(Short swbackordr) {
        this.swbackordr = swbackordr;
    }

    public Short getSwchkduppo() {
        return swchkduppo;
    }

    public void setSwchkduppo(Short swchkduppo) {
        this.swchkduppo = swchkduppo;
    }

    public Short getCategory() {
        return category;
    }

    public void setCategory(Short category) {
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
        return Objects.equals(idcust, arcus.idcust) && Objects.equals(audtdate, arcus.audtdate) && Objects.equals(audttime, arcus.audttime) && Objects.equals(audtuser, arcus.audtuser) && Objects.equals(audtorg, arcus.audtorg) && Objects.equals(textsnam, arcus.textsnam) && Objects.equals(idgrp, arcus.idgrp) && Objects.equals(idnatacct, arcus.idnatacct) && Objects.equals(swactv, arcus.swactv) && Objects.equals(dateinac, arcus.dateinac) && Objects.equals(datelastmn, arcus.datelastmn) && Objects.equals(swhold, arcus.swhold) && Objects.equals(datestart, arcus.datestart) && Objects.equals(idppnt, arcus.idppnt) && Objects.equals(codedab, arcus.codedab) && Objects.equals(codedabrtg, arcus.codedabrtg) && Objects.equals(datedab, arcus.datedab) && Objects.equals(namecust, arcus.namecust) && Objects.equals(textstre1, arcus.textstre1) && Objects.equals(textstre2, arcus.textstre2) && Objects.equals(textstre3, arcus.textstre3) && Objects.equals(textstre4, arcus.textstre4) && Objects.equals(namecity, arcus.namecity) && Objects.equals(codestte, arcus.codestte) && Objects.equals(codepstl, arcus.codepstl) && Objects.equals(codectry, arcus.codectry) && Objects.equals(namectac, arcus.namectac) && Objects.equals(textphon1, arcus.textphon1) && Objects.equals(textphon2, arcus.textphon2) && Objects.equals(codeterr, arcus.codeterr) && Objects.equals(idacctset, arcus.idacctset) && Objects.equals(idautocash, arcus.idautocash) && Objects.equals(idbillcycl, arcus.idbillcycl) && Objects.equals(idsvcchrg, arcus.idsvcchrg) && Objects.equals(iddlnq, arcus.iddlnq) && Objects.equals(codecurn, arcus.codecurn) && Objects.equals(swprtstmt, arcus.swprtstmt) && Objects.equals(swprtdlnq, arcus.swprtdlnq) && Objects.equals(swbalfwd, arcus.swbalfwd) && Objects.equals(codeterm, arcus.codeterm) && Objects.equals(idratetype, arcus.idratetype) && Objects.equals(codetaxgrp, arcus.codetaxgrp) && Objects.equals(idtaxregi1, arcus.idtaxregi1) && Objects.equals(idtaxregi2, arcus.idtaxregi2) && Objects.equals(idtaxregi3, arcus.idtaxregi3) && Objects.equals(idtaxregi4, arcus.idtaxregi4) && Objects.equals(idtaxregi5, arcus.idtaxregi5) && Objects.equals(taxstts1, arcus.taxstts1) && Objects.equals(taxstts2, arcus.taxstts2) && Objects.equals(taxstts3, arcus.taxstts3) && Objects.equals(taxstts4, arcus.taxstts4) && Objects.equals(taxstts5, arcus.taxstts5) && Objects.equals(amtcrlimt, arcus.amtcrlimt) && Objects.equals(amtbalduet, arcus.amtbalduet) && Objects.equals(amtbaldueh, arcus.amtbaldueh) && Objects.equals(datelastst, arcus.datelastst) && Objects.equals(amtlaststt, arcus.amtlaststt) && Objects.equals(amtlaststh, arcus.amtlaststh) && Objects.equals(dtbegbalfw, arcus.dtbegbalfw) && Objects.equals(amtbalfwdt, arcus.amtbalfwdt) && Objects.equals(amtbalfwdh, arcus.amtbalfwdh) && Objects.equals(dtlastrval, arcus.dtlastrval) && Objects.equals(amtballarv, arcus.amtballarv) && Objects.equals(cntopeninv, arcus.cntopeninv) && Objects.equals(cntinvpaid, arcus.cntinvpaid) && Objects.equals(daystopay, arcus.daystopay) && Objects.equals(dateinvchi, arcus.dateinvchi) && Objects.equals(datebalhi, arcus.datebalhi) && Objects.equals(dateinvhil, arcus.dateinvhil) && Objects.equals(datebalhil, arcus.datebalhil) && Objects.equals(datelastac, arcus.datelastac) && Objects.equals(datelastiv, arcus.datelastiv) && Objects.equals(datelastcr, arcus.datelastcr) && Objects.equals(datelastdr, arcus.datelastdr) && Objects.equals(datelastpa, arcus.datelastpa) && Objects.equals(datelastdi, arcus.datelastdi) && Objects.equals(datelastad, arcus.datelastad) && Objects.equals(datelastwr, arcus.datelastwr) && Objects.equals(datelastri, arcus.datelastri) && Objects.equals(datelastin, arcus.datelastin) && Objects.equals(datelastdq, arcus.datelastdq) && Objects.equals(idinvchi, arcus.idinvchi) && Objects.equals(idinvchily, arcus.idinvchily) && Objects.equals(amtinvhit, arcus.amtinvhit) && Objects.equals(amtbalhit, arcus.amtbalhit) && Objects.equals(amtinvhilt, arcus.amtinvhilt) && Objects.equals(amtbalhilt, arcus.amtbalhilt) && Objects.equals(amtlastivt, arcus.amtlastivt) && Objects.equals(amtlastcrt, arcus.amtlastcrt) && Objects.equals(amtlastdrt, arcus.amtlastdrt) && Objects.equals(amtlastpyt, arcus.amtlastpyt) && Objects.equals(amtlastdit, arcus.amtlastdit) && Objects.equals(amtlastadt, arcus.amtlastadt) && Objects.equals(amtlastwrt, arcus.amtlastwrt) && Objects.equals(amtlastrit, arcus.amtlastrit) && Objects.equals(amtlastint, arcus.amtlastint) && Objects.equals(amtinvhih, arcus.amtinvhih) && Objects.equals(amtbalhih, arcus.amtbalhih) && Objects.equals(amtinvhilh, arcus.amtinvhilh) && Objects.equals(amtbalhilh, arcus.amtbalhilh) && Objects.equals(amtlastivh, arcus.amtlastivh) && Objects.equals(amtlastcrh, arcus.amtlastcrh) && Objects.equals(amtlastdrh, arcus.amtlastdrh) && Objects.equals(amtlastpyh, arcus.amtlastpyh) && Objects.equals(amtlastdih, arcus.amtlastdih) && Objects.equals(amtlastadh, arcus.amtlastadh) && Objects.equals(amtlastwrh, arcus.amtlastwrh) && Objects.equals(amtlastrih, arcus.amtlastrih) && Objects.equals(amtlastinh, arcus.amtlastinh) && Objects.equals(codeslsp1, arcus.codeslsp1) && Objects.equals(codeslsp2, arcus.codeslsp2) && Objects.equals(codeslsp3, arcus.codeslsp3) && Objects.equals(codeslsp4, arcus.codeslsp4) && Objects.equals(codeslsp5, arcus.codeslsp5) && Objects.equals(pctsasplt1, arcus.pctsasplt1) && Objects.equals(pctsasplt2, arcus.pctsasplt2) && Objects.equals(pctsasplt3, arcus.pctsasplt3) && Objects.equals(pctsasplt4, arcus.pctsasplt4) && Objects.equals(pctsasplt5, arcus.pctsasplt5) && Objects.equals(priclist, arcus.priclist) && Objects.equals(custtype, arcus.custtype) && Objects.equals(amtpdue, arcus.amtpdue) && Objects.equals(email1, arcus.email1) && Objects.equals(email2, arcus.email2) && Objects.equals(website, arcus.website) && Objects.equals(billmethod, arcus.billmethod) && Objects.equals(paymcode, arcus.paymcode) && Objects.equals(fob, arcus.fob) && Objects.equals(shpviacode, arcus.shpviacode) && Objects.equals(shpviadesc, arcus.shpviadesc) && Objects.equals(delmethod, arcus.delmethod) && Objects.equals(primshipto, arcus.primshipto) && Objects.equals(ctacphone, arcus.ctacphone) && Objects.equals(ctacfax, arcus.ctacfax) && Objects.equals(swpartship, arcus.swpartship) && Objects.equals(swwebshop, arcus.swwebshop) && Objects.equals(rtgpercent, arcus.rtgpercent) && Objects.equals(rtgdays, arcus.rtgdays) && Objects.equals(rtgterms, arcus.rtgterms) && Objects.equals(rtgamttc, arcus.rtgamttc) && Objects.equals(rtgamthc, arcus.rtgamthc) && Objects.equals(values, arcus.values) && Objects.equals(cntppdinvc, arcus.cntppdinvc) && Objects.equals(amtppdinvt, arcus.amtppdinvt) && Objects.equals(amtppdinvh, arcus.amtppdinvh) && Objects.equals(datelastrf, arcus.datelastrf) && Objects.equals(amtlastrft, arcus.amtlastrft) && Objects.equals(amtlastrfh, arcus.amtlastrfh) && Objects.equals(codecheck, arcus.codecheck) && Objects.equals(nextcuid, arcus.nextcuid) && Objects.equals(location, arcus.location) && Objects.equals(swchklimit, arcus.swchklimit) && Objects.equals(swchkover, arcus.swchkover) && Objects.equals(overdays, arcus.overdays) && Objects.equals(overamt, arcus.overamt) && Objects.equals(swbackordr, arcus.swbackordr) && Objects.equals(swchkduppo, arcus.swchkduppo) && Objects.equals(category, arcus.category) && Objects.equals(brn, arcus.brn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcust, audtdate, audttime, audtuser, audtorg, textsnam, idgrp, idnatacct, swactv, dateinac, datelastmn, swhold, datestart, idppnt, codedab, codedabrtg, datedab, namecust, textstre1, textstre2, textstre3, textstre4, namecity, codestte, codepstl, codectry, namectac, textphon1, textphon2, codeterr, idacctset, idautocash, idbillcycl, idsvcchrg, iddlnq, codecurn, swprtstmt, swprtdlnq, swbalfwd, codeterm, idratetype, codetaxgrp, idtaxregi1, idtaxregi2, idtaxregi3, idtaxregi4, idtaxregi5, taxstts1, taxstts2, taxstts3, taxstts4, taxstts5, amtcrlimt, amtbalduet, amtbaldueh, datelastst, amtlaststt, amtlaststh, dtbegbalfw, amtbalfwdt, amtbalfwdh, dtlastrval, amtballarv, cntopeninv, cntinvpaid, daystopay, dateinvchi, datebalhi, dateinvhil, datebalhil, datelastac, datelastiv, datelastcr, datelastdr, datelastpa, datelastdi, datelastad, datelastwr, datelastri, datelastin, datelastdq, idinvchi, idinvchily, amtinvhit, amtbalhit, amtinvhilt, amtbalhilt, amtlastivt, amtlastcrt, amtlastdrt, amtlastpyt, amtlastdit, amtlastadt, amtlastwrt, amtlastrit, amtlastint, amtinvhih, amtbalhih, amtinvhilh, amtbalhilh, amtlastivh, amtlastcrh, amtlastdrh, amtlastpyh, amtlastdih, amtlastadh, amtlastwrh, amtlastrih, amtlastinh, codeslsp1, codeslsp2, codeslsp3, codeslsp4, codeslsp5, pctsasplt1, pctsasplt2, pctsasplt3, pctsasplt4, pctsasplt5, priclist, custtype, amtpdue, email1, email2, website, billmethod, paymcode, fob, shpviacode, shpviadesc, delmethod, primshipto, ctacphone, ctacfax, swpartship, swwebshop, rtgpercent, rtgdays, rtgterms, rtgamttc, rtgamthc, values, cntppdinvc, amtppdinvt, amtppdinvh, datelastrf, amtlastrft, amtlastrfh, codecheck, nextcuid, location, swchklimit, swchkover, overdays, overamt, swbackordr, swchkduppo, category, brn);
    }
}
