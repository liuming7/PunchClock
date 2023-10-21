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
public class TaskEntity {

    private Integer taskId;

    private String taskName;

    private Time taskStartTime;

    private Time taskEndTime;

    private Date taskStartDate;

    private Date taskEndDate;

    private String taskLocation;

    private String taskDescription;

    private Integer taskPublisher;

    private Timestamp taskStartTimestamp;

    private Timestamp taskEndTimestamp;
}
