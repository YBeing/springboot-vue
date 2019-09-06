package com.lying.test.pojo;

public class UnitBillTb {
    private Integer guid;

    private String unitcode;

    private String billcode;

    public UnitBillTb(Integer guid, String unitcode, String billcode) {
        this.guid = guid;
        this.unitcode = unitcode;
        this.billcode = billcode;
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
}