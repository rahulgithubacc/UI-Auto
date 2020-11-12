package com.learning.smoketest;

import com.learning.util.PropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class ShoppingCartLogin {
    WebDriver driver;
    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        String appUrl = PropertyUtil.getProperty("appURL");
        System.out.println("App URL:"+ appUrl);
        driver.get(appUrl);
    }
    @Test
    public void login() {
        WebElement registration_email= driver.findElement(By.xpath("//input[@id='email']"));
        registration_email.sendKeys("rahul.deshmukh324.rdr@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("Rahul");
        WebElement create_account_button= driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        create_account_button.click();
//        driver.quit();
    }
}
