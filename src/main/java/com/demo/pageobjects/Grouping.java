package com.demo.pageobjects;

import org.testng.annotations.Test;

public class Grouping {
    @Test (groups = {"car"})
    public void car1(){
        System.out.println("testcar1");
    }
    @Test(groups = {"car"})
    public void car2(){
        System.out.println("testcar2");
    }
    @Test(groups = {"bike"})
    public void bike1(){
        System.out.println("testbike1");
    }
    @Test(groups = {"bike"})
    public void bike2(){
        System.out.println("testbike2");
    }
    @Test(groups = {"car","sedan car"})
    public void sedan1(){
        System.out.println("testsedan1");
    }
}
