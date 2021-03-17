package com.example.testTask.repository;

import com.example.testTask.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends JpaRepository<Department, Long> {
    Department findByName(String departmentName);
}
