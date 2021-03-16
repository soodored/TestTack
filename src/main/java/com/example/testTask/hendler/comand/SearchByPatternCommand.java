package com.example.testTask.hendler.comand;

import com.example.testTask.entity.Lector;
import com.example.testTask.service.LectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchByPatternCommand implements Command {

    @Autowired
    private LectorService lectorService;

    @Override
    public void execute(String input) {
        List<Lector> allByLastNameIsContaining = lectorService.getAllByLastNameIsContaining(input);
        if (allByLastNameIsContaining.size() == 0) {
            System.out.println("Answer: No matches found");
        } else {
            System.out.print("Answer: ");
            allByLastNameIsContaining.forEach(System.out::println);
        }
    }
}
