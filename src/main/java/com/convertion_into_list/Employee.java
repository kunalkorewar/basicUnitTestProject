package com.convertion_into_list;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
public class Employee {

    private int id;

    private String name;

    private long salary;


    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(14);
        employee.setName("kunal");
        employee.setSalary(125000l);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee);
    }
}
