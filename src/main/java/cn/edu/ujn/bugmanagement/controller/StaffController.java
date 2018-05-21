package cn.edu.ujn.bugmanagement.controller;

import cn.edu.ujn.bugmanagement.pojo.Login;
import cn.edu.ujn.bugmanagement.pojo.LoginExtends;
import cn.edu.ujn.bugmanagement.service.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bugmanagement")
public class StaffController {
    @Autowired
    LoginService loginService;


    @RequestMapping("/login")
    public String login(@ModelAttribute("login") Login login, Model model){
        LoginExtends loginExtends=loginService.selectByIdAndPwd(login);
        if(loginExtends == null){
            String message = "账号或密码错误！";
            model.addAttribute ("staff_id",login.getStaff_id());
            model.addAttribute ("message",message);
            return "login";
        }
        return "main";
    }
}
