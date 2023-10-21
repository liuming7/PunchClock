package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class AbsenceRequestEntity {

    private Integer absenceRequestId;

    private Time absenceStartTime;

    private Time absenceEndTime;

    private Date absenceStartDate;

    private Date absenceEndDate;

    private String absenceReason;

    private Integer abssenceReasonType;

    private Integer employee;

    private Integer permissionFrom;

    private Timestamp absenceStartTimestamp;

    private Timestamp absenceEndTimestamp;

    private Boolean permissionStatus;
}
