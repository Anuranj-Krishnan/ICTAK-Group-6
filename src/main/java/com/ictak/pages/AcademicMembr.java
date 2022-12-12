package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcademicMembr {
	
	
	WebDriver driver;
	
	@FindBy(css="a[routerlink='/adminpage/academic']")
	private WebElement academicmember;
	
	@FindBy(css="button[target='_blank']")
	private WebElement download;
	
	
	public AcademicMembr (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void academicmember()
	
	{
		academicmember.click();
	}
	
	public void clickdownload()
	
	{
		download.click();
	}
	
}
