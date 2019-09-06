/**
 * className:XtMenuController
 * author:Lyibing
 * date: 2019/9/5
 */
package com.lying.test.controller;

import com.lying.test.pojo.XtMenu;
import com.lying.test.service.XtMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class XtMenuController {
    @Autowired
    XtMenuService service;
    /**
     * 获取单位树信息
     * @param
     * @return java.util.List<com.lying.test.pojo.User>
     */
    @RequestMapping("/getUserList")
    @ResponseBody
    public List<XtMenu> index() {

        return service.list();
    }
}
