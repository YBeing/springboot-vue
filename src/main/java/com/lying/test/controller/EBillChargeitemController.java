/**
 * className:EBillChargeitemController
 * author:Lyibing
 * date: 2019/9/9
 */
package com.lying.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lying.test.service.EBillChargeitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/billchargeitem")
public class EBillChargeitemController {
    @Autowired
    private EBillChargeitemService service;
    @RequestMapping("/selectByBitycode")
    @ResponseBody
    public String selectByBitycode(@RequestBody String bitycode) {
        Map parse = (Map) JSON.parse(bitycode);
        String bitycode1 =(String) parse.get("bitycode");
        return   service.selectByBitycode(bitycode1);
    }
    @RequestMapping("/getAllItem")
    @ResponseBody
    public String getAllItem() {

        return service.getAllItem();
    }
    @RequestMapping("/updateEbillChargeitem")
    @ResponseBody
    public void  updateEbillChargeitem(@RequestBody String reqStr){
        Map parse = (Map) JSON.parse(reqStr);
        String bitycode =(String) parse.get("bitycode");
        JSONArray itemArray=(JSONArray) parse.get("itemArray");
        String [] itemArrayStr = new String[itemArray.size()];
        for (int i = 0; i < itemArray.size(); i++) {
            String itemcode = (String) itemArray.get(i);
            itemArrayStr[i]=itemcode;
        }
        service.updateEbillChargeitem(bitycode,itemArrayStr);

    }

}
