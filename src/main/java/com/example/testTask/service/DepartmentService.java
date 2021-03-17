package com.example.testTask.service;

import com.example.testTask.entity.Department;
import com.example.testTask.entity.Lector;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public interface DepartmentService {
    void addDepartment(Department department);

    BigDecimal getAverageSalaryByDepartment(String department);

    Long countAllLecturersByDepartment(String department);

    Lector getManagerOfDepartment(String department);

    List<String> getPositionList(String department);
}
