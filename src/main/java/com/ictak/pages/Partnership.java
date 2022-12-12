package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Partnership {

	WebDriver driver;
	
	
	@FindBy(css="a[routerlink='/adminpage/partnership']")
	private WebElement partnership;
	
	@FindBy(css="button[target='_blank']")
	private WebElement download;
	
	
	public Partnership (WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void partnership()

	{
		partnership.click();
		download.click();
		
	}
	
}
