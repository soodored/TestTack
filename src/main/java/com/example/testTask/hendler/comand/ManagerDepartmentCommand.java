package com.example.testTask.hendler.comand;

import com.example.testTask.entity.Lector;
import com.example.testTask.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManagerDepartmentCommand implements Command {

    @Autowired
    private DepartmentService departmentService;

    @Override
    public void execute(String input) {
        Lector managerOfDepartment = departmentService.getManagerOfDepartment(input);
        System.out.println("Answer : Head of " + input + " department is " + managerOfDepartment.getName() +
                " " + managerOfDepartment.getLastName());
    }
}
