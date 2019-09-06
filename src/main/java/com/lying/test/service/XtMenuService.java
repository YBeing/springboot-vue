/**
 * className:XtMenuService
 * author:liuyibing
 * date:2019/9/5
 */
package com.lying.test.service;

import com.lying.test.pojo.XtMenu;

import java.util.List;

public interface XtMenuService {
    int deleteByPrimaryKey(Integer guid);
    int insert(XtMenu record);
    XtMenu selectByPrimaryKey(Integer guid);
    int updateByPrimaryKey(XtMenu record);
    List<XtMenu> list();

}
