package com.naveenautomation.PageTests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.base.TestBase;
import com.naveenautomation.pages.AccountPage;
import com.naveenautomation.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	AccountPage accountPage;

	@BeforeMethod
	public void launch() {
		intialisation();
		loginPage = new LoginPage();
		
	}

	@Test
	public void validateUserCanLoginWithValidCredentials() {
		accountPage=loginPage.SubmitLogin("peter@email.com","peter123");
		Assert.assertEquals(accountPage.getMyAccountText(), "My Account", "User not logged in");
	}
	
	@Test
	public void validateUserCanNotLoginWithInValidCredentials() {
		loginPage.SubmitLogin("peter@email.com","peter1234");
		Assert.assertEquals(loginPage.getAlertText(), "Warning: No match for E-Mail Address and/or Password.", "User logged in");
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
}