package com.test.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailPage {
	 @FindBy(xpath="//div[@id='container']/div/div[3]/div/div[2]/div[5]/div/div[2]/div/ul/li[4]/a")
	 private WebElement sizeBx;
	 
	 @FindBy(xpath="//div[@id='container']/div/div[3]/div/div/div[2]/div/ul/li[2]")
	 private WebElement byBtn;
	 
	 @FindBy(xpath="//div[@id='container']/div/div[2]/div/div/div[3]/div/div/div/div/div[3]/span[2]")
	 private WebElement continueBtn;

 
    public DetailPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickonSizeBx(WebDriver driver)
	 {
    	((JavascriptExecutor)driver).executeScript("scroll(0,500)");
    	 WebDriverWait	 wait  = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.elementToBeClickable(sizeBx));
		 sizeBx.click();
	 }
	 public void clickonByBtn(WebDriver driver)
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(byBtn));
		 byBtn.click();
	 }
	 public void continueBtn(WebDriver driver)
	 {
		  WebDriverWait  wait   = new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
		 continueBtn.click();
	 }
}
