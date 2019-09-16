/**
 * className:XtChargeitemController
 * author:Lyibing
 * date: 2019/9/16
 */
package com.lying.test.controller;

import com.lying.test.pojo.XtChargeitem;
import com.lying.test.service.XtChargeitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xtchargeitem")

public class XtChargeitemController {
    @Autowired
    private XtChargeitemService service;
    /**
     * 新增执收项目
     * @param chargeitem
     * @return void
     */
    @RequestMapping("/insertXtChargeitem")
    @ResponseBody
    public void insertXtChargeitem(XtChargeitem chargeitem) {

        service.insertXtChargeitem(chargeitem);
    }
    /**
     * 修改执收项目信息
     * @param chargeitem
     * @return void
     */
    @RequestMapping("/updateSingleXtChargeitem")
    @ResponseBody
    public void updateSingleXtChargeitem(XtChargeitem chargeitem) {
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
    public void list() {
        service.list();
    }
    
}
