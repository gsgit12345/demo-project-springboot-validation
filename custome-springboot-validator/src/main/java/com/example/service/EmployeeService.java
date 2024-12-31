package com.example.service;

import com.example.dto.Employee;
import com.example.dto.Student;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {

    public Employee addNewEmployee(Employee employee){
        employee.setEmpId(new Random().nextInt(68736432));
        //add employee to database
        return employee;
    }
    public Student addNewStudent(Student employee){
        employee.setId(new Random().nextInt(68736432));
        //add employee to database
        return employee;
    }
}