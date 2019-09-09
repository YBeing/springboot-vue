/**
 * className:UnitBillTbService
 * author:liuyibing
 * date:2019/9/9
 */
package com.lying.test.service;

import com.lying.test.pojo.UnitBillTb;

import java.util.List;

public interface UnitBillTbService {
    List<UnitBillTb> getByUnitcode(String unitcode);

}
