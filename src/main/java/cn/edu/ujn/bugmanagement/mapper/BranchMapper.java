package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Branch;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BranchMapper {
    int countByExample();

    @Select("select * from Branch where id = #{id}")
    int deleteById(Integer id)throws Exception;

    int insert(Branch branch)throws Exception;

    List<Branch> selectByBranch(Branch branch)throws Exception;

    Branch selectById(Integer id)throws Exception;

    int updateById(Branch branch)throws Exception;
}