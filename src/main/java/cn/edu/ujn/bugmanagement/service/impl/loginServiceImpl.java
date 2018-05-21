package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.mapper.LoginMapper;
import cn.edu.ujn.bugmanagement.pojo.Login;
import cn.edu.ujn.bugmanagement.pojo.LoginExtends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class loginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Login selectByLogin(Login login){

        return loginMapper.selectByIdAndPassword(login);
    }

    @Override
    public LoginExtends selectByIdAndPwd(Login login) {

        return loginMapper.selectByExtend(login);
    }

    @Override
    public Login insert(Login login) {
        loginMapper.insert(login);
        return login;
    }
}
