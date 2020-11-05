package com.learning.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchCountryTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        //Set the path to the chrome driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");//Set the driver for Chrome
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");//Set the driver for Firefox
        //Launch the browser
         driver= new ChromeDriver(); //Chrome
//        driver = new FirefoxDriver(); //Firefox
        //Open wikipedia
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
    }

//    @Test
    public void searchSingleCountry() {

        //Look for the search field
        WebElement countryName = driver.findElement(By.id("searchInput"));
        //Put India in the search field

        countryName.sendKeys("India");
        //Find the search button
        WebElement search = driver.findElement(By.id("searchButton"));
        //Do a click
        search.click();
        WebElement header = driver.findElement(By.id("firstHeading"));
        String headerValue = header.getText();
        Assert.assertEquals(headerValue, "India");
    }
    @Test(dataProvider = "searchCountries")
    public void searchMultipleCountries(String searchCountry, String expectedHeader) {
        //Look for the search field
        WebElement countryName = driver.findElement(By.id("searchInput"));
        //Put India in the search field

        countryName.sendKeys(searchCountry);
        //Find the search button
        WebElement search = driver.findElement(By.id("searchButton"));
        //Do a click
        search.click();
        WebElement header = driver.findElement(By.id("firstHeading"));
        String headerValue = header.getText();
        Assert.assertEquals(headerValue, expectedHeader);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();

    }

    @DataProvider(name = "searchCountries")
    public Object[][] countryData(){
        return new String[][]{{"India", "India"}, {"USA", "United States"}};

    }

}
