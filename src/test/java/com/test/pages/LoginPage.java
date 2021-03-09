package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
   @FindBy(xpath="//div[@id='container']/../div[2]/div/div/div/div/div[2]/div/form/div/input[1]")
	private WebElement usernameTxtBx;
   
   @FindBy(xpath="//div[@id='container']/../div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
   private  WebElement passwordTxtBx;
   
   @FindBy(xpath="//div[@id='container']/../div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
   private WebElement lgnBtn;
 
 

public  LoginPage(WebDriver driver) 
{
	
 PageFactory.initElements(driver, this);
	         
 }
     public void usernameTXtBx( WebDriver driver, String username)
     {
    WebDriverWait	 wait  = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfAllElements(usernameTxtBx));
    	 usernameTxtBx.sendKeys(username);
     }
     public void   passwordTxtBx( WebDriver driver, String password)
     {
    	    WebDriverWait  wait = new WebDriverWait(driver, 10);
    	    wait.until(ExpectedConditions.visibilityOfAllElements(passwordTxtBx));
    	 passwordTxtBx.sendKeys(password );
     }
     public void clickOnlgnBtn(WebDriver driver)
     {
    	      WebDriverWait wait   = new WebDriverWait(driver, 10);
    	      wait.until(ExpectedConditions.elementToBeClickable(lgnBtn));
    	      lgnBtn.click();
     }
 
 
}
