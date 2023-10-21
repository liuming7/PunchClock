package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

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
