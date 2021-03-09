package Frames;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumframes 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public static void seleniumFrames( ) throws InterruptedException
	{
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		WebElement text	   =driver.findElement(By.xpath("//header[@id='header']/../div[3]/h2"));
		int yaxix     = text.getLocation().getY();
		JavascriptExecutor jse  =    (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,"+yaxix+")");

		driver.findElement(By.xpath("//header[@id='header']/../div[3]/table/tbody/tr[2]/td[6]/a[4]")).click();
		driver.findElement(By.xpath("//a[.= 'Frames']")).click();

		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

		WebElement     classframe    = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		driver.switchTo( ).frame(classframe);
		driver.findElement(By.xpath("//a[.='org.openqa.selenium']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		WebElement packageListFrame	= driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(packageListFrame);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='org.openqa.selenium']")).click();	
		Thread.sleep(1000);
		driver.navigate().back();
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		Thread.sleep(1000);
		// driver.navigate().back();
		WebElement   packageframe       =   driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
		driver.switchTo().frame(packageframe);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='AbstractAnnotations']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.switchTo().frame(classframe);
		Thread.sleep(1000);


		//WebElement text1 =   driver.findElement(By.xpath("//a[.='org.openqa.selenium.grid']"));
		//int   yaxis      =   text1.getLocation().getY();
		//((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		JavascriptExecutor jse1 =(JavascriptExecutor)   driver;
		                 jse1.executeScript("scroll(0,300)");
		                        
		//jse1.executeScript("window.scrollTo(0,"+yaxis+")");
		Thread.sleep(2000);
		//text1.click();
		driver.findElement(By.xpath("//a[.='org.openqa.selenium.grid']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.switchTo().frame(packageListFrame);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='org.openqa.selenium.chrome']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.switchTo().frame(packageframe);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='AbstractDriverOptions']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.quit();














	}	}