/**
 * className:XtUnitService
 * author:liuyibing
 * date:2019/9/5
 */
package com.lying.test.service;

import com.lying.test.pojo.XtUnit;

public interface XtUnitService {
    int deleteByPrimaryKey(Integer guid);
    int insert(XtUnit record);
    XtUnit selectByPrimaryKey(Integer guid);
    int updateByPrimaryKey(XtUnit record);
    String getUnitTree();
    String getAllUnit();


}
