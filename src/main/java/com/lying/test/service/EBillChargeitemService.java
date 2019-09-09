/**
 * className:EBillChargeitemService
 * author:liuyibing
 * date:2019/9/9
 */
package com.lying.test.service;

public interface EBillChargeitemService {
    String selectByBitycode(String bitycode);
    String getAllItem();
    void  updateEbillChargeitem(String bitycode,String array[]);

}
