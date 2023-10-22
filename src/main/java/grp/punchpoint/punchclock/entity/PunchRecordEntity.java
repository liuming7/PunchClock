package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * @program: grp\punchpoint\punchclock\entity\PunchRecordEntity.java
 * @description: PunchRecordEntity
 * @author: Mengnan Wu
 * @create: 10/21/2023 5:10 PM
 **/
@Getter
@Setter
@ToString
public class PunchRecordEntity {

    private Integer punchRecordId;

    private Timestamp punchTimestamp;

    private Integer punchCategory;

    private Integer employee;

    private Boolean punchRecordStatus;
}
