package com.learning.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShoppingCartReg {
    WebDriver driver;
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
    @Test
    public void register() {
        WebElement registration_email= driver.findElement(By.xpath("//input[@id='email_create']"));
        registration_email.sendKeys("rahul.deshmukh324.rdr@gmail.com");
        WebElement create_account_button= driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
        create_account_button.click();
    }
}
