package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationPopup
{
	static

	{
		WebDriverManager.chromedriver().setup();
	}
	public static void confirmationPopUp()
	{
		WebDriver  driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
		try {
			WebDriverWait wait = new  WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert	    =  driver.switchTo().alert();
			String     text   =   alert.getText();
			System.out.println(text);
			alert.accept();
		} catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
