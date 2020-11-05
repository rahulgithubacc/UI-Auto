package com.learning.smoketest;

import org.testng.annotations.Test;

public class DependsOnGroupExample {
    @Test(groups = {"dependent"})
    public void firstMethod() {
        System.out.println("Executing first method");
        System.out.println("Last method depends on this method");
    }
    @Test (groups = {"dependent"})
    public void secondMethod() {
        System.out.println("Executing second method");
        System.out.println("Last method depends on this method also");
    }
    @Test(dependsOnGroups = {"dependent"})
    public void lastMethod() {
        System.out.println("Executing last method");
        System.out.println("Last method depends on first and second method");
    }
}
