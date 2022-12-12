package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseReg {
	
	WebDriver driver;
	
	@FindBy(css="a[routerlink='/adminpage/registered-users']")
	private WebElement coursereg;
	public WebElement getCourseReg()
	{
		return coursereg;
	}
	
	@FindBy(css="button[target='_blank']")
	private WebElement download;
	public WebElement getDownload()
	{
		return download;
	}
	
	public CourseReg (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//public void Coursereg()
	//{
//		coursereg.click();
//		download.click();
//	}

	public void Coursereg() 
	    {
		coursereg.click();
		}
	
	public void download()
	{
		download.click();
	}
	

}
