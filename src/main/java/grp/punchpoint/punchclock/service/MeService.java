package grp.punchpoint.punchclock.service;

import grp.punchpoint.punchclock.entity.EmployeeEntity;
import grp.punchpoint.punchclock.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: grp\punchpoint\punchclock\service\EmployeeService.java
 * @description: EmployeeService
 * @author: Mengnan Wu
 * @create: 10/21/2023 5:11 PM
 **/
@Service
public class MeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeEntity get(){
        EmployeeEntity employeeEntity = employeeMapper.getEmployeeById(1);
        return employeeEntity;
    }
}
