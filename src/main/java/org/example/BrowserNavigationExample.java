package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //driver.get("http://localhost:8080/login.do");
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }
}