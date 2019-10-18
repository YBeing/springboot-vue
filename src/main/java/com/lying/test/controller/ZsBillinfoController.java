/**
 * className:ZsBillinfoController
 * author:Lyibing
 * date: 2019/10/16
 */
package com.lying.test.controller;
import com.alibaba.fastjson.JSONObject;
import com.lying.test.pojo.ZsBillinfo;
import com.lying.test.pojo.ZsBillinfoDetail;
import com.lying.test.service.ZsBillinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/zsbillinfo")
@RestController
public class ZsBillinfoController {
    @Autowired
    private ZsBillinfoService service;
    @RequestMapping("/makebill")
    public void makebill(@RequestBody Map record) {
        ZsBillinfo zs=new ZsBillinfo();
        if(record.get("unitcode")!=null){
           String unitcode=(String) record.get("unitcode");
           zs.setUnitcode(unitcode);
        }
        if(record.get("checker")!=null){
           String checker=(String) record.get("checker");
           zs.setMakeplayer(checker);
        }
        if(record.get("billcode")!=null){
           String billcode=(String) record.get("billcode");
           zs.setBilltypeno(billcode);
        }
        if(record.get("payer")!=null){
           String payer=(String) record.get("payer");
           zs.setPayername(payer);
        }
        if(record.get("email")!=null){
           String email=(String) record.get("email");
           zs.setEmail(email);
        }
        if(record.get("tel")!=null){
           String tel=(String) record.get("tel");
           zs.setTel(tel);
        }
        if(record.get("payerType")!=null){
           String payerType=(String) record.get("payerType");
           zs.setPayerkind(payerType);
        }
        if(record.get("total")!=null){
           String total=(String) record.get("total");
           zs.setTotalmoney(total);
        }
        if(record.get("remark")!=null){
           String remark=(String) record.get("remark");
           zs.setRemark(remark);
        }
        zs.setMakedate(new Date());
        List<ZsBillinfoDetail> billinfoDetails=new ArrayList<>();
        String mapStr = JSONObject.toJSONString(record);
        for (int i = 1; i <6 ; i++) {
            ZsBillinfoDetail billinfoDetail=new ZsBillinfoDetail();
            String chargeitemkey="chargeitemcode"+i;
            String chargeitemvalue=(String) record.get(chargeitemkey);
            String untikey="unit"+i;
            String untivalue=(String) record.get(untikey);
            String countkey="count"+i;
            String countvalue=(String) record.get(countkey);
            String pricekey="price"+i;
            String pricevalue=(String) record.get(pricekey);
            String moneykey="money"+i;
            String moneyvalue=(String) record.get(moneykey);
            if (countvalue!=null && !countvalue.equals("")){
                billinfoDetail.setCount(Integer.parseInt(countvalue));
            }
            billinfoDetail.setItemcode(chargeitemvalue);
            billinfoDetail.setMoney(moneyvalue);
            if (pricevalue!=null && !pricevalue.equals("")){
                BigDecimal price=new BigDecimal(pricevalue);
                billinfoDetail.setPrice(price);
            }
            billinfoDetail.setUnitcode(untivalue);
            billinfoDetails.add(billinfoDetail);
        }
        System.out.println(1);
        service.insert(zs,billinfoDetails);

    }
}
