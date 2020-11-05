package com.learning.smoketest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFunction {
    @Test(dataProvider = "searchdata")
    void printSomething(String firstname, String lastname) {
        System.out.println("Firtsname " + firstname + " Lastname " + lastname);
    }

    @DataProvider(name = "searchdata")
    Object[][] sendData() {
        return new Object[][]
        {
                {"Rahul", "Deshmukh"},
                {"Bikram", "Deshmukh"}

        };
}
}
