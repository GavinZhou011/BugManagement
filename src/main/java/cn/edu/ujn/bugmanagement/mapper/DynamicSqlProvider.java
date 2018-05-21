package cn.edu.ujn.bugmanagement.mapper;

import cn.edu.ujn.bugmanagement.pojo.Bug;
import cn.edu.ujn.bugmanagement.pojo.Staff;
import org.apache.ibatis.jdbc.SQL;

import java.util.Date;
import java.util.Map;

public class DynamicSqlProvider {

    public String selectStaffBySelect(Staff staff){
        return new SQL(){{
            SELECT("*");
            FROM("staff");
            if(staff.getBranch_id()!=null){
                AND();
                WHERE("branch_id = #{branch_id}");
            }
            if((staff.getStaff_name()!=null) && (staff.getStaff_name()!="")){
                AND();
                WHERE("staff_name = #{staff_name}");
            }
        }
        }.toString();
    }


    public String selectBugBySelective(Map<String,Object> map){
        Bug bug = (Bug)map.get("param1");
        Date beginDate = (Date)map.get("param2");
        Date endDate = (Date)map.get("param3");
        return new SQL(){{
            SELECT("*");
            FROM("bug");
            if(bug.getProject_id()!=null){
                AND();
                WHERE("project_id = #{bug.project_id}");
            }
            if(bug.getModuleId()!=null){
                AND();
                WHERE("module_id = #{bug.module_id}");
            }
            if(bug.getBug_status()!=null){
                AND();
                WHERE("bug_status = #{bug.bug_status}");
            }
            if(bug.getProcess_result()!=null){
                AND();
                WHERE("process_result = #{bug.process_result}");
            }
            if(bug.getSerious_level()!=null){
                AND();
                WHERE("serious_level=#{bug.serious_level}");
            }
            if(bug.getReceiver()!=null){
                AND();
                WHERE("receiver=#(bug.receiver)");
            }
            if(bug.getCreator()!=null){
                AND();
                WHERE("creator =#{bug.creator}");
            }
            if((beginDate!=null) &&(endDate!=null)){
                AND();
                WHERE("create_time between #{beginDate} and #{endDate}");
            }
        }
        }.toString();
    }

}
