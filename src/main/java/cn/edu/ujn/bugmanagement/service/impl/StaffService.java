package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.pojo.Staff;

import java.util.List;

public interface StaffService {
    public List<Staff> selectBySelective( Staff staff);
}
