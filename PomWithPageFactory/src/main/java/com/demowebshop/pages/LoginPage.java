package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demowebshop.utilities.PageUtility;

public class LoginPage extends PageUtility{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	WebElement loginPage = driver.findElement(By.xpath("//div[@class='page login-page']"));
	public boolean isLoginPageLoaded()
	{
		waitForElementTobeVisible(driver, loginPage, 15);
		return getElementDisplayedStatus(loginPage);
	}

}
