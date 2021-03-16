package com.example.testTask.repository;

import com.example.testTask.entity.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectorRepository extends JpaRepository<Lector, Long> {
    List<Lector> getAllByLastNameIsContaining(String pattern);
}
