package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Branch;
import cn.edu.ujn.bugmanagement.pojo.Project;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProjectMapper {
    int countBy();

    Project selectById(Integer id);

    List<Project> selectByBranchId(Integer branchId);

    int insert(Project project);

    void updateById(Project project);

    void deleteById(Integer id);

}