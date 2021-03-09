package com.test.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.genrics.BaseTest; 
import com.test.pages.LoginPage;

public class InvalidLoginPage extends BaseTest
{
	@Test(dataProvider="login")
	public void login(String username, String password)
	{
		System.out.println("logintest");
		test=extent.createTest("logintest");
		LoginPage  lp  = new LoginPage(driver);
	    lp.usernameTXtBx(driver, username);
		lp.passwordTxtBx(driver, password);
		lp.clickOnlgnBtn(driver);
	}
	
	
	@DataProvider (name="login")
	public String[][] data() 
	{
		String[][] test=null;
	
		try
		{
			FileInputStream fis  =new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/data.xlsx"));	
			XSSFWorkbook   wb= new XSSFWorkbook(fis);
			XSSFSheet sheet  = wb.getSheet("Sheet1");
			XSSFRow  Row     = sheet.getRow(0);
			int NoOfCell        = Row.getLastCellNum();
			int NoOfRow      = sheet.getPhysicalNumberOfRows();

			Cell cell;
			test=new String[NoOfRow-1][NoOfCell];
			for (int i = 1; i < NoOfRow; i++)
			{
				for (int j = 0; j < NoOfCell; j++)
				{
					Row=sheet.getRow(i);		
					cell=Row.getCell(j);
					test[i-1][j]=cell.getStringCellValue();
				} 
			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return test;

	}
}
