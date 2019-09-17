/**
 * className:EModelServiceImpl
 * author:Lyibing
 * date: 2019/9/12
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.EModelMapper;
import com.lying.test.pojo.EModel;
import com.lying.test.service.EModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service

public class EModelServiceImpl implements EModelService {
    @Resource
    private EModelMapper mapper;
    @Override
    public int insert(EModel record) {
        return mapper.insert(record);
    }

    @Override
    public EModel selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(EModel record) {
        return mapper.updateByPrimaryKey(record);
    }


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<EModel> list() {
        return mapper.list();
    }

    @Override
    public EModel getByBitycode(String bitycode) {
        return mapper.getByBitycode(bitycode);
    }
}
