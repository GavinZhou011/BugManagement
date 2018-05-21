package cn.edu.ujn.bugmanagement.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/debug")
public class FileUrl {
    @RequestMapping("/getUrl")
    @ResponseBody
    public String getFileUrl(){
        return System.getProperty("user.dir");
    }

}
