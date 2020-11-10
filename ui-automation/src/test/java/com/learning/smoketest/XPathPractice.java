package com.learning.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XPathPractice {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        //Set the path to the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");//Set the driver for Chrome
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");//Set the driver for Firefox
        //Launch the browser
        driver= new ChromeDriver(); //Chrome
//        driver = new FirefoxDriver(); //Firefox
        //Open Facebook
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void facebookLogin() {
        WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
//        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("rahul.deshmukh324.rdr@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
//        WebElement password= driver.findElement(By.id("pass"));
        password.sendKeys("Rahul1996");
        WebElement loginButton= driver.findElement(By.xpath("//button[@id='u_0_f']"));
//        WebElement loginButton= driver.findElement(By.xpath("//button[text()='Log In']"));
//        WebElement loginButton= driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
        loginButton.click();
//        Thread.sleep(2000);
    }

}
