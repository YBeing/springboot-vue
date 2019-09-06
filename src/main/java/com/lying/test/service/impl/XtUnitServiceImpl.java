/**
 * className:XtUnitServiceImpl
 * author:Lyibing
 * date: 2019/9/5
 */
package com.lying.test.service.impl;

import com.lying.test.mapper.XtUnitMapper;
import com.lying.test.pojo.XtUnit;
import com.lying.test.service.XtUnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class XtUnitServiceImpl implements XtUnitService {
    @Resource
    private XtUnitMapper mapper;
    /**
     * 删除单位信息
     * @param guid
     * @return int
     */
    @Override
    public int deleteByPrimaryKey(Integer guid) {

        return mapper.deleteByPrimaryKey(guid);
    }
    /**
     * 插入单位信息
     * @param record
     * @return int
     */
    @Override
    public int insert(XtUnit record) {

        return mapper.insert(record);
    }
    /**
     * 通过id查询单位信息
     * @param guid
     * @return com.lying.test.pojo.XtUnit
     */
    @Override
    public XtUnit selectByPrimaryKey(Integer guid) {

        return mapper.selectByPrimaryKey(guid);
    }
    /**
     * 修改单位信息
     * @param record
     * @return int
     */
    @Override
    public int updateByPrimaryKey(XtUnit record) {

        return mapper.updateByPrimaryKey(record);
    }
    /**
     *  获取单位树
     * @param
     * @return java.util.List<com.lying.test.pojo.XtUnit>
     */
    @Override
    public List<XtUnit> getUnitTree() {
        List<XtUnit> list=mapper.getListBypid(0);
        LinkedHashMap map=new LinkedHashMap();
        List<LinkedHashMap> mapList=new ArrayList<>();
        for (XtUnit xtUnit : list) {
            LinkedHashMap map2=new LinkedHashMap();
            map2.put("label",xtUnit.getUnitname());
            List<XtUnit> childrenlist=mapper.getListBypid(xtUnit.getPid());
            for (XtUnit unit : childrenlist) {
                LinkedHashMap map1=new LinkedHashMap();

            }
        }
        return null;
    }
}
