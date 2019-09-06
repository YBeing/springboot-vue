/**
 * className:XtMenuServiceImpl
 * author:Lyibing
 * date: 2019/9/5
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.XtMenuMapper;
import com.lying.test.pojo.XtMenu;
import com.lying.test.service.XtMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XtMenuServiceImpl implements XtMenuService {
    @Resource
    private XtMenuMapper mapper;
    public int deleteByPrimaryKey(Integer guid){
        return mapper.deleteByPrimaryKey(guid);
    }
    public int insert(XtMenu record){
        return mapper.insert(record);

    }
    public XtMenu selectByPrimaryKey(Integer guid){
        return mapper.selectByPrimaryKey(guid);
    }
    public int updateByPrimaryKey(XtMenu record){
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<XtMenu> list() {
        return mapper.list();
    }
}
