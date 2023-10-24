package grp.punchpoint.punchclock.mapper;

import grp.punchpoint.punchclock.bo.LoginInfoBo;
import grp.punchpoint.punchclock.entity.EmployeeEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

    @Select("select first_name,password_encoded,work_email from employee inner join psd_keep on employee.employee_id = psd_keep.employee_id where first_name = #{firstName}")
    @Results(id = "passwordMap", value = {
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "password", column = "password_encoded"),
            @Result(property = "email", column = "work_email"),
    })
    public LoginInfoBo getPasswordByFirstName(String firstName);

    @Transactional(label = "setNewUser")
    @Insert("insert into psd_keep (employee_id,password_encoded) values (#{employeeId},#{password});")
    public Boolean setNewUser1(LoginInfoBo loginInfoBo);

    @Transactional(label = "setNewUser")
    @Insert("insert into employee (employee_id,first_name,work_email) values (#{employeeId},#{firstName},#{email});")
    public Boolean setNewUser2(LoginInfoBo loginInfoBo);

    @Select("select count(email) from employee where work_email = #{email}")
    public Integer isEmailOccupied(LoginInfoBo loginInfoBo);
}
