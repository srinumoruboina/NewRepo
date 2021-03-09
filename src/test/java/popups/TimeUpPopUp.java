package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeUpPopUp 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public static void cliclOnTimeUpPopUp()
	{
		WebDriver driver   = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("timerAlertButton")).click();
		try {
			 WebDriverWait wait = new  WebDriverWait(driver, 10);
	    	  wait.until(ExpectedConditions.alertIsPresent());
	   Alert alert 	 =  driver.switchTo().alert();
	    String text      = alert.getText();
	    System.out.println(text );
	           alert.accept();
		} catch (Exception e)
		{
			e.printStackTrace();// TODO: handle exception
		}
	}

}
