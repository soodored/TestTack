package com.example.testTask.service;

import com.example.testTask.entity.Lector;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LectorService {
    void saveLector(Lector lector);

    List<Lector> getAllByLastNameIsContaining(String pattern);
}
