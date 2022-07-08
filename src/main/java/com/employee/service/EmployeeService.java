package com.employee.service;

import com.employee.dao.MyDao;
import com.employee.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    MyDao dao;
    public String addEmployee(Employee employee) {

        String string=dao.addEmployee(employee);

        return string;
    }
}
