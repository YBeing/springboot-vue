/**
 * className:ZsBillinfoServiceImpl
 * author:Lyibing
 * date: 2019/10/14
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.ZsBillinfoMapper;
import com.lying.test.pojo.ZsBillinfo;
import com.lying.test.service.ZsBillinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ZsBillinfoServiceImpl implements ZsBillinfoService {
    @Resource
    private ZsBillinfoMapper mapper;

    @Override
    public int insert(ZsBillinfo record) {

      return   mapper.insert(record);
    }
}
