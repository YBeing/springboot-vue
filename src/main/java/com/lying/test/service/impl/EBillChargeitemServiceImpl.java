/**
 * className:EBillChargeitemServiceImpl
 * author:Lyibing
 * date: 2019/9/9
 */
package com.lying.test.service.impl;

import com.alibaba.fastjson.JSON;
import com.lying.test.mapper.EBillChargeitemMapper;
import com.lying.test.mapper.XtChargeitemMapper;
import com.lying.test.pojo.EBillChargeitem;
import com.lying.test.pojo.XtChargeitem;
import com.lying.test.service.EBillChargeitemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class EBillChargeitemServiceImpl implements EBillChargeitemService {
    @Resource
    private EBillChargeitemMapper mapper;
    @Resource
    private XtChargeitemMapper chargeitemMapper;
    @Override
    /**
     * 获取已绑定的执收项目
     * @param bitycode
     * @return java.lang.String
     */
    public String selectByBitycode(String bitycode) {

        List<EBillChargeitem> eBillChargeitemList= mapper.selectByBitycode(bitycode);
        List<LinkedHashMap> mapList=new ArrayList<>();

        for (EBillChargeitem billChargeitem : eBillChargeitemList) {
            LinkedHashMap map=new LinkedHashMap();
            map.put("id",billChargeitem.getChargeitem().getItemcode());
            mapList.add(map);


        }
        return JSON.toJSONString(mapList);
    }
    /**
     * 获取所有的执收项目
     * @param
     * @return java.lang.String
     */
    public String getAllItem() {

        List<XtChargeitem> xtChargeitems= chargeitemMapper.list();
        List<LinkedHashMap> mapList=new ArrayList<>();

        for (XtChargeitem xtChargeitem : xtChargeitems) {
            LinkedHashMap map=new LinkedHashMap();
            map.put("id",xtChargeitem.getItemcode());
            map.put("label",xtChargeitem.getItemname());
            mapList.add(map);


        }
        return JSON.toJSONString(mapList);
    }
    public void  updateEbillChargeitem(String bitycode,String array[]){
        List<String> itemlistNew= Arrays.asList(array);
        List<EBillChargeitem> eBillChargeitemList = mapper.selectByBitycode(bitycode);
        for (EBillChargeitem eBillChargeitem : eBillChargeitemList) {
            eBillChargeitem.setItemcode(eBillChargeitem.getChargeitem().getItemcode());
        }
        String itemArray[]=eBillChargeitemList.stream().map(EBillChargeitem::getItemcode).toArray(String[]::new);
        List<String> itemlistOld= Arrays.asList(itemArray);

        for (EBillChargeitem eBillChargeitem : eBillChargeitemList) {
            if(itemlistNew.contains(eBillChargeitem.getChargeitem().getItemcode())){
                //数据库里有该条数据,但是传来的参数里也有,证明已经存在,不需要进行操作
            }else{
                //数据库里有但是传来的参数里没有,删除掉数据库的数据
                mapper.deleteByBitycodeAndItemcode(bitycode,eBillChargeitem.getChargeitem().getItemcode());
            }

        }
        for (String s : array) {
            if(itemlistOld.contains(s)){
                //数据库里有该条数据,但是传来的参数里也有,证明已经存在,不需要进行操作
            }else{
                //数据库里没有但是传来的参数里有, 数据库增加该数据
                EBillChargeitem chargeitem=new EBillChargeitem();
                chargeitem.setItemcode(s);
                chargeitem.setBitycode(bitycode);
                mapper.insert(chargeitem);
            }
        }


    }


}
