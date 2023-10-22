package grp.punchpoint.punchclock.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: grp\punchpoint\punchclock\entity\PasswordEntity.java
 * @description: PasswordEntity
 * @author: Mengnan Wu
 * @create: 10/21/2023 5:10 PM
 **/
@Getter
@Setter
@ToString
public class PasswordEntity {

    private Integer employeeId;

    private String passwordEncoded;
}
