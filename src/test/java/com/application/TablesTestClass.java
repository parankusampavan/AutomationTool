package com.application;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TablesTestClass {
	private WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@Test
	public void tablesTest()
	{
		try
		{
		WebElement table = driver.findElement(By.xpath("//*[@class='tsc_table_s13']"));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> tr = tbody.findElements(By.tagName("tr"));
		System.out.println(tr);
		}
		catch(Exception e)
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
