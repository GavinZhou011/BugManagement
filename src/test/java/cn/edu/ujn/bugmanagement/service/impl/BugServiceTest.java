package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.pojo.Bug;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BugServiceTest {
    @Autowired
    private BugService bugService;

    @Test
    public void selectBySelective() throws Exception{
        Bug bug = new Bug();
        bug.setCreator(1012);
        Date beginDate = new Date();
        Date endDate = new Date();
        List<Bug> bugList = bugService.selectBySelective(bug, beginDate, endDate);
System.out.println("begin:"+beginDate+" end:"+endDate);
        for (Bug bugE:bugList) {
            System.out.println(bug.getBug_status());
        }
    }
}