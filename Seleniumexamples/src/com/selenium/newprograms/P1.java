package com.selenium.newprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Find out all the links in the page and check if they are working.
public class P1 {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/selenium/newtours/";
		 //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	     // WebDriver driver = new ChromeDriver();	
		WebDriver driver = new FirefoxDriver();
		
		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the page " + linkElements.size());
		
		String[] linkTexts = new String[linkElements.size()];
		int i=0;
		
		//extract the link texts of each link element
		for (WebElement e: linkElements) {
			linkTexts[i]=e.getText();
			i++;
		}
		//System.out.println(linkTexts[14]);
		//test each link and count working link and under construction link
		int count1 = 0, count2=0;
		for(String t: linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underConsTitle))
			{
				//System.out.println(t + "is under construction");
				count1++;
			}
			else
			{
				//System.out.println(t + "is working");
				count2++;
			}
			driver.navigate().back();
		}
		System.out.println("Number of pages under construction: " + count1);
		System.out.println("Number of pages working: " + count2);
		driver.quit();
	}

}
