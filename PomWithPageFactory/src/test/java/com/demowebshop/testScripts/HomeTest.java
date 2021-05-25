package com.demowebshop.testScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;

public class HomeTest extends Base{
	@Test
	public void verifyHomePageTitle()
	{
		HomePage home = new HomePage(driver);
		String actualPageTitle=home.getHomePageTitle();
		String expectedPageTitle = "Demo Web Shop1";
		Assert.assertEquals(actualPageTitle,expectedPageTitle, "Invalid home page title");
	}

}
