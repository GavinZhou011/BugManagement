package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.pojo.Login;
import cn.edu.ujn.bugmanagement.pojo.LoginExtends;

public interface LoginService {
    public Login selectByLogin(Login login);
    public LoginExtends selectByIdAndPwd(Login login);
    public Login insert(Login login);
}
