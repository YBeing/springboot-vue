/**
 * className:XtBillTypeController
 * author:Lyibing
 * date: 2019/9/12
 */
package com.lying.test.controller;

import com.lying.test.pojo.XtBilltype;
import com.lying.test.service.XtBillTypeService;
import com.lying.test.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/billtype")
public class XtBillTypeController {
    @Autowired
    XtBillTypeService service;
    @RequestMapping("/insert")
    @ResponseBody
    public int insert(@RequestBody Map record) {
        XtBilltype billtype = (XtBilltype) JsonUtils.jsonString2Bean(XtBilltype.class, record, "record");

        return service.insert(billtype);
    }

    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
    public XtBilltype selectByPrimaryKey(Integer id) {
        return service.selectByPrimaryKey(id);
    }

    @RequestMapping("/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(@RequestBody Map record) {
        XtBilltype billtype = (XtBilltype) JsonUtils.jsonString2Bean(XtBilltype.class, record, "record");
        return service.updateByPrimaryKey(billtype);
    }

    @RequestMapping("/selectByBillcode")
    @ResponseBody
    public XtBilltype selectByBillcode(String billcode) {
        return service.selectByBillcode(billcode);
    }

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(Integer id) {
        return service.deleteByPrimaryKey(id);
    }
    @RequestMapping("/list")
    @ResponseBody
    public List<XtBilltype> list() {
        return service.list();
    }
    @RequestMapping("/getSelectBox")
    @ResponseBody
    public String getSelectBox(){
        return service.getSelectBox();
    }
    
}
