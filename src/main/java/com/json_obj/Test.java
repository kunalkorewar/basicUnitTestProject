package com.json_obj;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {

        ArrayList<String> technologies = new ArrayList<>();
        technologies.add("java");
        technologies.add("hibernate");
        technologies.add("spring");

        Employee employee = new Employee(14, "kunal", 12500L, technologies);

        System.out.println(employee);

        ObjectMapper mapper = new ObjectMapper();
        String jsonObject = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(employee);

        System.out.println(jsonObject);

//for this no parameter constructor must

        Employee employee1 = mapper.readValue(jsonObject, Employee.class);
        System.out.println("Json to object");
        System.out.println(employee1);
        System.out.println("hello kunal how are you!!");

    }
}
