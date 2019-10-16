/**
 * className:ZsBillinfoServiceImpl
 * author:Lyibing
 * date: 2019/10/14
 */
package com.lying.test.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.lying.test.mapper.ZsBillinfoMapper;
import com.lying.test.pojo.ZsBillinfo;
import com.lying.test.pojo.ZsBillinfoDetail;
import com.lying.test.service.ZsBillinfoService;
import com.lying.test.utils.RedisOperaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class ZsBillinfoServiceImpl implements ZsBillinfoService {
    @Resource
    private ZsBillinfoMapper mapper;
    @Autowired
    private RedisOperaUtils operaUtils;
    public int insert(ZsBillinfo record, ZsBillinfoDetail record2) {
        Map map = (Map)JSONObject.toJSON(record2);
        operaUtils.setMapWithoutExpire(record.getBillno(),map);
        return   mapper.insert(record);
    }
}
