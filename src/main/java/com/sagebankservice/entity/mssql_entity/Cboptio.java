package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cboptio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OPTIONID", nullable = false, length = 4)
    private String optionid;
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
    @Column(name = "TRNSFRGL", nullable = false)
    private short trnsfrgl;
    @Basic
    @Column(name = "CONSOLDATE", nullable = false)
    private short consoldate;
    @Basic
    @Column(name = "DEFBANK", nullable = false, length = 12)
    private String defbank;
    @Basic
    @Column(name = "NBTCHNUM", nullable = false)
    private int nbtchnum;
    @Basic
    @Column(name = "NPSTSEQN", nullable = false)
    private int npstseqn;
    @Basic
    @Column(name = "CURYEAR", nullable = false, length = 4)
    private String curyear;
    @Basic
    @Column(name = "GLSEQN", nullable = false)
    private int glseqn;
    @Basic
    @Column(name = "GLCONSOLN", nullable = false)
    private int glconsoln;
    @Basic
    @Column(name = "CFBTCHCRTE", nullable = false)
    private short cfbtchcrte;
    @Basic
    @Column(name = "TAXTYPE", nullable = false)
    private short taxtype;
    @Basic
    @Column(name = "HISTDAYS", nullable = false)
    private int histdays;
    @Basic
    @Column(name = "APPNTOBTCH", nullable = false)
    private short appntobtch;
    @Basic
    @Column(name = "HISTTBLDYS", nullable = false)
    private int histtbldys;
    @Basic
    @Column(name = "FRCBTCHLST", nullable = false)
    private short frcbtchlst;
    @Basic
    @Column(name = "AUTOPOSTAP", nullable = false)
    private short autopostap;
    @Basic
    @Column(name = "AUTOPOSTAR", nullable = false)
    private short autopostar;
    @Basic
    @Column(name = "SWCHKDUP", nullable = false)
    private short swchkdup;
    @Basic
    @Column(name = "AUTOPOSTGL", nullable = false)
    private short autopostgl;
    @Basic
    @Column(name = "SWEDITRTRV", nullable = false)
    private short sweditrtrv;
    @Basic
    @Column(name = "DFTAXGROUP", nullable = false, length = 12)
    private String dftaxgroup;
    @Basic
    @Column(name = "DFCLASSTYP", nullable = false)
    private short dfclasstyp;
    @Basic
    @Column(name = "SWWARNDATE", nullable = false)
    private short swwarndate;
    @Basic
    @Column(name = "APSRCECODE", nullable = false, length = 4)
    private String apsrcecode;
    @Basic
    @Column(name = "ARSRCECODE", nullable = false, length = 4)
    private String arsrcecode;
    @Basic
    @Column(name = "PRSRCECODE", nullable = false, length = 4)
    private String prsrcecode;
    @Basic
    @Column(name = "SWAPVOID", nullable = false)
    private short swapvoid;
    @Basic
    @Column(name = "SWAPALIGN", nullable = false)
    private short swapalign;
    @Basic
    @Column(name = "SWAPSINGLE", nullable = false)
    private short swapsingle;
    @Basic
    @Column(name = "SWAPEFTBTH", nullable = false)
    private short swapeftbth;
    @Basic
    @Column(name = "SWARDPOSIT", nullable = false)
    private short swardposit;
    @Basic
    @Column(name = "SWPOSTRTAR", nullable = false)
    private short swpostrtar;
    @Basic
    @Column(name = "SWPOSTRTAP", nullable = false)
    private short swpostrtap;
    @Basic
    @Column(name = "SWPOSTRTRX", nullable = false)
    private short swpostrtrx;
    @Basic
    @Column(name = "AUTOPOSTPM", nullable = false)
    private short autopostpm;
    @Basic
    @Column(name = "APEFTPAYM", nullable = false, length = 12)
    private String apeftpaym;
    @Basic
    @Column(name = "SWAPREADY", nullable = false)
    private short swapready;
    @Basic
    @Column(name = "SWARREADY", nullable = false)
    private short swarready;
    @Basic
    @Column(name = "SWARREFUND", nullable = false)
    private short swarrefund;
    @Basic
    @Column(name = "SWRETRVOE", nullable = false)
    private short swretrvoe;
    @Basic
    @Column(name = "SWRETRVOT", nullable = false)
    private short swretrvot;
    @Basic
    @Column(name = "SWRETRVAR", nullable = false)
    private short swretrvar;
    @Basic
    @Column(name = "SWRETRVAP", nullable = false)
    private short swretrvap;
    @Basic
    @Column(name = "SWAPPNDEFT", nullable = false)
    private short swappndeft;
    @Basic
    @Column(name = "OTSRCEAPPL", nullable = false, length = 2)
    private String otsrceappl;
    @Basic
    @Column(name = "LSTRTVDATE", nullable = false, precision = 0)
    private int lstrtvdate;
    @Basic
    @Column(name = "RECXVERNO", nullable = false)
    private short recxverno;
    @Basic
    @Column(name = "EFTVERNO", nullable = false)
    private short eftverno;
    @Basic
    @Column(name = "SWEFTLOCK", nullable = false)
    private short sweftlock;

    public String getOptionid() {
        return optionid;
    }

    public void setOptionid(String optionid) {
        this.optionid = optionid;
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

    public short getTrnsfrgl() {
        return trnsfrgl;
    }

    public void setTrnsfrgl(short trnsfrgl) {
        this.trnsfrgl = trnsfrgl;
    }

    public short getConsoldate() {
        return consoldate;
    }

    public void setConsoldate(short consoldate) {
        this.consoldate = consoldate;
    }

    public String getDefbank() {
        return defbank;
    }

    public void setDefbank(String defbank) {
        this.defbank = defbank;
    }

    public int getNbtchnum() {
        return nbtchnum;
    }

    public void setNbtchnum(int nbtchnum) {
        this.nbtchnum = nbtchnum;
    }

    public int getNpstseqn() {
        return npstseqn;
    }

    public void setNpstseqn(int npstseqn) {
        this.npstseqn = npstseqn;
    }

    public String getCuryear() {
        return curyear;
    }

    public void setCuryear(String curyear) {
        this.curyear = curyear;
    }

    public int getGlseqn() {
        return glseqn;
    }

    public void setGlseqn(int glseqn) {
        this.glseqn = glseqn;
    }

    public int getGlconsoln() {
        return glconsoln;
    }

    public void setGlconsoln(int glconsoln) {
        this.glconsoln = glconsoln;
    }

    public short getCfbtchcrte() {
        return cfbtchcrte;
    }

    public void setCfbtchcrte(short cfbtchcrte) {
        this.cfbtchcrte = cfbtchcrte;
    }

    public short getTaxtype() {
        return taxtype;
    }

    public void setTaxtype(short taxtype) {
        this.taxtype = taxtype;
    }

    public int getHistdays() {
        return histdays;
    }

    public void setHistdays(int histdays) {
        this.histdays = histdays;
    }

    public short getAppntobtch() {
        return appntobtch;
    }

    public void setAppntobtch(short appntobtch) {
        this.appntobtch = appntobtch;
    }

    public int getHisttbldys() {
        return histtbldys;
    }

    public void setHisttbldys(int histtbldys) {
        this.histtbldys = histtbldys;
    }

    public short getFrcbtchlst() {
        return frcbtchlst;
    }

    public void setFrcbtchlst(short frcbtchlst) {
        this.frcbtchlst = frcbtchlst;
    }

    public short getAutopostap() {
        return autopostap;
    }

    public void setAutopostap(short autopostap) {
        this.autopostap = autopostap;
    }

    public short getAutopostar() {
        return autopostar;
    }

    public void setAutopostar(short autopostar) {
        this.autopostar = autopostar;
    }

    public short getSwchkdup() {
        return swchkdup;
    }

    public void setSwchkdup(short swchkdup) {
        this.swchkdup = swchkdup;
    }

    public short getAutopostgl() {
        return autopostgl;
    }

    public void setAutopostgl(short autopostgl) {
        this.autopostgl = autopostgl;
    }

    public short getSweditrtrv() {
        return sweditrtrv;
    }

    public void setSweditrtrv(short sweditrtrv) {
        this.sweditrtrv = sweditrtrv;
    }

    public String getDftaxgroup() {
        return dftaxgroup;
    }

    public void setDftaxgroup(String dftaxgroup) {
        this.dftaxgroup = dftaxgroup;
    }

    public short getDfclasstyp() {
        return dfclasstyp;
    }

    public void setDfclasstyp(short dfclasstyp) {
        this.dfclasstyp = dfclasstyp;
    }

    public short getSwwarndate() {
        return swwarndate;
    }

    public void setSwwarndate(short swwarndate) {
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

    public short getSwapvoid() {
        return swapvoid;
    }

    public void setSwapvoid(short swapvoid) {
        this.swapvoid = swapvoid;
    }

    public short getSwapalign() {
        return swapalign;
    }

    public void setSwapalign(short swapalign) {
        this.swapalign = swapalign;
    }

    public short getSwapsingle() {
        return swapsingle;
    }

    public void setSwapsingle(short swapsingle) {
        this.swapsingle = swapsingle;
    }

    public short getSwapeftbth() {
        return swapeftbth;
    }

    public void setSwapeftbth(short swapeftbth) {
        this.swapeftbth = swapeftbth;
    }

    public short getSwardposit() {
        return swardposit;
    }

    public void setSwardposit(short swardposit) {
        this.swardposit = swardposit;
    }

    public short getSwpostrtar() {
        return swpostrtar;
    }

    public void setSwpostrtar(short swpostrtar) {
        this.swpostrtar = swpostrtar;
    }

    public short getSwpostrtap() {
        return swpostrtap;
    }

    public void setSwpostrtap(short swpostrtap) {
        this.swpostrtap = swpostrtap;
    }

    public short getSwpostrtrx() {
        return swpostrtrx;
    }

    public void setSwpostrtrx(short swpostrtrx) {
        this.swpostrtrx = swpostrtrx;
    }

    public short getAutopostpm() {
        return autopostpm;
    }

    public void setAutopostpm(short autopostpm) {
        this.autopostpm = autopostpm;
    }

    public String getApeftpaym() {
        return apeftpaym;
    }

    public void setApeftpaym(String apeftpaym) {
        this.apeftpaym = apeftpaym;
    }

    public short getSwapready() {
        return swapready;
    }

    public void setSwapready(short swapready) {
        this.swapready = swapready;
    }

    public short getSwarready() {
        return swarready;
    }

    public void setSwarready(short swarready) {
        this.swarready = swarready;
    }

    public short getSwarrefund() {
        return swarrefund;
    }

    public void setSwarrefund(short swarrefund) {
        this.swarrefund = swarrefund;
    }

    public short getSwretrvoe() {
        return swretrvoe;
    }

    public void setSwretrvoe(short swretrvoe) {
        this.swretrvoe = swretrvoe;
    }

    public short getSwretrvot() {
        return swretrvot;
    }

    public void setSwretrvot(short swretrvot) {
        this.swretrvot = swretrvot;
    }

    public short getSwretrvar() {
        return swretrvar;
    }

    public void setSwretrvar(short swretrvar) {
        this.swretrvar = swretrvar;
    }

    public short getSwretrvap() {
        return swretrvap;
    }

    public void setSwretrvap(short swretrvap) {
        this.swretrvap = swretrvap;
    }

    public short getSwappndeft() {
        return swappndeft;
    }

    public void setSwappndeft(short swappndeft) {
        this.swappndeft = swappndeft;
    }

    public String getOtsrceappl() {
        return otsrceappl;
    }

    public void setOtsrceappl(String otsrceappl) {
        this.otsrceappl = otsrceappl;
    }

    public int getLstrtvdate() {
        return lstrtvdate;
    }

    public void setLstrtvdate(int lstrtvdate) {
        this.lstrtvdate = lstrtvdate;
    }

    public short getRecxverno() {
        return recxverno;
    }

    public void setRecxverno(short recxverno) {
        this.recxverno = recxverno;
    }

    public short getEftverno() {
        return eftverno;
    }

    public void setEftverno(short eftverno) {
        this.eftverno = eftverno;
    }

    public short getSweftlock() {
        return sweftlock;
    }

    public void setSweftlock(short sweftlock) {
        this.sweftlock = sweftlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cboptio cboptio = (Cboptio) o;
        return audtdate == cboptio.audtdate && audttime == cboptio.audttime && trnsfrgl == cboptio.trnsfrgl && consoldate == cboptio.consoldate && nbtchnum == cboptio.nbtchnum && npstseqn == cboptio.npstseqn && glseqn == cboptio.glseqn && glconsoln == cboptio.glconsoln && cfbtchcrte == cboptio.cfbtchcrte && taxtype == cboptio.taxtype && histdays == cboptio.histdays && appntobtch == cboptio.appntobtch && histtbldys == cboptio.histtbldys && frcbtchlst == cboptio.frcbtchlst && autopostap == cboptio.autopostap && autopostar == cboptio.autopostar && swchkdup == cboptio.swchkdup && autopostgl == cboptio.autopostgl && sweditrtrv == cboptio.sweditrtrv && dfclasstyp == cboptio.dfclasstyp && swwarndate == cboptio.swwarndate && swapvoid == cboptio.swapvoid && swapalign == cboptio.swapalign && swapsingle == cboptio.swapsingle && swapeftbth == cboptio.swapeftbth && swardposit == cboptio.swardposit && swpostrtar == cboptio.swpostrtar && swpostrtap == cboptio.swpostrtap && swpostrtrx == cboptio.swpostrtrx && autopostpm == cboptio.autopostpm && swapready == cboptio.swapready && swarready == cboptio.swarready && swarrefund == cboptio.swarrefund && swretrvoe == cboptio.swretrvoe && swretrvot == cboptio.swretrvot && swretrvar == cboptio.swretrvar && swretrvap == cboptio.swretrvap && swappndeft == cboptio.swappndeft && lstrtvdate == cboptio.lstrtvdate && recxverno == cboptio.recxverno && eftverno == cboptio.eftverno && sweftlock == cboptio.sweftlock && Objects.equals(optionid, cboptio.optionid) && Objects.equals(audtuser, cboptio.audtuser) && Objects.equals(audtorg, cboptio.audtorg) && Objects.equals(defbank, cboptio.defbank) && Objects.equals(curyear, cboptio.curyear) && Objects.equals(dftaxgroup, cboptio.dftaxgroup) && Objects.equals(apsrcecode, cboptio.apsrcecode) && Objects.equals(arsrcecode, cboptio.arsrcecode) && Objects.equals(prsrcecode, cboptio.prsrcecode) && Objects.equals(apeftpaym, cboptio.apeftpaym) && Objects.equals(otsrceappl, cboptio.otsrceappl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionid, audtdate, audttime, audtuser, audtorg, trnsfrgl, consoldate, defbank, nbtchnum, npstseqn, curyear, glseqn, glconsoln, cfbtchcrte, taxtype, histdays, appntobtch, histtbldys, frcbtchlst, autopostap, autopostar, swchkdup, autopostgl, sweditrtrv, dftaxgroup, dfclasstyp, swwarndate, apsrcecode, arsrcecode, prsrcecode, swapvoid, swapalign, swapsingle, swapeftbth, swardposit, swpostrtar, swpostrtap, swpostrtrx, autopostpm, apeftpaym, swapready, swarready, swarrefund, swretrvoe, swretrvot, swretrvar, swretrvap, swappndeft, otsrceappl, lstrtvdate, recxverno, eftverno, sweftlock);
    }
}
