package grp.punchpoint.punchclock.mapper;

import grp.punchpoint.punchclock.entity.EmployeeEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * {@code @program:} PunchClock
 * {@code @description:} EmployeeMapper
 * {@code @author:} Mengnan Wu
 * {@code @create:} 2023-10-21 16:16
 **/
@Repository
@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where employee_id = #{employee_id}")
    @Results(id = "employeeMap", value = {
            @Result(property = "employeeId", column = "employee_id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "middleName", column = "middle_name"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "pronouns", column = "pronouns"),
            @Result(property = "workEmail", column = "work_email"),
            @Result(property = "workMobile", column = "work_mobile"),
            @Result(property = "jobTitle", column = "job_title"),
            @Result(property = "jobLevel", column = "job_level"),
            @Result(property = "reportTo", column = "report_to"),
            @Result(property = "company", column = "company"),
            @Result(property = "emergencyContactName", column = "emergency_contact_name"),
            @Result(property = "emergencyContactEmail", column = "emergency_contact_email"),
            @Result(property = "emergencyContactMobile", column = "emergency_contact_mobile"),
            @Result(property = "emergencyContactRelationship", column = "emergency_contact_relationship"),
            @Result(property = "jobLevelName", column = "job_level_name")
    })
    public EmployeeEntity getEmployeeById(@Param("employee_id") Integer id);
}
