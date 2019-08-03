package com.demo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
    WebDriver driver;
    @BeforeTest
    public void launch(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\selenium2\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com");
    }
    @AfterTest
    public void browserClose(){
        driver.close();
    }


}
