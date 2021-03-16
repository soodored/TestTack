package com.example.testTask.service;

import com.example.testTask.entity.Departments;
import com.example.testTask.entity.Lector;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public interface DepartmentService {
    void addDepartment(Departments department);

    BigDecimal getAverageSalaryByDepartment(String department);

    Long countAllLecturersByDepartment(String department);

    Lector getManagerOfDepartment(String department);

    List<String> countByPosition(String department);
}
