package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.pojo.Login;
import cn.edu.ujn.bugmanagement.pojo.LoginExtends;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

//@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest //2.0取消了这个注解：@SpringApplicationConfiguration(classes = Application.class)
//@Transactional
public class LoginServiceTest {
    @Autowired
    LoginService loginService;

    @Test
    public void selectByLogin() {
        Login login = new Login();
        login.setStaff_password("sc123");
        login.setStaff_id(3333);
        Login result = loginService.selectByLogin(login);
        System.out.println(result.getId());
    }

    @Test
    public void selectByIdAndPwd() {
        Login login = new Login();
        login.setStaff_password("sc123");
        login.setStaff_id(3333);
        LoginExtends loginExtends = loginService.selectByIdAndPwd(login);
        System.out.println(loginExtends.getStaff().getStaff_name());
    }

    @Test
    public void insert() {
        Login login = new Login();
        login.setStaff_id(3334);
        Login loginResult = loginService.insert(login);
        System.out.println(loginResult.getId() +" staff_id: "+ loginResult.getStaff_id() );
    }
}