/**
 * className:XtBillTypeServiceImpl
 * author:Lyibing
 * date: 2019/9/12
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.XtBilltypeMapper;
import com.lying.test.pojo.XtBilltype;
import com.lying.test.service.XtBillTypeService;
import com.lying.test.utils.RedisOperaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service

public class XtBillTypeServiceImpl implements XtBillTypeService {
    @Resource
    private XtBilltypeMapper mapper;
    @Autowired
    protected RedisTemplate redisTemplate;
    @Autowired
    private RedisOperaUtils operaUtils;
    @Override
    public int insert(XtBilltype record) {
        //查询所有的电子票据种类,在进行插入操作后把所有票据种类信息放入到redis缓存中
        //如果redis已有存在的key值,则删掉更新最新的
        List bitycodeList =  operaUtils.ReadMapWithExpire("bitycodeList",0l,-1l);
        if(redisTemplate.hasKey("bitycodeList")){
            operaUtils.deleteBykey("bitycodeList");
        }
        List<XtBilltype> xtBilltypes = mapper.list();
        List billtypeCodes=new ArrayList();
        for (XtBilltype xtBilltype : xtBilltypes) {
            billtypeCodes.add(xtBilltype.getBillcode());
        }
        billtypeCodes.add(record.getBillcode());
        operaUtils.setListWithoutExpire("bitycodeList",billtypeCodes);
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
