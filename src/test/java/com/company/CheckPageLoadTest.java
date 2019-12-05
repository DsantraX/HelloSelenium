package com.company;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckPageLoadTest {
    @Test
    public void site_header_is_on_home_page() {
        WebDriver browser;
        //Chrome's driver *requires* you to specify its location.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SantraX\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("http://facebook.com/login");
        browser.manage().window().maximize();

        //gogole.com
//        WebElement header = browser.findElement(By.id("hplogo"));
//        assertTrue((header.isDisplayed()));
//        System.out.println("1");
//        WebElement textbox = browser.findElement(By.className("gLFyf"));
//        assertTrue((textbox.isDisplayed()));
//        System.out.println("2");
//        WebElement button = browser.findElement(By.className("gb_md"));
//        assertTrue((button.isDisplayed()));
//        button.click();
//        System.out.println("3");

        WebElement email = browser.findElement(By.id("email"));
        assertTrue((email.isDisplayed()));
        email.sendKeys("test.at@gmail.com");
        //textbox.sendKeys("debayansantra");
        //email.clear();
        //browser.close();
    }
}