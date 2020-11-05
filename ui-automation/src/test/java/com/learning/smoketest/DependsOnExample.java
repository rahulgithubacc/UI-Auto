package com.learning.smoketest;

import org.testng.annotations.Test;

public class DependsOnExample {
    @Test
    public void firstMethod() {
        System.out.println("Executing first method");
        System.out.println("Second method depends on this method");
    }
    @Test(dependsOnMethods = {"firstMethod"})
    public void secondMethod() {
        System.out.println("Executing secoend method");
        System.out.println("Second method depends on first method");
    }

}
