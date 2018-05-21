package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.pojo.Bug;

import java.util.Date;
import java.util.List;

public interface BugService {
    public List<Bug> selectBySelective(Bug bug, Date beginDate, Date endDate) throws Exception;
}
