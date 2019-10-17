/**
 * className:ZsBillinfoServiceImpl
 * author:Lyibing
 * date: 2019/10/14
 */
package com.lying.test.service.impl;
import com.lying.test.mapper.ZsBillinfoDetailMapper;
import com.lying.test.mapper.ZsBillinfoMapper;
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
    @Autowired
    private RedisOperaUtils operaUtils;
    public void insert(ZsBillinfo zs, List<ZsBillinfoDetail> billinfoDetails) {
        zsmapper.insert(zs);
        for (ZsBillinfoDetail billinfoDetail : billinfoDetails) {
            if (billinfoDetail.getItemcode()!=null ||!billinfoDetail.getItemcode().equals("")){
                billinfoDetail.setpBillid(zs.getBillid());
                billinfoDetailMapper.insert(billinfoDetail);
            }


        }

    }
}
