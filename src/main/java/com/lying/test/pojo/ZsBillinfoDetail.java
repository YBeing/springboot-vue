package com.lying.test.pojo;

import java.math.BigDecimal;

public class ZsBillinfoDetail {
    private Integer guid;

    private Integer pBillid;

    private String itemcode;

    private String unitcode;

    private Integer count;

    private BigDecimal price;

    private String money;

    public ZsBillinfoDetail(Integer guid, Integer pBillid, String itemcode, String unitcode, Integer count, BigDecimal price, String money) {
        this.guid = guid;
        this.pBillid = pBillid;
        this.itemcode = itemcode;
        this.unitcode = unitcode;
        this.count = count;
        this.price = price;
        this.money = money;
    }

    public ZsBillinfoDetail() {
        super();
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public Integer getpBillid() {
        return pBillid;
    }

    public void setpBillid(Integer pBillid) {
        this.pBillid = pBillid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode == null ? null : unitcode.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }
}