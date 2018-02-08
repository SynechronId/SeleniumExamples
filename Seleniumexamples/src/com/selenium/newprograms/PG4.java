package com.selenium.newprograms;
//Frame switching
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG4 {

	public static void main(String[] args) throws InterruptedException {
	   	WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("packageListFrame");
        Thread.sleep(3000);
        driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
        Thread.sleep(3000);
        driver.close(); 
        
    }

}
