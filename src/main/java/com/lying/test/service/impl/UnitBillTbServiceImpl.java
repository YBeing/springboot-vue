/**
 * className:UnitBillTbServiceImpl
 * author:Lyibing
 * date: 2019/9/9
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.UnitBillTbMapper;
import com.lying.test.pojo.UnitBillTb;
import com.lying.test.service.UnitBillTbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UnitBillTbServiceImpl implements UnitBillTbService {
    @Resource
    UnitBillTbMapper mapper;
    @Override
    public List<UnitBillTb> getByUnitcode(String unitcode) {
        return mapper.getByUnitcode(unitcode);
    }
}
