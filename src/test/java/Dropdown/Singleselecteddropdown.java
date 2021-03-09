package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singleselecteddropdown 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public void singleSelectedDropdown()
	{
		WebDriver driver     = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement element    = driver.findElement(By.id("oldSelectMenu"));
		Select s     = new Select(element);
		boolean b     = s.isMultiple();
		System.out.println(b);
		s.selectByIndex(2);
		s.selectByValue("6");
		s.selectByVisibleText("Purple");
		List<WebElement>   options   = s.getOptions();
		 System.out.println(options.size());
		            for (WebElement webElement : options) 
		            {
					String   text     =   webElement.getText();	
					System.out.println(text);
					}
		
		
		 
	
	 

	}
	}
