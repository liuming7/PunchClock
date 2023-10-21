package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.sql.Timestamp;

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
