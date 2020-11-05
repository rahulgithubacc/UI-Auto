package com.learning.smoketest;

import org.testng.annotations.DataProvider;

public class ProvideData {
    @DataProvider(name = "searchdata")
    public static Object[][] sendData() {
        return new Object[][]{
                {"Rahul", "Deshmukh"}
        };
    }
}
