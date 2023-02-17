package com.example.spring_sqlserver_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DpartmentController {
	@Autowired DepartmentService departmentService;

	@RequestMapping("/")
    public String index(Model model) {

        List<Department> departmentList = departmentService.findAllDepartment();
        model.addAttribute("departmentList", departmentList);
        return "index";
    }
}
