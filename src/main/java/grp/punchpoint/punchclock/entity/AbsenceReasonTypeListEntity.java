package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: grp\punchpoint\punchclock\entity\AbsenceReasonTypeListEntity.java
 * @description: AbsenceReasonTypeListEntity
 * @author: Mengnan Wu
 * @create: 10/21/2023 5:10 PM
 **/
@Getter
@Setter
@ToString
public class AbsenceReasonTypeListEntity {

    private Integer absenceReasonTypeId;

    private String absenceReasonType;
}
