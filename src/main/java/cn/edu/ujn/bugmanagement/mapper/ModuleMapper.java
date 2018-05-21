package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Branch;
import cn.edu.ujn.bugmanagement.pojo.Module;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ModuleMapper {
    int countBy()throws Exception;

    Module selectById(Integer id)throws Exception;

    List<Module> selectByProjectId(Integer projectId)throws Exception;

    int insert(Module module)throws Exception;

    void updateById(Integer id)throws Exception;

    void deleteById()throws Exception;

}