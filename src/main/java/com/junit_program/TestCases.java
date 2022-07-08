package com.junit_program;

import org.junit.*;
import org.junit.Test;

public class TestCases {

    @Before
    public void beforeTest() {
        System.out.println("this is @Before method");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("this is @BeforeClass method");
    }

    @After
    public void after() {
        System.out.println("this is @After method");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("this is @AfterClass method");
    }

    @Test
    public void firstCase() {
        System.out.println("this is first case..");
    }

    @Test
    public void secondCase() {
        System.out.println("this is second case..");
        Assert.assertEquals(21, 21);
    }
}

