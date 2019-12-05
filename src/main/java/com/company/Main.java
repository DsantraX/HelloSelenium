package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String path = System.getProperty("user.dir");
        System.out.println(path);
        //Chrome's driver *requires* you to specify its location.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SantraX\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

    }
}
