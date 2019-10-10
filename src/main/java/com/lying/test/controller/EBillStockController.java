/**
 * className:EBillStockController
 * author:Lyibing
 * date: 2019/10/10
 */
package com.lying.test.controller;

import com.alibaba.fastjson.JSON;
import com.lying.test.service.EBillStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/stock")
public class EBillStockController {
    @Autowired
    private EBillStockService service;
    @RequestMapping("/addStock")
    @ResponseBody
    public void addStock (@RequestBody String reqStr){
        Map parse = (Map) JSON.parse(reqStr);
        String regicode = (String) parse.get("regicode");
        String unitcode = (String) parse.get("unitcode");
        String bitycode = (String) parse.get("bitycode");
        Integer count    = (Integer) parse.get("count");
        service.addStock(regicode,unitcode,bitycode,count);
    }
    @RequestMapping("/deleteStock")
    @ResponseBody
    public void deleteStock (@RequestBody String reqStr){
        Map parse = (Map) JSON.parse(reqStr);
        String regicode = (String) parse.get("regicode");
        String unitcode = (String) parse.get("unitcode");
        String bitycode = (String) parse.get("bitycode");
        service.deletestock(regicode,unitcode,bitycode);
    }
}
