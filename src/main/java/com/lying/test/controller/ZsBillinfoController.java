/**
 * className:ZsBillinfoController
 * author:Lyibing
 * date: 2019/10/16
 */
package com.lying.test.controller;
import com.lying.test.service.ZsBillinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RequestMapping("/zsbillinfo")
@RestController
public class ZsBillinfoController {
    @Autowired
    private ZsBillinfoService service;
    @RequestMapping("/makebill")

    public void makebill(@RequestBody Map record) {
        Map newmap=record;

    }
}
