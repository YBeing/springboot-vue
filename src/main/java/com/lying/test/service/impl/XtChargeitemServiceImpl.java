/**
 * className:XtChargeitemServiceImpl
 * author:Lyibing
 * date: 2019/9/16
 */
package com.lying.test.service.impl;

import com.alibaba.fastjson.JSON;
import com.lying.test.mapper.XtChargeitemMapper;
import com.lying.test.pojo.XtChargeitem;
import com.lying.test.service.XtChargeitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class XtChargeitemServiceImpl implements XtChargeitemService {
    @Resource
    private XtChargeitemMapper mapper;
    /**
     * 新增执收项目
     * @param chargeitem
     * @return void
     */
    @Override
    public void insertXtChargeitem(XtChargeitem chargeitem) {

        mapper.insert(chargeitem);
    }
    /**
     * 修改执收项目信息
     * @param chargeitem
     * @return void
     */
    @Override
    public void updateSingleXtChargeitem(XtChargeitem chargeitem) {
        mapper.updateByPrimaryKey(chargeitem);
    }
    /**
     * 删除执收项目
     * @param id
     * @return void
     */
    @Override
    public void deleteSingleXtChargeitem(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
    /**
     * 查询所有执收项目信息
     * @param
     * @return void
     */
    @Override
    public List<XtChargeitem> list() {
        return  mapper.list();
    }
    /**
     * 查询所有执收项目信息的下拉框
     * @param
     * @return void
     */
    @Override
    public String getAllChargeitemSelectBox() {
        List<XtChargeitem> list=mapper.list();
        List<LinkedHashMap> mapList=new ArrayList<>();
        for (XtChargeitem chargeitem : list) {
            LinkedHashMap map2=new LinkedHashMap();
            map2.put("value",chargeitem.getItemcode());
            map2.put("label",chargeitem.getItemname());
            mapList.add(map2);
        }
        String jsonString= JSON.toJSONString(mapList);
        return jsonString;
    }
}
