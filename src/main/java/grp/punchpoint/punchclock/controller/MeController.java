package grp.punchpoint.punchclock.controller;

import grp.punchpoint.punchclock.service.MeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: grp\punchpoint\punchclock\controller\EmployeeController.java
 * @description: EmployeeController
 * @author: Mengnan Wu
 * @create: 10/21/2023 5:11 PM
 **/
@Controller
@RequestMapping("/me")
public class MeController {

    @Autowired
    private MeService employeeService;

    @RequestMapping(value = "/getEmployeeInfo", method = RequestMethod.POST)
    @ResponseBody
    public void getEmployeeInfo(){

    }

    @RequestMapping(value = "/editEmployee", method = RequestMethod.POST)
    @ResponseBody
    public void editEmployee(){

    }

    @RequestMapping(value = "/editPassword", method = RequestMethod.POST)
    @ResponseBody
    public void editPassword(){

    }
}
