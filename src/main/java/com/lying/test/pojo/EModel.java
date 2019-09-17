package com.lying.test.pojo;

public class EModel {
    private Integer modelid;

    private String bitycode;

    private String modelversion;

    private String modelurl;

    private String modelstartdate;

    private String modelenddate;

    public EModel(Integer modelid, String bitycode, String modelversion, String modelurl, String modelstartdate, String modelenddate) {
        this.modelid = modelid;
        this.bitycode = bitycode;
        this.modelversion = modelversion;
        this.modelurl = modelurl;
        this.modelstartdate = modelstartdate;
        this.modelenddate = modelenddate;
    }

    public EModel() {
        super();
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public String getBitycode() {
        return bitycode;
    }

    public void setBitycode(String bitycode) {
        this.bitycode = bitycode == null ? null : bitycode.trim();
    }

    public String getModelversion() {
        return modelversion;
    }

    public void setModelversion(String modelversion) {
        this.modelversion = modelversion == null ? null : modelversion.trim();
    }

    public String getModelurl() {
        return modelurl;
    }

    public void setModelurl(String modelurl) {
        this.modelurl = modelurl == null ? null : modelurl.trim();
    }

    public String getModelstartdate() {
        return modelstartdate;
    }

    public void setModelstartdate(String modelstartdate) {
        this.modelstartdate = modelstartdate;
    }

    public String getModelenddate() {
        return modelenddate;
    }

    public void setModelenddate(String modelenddate) {
        this.modelenddate = modelenddate;
    }
}