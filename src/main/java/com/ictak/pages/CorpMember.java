package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorpMember {
	
	WebDriver driver;
	
	@FindBy(css="a[routerlink='/adminpage/corporate']")
	private WebElement corpmember;
	
	@FindBy(css="button[target='_blank']")
	private WebElement download;
	
	
	public CorpMember(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void corpmember()
	
	{
		corpmember.click();
	}
	
    public void download()
    
    {
    	download.click();
    }
}
