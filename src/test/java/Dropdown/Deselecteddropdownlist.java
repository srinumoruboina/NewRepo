package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deselecteddropdownlist 
{
  static
  {
	  WebDriverManager.chromedriver().setup();
  }

@Test
public void deselectdropdown()
{
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/select-menu");
	WebElement element    = driver.findElement(By.id("cars"));
	Select s  =  new  Select(element);
	boolean     b =  s.isMultiple();
	System.out.println(b);
	  s.selectByIndex(0);
	  s.selectByValue("audi");
	  s.selectByVisibleText("Saab");
	  s.selectByIndex(2);
	 // s.deselectAll();
	  s.deselectByIndex(0);
	  s.deselectByValue("audi");
	  s.deselectByVisibleText("Saab");
	  
}	
}
