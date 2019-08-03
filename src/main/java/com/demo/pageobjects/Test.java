package com.demo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    WebDriver driver;
    @BeforeTest
    public void launch(){
        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\selenium2\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com");*/
        System.out.println("start");
    }
    @AfterTest
    public void browserClose(){
        System.out.println("end");
    }
}
