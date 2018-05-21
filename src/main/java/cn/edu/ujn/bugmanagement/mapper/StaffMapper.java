package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface StaffMapper {
    @Select("select * from staff where id=#{id}")
    Staff selectById(int id);

    @SelectProvider(type=DynamicSqlProvider.class, method="selectStaffBySelect")
    List<Staff> selectByStaff(Staff staff);

}
