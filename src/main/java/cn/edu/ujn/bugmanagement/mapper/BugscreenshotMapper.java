package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Branch;
import cn.edu.ujn.bugmanagement.pojo.Bugscreenshot;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BugscreenshotMapper {
    int countBy()throws Exception;

    Bugscreenshot selectById(Integer id)throws Exception;

    List<Bugscreenshot> selectBy(Integer bugId)throws Exception;

    int insert()throws Exception;

    void updateById(Integer id)throws Exception;

    void deleteById()throws Exception;

}