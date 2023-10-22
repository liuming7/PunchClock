package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * @program: grp\punchpoint\punchclock\entity\CompanyEntity.java
 * @description: CompanyEntity
 * @author: Mengnan Wu
 * @create: 10/21/2023 5:10 PM
 **/
@Getter
@Setter
@ToString
public class CompanyEntity {

    private Integer companyId;

    private String companyName;

    private Time workStartTime;

    private Time workEndTime;

    private Time workStartTimeException;

    private Time workEndTimeException;

    private Boolean isExceptionToday;

    private Timestamp workStartTimestamp;

    private Timestamp workEndTimestamp;

    private Timestamp workStartTimestampException;

    private Timestamp workEndTimestampException;
}
