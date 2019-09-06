package com.lying.test.pojo;

public class XtUnit {
    private Integer guid;

    private String unitcode;

    private String unitname;

    private Integer pid;

    public XtUnit(Integer guid, String unitcode, String unitname, Integer pid) {
        this.guid = guid;
        this.unitcode = unitcode;
        this.unitname = unitname;
        this.pid = pid;
    }

    public XtUnit() {
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

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}