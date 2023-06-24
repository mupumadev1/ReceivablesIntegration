package com.sagebankservice.entity.mssql_entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@jakarta.persistence.Table(name = "CBBTMS", schema = "dbo", catalog = "TSTDAT")
@IdClass(com.sagebankservice.entity.mssql_entity.CbbtmsEntityPK.class)
public class CbbtmsEntity {
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

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "DETAILNO")
    private String detailno;

    public String getDetailno() {
        return detailno;
    }

    public void setDetailno(String detailno) {
        this.detailno = detailno;
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
    @Column(name = "MISCCODE")
    private String misccode;

    public String getMisccode() {
        return misccode;
    }

    public void setMisccode(String misccode) {
        this.misccode = misccode;
    }

    @Basic
    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ADDRESS1")
    private String address1;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "ADDRESS2")
    private String address2;

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "ADDRESS3")
    private String address3;

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    @Basic
    @Column(name = "ADDRESS4")
    private String address4;

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    @Basic
    @Column(name = "POSTCODE")
    private String postcode;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "PHONE1")
    private String phone1;

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Basic
    @Column(name = "PHONE2")
    private String phone2;

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Basic
    @Column(name = "FAXNUMBER")
    private String faxnumber;

    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    @Basic
    @Column(name = "CONTACT")
    private String contact;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "COMMENTS")
    private String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "SWKEEPTOT")
    private Short swkeeptot;

    public Short getSwkeeptot() {
        return swkeeptot;
    }

    public void setSwkeeptot(Short swkeeptot) {
        this.swkeeptot = swkeeptot;
    }

    @Basic
    @Column(name = "ACCTROW")
    private Integer acctrow;

    public Integer getAcctrow() {
        return acctrow;
    }

    public void setAcctrow(Integer acctrow) {
        this.acctrow = acctrow;
    }

    @Basic
    @Column(name = "ACCTNAME")
    private String acctname;

    public String getAcctname() {
        return acctname;
    }

    public void setAcctname(String acctname) {
        this.acctname = acctname;
    }

    @Basic
    @Column(name = "ACCTNO")
    private String acctno;

    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
    }

    @Basic
    @Column(name = "CITY")
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "STATE")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "COUNTRY")
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "EMAILADDR")
    private String emailaddr;

    public String getEmailaddr() {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr;
    }

    @Basic
    @Column(name = "URLADDR")
    private String urladdr;

    public String getUrladdr() {
        return urladdr;
    }

    public void setUrladdr(String urladdr) {
        this.urladdr = urladdr;
    }

    @Basic
    @Column(name = "SWAPPROVED")
    private Short swapproved;

    public Short getSwapproved() {
        return swapproved;
    }

    public void setSwapproved(Short swapproved) {
        this.swapproved = swapproved;
    }

    @Basic
    @Column(name = "EFTDESC")
    private String eftdesc;

    public String getEftdesc() {
        return eftdesc;
    }

    public void setEftdesc(String eftdesc) {
        this.eftdesc = eftdesc;
    }

    @Basic
    @Column(name = "BANKNAME")
    private String bankname;

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Basic
    @Column(name = "ACCOUNT")
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "BRANCH")
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Basic
    @Column(name = "ACCTYPE")
    private Short acctype;

    public Short getAcctype() {
        return acctype;
    }

    public void setAcctype(Short acctype) {
        this.acctype = acctype;
    }

    @Basic
    @Column(name = "BANKID")
    private String bankid;

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    @Basic
    @Column(name = "SWIFTCTY")
    private String swiftcty;

    public String getSwiftcty() {
        return swiftcty;
    }

    public void setSwiftcty(String swiftcty) {
        this.swiftcty = swiftcty;
    }

    @Basic
    @Column(name = "PAYDETL")
    private String paydetl;

    public String getPaydetl() {
        return paydetl;
    }

    public void setPaydetl(String paydetl) {
        this.paydetl = paydetl;
    }

    @Basic
    @Column(name = "ADDINFO1")
    private String addinfo1;

    public String getAddinfo1() {
        return addinfo1;
    }

    public void setAddinfo1(String addinfo1) {
        this.addinfo1 = addinfo1;
    }

    @Basic
    @Column(name = "ADDINFO2")
    private String addinfo2;

    public String getAddinfo2() {
        return addinfo2;
    }

    public void setAddinfo2(String addinfo2) {
        this.addinfo2 = addinfo2;
    }

    @Basic
    @Column(name = "COVERTYPE")
    private Short covertype;

    public Short getCovertype() {
        return covertype;
    }

    public void setCovertype(Short covertype) {
        this.covertype = covertype;
    }

    @Basic
    @Column(name = "COVERINFO")
    private String coverinfo;

    public String getCoverinfo() {
        return coverinfo;
    }

    public void setCoverinfo(String coverinfo) {
        this.coverinfo = coverinfo;
    }

    @Basic
    @Column(name = "BENCODE")
    private String bencode;

    public String getBencode() {
        return bencode;
    }

    public void setBencode(String bencode) {
        this.bencode = bencode;
    }

    @Basic
    @Column(name = "EITYPE")
    private Short eitype;

    public Short getEitype() {
        return eitype;
    }

    public void setEitype(Short eitype) {
        this.eitype = eitype;
    }

    @Basic
    @Column(name = "BOPCATG")
    private String bopcatg;

    public String getBopcatg() {
        return bopcatg;
    }

    public void setBopcatg(String bopcatg) {
        this.bopcatg = bopcatg;
    }

    @Basic
    @Column(name = "BOPREF")
    private String bopref;

    public String getBopref() {
        return bopref;
    }

    public void setBopref(String bopref) {
        this.bopref = bopref;
    }

    @Basic
    @Column(name = "BOPDESC")
    private String bopdesc;

    public String getBopdesc() {
        return bopdesc;
    }

    public void setBopdesc(String bopdesc) {
        this.bopdesc = bopdesc;
    }

    @Basic
    @Column(name = "BRN")
    private String brn;

    public String getBrn() {
        return brn;
    }

    public void setBrn(String brn) {
        this.brn = brn;
    }

    @Basic
    @Column(name = "IDN")
    private String idn;

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
        CbbtmsEntity that = (CbbtmsEntity) o;
        return Objects.equals(batchid, that.batchid) && Objects.equals(entryno, that.entryno) && Objects.equals(detailno, that.detailno) && Objects.equals(audtdate, that.audtdate) && Objects.equals(audttime, that.audttime) && Objects.equals(audtuser, that.audtuser) && Objects.equals(audtorg, that.audtorg) && Objects.equals(misccode, that.misccode) && Objects.equals(name, that.name) && Objects.equals(address1, that.address1) && Objects.equals(address2, that.address2) && Objects.equals(address3, that.address3) && Objects.equals(address4, that.address4) && Objects.equals(postcode, that.postcode) && Objects.equals(phone1, that.phone1) && Objects.equals(phone2, that.phone2) && Objects.equals(faxnumber, that.faxnumber) && Objects.equals(contact, that.contact) && Objects.equals(comments, that.comments) && Objects.equals(swkeeptot, that.swkeeptot) && Objects.equals(acctrow, that.acctrow) && Objects.equals(acctname, that.acctname) && Objects.equals(acctno, that.acctno) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(country, that.country) && Objects.equals(emailaddr, that.emailaddr) && Objects.equals(urladdr, that.urladdr) && Objects.equals(swapproved, that.swapproved) && Objects.equals(eftdesc, that.eftdesc) && Objects.equals(bankname, that.bankname) && Objects.equals(account, that.account) && Objects.equals(branch, that.branch) && Objects.equals(acctype, that.acctype) && Objects.equals(bankid, that.bankid) && Objects.equals(swiftcty, that.swiftcty) && Objects.equals(paydetl, that.paydetl) && Objects.equals(addinfo1, that.addinfo1) && Objects.equals(addinfo2, that.addinfo2) && Objects.equals(covertype, that.covertype) && Objects.equals(coverinfo, that.coverinfo) && Objects.equals(bencode, that.bencode) && Objects.equals(eitype, that.eitype) && Objects.equals(bopcatg, that.bopcatg) && Objects.equals(bopref, that.bopref) && Objects.equals(bopdesc, that.bopdesc) && Objects.equals(brn, that.brn) && Objects.equals(idn, that.idn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchid, entryno, detailno, audtdate, audttime, audtuser, audtorg, misccode, name, address1, address2, address3, address4, postcode, phone1, phone2, faxnumber, contact, comments, swkeeptot, acctrow, acctname, acctno, city, state, country, emailaddr, urladdr, swapproved, eftdesc, bankname, account, branch, acctype, bankid, swiftcty, paydetl, addinfo1, addinfo2, covertype, coverinfo, bencode, eitype, bopcatg, bopref, bopdesc, brn, idn);
    }
}
