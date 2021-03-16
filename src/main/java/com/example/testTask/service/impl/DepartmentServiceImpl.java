package com.example.testTask.service.impl;

import com.example.testTask.entity.Departments;
import com.example.testTask.entity.Lector;
import com.example.testTask.repository.DepartmentsRepository;
import com.example.testTask.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentsRepository departmentsRepository;

    @Override
    public void addDepartment(Departments department) {
        departmentsRepository.save(department);
    }

    @Override
    public BigDecimal getAverageSalaryByDepartment(String department) {
        BigDecimal averageSalary = new BigDecimal("0.00");
        Departments byName = departmentsRepository.findByName(department);
        List<Lector> lecturers = byName.getLecturers();
        for (Lector l : lecturers) {
            averageSalary = averageSalary.add(l.getSalary());
        }
        return averageSalary.divide(new BigDecimal(lecturers.size()), 3, RoundingMode.DOWN);
    }

    @Override
    public Long countAllLecturersByDepartment(String department) {
        long count = 0L;
        Departments byName = departmentsRepository.findByName(department);
        if (byName != null) {
            count += byName.getLecturers().size();
            return count;
        } else {
            return null;
        }
    }

    @Override
    public Lector getManagerOfDepartment(String department) {
        return departmentsRepository.findByName(department).getManagerDepartment();
    }

    @Override
    public List<String> countByPosition(String department) {
        List<String> list = new ArrayList<>();
        Departments byName = departmentsRepository.findByName(department);
        if (byName != null) {
            List<Lector> lecturers = byName.getLecturers();
            for (Lector l : lecturers) {
                list.add(l.getDegree().name());
            }
        }
        return list;
    }
}
