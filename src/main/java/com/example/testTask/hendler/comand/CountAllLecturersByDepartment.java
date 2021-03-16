package com.example.testTask.hendler.comand;

import com.example.testTask.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CountAllLecturersByDepartment implements Command {

    @Autowired
    private DepartmentService departmentService;

    @Override
    public void execute(String input) {
        System.out.println("Answer: " + departmentService.countAllLecturersByDepartment(input));
    }
}
