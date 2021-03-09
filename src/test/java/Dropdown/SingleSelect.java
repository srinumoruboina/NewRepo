package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelect 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	@Test
	public static void clickonSingleSelect() throws InterruptedException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement element =driver.findElement(By.id("cars"));
		Select    se     =     new Select(element);
		System.out.println(se.isMultiple());
		      se.selectByIndex(2);
		      Thread.sleep(1000);
		      se.selectByValue("opel");
		      Thread.sleep(1000);
		      se.selectByVisibleText("Audi");
		      Thread.sleep(1000);
		      se.getFirstSelectedOption();
		      Thread.sleep(1000);
		      se.getAllSelectedOptions();
		      Thread.sleep(1000);
		      se.deselectAll();
		      List<WebElement> list = se.getOptions();
		                list.size();
		                for (WebElement webElement : list) 
		                {
							 System.out.println(webElement.getText());
						}
		
		
	
	}		               
}
