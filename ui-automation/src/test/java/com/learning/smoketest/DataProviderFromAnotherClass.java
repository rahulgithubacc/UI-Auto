package com.learning.smoketest;

import org.testng.annotations.Test;

public class DataProviderFromAnotherClass {
    @Test(dataProvider = "searchdata", dataProviderClass=ProvideData.class)
    public void printSomething(String firstname, String lastname){
        System.out.println("Firtsname " + firstname + " Lastname " + lastname);
//    public void printSomething(String firstname){
//        System.out.println("Firtsname " + firstname);
    }

}
