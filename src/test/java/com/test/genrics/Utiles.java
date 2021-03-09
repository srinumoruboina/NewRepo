package com.test.genrics;

import java.awt.Transparency;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.IIOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utiles 
{

	public static  String captureScreenShot( WebDriver driver)
	{


		TakesScreenshot  	ts  =   ( TakesScreenshot ) driver;
		String     s    =   ts.getScreenshotAs(OutputType.BASE64);
		return s;
	}
	
	public static String  read(int row,int cell)
	{
		String data = null;
		File fi = new File(System.getProperty("user.dir")+"/src/test/resources/test1.xlsx");
	try 
	{
		   FileInputStream fis = new FileInputStream(fi);
		    XSSFWorkbook wb = new XSSFWorkbook(fis);
		    XSSFSheet sheet = wb.getSheet("sheet1");
		    XSSFRow   row1 = sheet.getRow(row);
		    XSSFCell   cell1 = row1.getCell(cell);
		    data     = cell1.getStringCellValue();
	   }
		
	 catch (Exception e) 
	{
		e.printStackTrace();// TODO: handle exception
	}
     return data;
	}
}
