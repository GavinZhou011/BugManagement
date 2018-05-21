package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.mapper.StaffMapper;
import cn.edu.ujn.bugmanagement.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> selectBySelective(Staff staff) {

        return staffMapper.selectByStaff(staff);
    }
}

