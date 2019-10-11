/**
 * className:EBillStockServiceImpl
 * author:Lyibing
 * date: 2019/10/10
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.EBillStockMapper;
import com.lying.test.pojo.EBillStock;
import com.lying.test.service.EBillStockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EBillStockServiceImpl implements EBillStockService {
    @Resource
    private EBillStockMapper mapper;
    /**
     * 新增库存
     * @param regicode
     * @param unitcode
     * @param bitycode
     * @param count
     * @return void
     */
    public void addStock (String  regicode,String  unitcode,String bitycode,Integer count){
        //如果已经有该种票据的库存则直接在原有的基础上进行增加
        EBillStock bityTypeStock = mapper.getBityTypeStock(regicode,unitcode,bitycode);
        if (bityTypeStock!=null){
          int  finalEndNo= Integer.parseInt(bityTypeStock.getEndno())+count;
          Integer sheets=bityTypeStock.getSheets().intValue()+count;
          String endNo=finalEndNo+"";
            for (int i = endNo.length(); i <10 ; i++) {
                endNo="0"+endNo;
            }
            mapper.updatebillstock(endNo,regicode,unitcode,bitycode,sheets.longValue());

        }else {
            EBillStock eBillStock=new EBillStock();
            eBillStock.setBitycode(bitycode);
            eBillStock.setUnitcode(unitcode);
            eBillStock.setRegicode(regicode);
            eBillStock.setStartno("0000000000");
            Long sheet = count.longValue();
            eBillStock.setSheets(sheet);
            String endNo=count+"";
            for (int i = endNo.length(); i <10 ; i++) {
                endNo="0"+endNo;
            }
            eBillStock.setEndno(endNo);

            mapper.insert(eBillStock);
        }

    }
    /**
     * 开票成功后库存-1
     * @param regicode
     * @param unitcode
     * @param bitycode
     * @return void
     */
    public  void  deletestock (String  regicode,String  unitcode,String bitycode){
        mapper.deleteStock(regicode, unitcode, bitycode);
    }
    /**
     * 查询所有库存记录
     * @param
     * @return java.util.List<com.lying.test.pojo.EBillStock>
     */
    public List<EBillStock> list() {

        return mapper.list();
    }
    /**
     * 根据条件查询库存记录
     * @param regicode
     * @param unitcode
     * @param bitycode
     * @return java.util.List<com.lying.test.pojo.EBillStock>
     */
    public List<EBillStock> selectByConditions(String  regicode,String  unitcode,String bitycode){

        return   mapper.selectByConditions(regicode,unitcode,bitycode);

    }


}
