/**
 * className:XtChargeitemService
 * author:liuyibing
 * date:2019/9/16
 */
package com.lying.test.service;

import com.lying.test.pojo.XtChargeitem;

public interface XtChargeitemService {
    void  insertXtChargeitem(XtChargeitem chargeitem);
    void  updateSingleXtChargeitem(XtChargeitem chargeitem);
    void  deleteSingleXtChargeitem(Integer id);
    void  list();
}
