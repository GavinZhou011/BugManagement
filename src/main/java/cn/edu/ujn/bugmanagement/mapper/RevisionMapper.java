package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Revision;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RevisionMapper {
    int countBy();

    Revision selectById(Integer id);

    List<Revision> selectBySelect(Revision revision);

    int insert(Revision resion);

    void updateById(Revision revision);

    void deleteById();

}