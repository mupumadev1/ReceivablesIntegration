package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CbbtmsPK.class)
public class Cbbtms {
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
    @Column(name = "MISCCODE", nullable = false, length = 12)
    private String misccode;
    @Basic
    @Column(name = "NAME", nullable = false, length = 60)
    private String name;
    @Basic
    @Column(name = "ADDRESS1", nullable = false, length = 60)
    private String address1;
    @Basic
    @Column(name = "ADDRESS2", nullable = false, length = 60)
    private String address2;
    @Basic
    @Column(name = "ADDRESS3", nullable = false, length = 60)
    private String address3;
    @Basic
    @Column(name = "ADDRESS4", nullable = false, length = 60)
    private String address4;
    @Basic
    @Column(name = "POSTCODE", nullable = false, length = 20)
    private String postcode;
    @Basic
    @Column(name = "PHONE1", nullable = false, length = 30)
    private String phone1;
    @Basic
    @Column(name = "PHONE2", nullable = false, length = 30)
    private String phone2;
    @Basic
    @Column(name = "FAXNUMBER", nullable = false, length = 30)
    private String faxnumber;
    @Basic
    @Column(name = "CONTACT", nullable = false, length = 60)
    private String contact;
    @Basic
    @Column(name = "COMMENTS", nullable = false, length = 120)
    private String comments;
    @Basic
    @Column(name = "SWKEEPTOT", nullable = false)
    private short swkeeptot;
    @Basic
    @Column(name = "ACCTROW", nullable = false)
    private int acctrow;
    @Basic
    @Column(name = "ACCTNAME", nullable = false, length = 50)
    private String acctname;
    @Basic
    @Column(name = "ACCTNO", nullable = false, length = 30)
    private String acctno;
    @Basic
    @Column(name = "CITY", nullable = false, length = 30)
    private String city;
    @Basic
    @Column(name = "STATE", nullable = false, length = 30)
    private String state;
    @Basic
    @Column(name = "COUNTRY", nullable = false, length = 30)
    private String country;
    @Basic
    @Column(name = "EMAILADDR", nullable = false, length = 50)
    private String emailaddr;
    @Basic
    @Column(name = "URLADDR", nullable = false, length = 100)
    private String urladdr;
    @Basic
    @Column(name = "SWAPPROVED", nullable = false)
    private short swapproved;
    @Basic
    @Column(name = "EFTDESC", nullable = false, length = 50)
    private String eftdesc;
    @Basic
    @Column(name = "BANKNAME", nullable = false, length = 50)
    private String bankname;
    @Basic
    @Column(name = "ACCOUNT", nullable = false, length = 30)
    private String account;
    @Basic
    @Column(name = "BRANCH", nullable = false, length = 20)
    private String branch;
    @Basic
    @Column(name = "ACCTYPE", nullable = false)
    private short acctype;
    @Basic
    @Column(name = "BANKID", nullable = false, length = 12)
    private String bankid;
    @Basic
    @Column(name = "SWIFTCTY", nullable = false, length = 2)
    private String swiftcty;
    @Basic
    @Column(name = "PAYDETL", nullable = false, length = 75)
    private String paydetl;
    @Basic
    @Column(name = "ADDINFO1", nullable = false, length = 100)
    private String addinfo1;
    @Basic
    @Column(name = "ADDINFO2", nullable = false, length = 100)
    private String addinfo2;
    @Basic
    @Column(name = "COVERTYPE", nullable = false)
    private short covertype;
    @Basic
    @Column(name = "COVERINFO", nullable = false, length = 75)
    private String coverinfo;
    @Basic
    @Column(name = "BENCODE", nullable = false, length = 16)
    private String bencode;
    @Basic
    @Column(name = "EITYPE", nullable = false)
    private short eitype;
    @Basic
    @Column(name = "BOPCATG", nullable = false, length = 3)
    private String bopcatg;
    @Basic
    @Column(name = "BOPREF", nullable = false, length = 24)
    private String bopref;
    @Basic
    @Column(name = "BOPDESC", nullable = false, length = 150)
    private String bopdesc;
    @Basic
    @Column(name = "BRN", nullable = false, length = 30)
    private String brn;
    @Basic
    @Column(name = "IDN", nullable = false, length = 30)
    private String idn;

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

    public String getMisccode() {
        return misccode;
    }

