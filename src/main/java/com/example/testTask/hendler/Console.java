package com.example.testTask.hendler;

import com.example.testTask.hendler.comand.Command;
import com.example.testTask.hendler.comand.*;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Component
public class Console {
    Map<String, Command> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public Console(ApplicationContext applicationContext) {
        map.put("1", applicationContext.getBean(ManagerDepartmentCommand.class));
        map.put("2", applicationContext.getBean(CountByPositionCommand.class));
        map.put("3", applicationContext.getBean(AverageSalaryInTheDepartmentCommand.class));
        map.put("4", applicationContext.getBean(CountAllLecturersByDepartment.class));
        map.put("5", applicationContext.getBean(SearchByPatternCommand.class));
    }

    public void start() {
        while (true) {
            String menu =
                    "\n1. Who is head of department {department_name} \n" +
                            "2. Show {department_name} statistics.\n" +
                            "3. Show the average salary for the department {department_name}.\n" +
                            "4  Show count of employee for {department_name}\n" +
                            "5. Global search by {pattern}.\n" +
                            "6. Exit\n" +
                            "Enter menu number:";
            System.out.print(menu);
            String menuNumber = scanner.nextLine();
            switch (menuNumber) {
                case "1", "2", "3", "4" -> map.get(menuNumber).execute(departmentName());
                case "5" -> map.get(menuNumber).execute(pattern());
                case "6" -> System.exit(0);
                default -> {
                    System.out.println("Incorrect input, please try again");
                    start();
                }
            }
        }
    }

    private String departmentName() {
        String department = "\nChoose a department\n" +
                "1. TECHNOLOGY\n" +
                "2. BIOLOGY\n" +
                "3. HISTORICAL\n" +
                "4. EXIT";
        System.out.println(department);
        String menuNumber = scanner.nextLine();
        switch (menuNumber) {
            case "1":
                return "TECHNOLOGY";
            case "2":
                return "BIOLOGY";
            case "3":
                return "HISTORICAL";
            case "4":
                System.exit(10);
                break;
            default:
                System.out.println("Incorrect input, please try again");
                departmentName();
        }
        return null;
    }

    private String pattern() {
        System.out.print("Enter pattern: ");
        return scanner.nextLine();
    }

}
