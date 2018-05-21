package cn.edu.ujn.bugmanagement.mapper;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

@CacheNamespace(size = 512)
@Mapper
public interface DatadictionaryMapper {

    @Select("slect data_value from datadictionary where data_name=#{data_name} and data_key=#{data_key}")
    String selectValeuByNameAndKey(@Param("data_name") String data_name, @Param("data_key") String data_key);

    @Select("select data_value from datadictionary where data_name = \"bug_status\" and data_key = #{key}")
    String selectBugStatus(Integer key)throws Exception;

    @Select("select data_value from datadictionary where data_name = \"bug_type\" and data_key = #{key}")
    String selectBugType(Integer key)throws Exception;

    @Select("select data_value from datadictionary where data_name = \"discovery_stage\" and data_key = #{key}")
    String selectDiscoveryStage(Integer key)throws Exception;

    @Select("select data_value from datadictionary where data_name = \"position\" and data_key = #{key}")
    String selectPosition(Integer key)throws Exception;

    @Select("select data_value from datadictionary where data_name = \"process_result\" and data_key = #{key}")
    String selectProcessResult(Integer key)throws Exception;

    @Select("select data_value from datadictionary where data_name = \"revision_status\" and data_key = #{key}")
    String selectRevisionStatus(Integer key)throws Exception;

    @Select("select data_value from datadictionary where data_name = \"role\" and data_key = #{key}")
    String selectRole(Integer key)throws Exception;

    @Select("select data_value from datadictionary where data_name = \"serious_level\" and data_key = #{key}")
    String selectSeriousLevel(Integer key)throws Exception;
}
