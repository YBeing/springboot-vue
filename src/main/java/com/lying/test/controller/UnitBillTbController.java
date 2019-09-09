/**
 * className:UnitBillTbController
 * author:Lyibing
 * date: 2019/9/9
 */
package com.lying.test.controller;

import com.alibaba.fastjson.JSON;
import com.lying.test.pojo.UnitBillTb;
import com.lying.test.service.UnitBillTbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/unitbilltb")

public class UnitBillTbController {
    @Autowired
    private UnitBillTbService service;
    @RequestMapping("/getByUnitcode")
    @ResponseBody
    public  List<UnitBillTb> getByUnitcode(@RequestBody String unitcode){
        Map parse = (Map) JSON.parse(unitcode);
        String unitcode1 =(String) parse.get("unitcode");
        List<UnitBillTb> byUnitcode = service.getByUnitcode(unitcode1);
        return byUnitcode;
    }

}
