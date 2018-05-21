package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Updatebugjour;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpdatebugjourMapper {
    int countBy()throws Exception;

    Updatebugjour selectById(Integer id)throws Exception;

    List<Updatebugjour> selectBySelect(Updatebugjour updatebugjour)throws Exception;

    int insert(Updatebugjour updatebugjour)throws Exception;

    void updateById(Updatebugjour updatebugjour)throws Exception;

    void deleteById(Integer id)throws Exception;

}