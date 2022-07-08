package com.json_obj;

import java.util.ArrayList;

public class Employee {
    Integer id;
    String name;
    Long salary;
    ArrayList<String> technologies;

    public Employee() {

    }

    public Employee(Integer id, String name, Long salary, ArrayList<String> technologies) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.technologies = technologies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public ArrayList<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(ArrayList<String> technologies) {
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", technologies=" + technologies + '}';
    }
}
