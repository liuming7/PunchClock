package grp.punchpoint.punchclock.mapper;

import grp.punchpoint.punchclock.entity.EmployeeEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where employee_id = #{employee_id}")
    @Results({
            @Result(property = "employeeId", column = "employee_id"),
    })
    public EmployeeEntity getEmployeeById(@Param("employee_id") Integer id);
}
