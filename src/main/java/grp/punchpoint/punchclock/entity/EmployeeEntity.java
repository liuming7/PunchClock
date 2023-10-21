package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeEntity {

    private Integer employeeId;

    private String firstName;

    private String middleName;

    private String lastName;

    private Integer pronouns;

    private String workEmail;

    private String workMobile;

    private String jobTitle;

    private Integer jobLevel;

    private Integer reportTo;

    private Integer company;

    private String emergencyContactName;

    private String emergencyContactEmail;

    private String emergencyContactMobile;

    private String emergencyContactRelationship;

    private String jobLevelName;



}
