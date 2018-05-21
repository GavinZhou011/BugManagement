package cn.edu.ujn.bugmanagement.service.impl;

import cn.edu.ujn.bugmanagement.mapper.BugMapper;
import cn.edu.ujn.bugmanagement.pojo.Bug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BugServiceImpl implements BugService {
    @Autowired
    private BugMapper bugMapper;
    @Override
    public List<Bug> selectBySelective (Bug bug, Date beginDate, Date endDate) throws Exception {
        return bugMapper.selectBySelective(bug, beginDate, endDate);
    }
}
