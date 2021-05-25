package com.demowebshop.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;

public class LoginTest extends Base {
	HomePage home;
	LoginPage login;
	
	@Test
	public void verifyLoginPageLoadedorNot() {
		home = new HomePage(driver);
		login = home.clickOnLoginMenu();
		boolean result = login.isLoginPageLoaded();
		Assert.assertTrue(result,"Login Page not loaded");

	}
}
