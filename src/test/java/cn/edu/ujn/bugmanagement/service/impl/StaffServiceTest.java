package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.pojo.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StaffServiceTest {
    @Autowired
    private StaffService staffService;
    @Test
    public void selectBySelective() {
        Staff staff = new Staff();
        staff.setBranch_id(1);
        staff.setStaff_name("陈谷");
        List<Staff> staffList = new ArrayList<Staff>();
        staffList = staffService.selectBySelective(staff);

        if(staffList.isEmpty())
            System.out.println("没查到");

        for (Staff eveStaff:staffList
             ) {
            System.out.println(eveStaff.getAddress());
        }
    }
}