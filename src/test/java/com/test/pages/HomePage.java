package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	@FindBy(xpath="//div[@id='container']/../div[1]/div/div/div[1]/div[2]/div[2]/form/div/div/input")
	 private WebElement serchBx;
	 
	 @FindBy(xpath="//div[@id ='container']/../div[1]/div/div/div/div[2]/div[2]/form/div/button")
	 private WebElement serchBtn;
	 
	 @FindBy(xpath="//div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div[4]")
	 private WebElement jerkinBtn;

	
	 
	 public HomePage(WebDriver driver )
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public void clickOnSerchBx(WebDriver driver,String serchbx)
	 {
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(serchBx));
		 serchBx.sendKeys(serchbx);
	 }
	 public void clickONSerchBtn(WebDriver driver)
	 {
		      WebDriverWait wait  = new WebDriverWait(driver,10);
		      wait.until(ExpectedConditions.elementToBeClickable(serchBtn));
		      serchBtn.click();
	 }
	 public void clickonjerkinBtn(WebDriver driver)
	 {
		 WebDriverWait  wait= new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(jerkinBtn));
		 jerkinBtn.click();
	 }
	 
	
}
