package com.lying.test.pojo;

import java.util.Date;

public class XtBilltype {
    private Integer id;

    private String billcode;

    private String billname;

    private String isdzpj;

    private Date startdate;

    private Date enddate;

    public XtBilltype(Integer id, String billcode, String billname, String isdzpj, Date startdate, Date enddate) {
        this.id = id;
        this.billcode = billcode;
        this.billname = billname;
        this.isdzpj = isdzpj;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public XtBilltype() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    public String getBillname() {
        return billname;
    }

    public void setBillname(String billname) {
        this.billname = billname == null ? null : billname.trim();
    }

    public String getIsdzpj() {
        return isdzpj;
    }

    public void setIsdzpj(String isdzpj) {
        this.isdzpj = isdzpj == null ? null : isdzpj.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}