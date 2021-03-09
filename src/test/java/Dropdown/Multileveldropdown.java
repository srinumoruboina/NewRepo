package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multileveldropdown
{
	static
	{
		WebDriverManager.chromedriver().setup();

	}
	@Test
	public static void multiLevelDropDown() 
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
		  System.out.println("-------------------------");
	List<WebElement> options  =  s.getOptions();
	        System.out.println(options.size());
	               for (WebElement webElement : options)
	               {
					String s1       =   webElement.getText();
					 System.out.println(s1);
				}
	          System.out.println("--------------------");
	            WebElement first =  s.getFirstSelectedOption();
	          String s2     =  first.getText();
	          System.out.println(s2);
	          System.out.println("----------------------");
	             List<WebElement>   all   =   s.getAllSelectedOptions();
	                       for (WebElement webElement : all) 
	                       {
						String s3	 =  webElement.getText();
						     System.out.println(s3);
						}



	}
}
