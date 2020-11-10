package com.learning.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkText {
    WebDriver driver;
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.google.com/doodles");
    }
    @Test
    public void test() {
//        driver.findElement(By.linkText("Doodles Archive")).click();
        driver.findElement(By.partialLinkText("Doo")).click();
    }
}
