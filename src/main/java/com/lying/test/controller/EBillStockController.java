/**
 * className:EBillStockController
 * author:Lyibing
 * date: 2019/10/10
 */
package com.lying.test.controller;

import com.alibaba.fastjson.JSON;
import com.lying.test.pojo.EBillStock;
import com.lying.test.service.EBillStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stock")
public class EBillStockController {
    @Autowired
    private EBillStockService service;
    @RequestMapping("/addStock")
    public void addStock (@RequestBody String reqStr){
        Map parse = (Map) JSON.parse(reqStr);
        Map parse2=(Map) JSON.parse((String) parse.get("record"));
        String regicode = (String) parse2.get("regicode");
        String unitcode = (String) parse2.get("unitcode");
        String bitycode = (String) parse2.get("bitycode");
        Integer count    = Integer.parseInt((String) parse2.get("count")) ;
        service.addStock(regicode,unitcode,bitycode,count);
    }
    @RequestMapping("/deleteStock")
    public void deleteStock (@RequestBody String reqStr){
        Map parse = (Map) JSON.parse(reqStr);
        String regicode = (String) parse.get("regicode");
        String unitcode = (String) parse.get("unitcode");
        String bitycode = (String) parse.get("bitycode");
        service.deletestock(regicode,unitcode,bitycode);
    }
    @RequestMapping("/list")
    public List<EBillStock> list(){
        List<EBillStock> list = service.list();
        return  list;
    }
    @RequestMapping("/selectByConditions")
    public List<EBillStock> selectByConditions(@RequestBody String reqStr){
        Map parse = (Map) JSON.parse(reqStr);
        Map parse2=(Map) JSON.parse((String) parse.get("record"));
        String regicode = (String) parse2.get("regicode");
        String unitcode = (String) parse2.get("unitcode");
        String bitycode = (String) parse2.get("bitycode");
        return service.selectByConditions(regicode,unitcode,bitycode);
    }


}
