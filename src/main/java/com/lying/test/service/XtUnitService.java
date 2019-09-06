/**
 * className:XtUnitService
 * author:liuyibing
 * date:2019/9/5
 */
package com.lying.test.service;

import com.lying.test.pojo.XtUnit;

import java.util.List;

public interface XtUnitService {
    int deleteByPrimaryKey(Integer guid);
    int insert(XtUnit record);
    XtUnit selectByPrimaryKey(Integer guid);
    int updateByPrimaryKey(XtUnit record);
    List<XtUnit> getUnitTree();

}
