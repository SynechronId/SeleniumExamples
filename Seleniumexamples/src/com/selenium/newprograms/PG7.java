package com.selenium.newprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

// program to demostrate actions, action class. 
public class PG7 {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://demo.guru99.com/selenium/newtours";
		WebDriver driver = new FirefoxDriver();
		
		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		System.out.println(link_Home);
		WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr")); 
		System.out.println(td_Home);
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		Thread.sleep(3000);
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover:" + bgColor);
		mouseOverHome.perform();
		Thread.sleep(3000);
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After Hover:" + bgColor);
		driver.close();
	}

}
