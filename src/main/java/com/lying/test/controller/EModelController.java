/**
 * className:EModelController
 * author:Lyibing
 * date: 2019/9/12
 */
package com.lying.test.controller;

import com.lying.test.pojo.EModel;
import com.lying.test.service.EModelService;
import com.lying.test.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emodel")
public class EModelController {
    @Autowired
    EModelService service;
    @RequestMapping("/insert")
    public int insert(@RequestBody Map record) {

        EModel eModel = (EModel) JsonUtils.jsonString2Bean(EModel.class, record, "record");

        return service.insert(eModel);
    }
    @RequestMapping("/upload")
    public void upload(@RequestParam("file") MultipartFile file) {
        String filePaths="c:/uploadFile/dzpj/modelinfo";  //测试环境下
//      String filePaths="/usr/local/uploadfiles";         //Linux环境下
        if (!file.isEmpty()) {
            try {
                File dir = new File(filePaths + File.separator);
                if (!dir.exists())
                    dir.mkdirs();
                // 写文件到服务器
                File serverFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
                file.transferTo(serverFile);
            } catch (Exception e) {
            }
        }

    }


    @RequestMapping("/selectByPrimaryKey")
    public EModel selectByPrimaryKey(Integer id) {
        return service.selectByPrimaryKey(id);
    }

    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody Map record) {
        EModel eModel = (EModel) JsonUtils.jsonString2Bean(EModel.class, record, "record");
        return service.updateByPrimaryKey(eModel);
    }


    @RequestMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id) {
        return service.deleteByPrimaryKey(id);
    }
    @RequestMapping("/list")
    public List<EModel> list() {
        return service.list();
    }
    @RequestMapping("/getByBitycode")
    public String getByBitycode(String bitycode) {
        EModel byBitycode = service.getByBitycode(bitycode);
        if(byBitycode!=null){
            return "该票据种类已绑定,请重新输入";
        }
        return "";
    }

}
