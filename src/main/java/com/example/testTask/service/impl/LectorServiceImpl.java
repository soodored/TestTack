package com.example.testTask.service.impl;

import com.example.testTask.entity.Lector;
import com.example.testTask.repository.LectorRepository;
import com.example.testTask.service.LectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectorServiceImpl implements LectorService {

    @Autowired
    private LectorRepository lectorRepository;

    @Override
    public void saveLector(Lector lector) {
        lectorRepository.save(lector);
    }

    @Override
    public List<Lector> getAllByLastNameIsContaining(String pattern) {
        List<Lector> allByLastNameIsContaining = lectorRepository.getAllByLastNameIgnoreCaseIsContaining(pattern);
        if (allByLastNameIsContaining.size() != 0) {
            return allByLastNameIsContaining;
        }
        return lectorRepository.getAllByNameIgnoreCaseIsContaining(pattern);
    }
}
