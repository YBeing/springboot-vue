/**
 * className:EBillStockService
 * author:liuyibing
 * date:2019/10/10
 */
package com.lying.test.service;

public interface EBillStockService {
    public void addStock (String  regicode,String  unitcode,String bitycode,Integer count);
    public  void  deletestock (String  regicode,String  unitcode,String bitycode);
}
