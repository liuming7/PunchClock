package grp.punchpoint.punchclock;

import grp.punchpoint.punchclock.config.PersistenceConfig;
import grp.punchpoint.punchclock.entity.EmployeeEntity;
import grp.punchpoint.punchclock.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PersistenceConfig.class)
public class EmployeeMapperIntegrationTest {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void test1(){
        EmployeeEntity employeeEntity = employeeMapper.getEmployeeById(1);
        System.out.println(employeeEntity.toString());

    }
}
