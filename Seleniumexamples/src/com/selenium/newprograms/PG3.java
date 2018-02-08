package com.selenium.newprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.popuptest.com/popuptest2.html");
        Thread.sleep(2000);
        //driver.close(); 
        driver.quit(); // using QUIT all windows will close

	}

}
