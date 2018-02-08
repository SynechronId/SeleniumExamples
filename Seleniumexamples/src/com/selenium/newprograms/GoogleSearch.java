package com.selenium.newprograms;


import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		String baseURL = "https://www.google.co.in/";
		
	    WebDriver driver =  new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("Synechron");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		//driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[8]/div/div/h3/a")).click();
		List<WebElement> linkElements = driver.findElements(By.tagName("h3"));
		String s = "Synechron - About Us";
		System.out.println(linkElements.size());
		for(int i=0;i<linkElements.size();i++) 
		{
			if(linkElements.get(i).getText().equals(s))
				linkElements.get(i).click();
				
		}
					
	}

}