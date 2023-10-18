package org.example;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestDemo {



    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.diver","/usr/bin/chrome-driver" );
        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("headless");
        driver = new ChromeDriver(Options);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assert.assertTrue("page title is not correct", driver.getTitle().equals("Google"));




    }

}
