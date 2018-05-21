package cn.edu.ujn.bugmanagement.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

@Controller
@EnableAutoConfiguration
@RequestMapping("/bugmanagement")
public class Index {
    @RequestMapping("/index")
    public String index(){
        return "login";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }
}
