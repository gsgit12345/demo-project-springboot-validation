package com.example.controller;

import com.example.dto.Employee;
import com.example.dto.Student;
import com.example.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/saveStudent")
    public Student addNewStudentToSystem(@RequestBody @Valid Student employee){
        return service.addNewStudent(employee);
    }
}
