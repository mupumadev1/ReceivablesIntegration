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
@IdClass(com.sagebankservice.entity.mssql_entity.CbbthdPK.class)
public class Cbbthd {
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
    @Column(name = "ENTRYTYPE")
    private Short entrytype;

    public Short getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(Short entrytype) {
        this.entrytype = entrytype;
    }

    @Basic
    @Column(name = "REFERENCE")
    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "PERIOD")
    private String period;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Basic
    @Column(name = "DATE")
    private Integer date;

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Basic
    @Column(name = "DATECHQPRN")
    private Integer datechqprn;

    public Integer getDatechqprn() {
        return datechqprn;
    }

    public void setDatechqprn(Integer datechqprn) {
        this.datechqprn = datechqprn;
    }

    @Basic
    @Column(name = "SWCHQPRN")
    private Short swchqprn;

    public Short getSwchqprn() {
        return swchqprn;
    }

    public void setSwchqprn(Short swchqprn) {
        this.swchqprn = swchqprn;
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
    @Column(name = "TEXTDESC")
    private String textdesc;

    public String getTextdesc() {
        return textdesc;
    }

    public void setTextdesc(String textdesc) {
        this.textdesc = textdesc;
    }

    @Basic
    @Column(name = "DISTCODE")
    private String distcode;

    public String getDistcode() {
        return distcode;
    }

    public void setDistcode(String distcode) {
        this.distcode = distcode;
    }

    @Basic
    @Column(name = "CHARGECODE")
    private String chargecode;

    public String getChargecode() {
        return chargecode;
    }

    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }

    @Basic
    @Column(name = "CHRGAMOUNT")
    private BigDecimal chrgamount;

    public BigDecimal getChrgamount() {
        return chrgamount;
    }

    public void setChrgamount(BigDecimal chrgamount) {
        this.chrgamount = chrgamount;
    }

    @Basic
    @Column(name = "NODETAILS")
    private Integer nodetails;

    public Integer getNodetails() {
        return nodetails;
    }

    public void setNodetails(Integer nodetails) {
        this.nodetails = nodetails;
    }

    @Basic
    @Column(name = "TOTAMOUNT")
    private BigDecimal totamount;

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
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
    @Column(name = "TAXPERCNT")
    private BigDecimal taxpercnt;

    public BigDecimal getTaxpercnt() {
        return taxpercnt;
    }

    public void setTaxpercnt(BigDecimal taxpercnt) {
        this.taxpercnt = taxpercnt;
    }

    @Basic
    @Column(name = "BK2GLCURHM")
    private String bk2Glcurhm;

    public String getBk2Glcurhm() {
        return bk2Glcurhm;
    }

    public void setBk2Glcurhm(String bk2Glcurhm) {
        this.bk2Glcurhm = bk2Glcurhm;
    }

    @Basic
    @Column(name = "BK2GLRTTYP")
    private String bk2Glrttyp;

    public String getBk2Glrttyp() {
        return bk2Glrttyp;
    }

    public void setBk2Glrttyp(String bk2Glrttyp) {
        this.bk2Glrttyp = bk2Glrttyp;
    }

    @Basic
    @Column(name = "BK2GLCURSR")
    private String bk2Glcursr;

    public String getBk2Glcursr() {
        return bk2Glcursr;
    }

    public void setBk2Glcursr(String bk2Glcursr) {
        this.bk2Glcursr = bk2Glcursr;
    }

    @Basic
    @Column(name = "BK2GLDATE")
    private Integer bk2Gldate;

    public Integer getBk2Gldate() {
        return bk2Gldate;
    }

    public void setBk2Gldate(Integer bk2Gldate) {
        this.bk2Gldate = bk2Gldate;
    }

    @Basic
    @Column(name = "BK2GLRATE")
    private BigDecimal bk2Glrate;

    public BigDecimal getBk2Glrate() {
        return bk2Glrate;
    }

    public void setBk2Glrate(BigDecimal bk2Glrate) {
        this.bk2Glrate = bk2Glrate;
    }

    @Basic
    @Column(name = "BK2GLSPRD")
    private BigDecimal bk2Glsprd;

    public BigDecimal getBk2Glsprd() {
        return bk2Glsprd;
    }

    public void setBk2Glsprd(BigDecimal bk2Glsprd) {
        this.bk2Glsprd = bk2Glsprd;
    }

    @Basic
    @Column(name = "BK2GLOP")
    private Short bk2Glop;

    public Short getBk2Glop() {
        return bk2Glop;
    }

    public void setBk2Glop(Short bk2Glop) {
        this.bk2Glop = bk2Glop;
    }

    @Basic
    @Column(name = "BK2GLDTMTH")
    private Short bk2Gldtmth;

    public Short getBk2Gldtmth() {
        return bk2Gldtmth;
    }

    public void setBk2Gldtmth(Short bk2Gldtmth) {
        this.bk2Gldtmth = bk2Gldtmth;
    }

    @Basic
    @Column(name = "BT2GLCURHM")
    private String bt2Glcurhm;

    public String getBt2Glcurhm() {
        return bt2Glcurhm;
    }

    public void setBt2Glcurhm(String bt2Glcurhm) {
        this.bt2Glcurhm = bt2Glcurhm;
    }

    @Basic
    @Column(name = "BT2GLRTTYP")
    private String bt2Glrttyp;

    public String getBt2Glrttyp() {
        return bt2Glrttyp;
    }

    public void setBt2Glrttyp(String bt2Glrttyp) {
        this.bt2Glrttyp = bt2Glrttyp;
    }

    @Basic
    @Column(name = "BT2GLCURSR")
    private String bt2Glcursr;

    public String getBt2Glcursr() {
        return bt2Glcursr;
    }

    public void setBt2Glcursr(String bt2Glcursr) {
        this.bt2Glcursr = bt2Glcursr;
    }

    @Basic
    @Column(name = "BT2GLDATE")
    private Integer bt2Gldate;

    public Integer getBt2Gldate() {
        return bt2Gldate;
    }

    public void setBt2Gldate(Integer bt2Gldate) {
        this.bt2Gldate = bt2Gldate;
    }

    @Basic
    @Column(name = "BT2GLRATE")
    private BigDecimal bt2Glrate;

    public BigDecimal getBt2Glrate() {
        return bt2Glrate;
    }

    public void setBt2Glrate(BigDecimal bt2Glrate) {
        this.bt2Glrate = bt2Glrate;
    }

    @Basic
    @Column(name = "BT2GLSPRD")
    private BigDecimal bt2Glsprd;

    public BigDecimal getBt2Glsprd() {
        return bt2Glsprd;
    }

    public void setBt2Glsprd(BigDecimal bt2Glsprd) {
        this.bt2Glsprd = bt2Glsprd;
    }

    @Basic
    @Column(name = "BT2GLOP")
    private Short bt2Glop;

    public Short getBt2Glop() {
        return bt2Glop;
    }

    public void setBt2Glop(Short bt2Glop) {
        this.bt2Glop = bt2Glop;
    }

    @Basic
    @Column(name = "BT2GLDTMTH")
    private Short bt2Gldtmth;

    public Short getBt2Gldtmth() {
        return bt2Gldtmth;
    }

    public void setBt2Gldtmth(Short bt2Gldtmth) {
        this.bt2Gldtmth = bt2Gldtmth;
    }

    @Basic
    @Column(name = "MS2GLCURHM")
    private String ms2Glcurhm;

    public String getMs2Glcurhm() {
        return ms2Glcurhm;
    }

    public void setMs2Glcurhm(String ms2Glcurhm) {
        this.ms2Glcurhm = ms2Glcurhm;
    }

    @Basic
    @Column(name = "MS2GLRTTYP")
    private String ms2Glrttyp;

    public String getMs2Glrttyp() {
        return ms2Glrttyp;
    }

    public void setMs2Glrttyp(String ms2Glrttyp) {
        this.ms2Glrttyp = ms2Glrttyp;
    }

    @Basic
    @Column(name = "MS2GLCURSR")
    private String ms2Glcursr;

    public String getMs2Glcursr() {
        return ms2Glcursr;
    }

    public void setMs2Glcursr(String ms2Glcursr) {
        this.ms2Glcursr = ms2Glcursr;
    }

    @Basic
    @Column(name = "MS2GLDATE")
    private Integer ms2Gldate;

    public Integer getMs2Gldate() {
        return ms2Gldate;
    }

    public void setMs2Gldate(Integer ms2Gldate) {
        this.ms2Gldate = ms2Gldate;
    }

    @Basic
    @Column(name = "MS2GLRATE")
    private BigDecimal ms2Glrate;

    public BigDecimal getMs2Glrate() {
        return ms2Glrate;
    }

    public void setMs2Glrate(BigDecimal ms2Glrate) {
        this.ms2Glrate = ms2Glrate;
    }

    @Basic
    @Column(name = "MS2GLSPRD")
    private BigDecimal ms2Glsprd;

    public BigDecimal getMs2Glsprd() {
        return ms2Glsprd;
    }

    public void setMs2Glsprd(BigDecimal ms2Glsprd) {
        this.ms2Glsprd = ms2Glsprd;
    }

    @Basic
    @Column(name = "MS2GLOP")
    private Short ms2Glop;

    public Short getMs2Glop() {
        return ms2Glop;
    }

    public void setMs2Glop(Short ms2Glop) {
        this.ms2Glop = ms2Glop;
    }

    @Basic
    @Column(name = "MS2GLDTMTH")
    private Short ms2Gldtmth;

    public Short getMs2Gldtmth() {
        return ms2Gldtmth;
    }

    public void setMs2Gldtmth(Short ms2Gldtmth) {
        this.ms2Gldtmth = ms2Gldtmth;
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
    @Column(name = "BTCHNODEC")
    private Short btchnodec;

    public Short getBtchnodec() {
        return btchnodec;
    }

    public void setBtchnodec(Short btchnodec) {
        this.btchnodec = btchnodec;
    }

    @Basic
    @Column(name = "MISCNODEC")
    private Short miscnodec;

    public Short getMiscnodec() {
        return miscnodec;
    }

    public void setMiscnodec(Short miscnodec) {
        this.miscnodec = miscnodec;
    }

    @Basic
    @Column(name = "TAXGROUP")
    private String taxgroup;

    public String getTaxgroup() {
        return taxgroup;
    }

    public void setTaxgroup(String taxgroup) {
        this.taxgroup = taxgroup;
    }

    @Basic
    @Column(name = "CUSTCHQNO")
    private String custchqno;

    public String getCustchqno() {
        return custchqno;
    }

    public void setCustchqno(String custchqno) {
        this.custchqno = custchqno;
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
    @Column(name = "APPLAMOUNT")
    private BigDecimal applamount;

    public BigDecimal getApplamount() {
        return applamount;
    }

    public void setApplamount(BigDecimal applamount) {
        this.applamount = applamount;
    }

    @Basic
    @Column(name = "APPLDISC")
    private BigDecimal appldisc;

    public BigDecimal getAppldisc() {
        return appldisc;
    }

    public void setAppldisc(BigDecimal appldisc) {
        this.appldisc = appldisc;
    }

    @Basic
    @Column(name = "ACCTNAT")
    private String acctnat;

    public String getAcctnat() {
        return acctnat;
    }

    public void setAcctnat(String acctnat) {
        this.acctnat = acctnat;
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
    @Column(name = "PROFILEID")
    private String profileid;

    public String getProfileid() {
        return profileid;
    }

    public void setProfileid(String profileid) {
        this.profileid = profileid;
    }

    @Basic
    @Column(name = "SWINTERCO")
    private Short swinterco;

    public Short getSwinterco() {
        return swinterco;
    }

    public void setSwinterco(Short swinterco) {
        this.swinterco = swinterco;
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
    @Column(name = "CCTYPE")
    private String cctype;

    public String getCctype() {
        return cctype;
    }

    public void setCctype(String cctype) {
        this.cctype = cctype;
    }

    @Basic
    @Column(name = "CCNUMBER")
    private Object ccnumber;

    public Object getCcnumber() {
        return ccnumber;
    }

    public void setCcnumber(Object ccnumber) {
        this.ccnumber = ccnumber;
    }

    @Basic
    @Column(name = "CCNAME")
    private String ccname;

    public String getCcname() {
        return ccname;
    }

    public void setCcname(String ccname) {
        this.ccname = ccname;
    }

    @Basic
    @Column(name = "CCEXP")
    private Integer ccexp;

    public Integer getCcexp() {
        return ccexp;
    }

    public void setCcexp(Integer ccexp) {
        this.ccexp = ccexp;
    }

    @Basic
    @Column(name = "CCAUTHCODE")
    private String ccauthcode;

    public String getCcauthcode() {
        return ccauthcode;
    }

    public void setCcauthcode(String ccauthcode) {
        this.ccauthcode = ccauthcode;
    }

    @Basic
    @Column(name = "XCCNUMBER")
    private String xccnumber;

    public String getXccnumber() {
        return xccnumber;
    }

    public void setXccnumber(String xccnumber) {
        this.xccnumber = xccnumber;
    }

    @Basic
    @Column(name = "SERIAL")
    private Long serial;

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    @Basic
    @Column(name = "BANKAMOUNT")
    private BigDecimal bankamount;

    public BigDecimal getBankamount() {
        return bankamount;
    }

    public void setBankamount(BigDecimal bankamount) {
        this.bankamount = bankamount;
    }

    @Basic
    @Column(name = "BTCHAMOUNT")
    private BigDecimal btchamount;

    public BigDecimal getBtchamount() {
        return btchamount;
    }

    public void setBtchamount(BigDecimal btchamount) {
        this.btchamount = btchamount;
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
    @Column(name = "FUNCAMOUNT")
    private BigDecimal funcamount;

    public BigDecimal getFuncamount() {
        return funcamount;
    }

    public void setFuncamount(BigDecimal funcamount) {
        this.funcamount = funcamount;
    }

    @Basic
    @Column(name = "HDRDEBIT")
    private BigDecimal hdrdebit;

    public BigDecimal getHdrdebit() {
        return hdrdebit;
    }

    public void setHdrdebit(BigDecimal hdrdebit) {
        this.hdrdebit = hdrdebit;
    }

    @Basic
    @Column(name = "HDRCREDIT")
    private BigDecimal hdrcredit;

    public BigDecimal getHdrcredit() {
        return hdrcredit;
    }

    public void setHdrcredit(BigDecimal hdrcredit) {
        this.hdrcredit = hdrcredit;
    }

    @Basic
    @Column(name = "TAXAUTH1")
    private String taxauth1;

    public String getTaxauth1() {
        return taxauth1;
    }

    public void setTaxauth1(String taxauth1) {
        this.taxauth1 = taxauth1;
    }

    @Basic
    @Column(name = "TAXAUTH2")
    private String taxauth2;

    public String getTaxauth2() {
        return taxauth2;
    }

    public void setTaxauth2(String taxauth2) {
        this.taxauth2 = taxauth2;
    }

    @Basic
    @Column(name = "TAXAUTH3")
    private String taxauth3;

    public String getTaxauth3() {
        return taxauth3;
    }

    public void setTaxauth3(String taxauth3) {
        this.taxauth3 = taxauth3;
    }

    @Basic
    @Column(name = "TAXAUTH4")
    private String taxauth4;

    public String getTaxauth4() {
        return taxauth4;
    }

    public void setTaxauth4(String taxauth4) {
        this.taxauth4 = taxauth4;
    }

    @Basic
    @Column(name = "TAXAUTH5")
    private String taxauth5;

    public String getTaxauth5() {
        return taxauth5;
    }

    public void setTaxauth5(String taxauth5) {
        this.taxauth5 = taxauth5;
    }

    @Basic
    @Column(name = "TXAU1DESC")
    private String txau1Desc;

    public String getTxau1Desc() {
        return txau1Desc;
    }

    public void setTxau1Desc(String txau1Desc) {
        this.txau1Desc = txau1Desc;
    }

    @Basic
    @Column(name = "TXAU2DESC")
    private String txau2Desc;

    public String getTxau2Desc() {
        return txau2Desc;
    }

    public void setTxau2Desc(String txau2Desc) {
        this.txau2Desc = txau2Desc;
    }

    @Basic
    @Column(name = "TXAU3DESC")
    private String txau3Desc;

    public String getTxau3Desc() {
        return txau3Desc;
    }

    public void setTxau3Desc(String txau3Desc) {
        this.txau3Desc = txau3Desc;
    }

    @Basic
    @Column(name = "TXAU4DESC")
    private String txau4Desc;

    public String getTxau4Desc() {
        return txau4Desc;
    }

    public void setTxau4Desc(String txau4Desc) {
        this.txau4Desc = txau4Desc;
    }

    @Basic
    @Column(name = "TXAU5DESC")
    private String txau5Desc;

    public String getTxau5Desc() {
        return txau5Desc;
    }

    public void setTxau5Desc(String txau5Desc) {
        this.txau5Desc = txau5Desc;
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
    @Column(name = "BANKCODE")
    private String bankcode;

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    @Basic
    @Column(name = "SWPOSTED")
    private Short swposted;

    public Short getSwposted() {
        return swposted;
    }

    public void setSwposted(Short swposted) {
        this.swposted = swposted;
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
    @Column(name = "TOTUNAPPL")
    private BigDecimal totunappl;

    public BigDecimal getTotunappl() {
        return totunappl;
    }

    public void setTotunappl(BigDecimal totunappl) {
        this.totunappl = totunappl;
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
    @Column(name = "ALLOCMODE")
    private Short allocmode;

    public Short getAllocmode() {
        return allocmode;
    }

    public void setAllocmode(Short allocmode) {
        this.allocmode = allocmode;
    }

    @Basic
    @Column(name = "ALLOCAMT")
    private BigDecimal allocamt;

    public BigDecimal getAllocamt() {
        return allocamt;
    }

    public void setAllocamt(BigDecimal allocamt) {
        this.allocamt = allocamt;
    }

    @Basic
    @Column(name = "CLASSTYPE")
    private Short classtype;

    public Short getClasstype() {
        return classtype;
    }

    public void setClasstype(Short classtype) {
        this.classtype = classtype;
    }

    @Basic
    @Column(name = "CLASSAXIS")
    private Short classaxis;

    public Short getClassaxis() {
        return classaxis;
    }

    public void setClassaxis(Short classaxis) {
        this.classaxis = classaxis;
    }

    @Basic
    @Column(name = "DATALEVEL")
    private Short datalevel;

    public Short getDatalevel() {
        return datalevel;
    }

    public void setDatalevel(Short datalevel) {
        this.datalevel = datalevel;
    }

    @Basic
    @Column(name = "RECXCNTER")
    private Integer recxcnter;

    public Integer getRecxcnter() {
        return recxcnter;
    }

    public void setRecxcnter(Integer recxcnter) {
        this.recxcnter = recxcnter;
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
    @Column(name = "RATEOPRC")
    private Short rateoprc;

    public Short getRateoprc() {
        return rateoprc;
    }

    public void setRateoprc(Short rateoprc) {
        this.rateoprc = rateoprc;
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
    @Column(name = "CODECURNRC")
    private String codecurnrc;

    public String getCodecurnrc() {
        return codecurnrc;
    }

    public void setCodecurnrc(String codecurnrc) {
        this.codecurnrc = codecurnrc;
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
    @Column(name = "TXEXPRC")
    private BigDecimal txexprc;

    public BigDecimal getTxexprc() {
        return txexprc;
    }

    public void setTxexprc(BigDecimal txexprc) {
        this.txexprc = txexprc;
    }

    @Basic
    @Column(name = "TXRECRC")
    private BigDecimal txrecrc;

    public BigDecimal getTxrecrc() {
        return txrecrc;
    }

    public void setTxrecrc(BigDecimal txrecrc) {
        this.txrecrc = txrecrc;
    }

    @Basic
    @Column(name = "AMTRECTAX")
    private BigDecimal amtrectax;

    public BigDecimal getAmtrectax() {
        return amtrectax;
    }

    public void setAmtrectax(BigDecimal amtrectax) {
        this.amtrectax = amtrectax;
    }

    @Basic
    @Column(name = "AMTEXPTAX")
    private BigDecimal amtexptax;

    public BigDecimal getAmtexptax() {
        return amtexptax;
    }

    public void setAmtexptax(BigDecimal amtexptax) {
        this.amtexptax = amtexptax;
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
    @Column(name = "TXAMT1HC")
    private BigDecimal txamt1Hc;

    public BigDecimal getTxamt1Hc() {
        return txamt1Hc;
    }

    public void setTxamt1Hc(BigDecimal txamt1Hc) {
        this.txamt1Hc = txamt1Hc;
    }

    @Basic
    @Column(name = "TXAMT2HC")
    private BigDecimal txamt2Hc;

    public BigDecimal getTxamt2Hc() {
        return txamt2Hc;
    }

    public void setTxamt2Hc(BigDecimal txamt2Hc) {
        this.txamt2Hc = txamt2Hc;
    }

    @Basic
    @Column(name = "TXAMT3HC")
    private BigDecimal txamt3Hc;

    public BigDecimal getTxamt3Hc() {
        return txamt3Hc;
    }

    public void setTxamt3Hc(BigDecimal txamt3Hc) {
        this.txamt3Hc = txamt3Hc;
    }

    @Basic
    @Column(name = "TXAMT4HC")
    private BigDecimal txamt4Hc;

    public BigDecimal getTxamt4Hc() {
        return txamt4Hc;
    }

    public void setTxamt4Hc(BigDecimal txamt4Hc) {
        this.txamt4Hc = txamt4Hc;
    }

    @Basic
    @Column(name = "TXAMT5HC")
    private BigDecimal txamt5Hc;

    public BigDecimal getTxamt5Hc() {
        return txamt5Hc;
    }

    public void setTxamt5Hc(BigDecimal txamt5Hc) {
        this.txamt5Hc = txamt5Hc;
    }

    @Basic
    @Column(name = "ACCTREC1")
    private String acctrec1;

    public String getAcctrec1() {
        return acctrec1;
    }

    public void setAcctrec1(String acctrec1) {
        this.acctrec1 = acctrec1;
    }

    @Basic
    @Column(name = "ACCTREC2")
    private String acctrec2;

    public String getAcctrec2() {
        return acctrec2;
    }

    public void setAcctrec2(String acctrec2) {
        this.acctrec2 = acctrec2;
    }

    @Basic
    @Column(name = "ACCTREC3")
    private String acctrec3;

    public String getAcctrec3() {
        return acctrec3;
    }

    public void setAcctrec3(String acctrec3) {
        this.acctrec3 = acctrec3;
    }

    @Basic
    @Column(name = "ACCTREC4")
    private String acctrec4;

    public String getAcctrec4() {
        return acctrec4;
    }

    public void setAcctrec4(String acctrec4) {
        this.acctrec4 = acctrec4;
    }

    @Basic
    @Column(name = "ACCTREC5")
    private String acctrec5;

    public String getAcctrec5() {
        return acctrec5;
    }

    public void setAcctrec5(String acctrec5) {
        this.acctrec5 = acctrec5;
    }

    @Basic
    @Column(name = "ACCTEXP1")
    private String acctexp1;

    public String getAcctexp1() {
        return acctexp1;
    }

    public void setAcctexp1(String acctexp1) {
        this.acctexp1 = acctexp1;
    }

    @Basic
    @Column(name = "ACCTEXP2")
    private String acctexp2;

    public String getAcctexp2() {
        return acctexp2;
    }

    public void setAcctexp2(String acctexp2) {
        this.acctexp2 = acctexp2;
    }

    @Basic
    @Column(name = "ACCTEXP3")
    private String acctexp3;

    public String getAcctexp3() {
        return acctexp3;
    }

    public void setAcctexp3(String acctexp3) {
        this.acctexp3 = acctexp3;
    }

    @Basic
    @Column(name = "ACCTEXP4")
    private String acctexp4;

    public String getAcctexp4() {
        return acctexp4;
    }

    public void setAcctexp4(String acctexp4) {
        this.acctexp4 = acctexp4;
    }

    @Basic
    @Column(name = "ACCTEXP5")
    private String acctexp5;

    public String getAcctexp5() {
        return acctexp5;
    }

    public void setAcctexp5(String acctexp5) {
        this.acctexp5 = acctexp5;
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
    @Column(name = "TXINCLTC")
    private BigDecimal txincltc;

    public BigDecimal getTxincltc() {
        return txincltc;
    }

    public void setTxincltc(BigDecimal txincltc) {
        this.txincltc = txincltc;
    }

    @Basic
    @Column(name = "TXINCLHC")
    private BigDecimal txinclhc;

    public BigDecimal getTxinclhc() {
        return txinclhc;
    }

    public void setTxinclhc(BigDecimal txinclhc) {
        this.txinclhc = txinclhc;
    }

    @Basic
    @Column(name = "TXINCLBC")
    private BigDecimal txinclbc;

    public BigDecimal getTxinclbc() {
        return txinclbc;
    }

    public void setTxinclbc(BigDecimal txinclbc) {
        this.txinclbc = txinclbc;
    }

    @Basic
    @Column(name = "TXINCLMC")
    private BigDecimal txinclmc;

    public BigDecimal getTxinclmc() {
        return txinclmc;
    }

    public void setTxinclmc(BigDecimal txinclmc) {
        this.txinclmc = txinclmc;
    }

    @Basic
    @Column(name = "ARAPBATCH")
    private String arapbatch;

    public String getArapbatch() {
        return arapbatch;
    }

    public void setArapbatch(String arapbatch) {
        this.arapbatch = arapbatch;
    }

    @Basic
    @Column(name = "ARAPENTRY")
    private String arapentry;

    public String getArapentry() {
        return arapentry;
    }

    public void setArapentry(String arapentry) {
        this.arapentry = arapentry;
    }

    @Basic
    @Column(name = "SWCHEQUE")
    private Short swcheque;

    public Short getSwcheque() {
        return swcheque;
    }

    public void setSwcheque(Short swcheque) {
        this.swcheque = swcheque;
    }

    @Basic
    @Column(name = "SWEFT")
    private Short sweft;

    public Short getSweft() {
        return sweft;
    }

    public void setSweft(Short sweft) {
        this.sweft = sweft;
    }

    @Basic
    @Column(name = "RXMTCHSEQ")
    private Short rxmtchseq;

    public Short getRxmtchseq() {
        return rxmtchseq;
    }

    public void setRxmtchseq(Short rxmtchseq) {
        this.rxmtchseq = rxmtchseq;
    }

    @Basic
    @Column(name = "RXTRNSCODE")
    private String rxtrnscode;

    public String getRxtrnscode() {
        return rxtrnscode;
    }

    public void setRxtrnscode(String rxtrnscode) {
        this.rxtrnscode = rxtrnscode;
    }

    @Basic
    @Column(name = "RXCATEGORY")
    private String rxcategory;

    public String getRxcategory() {
        return rxcategory;
    }

    public void setRxcategory(String rxcategory) {
        this.rxcategory = rxcategory;
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
    @Column(name = "ENTEREDBY")
    private String enteredby;

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
        return Objects.equals(batchid, cbbthd.batchid) && Objects.equals(entryno, cbbthd.entryno) && Objects.equals(audtdate, cbbthd.audtdate) && Objects.equals(audttime, cbbthd.audttime) && Objects.equals(audtuser, cbbthd.audtuser) && Objects.equals(audtorg, cbbthd.audtorg) && Objects.equals(entrytype, cbbthd.entrytype) && Objects.equals(reference, cbbthd.reference) && Objects.equals(period, cbbthd.period) && Objects.equals(date, cbbthd.date) && Objects.equals(datechqprn, cbbthd.datechqprn) && Objects.equals(swchqprn, cbbthd.swchqprn) && Objects.equals(misccode, cbbthd.misccode) && Objects.equals(textdesc, cbbthd.textdesc) && Objects.equals(distcode, cbbthd.distcode) && Objects.equals(chargecode, cbbthd.chargecode) && Objects.equals(chrgamount, cbbthd.chrgamount) && Objects.equals(nodetails, cbbthd.nodetails) && Objects.equals(totamount, cbbthd.totamount) && Objects.equals(tottax, cbbthd.tottax) && Objects.equals(taxpercnt, cbbthd.taxpercnt) && Objects.equals(bk2Glcurhm, cbbthd.bk2Glcurhm) && Objects.equals(bk2Glrttyp, cbbthd.bk2Glrttyp) && Objects.equals(bk2Glcursr, cbbthd.bk2Glcursr) && Objects.equals(bk2Gldate, cbbthd.bk2Gldate) && Objects.equals(bk2Glrate, cbbthd.bk2Glrate) && Objects.equals(bk2Glsprd, cbbthd.bk2Glsprd) && Objects.equals(bk2Glop, cbbthd.bk2Glop) && Objects.equals(bk2Gldtmth, cbbthd.bk2Gldtmth) && Objects.equals(bt2Glcurhm, cbbthd.bt2Glcurhm) && Objects.equals(bt2Glrttyp, cbbthd.bt2Glrttyp) && Objects.equals(bt2Glcursr, cbbthd.bt2Glcursr) && Objects.equals(bt2Gldate, cbbthd.bt2Gldate) && Objects.equals(bt2Glrate, cbbthd.bt2Glrate) && Objects.equals(bt2Glsprd, cbbthd.bt2Glsprd) && Objects.equals(bt2Glop, cbbthd.bt2Glop) && Objects.equals(bt2Gldtmth, cbbthd.bt2Gldtmth) && Objects.equals(ms2Glcurhm, cbbthd.ms2Glcurhm) && Objects.equals(ms2Glrttyp, cbbthd.ms2Glrttyp) && Objects.equals(ms2Glcursr, cbbthd.ms2Glcursr) && Objects.equals(ms2Gldate, cbbthd.ms2Gldate) && Objects.equals(ms2Glrate, cbbthd.ms2Glrate) && Objects.equals(ms2Glsprd, cbbthd.ms2Glsprd) && Objects.equals(ms2Glop, cbbthd.ms2Glop) && Objects.equals(ms2Gldtmth, cbbthd.ms2Gldtmth) && Objects.equals(swcash, cbbthd.swcash) && Objects.equals(btchnodec, cbbthd.btchnodec) && Objects.equals(miscnodec, cbbthd.miscnodec) && Objects.equals(taxgroup, cbbthd.taxgroup) && Objects.equals(custchqno, cbbthd.custchqno) && Objects.equals(nosubdetl, cbbthd.nosubdetl) && Objects.equals(applamount, cbbthd.applamount) && Objects.equals(appldisc, cbbthd.appldisc) && Objects.equals(acctnat, cbbthd.acctnat) && Objects.equals(adjamount, cbbthd.adjamount) && Objects.equals(profileid, cbbthd.profileid) && Objects.equals(swinterco, cbbthd.swinterco) && Objects.equals(fiscyr, cbbthd.fiscyr) && Objects.equals(cctype, cbbthd.cctype) && Objects.equals(ccnumber, cbbthd.ccnumber) && Objects.equals(ccname, cbbthd.ccname) && Objects.equals(ccexp, cbbthd.ccexp) && Objects.equals(ccauthcode, cbbthd.ccauthcode) && Objects.equals(xccnumber, cbbthd.xccnumber) && Objects.equals(serial, cbbthd.serial) && Objects.equals(bankamount, cbbthd.bankamount) && Objects.equals(btchamount, cbbthd.btchamount) && Objects.equals(miscamount, cbbthd.miscamount) && Objects.equals(funcamount, cbbthd.funcamount) && Objects.equals(hdrdebit, cbbthd.hdrdebit) && Objects.equals(hdrcredit, cbbthd.hdrcredit) && Objects.equals(taxauth1, cbbthd.taxauth1) && Objects.equals(taxauth2, cbbthd.taxauth2) && Objects.equals(taxauth3, cbbthd.taxauth3) && Objects.equals(taxauth4, cbbthd.taxauth4) && Objects.equals(taxauth5, cbbthd.taxauth5) && Objects.equals(txau1Desc, cbbthd.txau1Desc) && Objects.equals(txau2Desc, cbbthd.txau2Desc) && Objects.equals(txau3Desc, cbbthd.txau3Desc) && Objects.equals(txau4Desc, cbbthd.txau4Desc) && Objects.equals(txau5Desc, cbbthd.txau5Desc) && Objects.equals(taxclass1, cbbthd.taxclass1) && Objects.equals(taxclass2, cbbthd.taxclass2) && Objects.equals(taxclass3, cbbthd.taxclass3) && Objects.equals(taxclass4, cbbthd.taxclass4) && Objects.equals(taxclass5, cbbthd.taxclass5) && Objects.equals(basetax1, cbbthd.basetax1) && Objects.equals(basetax2, cbbthd.basetax2) && Objects.equals(basetax3, cbbthd.basetax3) && Objects.equals(basetax4, cbbthd.basetax4) && Objects.equals(basetax5, cbbthd.basetax5) && Objects.equals(amttax1, cbbthd.amttax1) && Objects.equals(amttax2, cbbthd.amttax2) && Objects.equals(amttax3, cbbthd.amttax3) && Objects.equals(amttax4, cbbthd.amttax4) && Objects.equals(amttax5, cbbthd.amttax5) && Objects.equals(swtaxincl1, cbbthd.swtaxincl1) && Objects.equals(swtaxincl2, cbbthd.swtaxincl2) && Objects.equals(swtaxincl3, cbbthd.swtaxincl3) && Objects.equals(swtaxincl4, cbbthd.swtaxincl4) && Objects.equals(swtaxincl5, cbbthd.swtaxincl5) && Objects.equals(bankcode, cbbthd.bankcode) && Objects.equals(swposted, cbbthd.swposted) && Objects.equals(values, cbbthd.values) && Objects.equals(processcmd, cbbthd.processcmd) && Objects.equals(totunappl, cbbthd.totunappl) && Objects.equals(totapplamt, cbbthd.totapplamt) && Objects.equals(totappldsc, cbbthd.totappldsc) && Objects.equals(allocmode, cbbthd.allocmode) && Objects.equals(allocamt, cbbthd.allocamt) && Objects.equals(classtype, cbbthd.classtype) && Objects.equals(classaxis, cbbthd.classaxis) && Objects.equals(datalevel, cbbthd.datalevel) && Objects.equals(recxcnter, cbbthd.recxcnter) && Objects.equals(raterc, cbbthd.raterc) && Objects.equals(ratetyperc, cbbthd.ratetyperc) && Objects.equals(rateoprc, cbbthd.rateoprc) && Objects.equals(ratedaterc, cbbthd.ratedaterc) && Objects.equals(codecurnrc, cbbthd.codecurnrc) && Objects.equals(txamt1Rc, cbbthd.txamt1Rc) && Objects.equals(txamt2Rc, cbbthd.txamt2Rc) && Objects.equals(txamt3Rc, cbbthd.txamt3Rc) && Objects.equals(txamt4Rc, cbbthd.txamt4Rc) && Objects.equals(txamt5Rc, cbbthd.txamt5Rc) && Objects.equals(txtotrc, cbbthd.txtotrc) && Objects.equals(txallrc, cbbthd.txallrc) && Objects.equals(txexprc, cbbthd.txexprc) && Objects.equals(txrecrc, cbbthd.txrecrc) && Objects.equals(amtrectax, cbbthd.amtrectax) && Objects.equals(amtexptax, cbbthd.amtexptax) && Objects.equals(txbse1Hc, cbbthd.txbse1Hc) && Objects.equals(txbse2Hc, cbbthd.txbse2Hc) && Objects.equals(txbse3Hc, cbbthd.txbse3Hc) && Objects.equals(txbse4Hc, cbbthd.txbse4Hc) && Objects.equals(txbse5Hc, cbbthd.txbse5Hc) && Objects.equals(txamt1Hc, cbbthd.txamt1Hc) && Objects.equals(txamt2Hc, cbbthd.txamt2Hc) && Objects.equals(txamt3Hc, cbbthd.txamt3Hc) && Objects.equals(txamt4Hc, cbbthd.txamt4Hc) && Objects.equals(txamt5Hc, cbbthd.txamt5Hc) && Objects.equals(acctrec1, cbbthd.acctrec1) && Objects.equals(acctrec2, cbbthd.acctrec2) && Objects.equals(acctrec3, cbbthd.acctrec3) && Objects.equals(acctrec4, cbbthd.acctrec4) && Objects.equals(acctrec5, cbbthd.acctrec5) && Objects.equals(acctexp1, cbbthd.acctexp1) && Objects.equals(acctexp2, cbbthd.acctexp2) && Objects.equals(acctexp3, cbbthd.acctexp3) && Objects.equals(acctexp4, cbbthd.acctexp4) && Objects.equals(acctexp5, cbbthd.acctexp5) && Objects.equals(txexcltc, cbbthd.txexcltc) && Objects.equals(txexclhc, cbbthd.txexclhc) && Objects.equals(txexclbc, cbbthd.txexclbc) && Objects.equals(txexclmc, cbbthd.txexclmc) && Objects.equals(txincltc, cbbthd.txincltc) && Objects.equals(txinclhc, cbbthd.txinclhc) && Objects.equals(txinclbc, cbbthd.txinclbc) && Objects.equals(txinclmc, cbbthd.txinclmc) && Objects.equals(arapbatch, cbbthd.arapbatch) && Objects.equals(arapentry, cbbthd.arapentry) && Objects.equals(swcheque, cbbthd.swcheque) && Objects.equals(sweft, cbbthd.sweft) && Objects.equals(rxmtchseq, cbbthd.rxmtchseq) && Objects.equals(rxtrnscode, cbbthd.rxtrnscode) && Objects.equals(rxcategory, cbbthd.rxcategory) && Objects.equals(revuniq, cbbthd.revuniq) && Objects.equals(newrevuniq, cbbthd.newrevuniq) && Objects.equals(enteredby, cbbthd.enteredby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, audtdate, audttime, audtuser, audtorg, entrytype, reference, period, date, datechqprn, swchqprn, misccode, textdesc, distcode, chargecode, chrgamount, nodetails, totamount, tottax, taxpercnt, bk2Glcurhm, bk2Glrttyp, bk2Glcursr, bk2Gldate, bk2Glrate, bk2Glsprd, bk2Glop, bk2Gldtmth, bt2Glcurhm, bt2Glrttyp, bt2Glcursr, bt2Gldate, bt2Glrate, bt2Glsprd, bt2Glop, bt2Gldtmth, ms2Glcurhm, ms2Glrttyp, ms2Glcursr, ms2Gldate, ms2Glrate, ms2Glsprd, ms2Glop, ms2Gldtmth, swcash, btchnodec, miscnodec, taxgroup, custchqno, nosubdetl, applamount, appldisc, acctnat, adjamount, profileid, swinterco, fiscyr, cctype, ccnumber, ccname, ccexp, ccauthcode, xccnumber, serial, bankamount, btchamount, miscamount, funcamount, hdrdebit, hdrcredit, taxauth1, taxauth2, taxauth3, taxauth4, taxauth5, txau1Desc, txau2Desc, txau3Desc, txau4Desc, txau5Desc, taxclass1, taxclass2, taxclass3, taxclass4, taxclass5, basetax1, basetax2, basetax3, basetax4, basetax5, amttax1, amttax2, amttax3, amttax4, amttax5, swtaxincl1, swtaxincl2, swtaxincl3, swtaxincl4, swtaxincl5, bankcode, swposted, values, processcmd, totunappl, totapplamt, totappldsc, allocmode, allocamt, classtype, classaxis, datalevel, recxcnter, raterc, ratetyperc, rateoprc, ratedaterc, codecurnrc, txamt1Rc, txamt2Rc, txamt3Rc, txamt4Rc, txamt5Rc, txtotrc, txallrc, txexprc, txrecrc, amtrectax, amtexptax, txbse1Hc, txbse2Hc, txbse3Hc, txbse4Hc, txbse5Hc, txamt1Hc, txamt2Hc, txamt3Hc, txamt4Hc, txamt5Hc, acctrec1, acctrec2, acctrec3, acctrec4, acctrec5, acctexp1, acctexp2, acctexp3, acctexp4, acctexp5, txexcltc, txexclhc, txexclbc, txexclmc, txincltc, txinclhc, txinclbc, txinclmc, arapbatch, arapentry, swcheque, sweft, rxmtchseq, rxtrnscode, rxcategory, revuniq, newrevuniq, enteredby);
    }
}
