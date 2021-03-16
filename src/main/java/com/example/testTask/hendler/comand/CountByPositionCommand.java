package com.example.testTask.hendler.comand;

import com.example.testTask.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class CountByPositionCommand implements Command {

    @Autowired
    private DepartmentService departmentService;

    @Override
    public void execute(String input) {
        List<String> list = departmentService.countByPosition(input);
        Set<?> set = new HashSet<>(list);
        set.forEach(l -> System.out.println(l + " - " + Collections.frequency(list, l)));
    }
}
