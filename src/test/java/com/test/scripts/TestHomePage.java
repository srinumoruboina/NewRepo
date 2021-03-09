package com.test.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.test.genrics.BaseTest;
import com.test.genrics.ReadProperties;
import com.test.genrics.Utiles;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class TestHomePage extends BaseTest
{
	@Test
	  public void testHomepage( ) 
	{
    test = extent.createTest("Test Homepage");
	ReadProperties rp = new ReadProperties();
	LoginPage lp = new LoginPage(driver);
	HomePage hp = new HomePage(driver);
	  lp.usernameTXtBx(driver, rp.getUserName());
	  lp.passwordTxtBx(driver, rp.getPassword());
	  lp.clickOnlgnBtn(driver);
	  int row = 0;
	  int cell =0;
	 hp.clickOnSerchBx(driver,Utiles.read(row, cell));
	 hp.clickONSerchBtn(driver);
	 hp.clickonjerkinBtn(driver);
	  
 }
}
