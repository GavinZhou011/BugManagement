package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Login;
import cn.edu.ujn.bugmanagement.pojo.LoginExtends;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

@Mapper
public interface LoginMapper {

    @Select("select * from login where staff_id=#{staff_id} and staff_password=#{staff_password}")
    Login selectByIdAndPassword(Login login);

    @Select("select * from login where staff_id=#{staff_id} and staff_password=#{staff_password}")
    @Results({
            @Result(id=true,column="id", property = "id"),
            @Result(column="staff_id", property="staff_id"),
            @Result(column = "staff_password", property = "staff_password"),
            @Result(column = "staff_id", property = "staff", one = @One(select = "cn.edu.ujn.bugmanagement.mapper.StaffMapper.selectById"))
    })
    LoginExtends selectByExtend(Login login);

    @Select("select * from login where id=#{staff_id}")
    Login selectById(Integer id);


    @Insert("insert into login (id, staff_id, staff_password, role)" +
            "  values (#{id}, #{staff_id}, #{staff_password}, #{role})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Login login);

}
