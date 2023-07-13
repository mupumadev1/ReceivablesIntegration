package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@IdClass(com.sagebankservice.entity.mssql_entity.AroblPK.class)
public class Arobl {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "IDCUST")
    private String idcust;

    public String getIdcust() {
        return idcust;
    }

    public void setIdcust(String idcust) {
        this.idcust = idcust;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "IDINVC")
    private String idinvc;

    public String getIdinvc() {
        return idinvc;
    }

    public void setIdinvc(String idinvc) {
        this.idinvc = idinvc;
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
    @Column(name = "IDRMIT")
    private String idrmit;

    public String getIdrmit() {
        return idrmit;
    }

    public void setIdrmit(String idrmit) {
        this.idrmit = idrmit;
    }

    @Basic
    @Column(name = "IDORDERNBR")
    private String idordernbr;

    public String getIdordernbr() {
        return idordernbr;
    }

    public void setIdordernbr(String idordernbr) {
        this.idordernbr = idordernbr;
    }

    @Basic
    @Column(name = "IDCUSTPO")
    private String idcustpo;

    public String getIdcustpo() {
        return idcustpo;
    }

    public void setIdcustpo(String idcustpo) {
        this.idcustpo = idcustpo;
    }

    @Basic
    @Column(name = "DATEDUE")
    private Integer datedue;

    public Integer getDatedue() {
        return datedue;
    }

    public void setDatedue(Integer datedue) {
        this.datedue = datedue;
    }

    @Basic
    @Column(name = "IDNATACCT")
    private String idnatacct;

    public String getIdnatacct() {
        return idnatacct;
    }

    public void setIdnatacct(String idnatacct) {
        this.idnatacct = idnatacct;
    }

    @Basic
    @Column(name = "IDCUSTSHPT")
    private String idcustshpt;

    public String getIdcustshpt() {
        return idcustshpt;
    }

    public void setIdcustshpt(String idcustshpt) {
        this.idcustshpt = idcustshpt;
    }

    @Basic
    @Column(name = "TRXTYPEID")
    private Short trxtypeid;

    public Short getTrxtypeid() {
        return trxtypeid;
    }

    public void setTrxtypeid(Short trxtypeid) {
        this.trxtypeid = trxtypeid;
    }

    @Basic
    @Column(name = "TRXTYPETXT")
    private Short trxtypetxt;

    public Short getTrxtypetxt() {
        return trxtypetxt;
    }

    public void setTrxtypetxt(Short trxtypetxt) {
        this.trxtypetxt = trxtypetxt;
    }

    @Basic
    @Column(name = "DATEBTCH")
    private Integer datebtch;

    public Integer getDatebtch() {
        return datebtch;
    }

    public void setDatebtch(Integer datebtch) {
        this.datebtch = datebtch;
    }

    @Basic
    @Column(name = "CNTBTCH")
    private Integer cntbtch;

    public Integer getCntbtch() {
        return cntbtch;
    }

    public void setCntbtch(Integer cntbtch) {
        this.cntbtch = cntbtch;
    }

    @Basic
    @Column(name = "CNTITEM")
    private Integer cntitem;

    public Integer getCntitem() {
        return cntitem;
    }

    public void setCntitem(Integer cntitem) {
        this.cntitem = cntitem;
    }

    @Basic
    @Column(name = "IDGRP")
    private String idgrp;

    public String getIdgrp() {
        return idgrp;
    }

    public void setIdgrp(String idgrp) {
        this.idgrp = idgrp;
    }

    @Basic
    @Column(name = "DESCINVC")
    private String descinvc;

    public String getDescinvc() {
        return descinvc;
    }

    public void setDescinvc(String descinvc) {
        this.descinvc = descinvc;
    }

    @Basic
    @Column(name = "DATEINVC")
    private Integer dateinvc;

    public Integer getDateinvc() {
        return dateinvc;
    }

    public void setDateinvc(Integer dateinvc) {
        this.dateinvc = dateinvc;
    }

    @Basic
    @Column(name = "DATEASOF")
    private Integer dateasof;

    public Integer getDateasof() {
        return dateasof;
    }

    public void setDateasof(Integer dateasof) {
        this.dateasof = dateasof;
    }

    @Basic
    @Column(name = "CODETERM")
    private String codeterm;

    public String getCodeterm() {
        return codeterm;
    }

    public void setCodeterm(String codeterm) {
        this.codeterm = codeterm;
    }

    @Basic
    @Column(name = "DATEDISC")
    private Integer datedisc;

    public Integer getDatedisc() {
        return datedisc;
    }

    public void setDatedisc(Integer datedisc) {
        this.datedisc = datedisc;
    }

    @Basic
    @Column(name = "CODECURN")
    private String codecurn;

    public String getCodecurn() {
        return codecurn;
    }

    public void setCodecurn(String codecurn) {
        this.codecurn = codecurn;
    }

    @Basic
    @Column(name = "IDRATETYPE")
    private String idratetype;

    public String getIdratetype() {
        return idratetype;
    }

    public void setIdratetype(String idratetype) {
        this.idratetype = idratetype;
    }

    @Basic
    @Column(name = "SWRATEOVRD")
    private Short swrateovrd;

    public Short getSwrateovrd() {
        return swrateovrd;
    }

    public void setSwrateovrd(Short swrateovrd) {
        this.swrateovrd = swrateovrd;
    }

    @Basic
    @Column(name = "EXCHRATEHC")
    private BigDecimal exchratehc;

    public BigDecimal getExchratehc() {
        return exchratehc;
    }

    public void setExchratehc(BigDecimal exchratehc) {
        this.exchratehc = exchratehc;
    }

    @Basic
    @Column(name = "AMTINVCHC")
    private BigDecimal amtinvchc;

    public BigDecimal getAmtinvchc() {
        return amtinvchc;
    }

    public void setAmtinvchc(BigDecimal amtinvchc) {
        this.amtinvchc = amtinvchc;
    }

    @Basic
    @Column(name = "AMTDUEHC")
    private BigDecimal amtduehc;

    public BigDecimal getAmtduehc() {
        return amtduehc;
    }

    public void setAmtduehc(BigDecimal amtduehc) {
        this.amtduehc = amtduehc;
    }

    @Basic
    @Column(name = "AMTTXBLHC")
    private BigDecimal amttxblhc;

    public BigDecimal getAmttxblhc() {
        return amttxblhc;
    }

    public void setAmttxblhc(BigDecimal amttxblhc) {
        this.amttxblhc = amttxblhc;
    }

    @Basic
    @Column(name = "AMTNONTXHC")
    private BigDecimal amtnontxhc;

    public BigDecimal getAmtnontxhc() {
        return amtnontxhc;
    }

    public void setAmtnontxhc(BigDecimal amtnontxhc) {
        this.amtnontxhc = amtnontxhc;
    }

    @Basic
    @Column(name = "AMTTAXHC")
    private BigDecimal amttaxhc;

    public BigDecimal getAmttaxhc() {
        return amttaxhc;
    }

    public void setAmttaxhc(BigDecimal amttaxhc) {
        this.amttaxhc = amttaxhc;
    }

    @Basic
    @Column(name = "AMTDISCHC")
    private BigDecimal amtdischc;

    public BigDecimal getAmtdischc() {
        return amtdischc;
    }

    public void setAmtdischc(BigDecimal amtdischc) {
        this.amtdischc = amtdischc;
    }

    @Basic
    @Column(name = "AMTINVCTC")
    private BigDecimal amtinvctc;

    public BigDecimal getAmtinvctc() {
        return amtinvctc;
    }

    public void setAmtinvctc(BigDecimal amtinvctc) {
        this.amtinvctc = amtinvctc;
    }

    @Basic
    @Column(name = "AMTDUETC")
    private BigDecimal amtduetc;

    public BigDecimal getAmtduetc() {
        return amtduetc;
    }

    public void setAmtduetc(BigDecimal amtduetc) {
        this.amtduetc = amtduetc;
    }

    @Basic
    @Column(name = "AMTTXBLTC")
    private BigDecimal amttxbltc;

    public BigDecimal getAmttxbltc() {
        return amttxbltc;
    }

    public void setAmttxbltc(BigDecimal amttxbltc) {
        this.amttxbltc = amttxbltc;
    }

    @Basic
    @Column(name = "AMTNONTXTC")
    private BigDecimal amtnontxtc;

    public BigDecimal getAmtnontxtc() {
        return amtnontxtc;
    }

    public void setAmtnontxtc(BigDecimal amtnontxtc) {
        this.amtnontxtc = amtnontxtc;
    }

    @Basic
    @Column(name = "AMTTAXTC")
    private BigDecimal amttaxtc;

    public BigDecimal getAmttaxtc() {
        return amttaxtc;
    }

    public void setAmttaxtc(BigDecimal amttaxtc) {
        this.amttaxtc = amttaxtc;
    }

    @Basic
    @Column(name = "AMTDISCTC")
    private BigDecimal amtdisctc;

    public BigDecimal getAmtdisctc() {
        return amtdisctc;
    }

    public void setAmtdisctc(BigDecimal amtdisctc) {
        this.amtdisctc = amtdisctc;
    }

    @Basic
    @Column(name = "SWPAID")
    private Short swpaid;

    public Short getSwpaid() {
        return swpaid;
    }

    public void setSwpaid(Short swpaid) {
        this.swpaid = swpaid;
    }

    @Basic
    @Column(name = "DATELSTACT")
    private Integer datelstact;

    public Integer getDatelstact() {
        return datelstact;
    }

    public void setDatelstact(Integer datelstact) {
        this.datelstact = datelstact;
    }

    @Basic
    @Column(name = "DATELSTSTM")
    private Integer datelststm;

    public Integer getDatelststm() {
        return datelststm;
    }

    public void setDatelststm(Integer datelststm) {
        this.datelststm = datelststm;
    }

    @Basic
    @Column(name = "DATELSTDLQ")
    private Integer datelstdlq;

    public Integer getDatelstdlq() {
        return datelstdlq;
    }

    public void setDatelstdlq(Integer datelstdlq) {
        this.datelstdlq = datelstdlq;
    }

    @Basic
    @Column(name = "CODEDLQSTS")
    private Short codedlqsts;

    public Short getCodedlqsts() {
        return codedlqsts;
    }

    public void setCodedlqsts(Short codedlqsts) {
        this.codedlqsts = codedlqsts;
    }

    @Basic
    @Column(name = "CNTTOTPAYM")
    private Integer cnttotpaym;

    public Integer getCnttotpaym() {
        return cnttotpaym;
    }

    public void setCnttotpaym(Integer cnttotpaym) {
        this.cnttotpaym = cnttotpaym;
    }

    @Basic
    @Column(name = "CNTLSTPAID")
    private Integer cntlstpaid;

    public Integer getCntlstpaid() {
        return cntlstpaid;
    }

    public void setCntlstpaid(Integer cntlstpaid) {
        this.cntlstpaid = cntlstpaid;
    }

    @Basic
    @Column(name = "CNTLSTPYST")
    private Integer cntlstpyst;

    public Integer getCntlstpyst() {
        return cntlstpyst;
    }

    public void setCntlstpyst(Integer cntlstpyst) {
        this.cntlstpyst = cntlstpyst;
    }

    @Basic
    @Column(name = "AMTREMIT")
    private BigDecimal amtremit;

    public BigDecimal getAmtremit() {
        return amtremit;
    }

    public void setAmtremit(BigDecimal amtremit) {
        this.amtremit = amtremit;
    }

    @Basic
    @Column(name = "CNTLASTSEQ")
    private Integer cntlastseq;

    public Integer getCntlastseq() {
        return cntlastseq;
    }

    public void setCntlastseq(Integer cntlastseq) {
        this.cntlastseq = cntlastseq;
    }

    @Basic
    @Column(name = "SWTAXINPUT")
    private Short swtaxinput;

    public Short getSwtaxinput() {
        return swtaxinput;
    }

    public void setSwtaxinput(Short swtaxinput) {
        this.swtaxinput = swtaxinput;
    }

    @Basic
    @Column(name = "CODETAX1")
    private String codetax1;

    public String getCodetax1() {
        return codetax1;
    }

    public void setCodetax1(String codetax1) {
        this.codetax1 = codetax1;
    }

    @Basic
    @Column(name = "CODETAX2")
    private String codetax2;

    public String getCodetax2() {
        return codetax2;
    }

    public void setCodetax2(String codetax2) {
        this.codetax2 = codetax2;
    }

    @Basic
    @Column(name = "CODETAX3")
    private String codetax3;

    public String getCodetax3() {
        return codetax3;
    }

    public void setCodetax3(String codetax3) {
        this.codetax3 = codetax3;
    }

    @Basic
    @Column(name = "CODETAX4")
    private String codetax4;

    public String getCodetax4() {
        return codetax4;
    }

    public void setCodetax4(String codetax4) {
        this.codetax4 = codetax4;
    }

    @Basic
    @Column(name = "CODETAX5")
    private String codetax5;

    public String getCodetax5() {
        return codetax5;
    }

    public void setCodetax5(String codetax5) {
        this.codetax5 = codetax5;
    }

    @Basic
    @Column(name = "AMTBASE1HC")
    private BigDecimal amtbase1Hc;

    public BigDecimal getAmtbase1Hc() {
        return amtbase1Hc;
    }

    public void setAmtbase1Hc(BigDecimal amtbase1Hc) {
        this.amtbase1Hc = amtbase1Hc;
    }

    @Basic
    @Column(name = "AMTBASE2HC")
    private BigDecimal amtbase2Hc;

    public BigDecimal getAmtbase2Hc() {
        return amtbase2Hc;
    }

    public void setAmtbase2Hc(BigDecimal amtbase2Hc) {
        this.amtbase2Hc = amtbase2Hc;
    }

    @Basic
    @Column(name = "AMTBASE3HC")
    private BigDecimal amtbase3Hc;

    public BigDecimal getAmtbase3Hc() {
        return amtbase3Hc;
    }

    public void setAmtbase3Hc(BigDecimal amtbase3Hc) {
        this.amtbase3Hc = amtbase3Hc;
    }

    @Basic
    @Column(name = "AMTBASE4HC")
    private BigDecimal amtbase4Hc;

    public BigDecimal getAmtbase4Hc() {
        return amtbase4Hc;
    }

    public void setAmtbase4Hc(BigDecimal amtbase4Hc) {
        this.amtbase4Hc = amtbase4Hc;
    }

    @Basic
    @Column(name = "AMTBASE5HC")
    private BigDecimal amtbase5Hc;

    public BigDecimal getAmtbase5Hc() {
        return amtbase5Hc;
    }

    public void setAmtbase5Hc(BigDecimal amtbase5Hc) {
        this.amtbase5Hc = amtbase5Hc;
    }

    @Basic
    @Column(name = "AMTTAX1HC")
    private BigDecimal amttax1Hc;

    public BigDecimal getAmttax1Hc() {
        return amttax1Hc;
    }

    public void setAmttax1Hc(BigDecimal amttax1Hc) {
        this.amttax1Hc = amttax1Hc;
    }

    @Basic
    @Column(name = "AMTTAX2HC")
    private BigDecimal amttax2Hc;

    public BigDecimal getAmttax2Hc() {
        return amttax2Hc;
    }

    public void setAmttax2Hc(BigDecimal amttax2Hc) {
        this.amttax2Hc = amttax2Hc;
    }

    @Basic
    @Column(name = "AMTTAX3HC")
    private BigDecimal amttax3Hc;

    public BigDecimal getAmttax3Hc() {
        return amttax3Hc;
    }

    public void setAmttax3Hc(BigDecimal amttax3Hc) {
        this.amttax3Hc = amttax3Hc;
    }

    @Basic
    @Column(name = "AMTTAX4HC")
    private BigDecimal amttax4Hc;

    public BigDecimal getAmttax4Hc() {
        return amttax4Hc;
    }

    public void setAmttax4Hc(BigDecimal amttax4Hc) {
        this.amttax4Hc = amttax4Hc;
    }

    @Basic
    @Column(name = "AMTTAX5HC")
    private BigDecimal amttax5Hc;

    public BigDecimal getAmttax5Hc() {
        return amttax5Hc;
    }

    public void setAmttax5Hc(BigDecimal amttax5Hc) {
        this.amttax5Hc = amttax5Hc;
    }

    @Basic
    @Column(name = "AMTBASE1TC")
    private BigDecimal amtbase1Tc;

    public BigDecimal getAmtbase1Tc() {
        return amtbase1Tc;
    }

    public void setAmtbase1Tc(BigDecimal amtbase1Tc) {
        this.amtbase1Tc = amtbase1Tc;
    }

    @Basic
    @Column(name = "AMTBASE2TC")
    private BigDecimal amtbase2Tc;

    public BigDecimal getAmtbase2Tc() {
        return amtbase2Tc;
    }

    public void setAmtbase2Tc(BigDecimal amtbase2Tc) {
        this.amtbase2Tc = amtbase2Tc;
    }

    @Basic
    @Column(name = "AMTBASE3TC")
    private BigDecimal amtbase3Tc;

    public BigDecimal getAmtbase3Tc() {
        return amtbase3Tc;
    }

    public void setAmtbase3Tc(BigDecimal amtbase3Tc) {
        this.amtbase3Tc = amtbase3Tc;
    }

    @Basic
    @Column(name = "AMTBASE4TC")
    private BigDecimal amtbase4Tc;

    public BigDecimal getAmtbase4Tc() {
        return amtbase4Tc;
    }

    public void setAmtbase4Tc(BigDecimal amtbase4Tc) {
        this.amtbase4Tc = amtbase4Tc;
    }

    @Basic
    @Column(name = "AMTBASE5TC")
    private BigDecimal amtbase5Tc;

    public BigDecimal getAmtbase5Tc() {
        return amtbase5Tc;
    }

    public void setAmtbase5Tc(BigDecimal amtbase5Tc) {
        this.amtbase5Tc = amtbase5Tc;
    }

    @Basic
    @Column(name = "AMTTAX1TC")
    private BigDecimal amttax1Tc;

    public BigDecimal getAmttax1Tc() {
        return amttax1Tc;
    }

    public void setAmttax1Tc(BigDecimal amttax1Tc) {
        this.amttax1Tc = amttax1Tc;
    }

    @Basic
    @Column(name = "AMTTAX2TC")
    private BigDecimal amttax2Tc;

    public BigDecimal getAmttax2Tc() {
        return amttax2Tc;
    }

    public void setAmttax2Tc(BigDecimal amttax2Tc) {
        this.amttax2Tc = amttax2Tc;
    }

    @Basic
    @Column(name = "AMTTAX3TC")
    private BigDecimal amttax3Tc;

    public BigDecimal getAmttax3Tc() {
        return amttax3Tc;
    }

    public void setAmttax3Tc(BigDecimal amttax3Tc) {
        this.amttax3Tc = amttax3Tc;
    }

    @Basic
    @Column(name = "AMTTAX4TC")
    private BigDecimal amttax4Tc;

    public BigDecimal getAmttax4Tc() {
        return amttax4Tc;
    }

    public void setAmttax4Tc(BigDecimal amttax4Tc) {
        this.amttax4Tc = amttax4Tc;
    }

    @Basic
    @Column(name = "AMTTAX5TC")
    private BigDecimal amttax5Tc;

    public BigDecimal getAmttax5Tc() {
        return amttax5Tc;
    }

    public void setAmttax5Tc(BigDecimal amttax5Tc) {
        this.amttax5Tc = amttax5Tc;
    }

    @Basic
    @Column(name = "CODESLSP1")
    private String codeslsp1;

    public String getCodeslsp1() {
        return codeslsp1;
    }

    public void setCodeslsp1(String codeslsp1) {
        this.codeslsp1 = codeslsp1;
    }

    @Basic
    @Column(name = "CODESLSP2")
    private String codeslsp2;

    public String getCodeslsp2() {
        return codeslsp2;
    }

    public void setCodeslsp2(String codeslsp2) {
        this.codeslsp2 = codeslsp2;
    }

    @Basic
    @Column(name = "CODESLSP3")
    private String codeslsp3;

    public String getCodeslsp3() {
        return codeslsp3;
    }

    public void setCodeslsp3(String codeslsp3) {
        this.codeslsp3 = codeslsp3;
    }

    @Basic
    @Column(name = "CODESLSP4")
    private String codeslsp4;

    public String getCodeslsp4() {
        return codeslsp4;
    }

    public void setCodeslsp4(String codeslsp4) {
        this.codeslsp4 = codeslsp4;
    }

    @Basic
    @Column(name = "CODESLSP5")
    private String codeslsp5;

    public String getCodeslsp5() {
        return codeslsp5;
    }

    public void setCodeslsp5(String codeslsp5) {
        this.codeslsp5 = codeslsp5;
    }

    @Basic
    @Column(name = "PCTSASPLT1")
    private BigDecimal pctsasplt1;

    public BigDecimal getPctsasplt1() {
        return pctsasplt1;
    }

    public void setPctsasplt1(BigDecimal pctsasplt1) {
        this.pctsasplt1 = pctsasplt1;
    }

    @Basic
    @Column(name = "PCTSASPLT2")
    private BigDecimal pctsasplt2;

    public BigDecimal getPctsasplt2() {
        return pctsasplt2;
    }

    public void setPctsasplt2(BigDecimal pctsasplt2) {
        this.pctsasplt2 = pctsasplt2;
    }

    @Basic
    @Column(name = "PCTSASPLT3")
    private BigDecimal pctsasplt3;

    public BigDecimal getPctsasplt3() {
        return pctsasplt3;
    }

    public void setPctsasplt3(BigDecimal pctsasplt3) {
        this.pctsasplt3 = pctsasplt3;
    }

    @Basic
    @Column(name = "PCTSASPLT4")
    private BigDecimal pctsasplt4;

    public BigDecimal getPctsasplt4() {
        return pctsasplt4;
    }

    public void setPctsasplt4(BigDecimal pctsasplt4) {
        this.pctsasplt4 = pctsasplt4;
    }

    @Basic
    @Column(name = "PCTSASPLT5")
    private BigDecimal pctsasplt5;

    public BigDecimal getPctsasplt5() {
        return pctsasplt5;
    }

    public void setPctsasplt5(BigDecimal pctsasplt5) {
        this.pctsasplt5 = pctsasplt5;
    }

    @Basic
    @Column(name = "FISCYR")
    private String fiscyr;

    public String getFiscyr() {
        return fiscyr;
    }

    public void setFiscyr(String fiscyr) {
        this.fiscyr = fiscyr;
    }

    @Basic
    @Column(name = "FISCPER")
    private String fiscper;

    public String getFiscper() {
        return fiscper;
    }

    public void setFiscper(String fiscper) {
        this.fiscper = fiscper;
    }

    @Basic
    @Column(name = "IDPREPAID")
    private String idprepaid;

    public String getIdprepaid() {
        return idprepaid;
    }

    public void setIdprepaid(String idprepaid) {
        this.idprepaid = idprepaid;
    }

    @Basic
    @Column(name = "DATEBUS")
    private Integer datebus;

    public Integer getDatebus() {
        return datebus;
    }

    public void setDatebus(Integer datebus) {
        this.datebus = datebus;
    }

    @Basic
    @Column(name = "RATEDATE")
    private Integer ratedate;

    public Integer getRatedate() {
        return ratedate;
    }

    public void setRatedate(Integer ratedate) {
        this.ratedate = ratedate;
    }

    @Basic
    @Column(name = "RATEOP")
    private Short rateop;

    public Short getRateop() {
        return rateop;
    }

    public void setRateop(Short rateop) {
        this.rateop = rateop;
    }

    @Basic
    @Column(name = "YPLASTACT")
    private String yplastact;

    public String getYplastact() {
        return yplastact;
    }

    public void setYplastact(String yplastact) {
        this.yplastact = yplastact;
    }

    @Basic
    @Column(name = "IDBANK")
    private String idbank;

    public String getIdbank() {
        return idbank;
    }

    public void setIdbank(String idbank) {
        this.idbank = idbank;
    }

    @Basic
    @Column(name = "DEPSTNBR")
    private Integer depstnbr;

    public Integer getDepstnbr() {
        return depstnbr;
    }

    public void setDepstnbr(Integer depstnbr) {
        this.depstnbr = depstnbr;
    }

    @Basic
    @Column(name = "POSTSEQNCE")
    private Integer postseqnce;

    public Integer getPostseqnce() {
        return postseqnce;
    }

    public void setPostseqnce(Integer postseqnce) {
        this.postseqnce = postseqnce;
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
    @Column(name = "SWRTG")
    private Short swrtg;

    public Short getSwrtg() {
        return swrtg;
    }

    public void setSwrtg(Short swrtg) {
        this.swrtg = swrtg;
    }

    @Basic
    @Column(name = "SWRTGOUT")
    private Short swrtgout;

    public Short getSwrtgout() {
        return swrtgout;
    }

    public void setSwrtgout(Short swrtgout) {
        this.swrtgout = swrtgout;
    }

    @Basic
    @Column(name = "RTGDATEDUE")
    private Integer rtgdatedue;

    public Integer getRtgdatedue() {
        return rtgdatedue;
    }

    public void setRtgdatedue(Integer rtgdatedue) {
        this.rtgdatedue = rtgdatedue;
    }

    @Basic
    @Column(name = "RTGOAMTHC")
    private BigDecimal rtgoamthc;

    public BigDecimal getRtgoamthc() {
        return rtgoamthc;
    }

    public void setRtgoamthc(BigDecimal rtgoamthc) {
        this.rtgoamthc = rtgoamthc;
    }

    @Basic
    @Column(name = "RTGAMTHC")
    private BigDecimal rtgamthc;

    public BigDecimal getRtgamthc() {
        return rtgamthc;
    }

    public void setRtgamthc(BigDecimal rtgamthc) {
        this.rtgamthc = rtgamthc;
    }

    @Basic
    @Column(name = "RTGOAMTTC")
    private BigDecimal rtgoamttc;

    public BigDecimal getRtgoamttc() {
        return rtgoamttc;
    }

    public void setRtgoamttc(BigDecimal rtgoamttc) {
        this.rtgoamttc = rtgoamttc;
    }

    @Basic
    @Column(name = "RTGAMTTC")
    private BigDecimal rtgamttc;

    public BigDecimal getRtgamttc() {
        return rtgamttc;
    }

    public void setRtgamttc(BigDecimal rtgamttc) {
        this.rtgamttc = rtgamttc;
    }

    @Basic
    @Column(name = "RTGTERMS")
    private String rtgterms;

    public String getRtgterms() {
        return rtgterms;
    }

    public void setRtgterms(String rtgterms) {
        this.rtgterms = rtgterms;
    }

    @Basic
    @Column(name = "SWRTGRATE")
    private Short swrtgrate;

    public Short getSwrtgrate() {
        return swrtgrate;
    }

    public void setSwrtgrate(Short swrtgrate) {
        this.swrtgrate = swrtgrate;
    }

    @Basic
    @Column(name = "RTGAPPLYTO")
    private String rtgapplyto;

    public String getRtgapplyto() {
        return rtgapplyto;
    }

    public void setRtgapplyto(String rtgapplyto) {
        this.rtgapplyto = rtgapplyto;
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
    @Column(name = "SRCEAPPL")
    private String srceappl;

    public String getSrceappl() {
        return srceappl;
    }

    public void setSrceappl(String srceappl) {
        this.srceappl = srceappl;
    }

    @Basic
    @Column(name = "ARVERSION")
    private String arversion;

    public String getArversion() {
        return arversion;
    }

    public void setArversion(String arversion) {
        this.arversion = arversion;
    }

    @Basic
    @Column(name = "INVCTYPE")
    private Short invctype;

    public Short getInvctype() {
        return invctype;
    }

    public void setInvctype(Short invctype) {
        this.invctype = invctype;
    }

    @Basic
    @Column(name = "DEPSEQ")
    private Long depseq;

    public Long getDepseq() {
        return depseq;
    }

    public void setDepseq(Long depseq) {
        this.depseq = depseq;
    }

    @Basic
    @Column(name = "DEPLINE")
    private Integer depline;

    public Integer getDepline() {
        return depline;
    }

    public void setDepline(Integer depline) {
        this.depline = depline;
    }

    @Basic
    @Column(name = "TYPEBTCH")
    private String typebtch;

    public String getTypebtch() {
        return typebtch;
    }

    public void setTypebtch(String typebtch) {
        this.typebtch = typebtch;
    }

    @Basic
    @Column(name = "CNTOBLJ")
    private Integer cntoblj;

    public Integer getCntoblj() {
        return cntoblj;
    }

    public void setCntoblj(Integer cntoblj) {
        this.cntoblj = cntoblj;
    }

    @Basic
    @Column(name = "CODECURNRC")
    private String codecurnrc;

    public String getCodecurnrc() {
        return codecurnrc;
    }

    public void setCodecurnrc(String codecurnrc) {
        this.codecurnrc = codecurnrc;
    }

    @Basic
    @Column(name = "RATERC")
    private BigDecimal raterc;

    public BigDecimal getRaterc() {
        return raterc;
    }

    public void setRaterc(BigDecimal raterc) {
        this.raterc = raterc;
    }

    @Basic
    @Column(name = "RATETYPERC")
    private String ratetyperc;

    public String getRatetyperc() {
        return ratetyperc;
    }

    public void setRatetyperc(String ratetyperc) {
        this.ratetyperc = ratetyperc;
    }

    @Basic
    @Column(name = "RATEDATERC")
    private Integer ratedaterc;

    public Integer getRatedaterc() {
        return ratedaterc;
    }

    public void setRatedaterc(Integer ratedaterc) {
        this.ratedaterc = ratedaterc;
    }

    @Basic
    @Column(name = "RATEOPRC")
    private Short rateoprc;

    public Short getRateoprc() {
        return rateoprc;
    }

    public void setRateoprc(Short rateoprc) {
        this.rateoprc = rateoprc;
    }

    @Basic
    @Column(name = "SWRATERC")
    private Short swraterc;

    public Short getSwraterc() {
        return swraterc;
    }

    public void setSwraterc(Short swraterc) {
        this.swraterc = swraterc;
    }

    @Basic
    @Column(name = "SWTXRTGRPT")
    private Short swtxrtgrpt;

    public Short getSwtxrtgrpt() {
        return swtxrtgrpt;
    }

    public void setSwtxrtgrpt(Short swtxrtgrpt) {
        this.swtxrtgrpt = swtxrtgrpt;
    }

    @Basic
    @Column(name = "CODETAXGRP")
    private String codetaxgrp;

    public String getCodetaxgrp() {
        return codetaxgrp;
    }

    public void setCodetaxgrp(String codetaxgrp) {
        this.codetaxgrp = codetaxgrp;
    }

    @Basic
    @Column(name = "TAXVERSION")
    private Integer taxversion;

    public Integer getTaxversion() {
        return taxversion;
    }

    public void setTaxversion(Integer taxversion) {
        this.taxversion = taxversion;
    }

    @Basic
    @Column(name = "SWTXCTLRC")
    private Short swtxctlrc;

    public Short getSwtxctlrc() {
        return swtxctlrc;
    }

    public void setSwtxctlrc(Short swtxctlrc) {
        this.swtxctlrc = swtxctlrc;
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
    @Column(name = "TXBSERT1TC")
    private BigDecimal txbsert1Tc;

    public BigDecimal getTxbsert1Tc() {
        return txbsert1Tc;
    }

    public void setTxbsert1Tc(BigDecimal txbsert1Tc) {
        this.txbsert1Tc = txbsert1Tc;
    }

    @Basic
    @Column(name = "TXBSERT2TC")
    private BigDecimal txbsert2Tc;

    public BigDecimal getTxbsert2Tc() {
        return txbsert2Tc;
    }

    public void setTxbsert2Tc(BigDecimal txbsert2Tc) {
        this.txbsert2Tc = txbsert2Tc;
    }

    @Basic
    @Column(name = "TXBSERT3TC")
    private BigDecimal txbsert3Tc;

    public BigDecimal getTxbsert3Tc() {
        return txbsert3Tc;
    }

    public void setTxbsert3Tc(BigDecimal txbsert3Tc) {
        this.txbsert3Tc = txbsert3Tc;
    }

    @Basic
    @Column(name = "TXBSERT4TC")
    private BigDecimal txbsert4Tc;

    public BigDecimal getTxbsert4Tc() {
        return txbsert4Tc;
    }

    public void setTxbsert4Tc(BigDecimal txbsert4Tc) {
        this.txbsert4Tc = txbsert4Tc;
    }

    @Basic
    @Column(name = "TXBSERT5TC")
    private BigDecimal txbsert5Tc;

    public BigDecimal getTxbsert5Tc() {
        return txbsert5Tc;
    }

    public void setTxbsert5Tc(BigDecimal txbsert5Tc) {
        this.txbsert5Tc = txbsert5Tc;
    }

    @Basic
    @Column(name = "TXAMTRT1TC")
    private BigDecimal txamtrt1Tc;

    public BigDecimal getTxamtrt1Tc() {
        return txamtrt1Tc;
    }

    public void setTxamtrt1Tc(BigDecimal txamtrt1Tc) {
        this.txamtrt1Tc = txamtrt1Tc;
    }

    @Basic
    @Column(name = "TXAMTRT2TC")
    private BigDecimal txamtrt2Tc;

    public BigDecimal getTxamtrt2Tc() {
        return txamtrt2Tc;
    }

    public void setTxamtrt2Tc(BigDecimal txamtrt2Tc) {
        this.txamtrt2Tc = txamtrt2Tc;
    }

    @Basic
    @Column(name = "TXAMTRT3TC")
    private BigDecimal txamtrt3Tc;

    public BigDecimal getTxamtrt3Tc() {
        return txamtrt3Tc;
    }

    public void setTxamtrt3Tc(BigDecimal txamtrt3Tc) {
        this.txamtrt3Tc = txamtrt3Tc;
    }

    @Basic
    @Column(name = "TXAMTRT4TC")
    private BigDecimal txamtrt4Tc;

    public BigDecimal getTxamtrt4Tc() {
        return txamtrt4Tc;
    }

    public void setTxamtrt4Tc(BigDecimal txamtrt4Tc) {
        this.txamtrt4Tc = txamtrt4Tc;
    }

    @Basic
    @Column(name = "TXAMTRT5TC")
    private BigDecimal txamtrt5Tc;

    public BigDecimal getTxamtrt5Tc() {
        return txamtrt5Tc;
    }

    public void setTxamtrt5Tc(BigDecimal txamtrt5Tc) {
        this.txamtrt5Tc = txamtrt5Tc;
    }

    @Basic
    @Column(name = "IDSHIPNBR")
    private String idshipnbr;

    public String getIdshipnbr() {
        return idshipnbr;
    }

    public void setIdshipnbr(String idshipnbr) {
        this.idshipnbr = idshipnbr;
    }

    @Basic
    @Column(name = "DATEFRSTBK")
    private Integer datefrstbk;

    public Integer getDatefrstbk() {
        return datefrstbk;
    }

    public void setDatefrstbk(Integer datefrstbk) {
        this.datefrstbk = datefrstbk;
    }

    @Basic
    @Column(name = "DATELSTRVL")
    private Integer datelstrvl;

    public Integer getDatelstrvl() {
        return datelstrvl;
    }

    public void setDatelstrvl(Integer datelstrvl) {
        this.datelstrvl = datelstrvl;
    }

    @Basic
    @Column(name = "ORATE")
    private BigDecimal orate;

    public BigDecimal getOrate() {
        return orate;
    }

    public void setOrate(BigDecimal orate) {
        this.orate = orate;
    }

    @Basic
    @Column(name = "ORATETYPE")
    private String oratetype;

    public String getOratetype() {
        return oratetype;
    }

    public void setOratetype(String oratetype) {
        this.oratetype = oratetype;
    }

    @Basic
    @Column(name = "ORATEDATE")
    private Integer oratedate;

    public Integer getOratedate() {
        return oratedate;
    }

    public void setOratedate(Integer oratedate) {
        this.oratedate = oratedate;
    }

    @Basic
    @Column(name = "ORATEOP")
    private Short orateop;

    public Short getOrateop() {
        return orateop;
    }

    public void setOrateop(Short orateop) {
        this.orateop = orateop;
    }

    @Basic
    @Column(name = "OSWRATE")
    private Short oswrate;

    public Short getOswrate() {
        return oswrate;
    }

    public void setOswrate(Short oswrate) {
        this.oswrate = oswrate;
    }

    @Basic
    @Column(name = "IDACCTSET")
    private String idacctset;

    public String getIdacctset() {
        return idacctset;
    }

    public void setIdacctset(String idacctset) {
        this.idacctset = idacctset;
    }

    @Basic
    @Column(name = "DATEPAID")
    private Integer datepaid;

    public Integer getDatepaid() {
        return datepaid;
    }

    public void setDatepaid(Integer datepaid) {
        this.datepaid = datepaid;
    }

    @Basic
    @Column(name = "SWNONRCVBL")
    private Short swnonrcvbl;

    public Short getSwnonrcvbl() {
        return swnonrcvbl;
    }

    public void setSwnonrcvbl(Short swnonrcvbl) {
        this.swnonrcvbl = swnonrcvbl;
    }

    @Basic
    @Column(name = "CODETERR")
    private String codeterr;

    public String getCodeterr() {
        return codeterr;
    }

    public void setCodeterr(String codeterr) {
        this.codeterr = codeterr;
    }

    @Basic
    @Column(name = "OAMTWHT1TC")
    private BigDecimal oamtwht1Tc;

    public BigDecimal getOamtwht1Tc() {
        return oamtwht1Tc;
    }

    public void setOamtwht1Tc(BigDecimal oamtwht1Tc) {
        this.oamtwht1Tc = oamtwht1Tc;
    }

    @Basic
    @Column(name = "OAMTWHT2TC")
    private BigDecimal oamtwht2Tc;

    public BigDecimal getOamtwht2Tc() {
        return oamtwht2Tc;
    }

    public void setOamtwht2Tc(BigDecimal oamtwht2Tc) {
        this.oamtwht2Tc = oamtwht2Tc;
    }

    @Basic
    @Column(name = "OAMTWHT3TC")
    private BigDecimal oamtwht3Tc;

    public BigDecimal getOamtwht3Tc() {
        return oamtwht3Tc;
    }

    public void setOamtwht3Tc(BigDecimal oamtwht3Tc) {
        this.oamtwht3Tc = oamtwht3Tc;
    }

    @Basic
    @Column(name = "OAMTWHT4TC")
    private BigDecimal oamtwht4Tc;

    public BigDecimal getOamtwht4Tc() {
        return oamtwht4Tc;
    }

    public void setOamtwht4Tc(BigDecimal oamtwht4Tc) {
        this.oamtwht4Tc = oamtwht4Tc;
    }

    @Basic
    @Column(name = "OAMTWHT5TC")
    private BigDecimal oamtwht5Tc;

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
        return Objects.equals(idcust, arobl.idcust) && Objects.equals(idinvc, arobl.idinvc) && Objects.equals(audtdate, arobl.audtdate) && Objects.equals(audttime, arobl.audttime) && Objects.equals(audtuser, arobl.audtuser) && Objects.equals(audtorg, arobl.audtorg) && Objects.equals(idrmit, arobl.idrmit) && Objects.equals(idordernbr, arobl.idordernbr) && Objects.equals(idcustpo, arobl.idcustpo) && Objects.equals(datedue, arobl.datedue) && Objects.equals(idnatacct, arobl.idnatacct) && Objects.equals(idcustshpt, arobl.idcustshpt) && Objects.equals(trxtypeid, arobl.trxtypeid) && Objects.equals(trxtypetxt, arobl.trxtypetxt) && Objects.equals(datebtch, arobl.datebtch) && Objects.equals(cntbtch, arobl.cntbtch) && Objects.equals(cntitem, arobl.cntitem) && Objects.equals(idgrp, arobl.idgrp) && Objects.equals(descinvc, arobl.descinvc) && Objects.equals(dateinvc, arobl.dateinvc) && Objects.equals(dateasof, arobl.dateasof) && Objects.equals(codeterm, arobl.codeterm) && Objects.equals(datedisc, arobl.datedisc) && Objects.equals(codecurn, arobl.codecurn) && Objects.equals(idratetype, arobl.idratetype) && Objects.equals(swrateovrd, arobl.swrateovrd) && Objects.equals(exchratehc, arobl.exchratehc) && Objects.equals(amtinvchc, arobl.amtinvchc) && Objects.equals(amtduehc, arobl.amtduehc) && Objects.equals(amttxblhc, arobl.amttxblhc) && Objects.equals(amtnontxhc, arobl.amtnontxhc) && Objects.equals(amttaxhc, arobl.amttaxhc) && Objects.equals(amtdischc, arobl.amtdischc) && Objects.equals(amtinvctc, arobl.amtinvctc) && Objects.equals(amtduetc, arobl.amtduetc) && Objects.equals(amttxbltc, arobl.amttxbltc) && Objects.equals(amtnontxtc, arobl.amtnontxtc) && Objects.equals(amttaxtc, arobl.amttaxtc) && Objects.equals(amtdisctc, arobl.amtdisctc) && Objects.equals(swpaid, arobl.swpaid) && Objects.equals(datelstact, arobl.datelstact) && Objects.equals(datelststm, arobl.datelststm) && Objects.equals(datelstdlq, arobl.datelstdlq) && Objects.equals(codedlqsts, arobl.codedlqsts) && Objects.equals(cnttotpaym, arobl.cnttotpaym) && Objects.equals(cntlstpaid, arobl.cntlstpaid) && Objects.equals(cntlstpyst, arobl.cntlstpyst) && Objects.equals(amtremit, arobl.amtremit) && Objects.equals(cntlastseq, arobl.cntlastseq) && Objects.equals(swtaxinput, arobl.swtaxinput) && Objects.equals(codetax1, arobl.codetax1) && Objects.equals(codetax2, arobl.codetax2) && Objects.equals(codetax3, arobl.codetax3) && Objects.equals(codetax4, arobl.codetax4) && Objects.equals(codetax5, arobl.codetax5) && Objects.equals(amtbase1Hc, arobl.amtbase1Hc) && Objects.equals(amtbase2Hc, arobl.amtbase2Hc) && Objects.equals(amtbase3Hc, arobl.amtbase3Hc) && Objects.equals(amtbase4Hc, arobl.amtbase4Hc) && Objects.equals(amtbase5Hc, arobl.amtbase5Hc) && Objects.equals(amttax1Hc, arobl.amttax1Hc) && Objects.equals(amttax2Hc, arobl.amttax2Hc) && Objects.equals(amttax3Hc, arobl.amttax3Hc) && Objects.equals(amttax4Hc, arobl.amttax4Hc) && Objects.equals(amttax5Hc, arobl.amttax5Hc) && Objects.equals(amtbase1Tc, arobl.amtbase1Tc) && Objects.equals(amtbase2Tc, arobl.amtbase2Tc) && Objects.equals(amtbase3Tc, arobl.amtbase3Tc) && Objects.equals(amtbase4Tc, arobl.amtbase4Tc) && Objects.equals(amtbase5Tc, arobl.amtbase5Tc) && Objects.equals(amttax1Tc, arobl.amttax1Tc) && Objects.equals(amttax2Tc, arobl.amttax2Tc) && Objects.equals(amttax3Tc, arobl.amttax3Tc) && Objects.equals(amttax4Tc, arobl.amttax4Tc) && Objects.equals(amttax5Tc, arobl.amttax5Tc) && Objects.equals(codeslsp1, arobl.codeslsp1) && Objects.equals(codeslsp2, arobl.codeslsp2) && Objects.equals(codeslsp3, arobl.codeslsp3) && Objects.equals(codeslsp4, arobl.codeslsp4) && Objects.equals(codeslsp5, arobl.codeslsp5) && Objects.equals(pctsasplt1, arobl.pctsasplt1) && Objects.equals(pctsasplt2, arobl.pctsasplt2) && Objects.equals(pctsasplt3, arobl.pctsasplt3) && Objects.equals(pctsasplt4, arobl.pctsasplt4) && Objects.equals(pctsasplt5, arobl.pctsasplt5) && Objects.equals(fiscyr, arobl.fiscyr) && Objects.equals(fiscper, arobl.fiscper) && Objects.equals(idprepaid, arobl.idprepaid) && Objects.equals(datebus, arobl.datebus) && Objects.equals(ratedate, arobl.ratedate) && Objects.equals(rateop, arobl.rateop) && Objects.equals(yplastact, arobl.yplastact) && Objects.equals(idbank, arobl.idbank) && Objects.equals(depstnbr, arobl.depstnbr) && Objects.equals(postseqnce, arobl.postseqnce) && Objects.equals(swjob, arobl.swjob) && Objects.equals(swrtg, arobl.swrtg) && Objects.equals(swrtgout, arobl.swrtgout) && Objects.equals(rtgdatedue, arobl.rtgdatedue) && Objects.equals(rtgoamthc, arobl.rtgoamthc) && Objects.equals(rtgamthc, arobl.rtgamthc) && Objects.equals(rtgoamttc, arobl.rtgoamttc) && Objects.equals(rtgamttc, arobl.rtgamttc) && Objects.equals(rtgterms, arobl.rtgterms) && Objects.equals(swrtgrate, arobl.swrtgrate) && Objects.equals(rtgapplyto, arobl.rtgapplyto) && Objects.equals(values, arobl.values) && Objects.equals(srceappl, arobl.srceappl) && Objects.equals(arversion, arobl.arversion) && Objects.equals(invctype, arobl.invctype) && Objects.equals(depseq, arobl.depseq) && Objects.equals(depline, arobl.depline) && Objects.equals(typebtch, arobl.typebtch) && Objects.equals(cntoblj, arobl.cntoblj) && Objects.equals(codecurnrc, arobl.codecurnrc) && Objects.equals(raterc, arobl.raterc) && Objects.equals(ratetyperc, arobl.ratetyperc) && Objects.equals(ratedaterc, arobl.ratedaterc) && Objects.equals(rateoprc, arobl.rateoprc) && Objects.equals(swraterc, arobl.swraterc) && Objects.equals(swtxrtgrpt, arobl.swtxrtgrpt) && Objects.equals(codetaxgrp, arobl.codetaxgrp) && Objects.equals(taxversion, arobl.taxversion) && Objects.equals(swtxctlrc, arobl.swtxctlrc) && Objects.equals(taxclass1, arobl.taxclass1) && Objects.equals(taxclass2, arobl.taxclass2) && Objects.equals(taxclass3, arobl.taxclass3) && Objects.equals(taxclass4, arobl.taxclass4) && Objects.equals(taxclass5, arobl.taxclass5) && Objects.equals(txbsert1Tc, arobl.txbsert1Tc) && Objects.equals(txbsert2Tc, arobl.txbsert2Tc) && Objects.equals(txbsert3Tc, arobl.txbsert3Tc) && Objects.equals(txbsert4Tc, arobl.txbsert4Tc) && Objects.equals(txbsert5Tc, arobl.txbsert5Tc) && Objects.equals(txamtrt1Tc, arobl.txamtrt1Tc) && Objects.equals(txamtrt2Tc, arobl.txamtrt2Tc) && Objects.equals(txamtrt3Tc, arobl.txamtrt3Tc) && Objects.equals(txamtrt4Tc, arobl.txamtrt4Tc) && Objects.equals(txamtrt5Tc, arobl.txamtrt5Tc) && Objects.equals(idshipnbr, arobl.idshipnbr) && Objects.equals(datefrstbk, arobl.datefrstbk) && Objects.equals(datelstrvl, arobl.datelstrvl) && Objects.equals(orate, arobl.orate) && Objects.equals(oratetype, arobl.oratetype) && Objects.equals(oratedate, arobl.oratedate) && Objects.equals(orateop, arobl.orateop) && Objects.equals(oswrate, arobl.oswrate) && Objects.equals(idacctset, arobl.idacctset) && Objects.equals(datepaid, arobl.datepaid) && Objects.equals(swnonrcvbl, arobl.swnonrcvbl) && Objects.equals(codeterr, arobl.codeterr) && Objects.equals(oamtwht1Tc, arobl.oamtwht1Tc) && Objects.equals(oamtwht2Tc, arobl.oamtwht2Tc) && Objects.equals(oamtwht3Tc, arobl.oamtwht3Tc) && Objects.equals(oamtwht4Tc, arobl.oamtwht4Tc) && Objects.equals(oamtwht5Tc, arobl.oamtwht5Tc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcust, idinvc, audtdate, audttime, audtuser, audtorg, idrmit, idordernbr, idcustpo, datedue, idnatacct, idcustshpt, trxtypeid, trxtypetxt, datebtch, cntbtch, cntitem, idgrp, descinvc, dateinvc, dateasof, codeterm, datedisc, codecurn, idratetype, swrateovrd, exchratehc, amtinvchc, amtduehc, amttxblhc, amtnontxhc, amttaxhc, amtdischc, amtinvctc, amtduetc, amttxbltc, amtnontxtc, amttaxtc, amtdisctc, swpaid, datelstact, datelststm, datelstdlq, codedlqsts, cnttotpaym, cntlstpaid, cntlstpyst, amtremit, cntlastseq, swtaxinput, codetax1, codetax2, codetax3, codetax4, codetax5, amtbase1Hc, amtbase2Hc, amtbase3Hc, amtbase4Hc, amtbase5Hc, amttax1Hc, amttax2Hc, amttax3Hc, amttax4Hc, amttax5Hc, amtbase1Tc, amtbase2Tc, amtbase3Tc, amtbase4Tc, amtbase5Tc, amttax1Tc, amttax2Tc, amttax3Tc, amttax4Tc, amttax5Tc, codeslsp1, codeslsp2, codeslsp3, codeslsp4, codeslsp5, pctsasplt1, pctsasplt2, pctsasplt3, pctsasplt4, pctsasplt5, fiscyr, fiscper, idprepaid, datebus, ratedate, rateop, yplastact, idbank, depstnbr, postseqnce, swjob, swrtg, swrtgout, rtgdatedue, rtgoamthc, rtgamthc, rtgoamttc, rtgamttc, rtgterms, swrtgrate, rtgapplyto, values, srceappl, arversion, invctype, depseq, depline, typebtch, cntoblj, codecurnrc, raterc, ratetyperc, ratedaterc, rateoprc, swraterc, swtxrtgrpt, codetaxgrp, taxversion, swtxctlrc, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, txbsert1Tc, txbsert2Tc, txbsert3Tc, txbsert4Tc, txbsert5Tc, txamtrt1Tc, txamtrt2Tc, txamtrt3Tc, txamtrt4Tc, txamtrt5Tc, idshipnbr, datefrstbk, datelstrvl, orate, oratetype, oratedate, orateop, oswrate, idacctset, datepaid, swnonrcvbl, codeterr, oamtwht1Tc, oamtwht2Tc, oamtwht3Tc, oamtwht4Tc, oamtwht5Tc);
    }
}
