package com.lying.test.pojo;

public class XtBilltype {
    private Integer id;

    private String billcode;

    private String billname;

    private String isdzpj;

    private String startdate;

    private String enddate;

    public XtBilltype(Integer id, String billcode, String billname, String isdzpj, String startdate, String enddate) {
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

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}