package com.application;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsTestClass {
	private WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@AfterTest
	public void afterTest() 
	{
		driver.quit();
		try {
			Runtime.getRuntime().exec("taskkill /F /IM " + "chromedriver");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void actionsTest()
	{
		try 
		{
		WebElement product = driver.findElement(By.linkText("Product Category"));
		Actions mouseMove = new Actions(driver);
		Action mouseAction = mouseMove.moveToElement(product).build();
		mouseAction.perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("iMacs"));
		
		//Example for drag and drop
		/*WebElement from = driver.findElement(By.linkText("Product Category"));
		WebElement to = driver.findElement(By.linkText("Product Category"));
		
		mouseAction= mouseMove.clickAndHold(from).moveToElement(to).release(to).build();
		mouseAction.perform();*/
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
