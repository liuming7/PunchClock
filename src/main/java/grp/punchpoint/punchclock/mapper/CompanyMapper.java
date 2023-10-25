package grp.punchpoint.punchclock.mapper;

import grp.punchpoint.punchclock.entity.CompanyEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: PunchClock
 * @description: CompanyMapper
 * @author: Mengnan Wu
 * @create: 2023-10-21 16:16
 **/

@Repository
@Mapper
public interface CompanyMapper {

    @Select("select * from company where company_id = #{companyId} and is_deleted = 0")
    @Results(id = "companyMap", value = {
            @Result(property = "companyId", column = "company_id"),
            @Result(property = "companyName", column = "company_name"),
            @Result(property = "workStartTime", column = "work_start_time"),
            @Result(property = "workEndTime", column = "work_end_time"),
            @Result(property = "workStartTimeException", column = "work_start_time_exception"),
            @Result(property = "workEndTimeException", column = "work_end_time_exception"),
            @Result(property = "isExceptionToday", column = "is_exception_today"),
            @Result(property = "workStartTimestamp", column = "work_start_timestamp"),
            @Result(property = "workEndTimestamp", column = "work_end_timestamp"),
            @Result(property = "workStartTimestampException", column = "work_start_timestamp_exception"),
            @Result(property = "workEndTimestampException", column = "work_end_timestamp_exception")
    })
    public CompanyEntity getCompanyInfoById(Integer companyId);

    @Transactional(label = "setNewCompany")
    @Insert("insert into company values (#{companyId},#{companyName},#{workStartTime},#{workEndTime},#{workStartTimeException},#{workEndTimeException}," +
            "#{isExceptionToday},#{workStartTimestamp},#{workEndTimestamp},#{workStartTimestampException},#{workEndTimestampException},#{isDeleted})")
    public Boolean setNewCompany(CompanyEntity companyEntity);
}
