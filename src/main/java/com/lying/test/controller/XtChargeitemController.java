/**
 * className:XtChargeitemController
 * author:Lyibing
 * date: 2019/9/16
 */
package com.lying.test.controller;

import com.lying.test.pojo.XtChargeitem;
import com.lying.test.service.XtChargeitemService;
import com.lying.test.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/xtchargeitem")

public class XtChargeitemController {
    @Autowired
    private XtChargeitemService service;
    /**
     * 新增执收项目
     * @param record
     * @return void
     */
    @RequestMapping("/insertXtChargeitem")
    @ResponseBody
    public void insertXtChargeitem(@RequestBody Map record) {
        XtChargeitem chargeitem = (XtChargeitem) JsonUtils.jsonString2Bean(XtChargeitem.class, record, "record");
        service.insertXtChargeitem(chargeitem);
    }
    /**
     * 修改执收项目信息
     * @param record
     * @return void
     */
    @RequestMapping("/updateSingleXtChargeitem")
    @ResponseBody
    public void updateSingleXtChargeitem(@RequestBody Map record) {
        XtChargeitem chargeitem = (XtChargeitem) JsonUtils.jsonString2Bean(XtChargeitem.class, record, "record");
        service.updateSingleXtChargeitem(chargeitem);
    }
    /**
     * 删除执收项目
     * @param id
     * @return void
     */
    @RequestMapping("/deleteSingleXtChargeitem")
    @ResponseBody
    public void deleteSingleXtChargeitem(Integer id) {
        service.deleteSingleXtChargeitem(id);
    }
    /**
     * 查询所有执收项目信息
     * @param
     * @return void
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<XtChargeitem> list() {
        return service.list();
    }
    /**
     * 查询所有执收项目信息的下拉框
     * @param
     * @return void
     */
    @RequestMapping("/getAllChargeitemSelectBox")
    @ResponseBody
    public  String getAllChargeitemSelectBox(){
        return service.getAllChargeitemSelectBox();
    }
    
}
