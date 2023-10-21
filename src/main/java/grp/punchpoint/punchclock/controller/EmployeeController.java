package grp.punchpoint.punchclock.controller;

import grp.punchpoint.punchclock.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/name")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/name")
    @ResponseBody
    public void get(){
        employeeService.get();
        System.out.println("1111111111111111111111111111111111111");
    }
}
