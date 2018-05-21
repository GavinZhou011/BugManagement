package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Testcase;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestcaseMapper {
    int countBy()throws Exception;

    Testcase selectById(Integer id)throws Exception;

    List<Testcase> selectBySelect(Testcase testcase)throws Exception;

    int insert(Testcase testcase)throws Exception;

    void updateById(Testcase testcase)throws Exception;

    void deleteById(Integer id)throws Exception;

}