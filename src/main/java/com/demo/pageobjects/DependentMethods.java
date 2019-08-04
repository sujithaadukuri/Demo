package com.demo.pageobjects;

import org.testng.annotations.Test;

public class DependentMethods {
    @Test(dependsOnMethods = {"browser"})
    public void signin(){
        System.out.println("this will execute second(signin)");
    }
    @Test
    public void browser(){
        System.out.println("this will execute first");
    }
    @Test(dependsOnMethods = {"signin"})
    public void logout(){
        System.out.println("this will execute last");
    }
}
