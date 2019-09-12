/**
 * className:XtBillTypeServiceImpl
 * author:Lyibing
 * date: 2019/9/12
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.XtBilltypeMapper;
import com.lying.test.pojo.XtBilltype;
import com.lying.test.service.XtBillTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class XtBillTypeServiceImpl implements XtBillTypeService {
    @Resource
    private XtBilltypeMapper mapper;
    @Override
    public int insert(XtBilltype record) {
        return mapper.insert(record);
    }

    @Override
    public XtBilltype selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(XtBilltype record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public XtBilltype selectByBillcode(String billcode) {
        return mapper.selectByBillcode(billcode);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<XtBilltype> list() {
        return mapper.list();
    }
}
