package com.lying.test.pojo;

import java.util.Date;

public class ZsBillinfo {
    private Integer billid;

    private String billno;

    private String billtypeno;

    private String billtypename;

    private Date makedate;

    private String makeplayer;

    public ZsBillinfo(Integer billid, String billno, String billtypeno, String billtypename, Date makedate, String makeplayer) {
        this.billid = billid;
        this.billno = billno;
        this.billtypeno = billtypeno;
        this.billtypename = billtypename;
        this.makedate = makedate;
        this.makeplayer = makeplayer;
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
}