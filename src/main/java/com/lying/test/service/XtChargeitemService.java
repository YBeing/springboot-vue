/**
 * className:XtChargeitemService
 * author:liuyibing
 * date:2019/9/16
 */
package com.lying.test.service;

import com.lying.test.pojo.XtChargeitem;

import java.util.List;

public interface XtChargeitemService {
    void  insertXtChargeitem(XtChargeitem chargeitem);
    void  updateSingleXtChargeitem(XtChargeitem chargeitem);
    void  deleteSingleXtChargeitem(Integer id);
    List<XtChargeitem> list();
    String getAllChargeitemSelectBox();
}
