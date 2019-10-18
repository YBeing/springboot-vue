/**
 * className:ZsBillinfoServiceImpl
 * author:Lyibing
 * date: 2019/10/14
 */
package com.lying.test.service.impl;

import com.lying.test.exception.MyException;
import com.lying.test.mapper.EBillStockMapper;
import com.lying.test.mapper.XtBilltypeMapper;
import com.lying.test.mapper.ZsBillinfoDetailMapper;
import com.lying.test.mapper.ZsBillinfoMapper;
import com.lying.test.pojo.EBillStock;
import com.lying.test.pojo.XtBilltype;
import com.lying.test.pojo.ZsBillinfo;
import com.lying.test.pojo.ZsBillinfoDetail;
import com.lying.test.service.ZsBillinfoService;
import com.lying.test.utils.RedisOperaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsBillinfoServiceImpl implements ZsBillinfoService {
    @Resource
    private ZsBillinfoMapper zsmapper;
    @Resource
    private ZsBillinfoDetailMapper billinfoDetailMapper;
    @Resource
    private EBillStockMapper billStockMapper;
    @Resource
    private XtBilltypeMapper billtypeMapper;
    @Autowired
    private RedisOperaUtils operaUtils;
    public void insert(ZsBillinfo zs, List<ZsBillinfoDetail> billinfoDetails) {
        //通过查询库存表的电子票据种类编码获得当前电子票据号码
        List<EBillStock> eBillStocks = billStockMapper.selectByConditions(null, null, zs.getBilltypeno());
        XtBilltype billtype = billtypeMapper.selectByBillcode(zs.getBilltypeno());
        if (eBillStocks.size()==0){
            throw new MyException("库存不足！");
        }
        EBillStock eBillStock = eBillStocks.get(0);
        zs.setBillno(eBillStock.getStartno());
        zs.setBilltypename(billtype.getBillname());
        zsmapper.insert(zs);
        for (ZsBillinfoDetail billinfoDetail : billinfoDetails) {
            if (billinfoDetail.getItemcode()!=null ||!billinfoDetail.getItemcode().equals("")){
                billinfoDetail.setpBillid(zs.getBillid());
                billinfoDetailMapper.insert(billinfoDetail);
            }


        }

    }


}
