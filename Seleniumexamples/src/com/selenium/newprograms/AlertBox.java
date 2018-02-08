package com.selenium.newprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        Thread.sleep(3000);
        alertMessage = driver.switchTo().alert().getText();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
       Thread.sleep(3000);
        System.out.println(alertMessage);
        driver.quit();

	}

}
