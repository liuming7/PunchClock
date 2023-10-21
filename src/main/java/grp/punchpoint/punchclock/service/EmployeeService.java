package grp.punchpoint.punchclock.service;

import grp.punchpoint.punchclock.entity.EmployeeEntity;
import grp.punchpoint.punchclock.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void get(){
        EmployeeEntity employeeEntity = employeeMapper.getEmployeeById(1);
        System.out.println(employeeEntity.toString());
    }
}
