package com.learning.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AddToCart {
    WebDriver driver;
    WebDriverWait  wait;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Implicit wait
        driver.get("http://automationpractice.com/index.php");
    }
    @Test
    public void addToCart() {
        String xpathAddToCart = "//a[@title='Faded Short Sleeve T-shirts']/parent::h5/following-sibling::div[@class='button-container']/a";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathAddToCart)));
        WebElement add_items= driver.findElement(By.xpath(xpathAddToCart));
        add_items.click();
    }
}
