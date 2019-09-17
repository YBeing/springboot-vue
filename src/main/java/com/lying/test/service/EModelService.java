/**
 * className:EModelService
 * author:liuyibing
 * date:2019/9/12
 */
package com.lying.test.service;

import com.lying.test.pojo.EModel;

import java.util.List;

public interface EModelService {
    int insert(EModel record);
    EModel selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(EModel record);
    int deleteByPrimaryKey(Integer id);
    List<EModel> list();
    EModel getByBitycode(String bitycode);



}