    public void setMisccode(String misccode) {
        this.misccode = misccode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public short getSwkeeptot() {
        return swkeeptot;
    }

    public void setSwkeeptot(short swkeeptot) {
        this.swkeeptot = swkeeptot;
    }

    public int getAcctrow() {
        return acctrow;
    }

    public void setAcctrow(int acctrow) {
        this.acctrow = acctrow;
    }

    public String getAcctname() {
        return acctname;
    }

    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailaddr() {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr;
    }

    public String getUrladdr() {
        return urladdr;
    }

    public void setUrladdr(String urladdr) {
        this.urladdr = urladdr;
    }

    public short getSwapproved() {
        return swapproved;
    }

    public void setSwapproved(short swapproved) {
        this.swapproved = swapproved;
    }

    public String getEftdesc() {
        return eftdesc;
    }

    public void setEftdesc(String eftdesc) {
        this.eftdesc = eftdesc;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public short getAcctype() {
        return acctype;
    }

    public void setAcctype(short acctype) {
        this.acctype = acctype;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getSwiftcty() {
        return swiftcty;
    }

    public void setSwiftcty(String swiftcty) {
        this.swiftcty = swiftcty;
    }

    public String getPaydetl() {
        return paydetl;
    }

    public void setPaydetl(String paydetl) {
        this.paydetl = paydetl;
    }

    public String getAddinfo1() {
        return addinfo1;
    }

    public void setAddinfo1(String addinfo1) {
        this.addinfo1 = addinfo1;
    }

    public String getAddinfo2() {
        return addinfo2;
    }

    public void setAddinfo2(String addinfo2) {
        this.addinfo2 = addinfo2;
    }

    public short getCovertype() {
        return covertype;
    }

    public void setCovertype(short covertype) {
        this.covertype = covertype;
    }

    public String getCoverinfo() {
        return coverinfo;
    }

    public void setCoverinfo(String coverinfo) {
        this.coverinfo = coverinfo;
    }

    public String getBencode() {
        return bencode;
    }

    public void setBencode(String bencode) {
        this.bencode = bencode;
    }

    public short getEitype() {
        return eitype;
    }

    public void setEitype(short eitype) {
        this.eitype = eitype;
    }

    public String getBopcatg() {
        return bopcatg;
    }

    public void setBopcatg(String bopcatg) {
        this.bopcatg = bopcatg;
    }

    public String getBopref() {
        return bopref;
    }

    public void setBopref(String bopref) {
        this.bopref = bopref;
    }

    public String getBopdesc() {
        return bopdesc;
    }

    public void setBopdesc(String bopdesc) {
        this.bopdesc = bopdesc;
    }

    public String getBrn() {
        return brn;
    }

    public void setBrn(String brn) {
        this.brn = brn;
    }

    public String getIdn() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cbbtms cbbtms = (Cbbtms) o;
        return audtdate == cbbtms.audtdate && audttime == cbbtms.audttime && swkeeptot == cbbtms.swkeeptot && acctrow == cbbtms.acctrow && swapproved == cbbtms.swapproved && acctype == cbbtms.acctype && covertype == cbbtms.covertype && eitype == cbbtms.eitype && Objects.equals(batchid, cbbtms.batchid) && Objects.equals(entryno, cbbtms.entryno) && Objects.equals(detailno, cbbtms.detailno) && Objects.equals(audtuser, cbbtms.audtuser) && Objects.equals(audtorg, cbbtms.audtorg) && Objects.equals(misccode, cbbtms.misccode) && Objects.equals(name, cbbtms.name) && Objects.equals(address1, cbbtms.address1) && Objects.equals(address2, cbbtms.address2) && Objects.equals(address3, cbbtms.address3) && Objects.equals(address4, cbbtms.address4) && Objects.equals(postcode, cbbtms.postcode) && Objects.equals(phone1, cbbtms.phone1) && Objects.equals(phone2, cbbtms.phone2) && Objects.equals(faxnumber, cbbtms.faxnumber) && Objects.equals(contact, cbbtms.contact) && Objects.equals(comments, cbbtms.comments) && Objects.equals(acctname, cbbtms.acctname) && Objects.equals(acctno, cbbtms.acctno) && Objects.equals(city, cbbtms.city) && Objects.equals(state, cbbtms.state) && Objects.equals(country, cbbtms.country) && Objects.equals(emailaddr, cbbtms.emailaddr) && Objects.equals(urladdr, cbbtms.urladdr) && Objects.equals(eftdesc, cbbtms.eftdesc) && Objects.equals(bankname, cbbtms.bankname) && Objects.equals(account, cbbtms.account) && Objects.equals(branch, cbbtms.branch) && Objects.equals(bankid, cbbtms.bankid) && Objects.equals(swiftcty, cbbtms.swiftcty) && Objects.equals(paydetl, cbbtms.paydetl) && Objects.equals(addinfo1, cbbtms.addinfo1) && Objects.equals(addinfo2, cbbtms.addinfo2) && Objects.equals(coverinfo, cbbtms.coverinfo) && Objects.equals(bencode, cbbtms.bencode) && Objects.equals(bopcatg, cbbtms.bopcatg) && Objects.equals(bopref, cbbtms.bopref) && Objects.equals(bopdesc, cbbtms.bopdesc) && Objects.equals(brn, cbbtms.brn) && Objects.equals(idn, cbbtms.idn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, detailno, audtdate, audttime, audtuser, audtorg, misccode, name, address1, address2, address3, address4, postcode, phone1, phone2, faxnumber, contact, comments, swkeeptot, acctrow, acctname, acctno, city, state, country, emailaddr, urladdr, swapproved, eftdesc, bankname, account, branch, acctype, bankid, swiftcty, paydetl, addinfo1, addinfo2, covertype, coverinfo, bencode, eitype, bopcatg, bopref, bopdesc, brn, idn);
    }
}
