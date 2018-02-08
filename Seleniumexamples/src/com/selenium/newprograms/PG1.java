package com.selenium.newprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) 
		{
			System.out.println("Test passed!");
		}
		else {
			System.out.println("Test failed");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
