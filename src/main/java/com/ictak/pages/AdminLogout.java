package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogout {
	
	WebDriver driver;
	
 
	@FindBy(css="a[aria-controls='ProfileNav']")
	private WebElement Admin;
	
	@FindBy(css="span[class='sidenav-normal ms-3 ps-1']")
	private WebElement logout;
	
public AdminLogout (WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Logout()

	{
		Admin.click();
		logout.click();
		
	}
	
	

	

}
