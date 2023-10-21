package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TaskEmployeeLinkEntity {

    private Integer taskEmployeeLinkId;

    private Integer taskId;

    private Integer employeeId;
}
