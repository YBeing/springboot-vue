package com.lying.test.pojo;

public class XtChargeitem {
    private Integer guid;

    private String itemcode;

    private String itemname;

    public XtChargeitem(Integer guid, String itemcode, String itemname) {
        this.guid = guid;
        this.itemcode = itemcode;
        this.itemname = itemname;
    }

    public XtChargeitem() {
        super();
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }
}