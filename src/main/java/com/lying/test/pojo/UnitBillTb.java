package com.lying.test.pojo;

public class UnitBillTb {
    private Integer guid;

    private String unitcode;

    private String billcode;
    private XtBilltype billtype;



    public UnitBillTb(Integer guid, String unitcode, String billcode,XtBilltype billtype) {
        this.guid = guid;
        this.unitcode = unitcode;
        this.billcode = billcode;
        this.billtype = billtype;
    }

    public UnitBillTb() {
        super();
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode == null ? null : unitcode.trim();
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    public XtBilltype getBilltype() {
        return billtype;
    }

    public void setBilltype(XtBilltype billtype) {
        this.billtype = billtype;
    }
}