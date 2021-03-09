package com.test.scripts;

import java.util.Set;

import org.testng.annotations.Test;



import com.test.genrics.BaseTest;
import com.test.genrics.ReadProperties;
import com.test.genrics.Utiles;
import com.test.pages.DetailPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class TestDetailsPage extends BaseTest
{
	@Test
	public void testDetailPage()
	{
		test = extent.createTest("Test DetailesPage"); 
		ReadProperties rp = new ReadProperties();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		DetailPage dp = new DetailPage(driver);
		lp.usernameTXtBx(driver, rp.getUserName());
		lp.passwordTxtBx(driver, rp.getPassword());
		lp.clickOnlgnBtn(driver);
		int row = 0;
		int cell = 0;
		hp.clickOnSerchBx(driver, Utiles.read(row, cell));
		hp.clickONSerchBtn(driver);
		hp.clickonjerkinBtn(driver);
		String   pwh  = driver.getWindowHandle();
		System.out.println(pwh);
		
		Set<String>  set   = driver.getWindowHandles();
		for (String string : set) 
		{
			if(!string.equals(pwh))
			{
				driver.switchTo().window(string);
				dp.clickonSizeBx(driver);
				dp.clickonByBtn(driver);
				dp.continueBtn(driver);	
			}
		}
		

	}
}
