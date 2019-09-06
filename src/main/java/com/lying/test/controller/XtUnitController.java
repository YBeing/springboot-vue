/**
 * className:XtUnitController
 * author:Lyibing
 * date: 2019/9/5
 */
package com.lying.test.controller;

import com.lying.test.pojo.XtUnit;
import com.lying.test.service.XtUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unit")
public class XtUnitController {
    @Autowired
    XtUnitService service;
    /**
     * 删除单位信息
     * @param guid
     * @return int
     */
    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
    public int deleteByPrimaryKey(Integer guid) {

        return service.deleteByPrimaryKey(guid);
    }
    /**
     * 插入单位信息
     * @param record
     * @return int
     */
    @RequestMapping("/insert")
    @ResponseBody
    public int insert(XtUnit record) {

        return service.insert(record);
    }
    /**
     * 通过id查询单位信息
     * @param guid
     * @return com.lying.test.pojo.XtUnit
     */
    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
    public XtUnit selectByPrimaryKey(Integer guid) {

        return service.selectByPrimaryKey(guid);
    }
    /**
     * 修改单位信息
     * @param record
     * @return int
     */
    @RequestMapping("/updateByPrimaryKey")
    @ResponseBody
    public int updateByPrimaryKey(XtUnit record) {

        return service.updateByPrimaryKey(record);
    }
    /**
     *  获取单位树
     * @param
     * @return java.util.List<com.lying.test.pojo.XtUnit>
     */
    @RequestMapping("/getUnitTree")
    @ResponseBody
    public String getUnitTree() {

        return service.getUnitTree();
    }
}
