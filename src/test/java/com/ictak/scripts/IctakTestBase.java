package com.ictak.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class IctakTestBase {
	
	WebDriver driver;
	
	public static Properties prop=null;
//	String driverPath=System.getProperty("user.dir")+File.separator+"drivers"+File.separator+"chromedriver.exe";
	String driverPath="C:\\Users\\user\\eclipse-workspace\\ICTAKfinal\\drivers\\chromedriver.exe";
//	System.out.println(driverPath);
//	System.setProperty("webdriver.chrome.driver", driverPath);
	
	public static void ictakTestBase()
	{
		try 
		{
			
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\ICTAKfinal\\src\\test\\resources\\config.properties");
		prop.load(ip);	
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}
	
	@BeforeTest
	public void onSetup()
	{
		ictakTestBase();
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver=new FirefoxDriver();
			System.out.println("firefox not installed");
	}

		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
       }
//	@AfterTest
//	public void close()
//	{
//	driver.close();	
//	}
//	
	}
