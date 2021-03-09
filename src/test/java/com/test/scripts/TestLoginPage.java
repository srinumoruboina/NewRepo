package com.test.scripts;




import org.testng.annotations.Test;

import com.test.genrics.BaseTest;
import com.test.genrics.ReadProperties;
import com.test.pages.LoginPage;

public class TestLoginPage extends BaseTest
{

	@Test
	public void testlogin()
	{
		System.out.println(" Login test");
		test=extent.createTest("logintest");
		ReadProperties   rp = new ReadProperties();
		LoginPage lp = new LoginPage(driver);
		     lp.usernameTXtBx(driver, rp.getUserName());
		     lp.passwordTxtBx(driver, rp.getPassword());
		     lp.clickOnlgnBtn(driver);
	}
}



















