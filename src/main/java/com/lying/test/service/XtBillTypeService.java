/**
 * className:XtBillTypeService
 * author:liuyibing
 * date:2019/9/12
 */
package com.lying.test.service;

import com.lying.test.pojo.XtBilltype;

import java.util.List;

public interface XtBillTypeService {
    int insert(XtBilltype record);
    XtBilltype selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(XtBilltype record);
    XtBilltype selectByBillcode(String billcode);
    int deleteByPrimaryKey(Integer id);
    List<XtBilltype> list();
    String getSelectBox();


}
