package com.employee.controller;

import com.employee.entities.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("addEmployee")
    ResponseEntity<String>addEmployee(@RequestBody Employee employee){

        String string=service.addEmployee(employee);

        return  new ResponseEntity<String>(string, HttpStatus.OK);
    }
}
