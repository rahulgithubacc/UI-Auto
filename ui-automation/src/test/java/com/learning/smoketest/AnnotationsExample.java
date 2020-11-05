package com.learning.smoketest;

import org.testng.annotations.*;

public class AnnotationsExample {
////    @BeforeTest
//    void beforetest() {
//        System.out.println("THis method will be executed before test");
//    }
//
////    @Test(priority = 0)
//    void testfun() {
//        System.out.println("Test with priority 0");
//    }
//
////    @Test(priority = 1)
//    void testfunsecoend() {
//        System.out.println("Test with priority 1");
//    }
//
////    @AfterTest
//    void aftertest() {
//        System.out.println("This will be executed after all the tests");
//    }

    @BeforeClass
    void beforetest() {
        System.out.println("THis method will be executed before test");
    }

    @Test(priority = 0)
    void testfun() {
        System.out.println("Test with priority 0");
    }

    @Test(priority = 1)
    void testfunsecoend() {
        System.out.println("Test with priority 1");
    }

    @AfterClass
    void aftertest() {
        System.out.println("This will be executed after all the tests");
    }

}
//If we use @beforeMethod and @afterMethod instead of @beforetest and @aftertest , @aftertest will be
// executed after each @test

