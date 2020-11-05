package com.learning.smoketest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExampleXML {
    @Test
    @Parameters({"firstname","lastname"})
    public void acceptParameters(String firstname, String lastname) {
    System.out.println("Firstname "+ firstname+"Lastname "+lastname);
    }
}
