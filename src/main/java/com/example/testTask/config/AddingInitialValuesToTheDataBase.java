package com.example.testTask.config;

import com.example.testTask.entity.Department;
import com.example.testTask.entity.Lector;
import com.example.testTask.entity.enums.Degree;
import com.example.testTask.service.DepartmentService;
import com.example.testTask.service.LectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@Component
public class AddingInitialValuesToTheDataBase {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private LectorService lectorService;

    @PostConstruct
    public void init() {
        Lector stas = new Lector();
        stas.setSalary(new BigDecimal("5000.00"));
        stas.setDegree(Degree.PROFESSOR);
        stas.setName("Stanislav");
        stas.setLastName("Aleshckevich");
        lectorService.saveLector(stas);

        Lector roma = new Lector();
        roma.setSalary(new BigDecimal("1000.00"));
        roma.setDegree(Degree.ASSOCIATE_PROFESSOR);
        roma.setName("Roma");
        roma.setLastName("Romanovish");
        lectorService.saveLector(roma);

        Lector nicita = new Lector();
        nicita.setSalary(new BigDecimal("3000.00"));
        nicita.setDegree(Degree.ASSISTANT);
        nicita.setName("Nicita");
        nicita.setLastName("Nicitovich");
        lectorService.saveLector(nicita);

        Lector vova = new Lector();
        vova.setSalary(new BigDecimal("5000.00"));
        vova.setDegree(Degree.PROFESSOR);
        vova.setName("Vova");
        vova.setLastName("Vladimirovich");
        lectorService.saveLector(vova);

        Lector jenya = new Lector();
        jenya.setSalary(new BigDecimal("650.00"));
        jenya.setDegree(Degree.ASSOCIATE_PROFESSOR);
        jenya.setName("Jenya");
        jenya.setLastName("Yevgenievich");
        lectorService.saveLector(jenya);

        Lector katya = new Lector();
        katya.setSalary(new BigDecimal("2200.00"));
        katya.setDegree(Degree.ASSISTANT);
        katya.setName("Katya");
        katya.setLastName("Olegovna");
        lectorService.saveLector(katya);

        Lector julia = new Lector();
        julia.setSalary(new BigDecimal("4000.00"));
        julia.setDegree(Degree.PROFESSOR);
        julia.setName("Julia");
        julia.setLastName("Dmitrievna");
        lectorService.saveLector(julia);

        Lector saha = new Lector();
        saha.setSalary(new BigDecimal("1100.00"));
        saha.setDegree(Degree.ASSOCIATE_PROFESSOR);
        saha.setName("Saha");
        saha.setLastName("Aleksandrovna");
        lectorService.saveLector(saha);

        Lector petya = new Lector();
        petya.setSalary(new BigDecimal("900.00"));
        petya.setDegree(Degree.ASSISTANT);
        petya.setName("Petya");
        petya.setLastName("Petrovich");
        lectorService.saveLector(petya);

        Lector olya = new Lector();
        olya.setSalary(new BigDecimal("700.00"));
        olya.setDegree(Degree.PROFESSOR);
        olya.setName("Olya");
        olya.setLastName("Olgovna");
        lectorService.saveLector(olya);

        Lector dima = new Lector();
        dima.setSalary(new BigDecimal("2000.00"));
        dima.setDegree(Degree.ASSOCIATE_PROFESSOR);
        dima.setName("Dima");
        dima.setLastName("Dmitreevich");
        lectorService.saveLector(dima);

        Lector vitya = new Lector();
        vitya.setSalary(new BigDecimal("1230.00"));
        vitya.setDegree(Degree.ASSISTANT);
        vitya.setName("Vitya");
        vitya.setLastName("Vityavich");
        lectorService.saveLector(vitya);


        Department technology = new Department();
        technology.setManagerDepartment(stas);
        technology.setLecturers(List.of(stas, roma, nicita, vova));
        technology.setName("TECHNOLOGY");
        departmentService.addDepartment(technology);

        Department biology = new Department();
        biology.setManagerDepartment(julia);
        biology.setLecturers(List.of(jenya, katya, julia, saha));
        biology.setName("BIOLOGY");
        departmentService.addDepartment(biology);

        Department historical = new Department();
        historical.setManagerDepartment(olya);
        historical.setLecturers(List.of(vitya, dima, olya, petya));
        historical.setName("HISTORICAL");
        departmentService.addDepartment(historical);

    }
}
