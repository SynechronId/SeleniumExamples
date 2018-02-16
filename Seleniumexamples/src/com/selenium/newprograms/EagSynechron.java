package com.selenium.newprograms;

import java.util.Base64;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EagSynechron {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://eag.synechron.com/";
		String user = "rakhiyana.vuchula";
		String pass1 = "UGlua3lAMzE=";
		byte[] decodedBytes = Base64.getDecoder().decode(pass1);
		String pass2 = new String(decodedBytes);
		WebDriver driver = new FirefoxDriver();
		WebDriverWait mywaitvar = new WebDriverWait(driver, 10);
		driver.get(baseUrl);
		driver.findElement(By.id("UserName")).sendKeys(user);
		driver.findElement(By.id("Password")).sendKeys(pass2);
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.findElement(By.id("empsearch")).sendKeys("Moazzam Khan");
		WebElement emp = driver.findElement(By.id("ui-id-1"));
		mywaitvar.until(ExpectedConditions.visibilityOf(emp));
		emp.click();
		//driver.findElement(By.xpath("//*[@id='myModalLabel2']")).getText()
		//driver.findElement(By.id("myModalLabel2")).getText()
		Thread.sleep(3000);
		String empname = driver.findElement(By.id("myModalLabel2")).getText();
		String emp2[] = empname.split(" ");
		System.out.println("Employee name: " + emp2[0] + " " + emp2[1] + " and " + "Id: " + emp2[3]);
		int index=1;
		List <WebElement> allElement = driver.findElements(By.xpath("(//*[@class='row mrglft24_ng'])"));
		for(WebElement element: allElement)
		{
		    String className = element.getText();
		    System.out.println(className);
		    index++;
		}
		List <WebElement> allElement1 = driver.findElements(By.xpath("(//*[@class='row contact_detail'])"));
		for(WebElement element1: allElement1)
		{
		    String className2 = element1.getText();
		    System.out.println(className2);
		    index++;
		}
		
		//Trying to perform a right click
		Actions builder = new Actions(driver).contextClick(driver.findElement(By.id("myModalLabel2")));
		builder.build().perform();
		
	}

}
