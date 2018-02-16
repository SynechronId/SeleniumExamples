package com.selenium.newprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExapmle {

	public static void main(String[] args) {
		String baseurl = "http://www.facebook.com";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = (Action) builder.moveToElement(txtUsername).click();
		
	}

}
