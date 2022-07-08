package com.junit_program;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test {
    public static void main(String[] args) {


        Result result = JUnitCore.runClasses(TestCases.class);

        if(!result.getFailures().isEmpty()){

            result.getFailures().forEach(failure->{

                System.out.println(failure.toString());
                System.out.println("hello");
            });

        }

//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
        System.out.println(result.wasSuccessful());
    }
}
