package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: grp\punchpoint\punchclock\entity\TaskEmployeeLinkEntity.java
 * @description: TaskEmployeeLinkEntity
 * @author: Mengnan Wu
 * @create: 10/21/2023 5:10 PM
 **/
@Getter
@Setter
@ToString
public class TaskEmployeeLinkEntity {

    private Integer taskEmployeeLinkId;

    private Integer taskId;

    private Integer employeeId;
}
