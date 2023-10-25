package grp.punchpoint.punchclock.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import grp.punchpoint.punchclock.bo.LoginInfoBo;
import grp.punchpoint.punchclock.entity.EmployeeEntity;
import grp.punchpoint.punchclock.service.MeService;
import grp.punchpoint.punchclock.util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/getEmployeeInfo", method = RequestMethod.GET)
    @ResponseBody
    public String getEmployeeInfoById(@RequestParam(name = "id") Integer employeeId){
        EmployeeEntity employeeEntity = employeeService.getEmployeeInfoById(employeeId);
        return ReturnResult.fine(employeeEntity);
    }

    @RequestMapping(value = "/editEmployee", method = RequestMethod.POST)
    @ResponseBody
    public String editEmployee(@RequestBody String employeeInfo){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        JSONObject jsonObject = JSON.parseObject(employeeInfo);
        Boolean result = false;
        return result ? ReturnResult.fine(employeeEntity) : ReturnResult.error("edit failed");

    }

    @RequestMapping(value = "/editPassword", method = RequestMethod.POST)
    @ResponseBody
    public void editPassword(){

    }
}
