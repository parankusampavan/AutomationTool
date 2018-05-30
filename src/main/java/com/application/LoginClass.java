package com.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass 
{
	
	
	public WebElement register(WebDriver driver )
	{
		WebElement registerButton = driver.findElement(By.id("email"));
		return registerButton;
	}
	
	public By emailTextBox = By.id("email");
	public By pwdTextBox = By.name("password");
	public By registerButton = By.linkText("Register");
	public By selectTitle = By.id("user_title");
	public By firtName = By.xpath("//input[@id='user_firstname']");
	public By surName = By.xpath("//*[contains(@name,'lastname')]");
	public By phoneNo = By.tagName("input");
	public By fullRadioButton = By.id("licencetype_t");
	public By provisionalButton = By.name("licencetype");
	public By licencePeriod = By.cssSelector("[name=licenceperiod]");
	
}
