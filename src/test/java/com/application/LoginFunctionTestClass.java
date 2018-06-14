package com.application;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFunctionTestClass extends LoginClass
{

	private WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan.parankusam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}	

	@Test(priority = 2,enabled = false)			
	public void testcase1() 
	{	
		try 
		{
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page"));

			//loginObj.register(driver).sendKeys("pavan");
			driver.findElement(emailTextBox).sendKeys("Pavan");


			Thread.sleep(1000);
		}
		catch (Exception e)
		{

		}
	}	

	@Test(priority =1 ,enabled = false)
	public void testcase2()
	{
		driver.findElement(pwdTextBox).sendKeys("abc");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testcase3()

	{
		try
		{
			driver.findElement(registerButton).click();
			Assert.assertTrue(driver.getPageSource().contains("Sign up as a new user"));

			Select personTitle = new Select (driver.findElement(selectTitle));
			for (int i =0 ;i <personTitle.getOptions().size();i++)
			{
				System.out.println(personTitle.getOptions().get(i).getText());
			}
			personTitle.selectByVisibleText("Mr");
			driver.findElement(firtName).sendKeys("Pavan");
			driver.findElement(surName).sendKeys("Parankusam");
			List<WebElement> tagNameInput = driver.findElements(phoneNo);
			tagNameInput.size();
			for (WebElement tag :tagNameInput)
			{
				if(tag.getAttribute("name").contains("phone"))
				{
					tag.sendKeys("9703486600");
				}
			}
			WebElement radioFull = driver.findElement(fullRadioButton);
			Assert.assertTrue(radioFull.isSelected());
			driver.findElement(provisionalButton).click();
			
			Select licensePeriod = new Select(driver.findElement(licencePeriod));
			System.out.println(licensePeriod.getOptions().size());
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
