package com.lying.test.pojo;

public class XtMenu {
    private Integer guid;

    private String menuname;

    private String url;

    private Integer pid;

    public XtMenu(Integer guid, String menuname, String url, Integer pid) {
        this.guid = guid;
        this.menuname = menuname;
        this.url = url;
        this.pid = pid;
    }

    public XtMenu() {
        super();
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}