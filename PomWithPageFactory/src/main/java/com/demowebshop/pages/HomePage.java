package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
  WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	WebElement loginMenu=driver.findElement(By.xpath("//a[@class='ico-login']"));
	public String getHomePageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	public LoginPage clickOnLoginMenu()
	{
		loginMenu.click();
		return new LoginPage(driver);
	}
}
