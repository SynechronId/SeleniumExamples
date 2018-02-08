package com.selenium.newprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class AccessDropDown {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseURL = "http://demo.guru99.com/selenium/newtours/register.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		fruits.selectByIndex(2);
		

	}

}
