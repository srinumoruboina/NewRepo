package com.test.genrics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
     Properties pro;
    public  ReadProperties()
    {
    
     File  	fil   = new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
    try 
    {
		pro = new Properties();
		 FileInputStream fis = new FileInputStream(fil);
		    pro.load(fis);
	} catch (Exception e) 
    {
		// TODO: handle exception
	}
    }
    public String getUrl()
    {
    String s	=pro.getProperty("url");
	return s;
    }
     public String getUserName()
     {
    	String s = pro.getProperty("username");
		return s;
     }	
	 public   String getPassword()      
		{
	String s	= 	pro.getProperty("password");
			return s;
		
	
	
	
	}
     }	 
    	
    
	