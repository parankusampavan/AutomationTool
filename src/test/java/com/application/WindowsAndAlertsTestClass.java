package com.application;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowsAndAlertsTestClass {
	private WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}	

	@Test(priority =1 ,enabled = true)
	public void windowstest()
	{
		try
		{
			String parentWindowName = driver.getWindowHandle().toString();
			/*driver.findElement(By.id("button1")).click();
			Set<String> wins = driver.getWindowHandles();
			System.out.println(wins);
			for (String windowName : wins)
			{
				if (!parentWindowName.equalsIgnoreCase(windowName))
				{
					driver.switchTo().window(windowName);
					Assert.assertTrue(driver.getTitle().contains("QA Automation"));
					driver.close();
				}
			}
			driver.switchTo().window(parentWindowName);
			Assert.assertTrue(driver.getTitle().contains("A new title"));*/

			driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();
			Set<String>  newWindows= driver.getWindowHandles();
			for(String newin: newWindows)
			{
				if(!newin.equalsIgnoreCase(parentWindowName))
				{
					driver.switchTo().window(newin);
					Assert.assertTrue(driver.getTitle().contains("QA Automation"));
					driver.close();
				}
			}
			driver.switchTo().window(parentWindowName);
			Assert.assertTrue(driver.getTitle().contains("A new title"));
			
			
			driver.findElement(By.id("alert")).click();
			Alert qaAlert= driver.switchTo().alert();
			qaAlert.accept();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	@AfterTest
	public void afterTest() 
	{
		driver.quit();			
	}
}
