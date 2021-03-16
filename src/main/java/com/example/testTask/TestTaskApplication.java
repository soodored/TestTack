package com.example.testTask;

import com.example.testTask.hendler.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestTaskApplication {
    public static void main(String[] args) {
        new Console(SpringApplication.run(TestTaskApplication.class, args)).start();
    }
}
