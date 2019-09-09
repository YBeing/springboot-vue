package com.lying.test.pojo;

public class EBillChargeitem {
    private Integer guid;

    private String bitycode;

    private String itemcode;
    private XtChargeitem chargeitem;
    private XtBilltype billtype;

    public EBillChargeitem(Integer guid, String bitycode, String itemcode,XtChargeitem chargeitem,XtBilltype billtype) {
        this.guid = guid;
        this.bitycode = bitycode;
        this.itemcode = itemcode;
        this.chargeitem=chargeitem;
        this.billtype=billtype;
    }

    public EBillChargeitem() {
        super();
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getBitycode() {
        return bitycode;
    }

    public void setBitycode(String bitycode) {
        this.bitycode = bitycode == null ? null : bitycode.trim();
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public XtChargeitem getChargeitem() {
        return chargeitem;
    }

    public void setChargeitem(XtChargeitem chargeitem) {
        this.chargeitem = chargeitem;
    }

    public XtBilltype getBilltype() {
        return billtype;
    }

    public void setBilltype(XtBilltype billtype) {
        this.billtype = billtype;
    }
}