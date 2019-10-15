package com.lying.test.pojo;

import java.util.Date;

public class ZsBillinfo {
    private Integer billid;

    private String billno;

    private String billtypeno;

    private String billtypename;

    private Date makedate;

    private String makeplayer;

    private String unitcode;

    private String payername;

    private String tel;

    private String idcard;

    private String email;

    private String payerkind;

    private String totalmoney;

    private String remark;

    public ZsBillinfo(Integer billid, String billno, String billtypeno, String billtypename, Date makedate, String makeplayer, String unitcode, String payername, String tel, String idcard, String email, String payerkind, String totalmoney, String remark) {
        this.billid = billid;
        this.billno = billno;
        this.billtypeno = billtypeno;
        this.billtypename = billtypename;
        this.makedate = makedate;
        this.makeplayer = makeplayer;
        this.unitcode = unitcode;
        this.payername = payername;
        this.tel = tel;
        this.idcard = idcard;
        this.email = email;
        this.payerkind = payerkind;
        this.totalmoney = totalmoney;
        this.remark = remark;
    }

    public ZsBillinfo() {
        super();
    }

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getBilltypeno() {
        return billtypeno;
    }

    public void setBilltypeno(String billtypeno) {
        this.billtypeno = billtypeno == null ? null : billtypeno.trim();
    }

    public String getBilltypename() {
        return billtypename;
    }

    public void setBilltypename(String billtypename) {
        this.billtypename = billtypename == null ? null : billtypename.trim();
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getMakeplayer() {
        return makeplayer;
    }

    public void setMakeplayer(String makeplayer) {
        this.makeplayer = makeplayer == null ? null : makeplayer.trim();
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode == null ? null : unitcode.trim();
    }

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername == null ? null : payername.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPayerkind() {
        return payerkind;
    }

    public void setPayerkind(String payerkind) {
        this.payerkind = payerkind == null ? null : payerkind.trim();
    }

    public String getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(String totalmoney) {
        this.totalmoney = totalmoney == null ? null : totalmoney.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}