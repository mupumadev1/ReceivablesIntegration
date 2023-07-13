package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cboptio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OPTIONID")
    private String optionid;
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
    @Column(name = "TRNSFRGL")
    private Short trnsfrgl;
    @Basic
    @Column(name = "CONSOLDATE")
    private Short consoldate;
    @Basic
    @Column(name = "DEFBANK")
    private String defbank;
    @Basic
    @Column(name = "NBTCHNUM")
    private Integer nbtchnum;
    @Basic
    @Column(name = "NPSTSEQN")
    private Integer npstseqn;
    @Basic
    @Column(name = "CURYEAR")
    private String curyear;
    @Basic
    @Column(name = "GLSEQN")
    private Integer glseqn;
    @Basic
    @Column(name = "GLCONSOLN")
    private Integer glconsoln;
    @Basic
    @Column(name = "CFBTCHCRTE")
    private Short cfbtchcrte;
    @Basic
    @Column(name = "TAXTYPE")
    private Short taxtype;
    @Basic
    @Column(name = "HISTDAYS")
    private Integer histdays;
    @Basic
    @Column(name = "APPNTOBTCH")
    private Short appntobtch;
    @Basic
    @Column(name = "HISTTBLDYS")
    private Integer histtbldys;
    @Basic
    @Column(name = "FRCBTCHLST")
    private Short frcbtchlst;
    @Basic
    @Column(name = "AUTOPOSTAP")
    private Short autopostap;
    @Basic
    @Column(name = "AUTOPOSTAR")
    private Short autopostar;
    @Basic
    @Column(name = "SWCHKDUP")
    private Short swchkdup;
    @Basic
    @Column(name = "AUTOPOSTGL")
    private Short autopostgl;
    @Basic
    @Column(name = "SWEDITRTRV")
    private Short sweditrtrv;
    @Basic
    @Column(name = "DFTAXGROUP")
    private String dftaxgroup;
    @Basic
    @Column(name = "DFCLASSTYP")
    private Short dfclasstyp;
    @Basic
    @Column(name = "SWWARNDATE")
    private Short swwarndate;
    @Basic
    @Column(name = "APSRCECODE")
    private String apsrcecode;
    @Basic
    @Column(name = "ARSRCECODE")
    private String arsrcecode;
    @Basic
    @Column(name = "PRSRCECODE")
    private String prsrcecode;
    @Basic
    @Column(name = "SWAPVOID")
    private Short swapvoid;
    @Basic
    @Column(name = "SWAPALIGN")
    private Short swapalign;
    @Basic
    @Column(name = "SWAPSINGLE")
    private Short swapsingle;
    @Basic
    @Column(name = "SWAPEFTBTH")
    private Short swapeftbth;
    @Basic
    @Column(name = "SWARDPOSIT")
    private Short swardposit;
    @Basic
    @Column(name = "SWPOSTRTAR")
    private Short swpostrtar;
    @Basic
    @Column(name = "SWPOSTRTAP")
    private Short swpostrtap;
    @Basic
    @Column(name = "SWPOSTRTRX")
    private Short swpostrtrx;
    @Basic
    @Column(name = "AUTOPOSTPM")
    private Short autopostpm;
    @Basic
    @Column(name = "APEFTPAYM")
    private String apeftpaym;
    @Basic
    @Column(name = "SWAPREADY")
    private Short swapready;
    @Basic
    @Column(name = "SWARREADY")
    private Short swarready;
    @Basic
    @Column(name = "SWARREFUND")
    private Short swarrefund;
    @Basic
    @Column(name = "SWRETRVOE")
    private Short swretrvoe;
    @Basic
    @Column(name = "SWRETRVOT")
    private Short swretrvot;
    @Basic
    @Column(name = "SWRETRVAR")
    private Short swretrvar;
    @Basic
    @Column(name = "SWRETRVAP")
    private Short swretrvap;
    @Basic
    @Column(name = "SWAPPNDEFT")
    private Short swappndeft;
    @Basic
    @Column(name = "OTSRCEAPPL")
    private String otsrceappl;
    @Basic
    @Column(name = "LSTRTVDATE")
    private Integer lstrtvdate;
    @Basic
    @Column(name = "RECXVERNO")
    private Short recxverno;
    @Basic
    @Column(name = "EFTVERNO")
    private Short eftverno;
    @Basic
    @Column(name = "SWEFTLOCK")
    private Short sweftlock;

    public String getOptionid() {
        return optionid;
    }

    public void setOptionid(String optionid) {
        this.optionid = optionid;
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

    public Short getTrnsfrgl() {
        return trnsfrgl;
    }

    public void setTrnsfrgl(Short trnsfrgl) {
        this.trnsfrgl = trnsfrgl;
    }

    public Short getConsoldate() {
        return consoldate;
    }

    public void setConsoldate(Short consoldate) {
        this.consoldate = consoldate;
    }

    public String getDefbank() {
        return defbank;
    }

    public void setDefbank(String defbank) {
        this.defbank = defbank;
    }

    public Integer getNbtchnum() {
        return nbtchnum;
    }

    public void setNbtchnum(Integer nbtchnum) {
        this.nbtchnum = nbtchnum;
    }

    public Integer getNpstseqn() {
        return npstseqn;
    }

    public void setNpstseqn(Integer npstseqn) {
        this.npstseqn = npstseqn;
    }

    public String getCuryear() {
        return curyear;
    }

    public void setCuryear(String curyear) {
        this.curyear = curyear;
    }

    public Integer getGlseqn() {
        return glseqn;
    }

    public void setGlseqn(Integer glseqn) {
        this.glseqn = glseqn;
    }

    public Integer getGlconsoln() {
        return glconsoln;
    }

    public void setGlconsoln(Integer glconsoln) {
        this.glconsoln = glconsoln;
    }

    public Short getCfbtchcrte() {
        return cfbtchcrte;
    }

    public void setCfbtchcrte(Short cfbtchcrte) {
        this.cfbtchcrte = cfbtchcrte;
    }

    public Short getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(Short taxtype) {
        this.taxtype = taxtype;
    }

    public Integer getHistdays() {
        return histdays;
    }

    public void setHistdays(Integer histdays) {
        this.histdays = histdays;
    }

    public Short getAppntobtch() {
        return appntobtch;
    }

    public void setAppntobtch(Short appntobtch) {
        this.appntobtch = appntobtch;
    }

    public Integer getHisttbldys() {
        return histtbldys;
    }

    public void setHisttbldys(Integer histtbldys) {
        this.histtbldys = histtbldys;
    }

    public Short getFrcbtchlst() {
        return frcbtchlst;
    }

    public void setFrcbtchlst(Short frcbtchlst) {
        this.frcbtchlst = frcbtchlst;
    }

    public Short getAutopostap() {
        return autopostap;
    }

    public void setAutopostap(Short autopostap) {
        this.autopostap = autopostap;
    }

    public Short getAutopostar() {
        return autopostar;
    }

    public void setAutopostar(Short autopostar) {
        this.autopostar = autopostar;
    }

    public Short getSwchkdup() {
        return swchkdup;
    }

    public void setSwchkdup(Short swchkdup) {
        this.swchkdup = swchkdup;
    }

    public Short getAutopostgl() {
        return autopostgl;
    }

    public void setAutopostgl(Short autopostgl) {
        this.autopostgl = autopostgl;
    }

    public Short getSweditrtrv() {
        return sweditrtrv;
    }

    public void setSweditrtrv(Short sweditrtrv) {
        this.sweditrtrv = sweditrtrv;
    }

    public String getDftaxgroup() {
        return dftaxgroup;
    }

    public void setDftaxgroup(String dftaxgroup) {
        this.dftaxgroup = dftaxgroup;
    }

    public Short getDfclasstyp() {
        return dfclasstyp;
    }

    public void setDfclasstyp(Short dfclasstyp) {
        this.dfclasstyp = dfclasstyp;
    }

    public Short getSwwarndate() {
        return swwarndate;
    }

    public void setSwwarndate(Short swwarndate) {
        this.swwarndate = swwarndate;
    }

    public String getApsrcecode() {
        return apsrcecode;
    }

    public void setApsrcecode(String apsrcecode) {
        this.apsrcecode = apsrcecode;
    }

    public String getArsrcecode() {
        return arsrcecode;
    }

    public void setArsrcecode(String arsrcecode) {
        this.arsrcecode = arsrcecode;
    }

    public String getPrsrcecode() {
        return prsrcecode;
    }

    public void setPrsrcecode(String prsrcecode) {
        this.prsrcecode = prsrcecode;
    }

    public Short getSwapvoid() {
        return swapvoid;
    }

    public void setSwapvoid(Short swapvoid) {
        this.swapvoid = swapvoid;
    }

    public Short getSwapalign() {
        return swapalign;
    }

    public void setSwapalign(Short swapalign) {
        this.swapalign = swapalign;
    }

    public Short getSwapsingle() {
        return swapsingle;
    }

    public void setSwapsingle(Short swapsingle) {
        this.swapsingle = swapsingle;
    }

    public Short getSwapeftbth() {
        return swapeftbth;
    }

    public void setSwapeftbth(Short swapeftbth) {
        this.swapeftbth = swapeftbth;
    }

    public Short getSwardposit() {
        return swardposit;
    }

    public void setSwardposit(Short swardposit) {
        this.swardposit = swardposit;
    }

    public Short getSwpostrtar() {
        return swpostrtar;
    }

    public void setSwpostrtar(Short swpostrtar) {
        this.swpostrtar = swpostrtar;
    }

    public Short getSwpostrtap() {
        return swpostrtap;
    }

    public void setSwpostrtap(Short swpostrtap) {
        this.swpostrtap = swpostrtap;
    }

    public Short getSwpostrtrx() {
        return swpostrtrx;
    }

    public void setSwpostrtrx(Short swpostrtrx) {
        this.swpostrtrx = swpostrtrx;
    }

    public Short getAutopostpm() {
        return autopostpm;
    }

    public void setAutopostpm(Short autopostpm) {
        this.autopostpm = autopostpm;
    }

    public String getApeftpaym() {
        return apeftpaym;
    }

    public void setApeftpaym(String apeftpaym) {
        this.apeftpaym = apeftpaym;
    }

    public Short getSwapready() {
        return swapready;
    }

    public void setSwapready(Short swapready) {
        this.swapready = swapready;
    }

    public Short getSwarready() {
        return swarready;
    }

    public void setSwarready(Short swarready) {
        this.swarready = swarready;
    }

    public Short getSwarrefund() {
        return swarrefund;
    }

    public void setSwarrefund(Short swarrefund) {
        this.swarrefund = swarrefund;
    }

    public Short getSwretrvoe() {
        return swretrvoe;
    }

    public void setSwretrvoe(Short swretrvoe) {
        this.swretrvoe = swretrvoe;
    }

    public Short getSwretrvot() {
        return swretrvot;
    }

    public void setSwretrvot(Short swretrvot) {
        this.swretrvot = swretrvot;
    }

    public Short getSwretrvar() {
        return swretrvar;
    }

    public void setSwretrvar(Short swretrvar) {
        this.swretrvar = swretrvar;
    }

    public Short getSwretrvap() {
        return swretrvap;
    }

    public void setSwretrvap(Short swretrvap) {
        this.swretrvap = swretrvap;
    }

    public Short getSwappndeft() {
        return swappndeft;
    }

    public void setSwappndeft(Short swappndeft) {
        this.swappndeft = swappndeft;
    }

    public String getOtsrceappl() {
        return otsrceappl;
    }

    public void setOtsrceappl(String otsrceappl) {
        this.otsrceappl = otsrceappl;
    }

    public Integer getLstrtvdate() {
        return lstrtvdate;
    }

    public void setLstrtvdate(Integer lstrtvdate) {
        this.lstrtvdate = lstrtvdate;
    }

    public Short getRecxverno() {
        return recxverno;
    }

    public void setRecxverno(Short recxverno) {
        this.recxverno = recxverno;
    }

    public Short getEftverno() {
        return eftverno;
    }

    public void setEftverno(Short eftverno) {
        this.eftverno = eftverno;
    }

    public Short getSweftlock() {
        return sweftlock;
    }

    public void setSweftlock(Short sweftlock) {
        this.sweftlock = sweftlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cboptio cboptio = (Cboptio) o;
        return Objects.equals(optionid, cboptio.optionid) && Objects.equals(audtdate, cboptio.audtdate) && Objects.equals(audttime, cboptio.audttime) && Objects.equals(audtuser, cboptio.audtuser) && Objects.equals(audtorg, cboptio.audtorg) && Objects.equals(trnsfrgl, cboptio.trnsfrgl) && Objects.equals(consoldate, cboptio.consoldate) && Objects.equals(defbank, cboptio.defbank) && Objects.equals(nbtchnum, cboptio.nbtchnum) && Objects.equals(npstseqn, cboptio.npstseqn) && Objects.equals(curyear, cboptio.curyear) && Objects.equals(glseqn, cboptio.glseqn) && Objects.equals(glconsoln, cboptio.glconsoln) && Objects.equals(cfbtchcrte, cboptio.cfbtchcrte) && Objects.equals(taxtype, cboptio.taxtype) && Objects.equals(histdays, cboptio.histdays) && Objects.equals(appntobtch, cboptio.appntobtch) && Objects.equals(histtbldys, cboptio.histtbldys) && Objects.equals(frcbtchlst, cboptio.frcbtchlst) && Objects.equals(autopostap, cboptio.autopostap) && Objects.equals(autopostar, cboptio.autopostar) && Objects.equals(swchkdup, cboptio.swchkdup) && Objects.equals(autopostgl, cboptio.autopostgl) && Objects.equals(sweditrtrv, cboptio.sweditrtrv) && Objects.equals(dftaxgroup, cboptio.dftaxgroup) && Objects.equals(dfclasstyp, cboptio.dfclasstyp) && Objects.equals(swwarndate, cboptio.swwarndate) && Objects.equals(apsrcecode, cboptio.apsrcecode) && Objects.equals(arsrcecode, cboptio.arsrcecode) && Objects.equals(prsrcecode, cboptio.prsrcecode) && Objects.equals(swapvoid, cboptio.swapvoid) && Objects.equals(swapalign, cboptio.swapalign) && Objects.equals(swapsingle, cboptio.swapsingle) && Objects.equals(swapeftbth, cboptio.swapeftbth) && Objects.equals(swardposit, cboptio.swardposit) && Objects.equals(swpostrtar, cboptio.swpostrtar) && Objects.equals(swpostrtap, cboptio.swpostrtap) && Objects.equals(swpostrtrx, cboptio.swpostrtrx) && Objects.equals(autopostpm, cboptio.autopostpm) && Objects.equals(apeftpaym, cboptio.apeftpaym) && Objects.equals(swapready, cboptio.swapready) && Objects.equals(swarready, cboptio.swarready) && Objects.equals(swarrefund, cboptio.swarrefund) && Objects.equals(swretrvoe, cboptio.swretrvoe) && Objects.equals(swretrvot, cboptio.swretrvot) && Objects.equals(swretrvar, cboptio.swretrvar) && Objects.equals(swretrvap, cboptio.swretrvap) && Objects.equals(swappndeft, cboptio.swappndeft) && Objects.equals(otsrceappl, cboptio.otsrceappl) && Objects.equals(lstrtvdate, cboptio.lstrtvdate) && Objects.equals(recxverno, cboptio.recxverno) && Objects.equals(eftverno, cboptio.eftverno) && Objects.equals(sweftlock, cboptio.sweftlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionid, audtdate, audttime, audtuser, audtorg, trnsfrgl, consoldate, defbank, nbtchnum, npstseqn, curyear, glseqn, glconsoln, cfbtchcrte, taxtype, histdays, appntobtch, histtbldys, frcbtchlst, autopostap, autopostar, swchkdup, autopostgl, sweditrtrv, dftaxgroup, dfclasstyp, swwarndate, apsrcecode, arsrcecode, prsrcecode, swapvoid, swapalign, swapsingle, swapeftbth, swardposit, swpostrtar, swpostrtap, swpostrtrx, autopostpm, apeftpaym, swapready, swarready, swarrefund, swretrvoe, swretrvot, swretrvar, swretrvap, swappndeft, otsrceappl, lstrtvdate, recxverno, eftverno, sweftlock);
    }
}
