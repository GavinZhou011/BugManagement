package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Bug;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface BugMapper {

    @Select("select * from bug where tester_id=#{testerId}")
    int countByTesterId(Integer testerId)throws Exception;//动态sql

    int deleteByBug(Bug bug)throws Exception;

    //int deleteById(Integer id)throws Exception;

    int insert(Bug bug)throws Exception;

    @SelectProvider(type=DynamicSqlProvider.class, method = "selectBugBySelective")
    List<Bug> selectBySelective(@Param("bug") Bug bug, @Param("beginDate")Date beginDate, @Param("endDate") Date endDate)throws Exception;

    @Select("select * from Bug where id = #{id}")
    Bug selectById(Integer id)throws Exception;

    int updateById(Bug bug)throws Exception;


}