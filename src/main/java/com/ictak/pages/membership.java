package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class membership {
	
	WebDriver driver;
	
	@FindBy(id="dropdownMenuDocs")
	private WebElement membership;
	
	@FindBy(linkText="Corporate Membership")
	private WebElement corporatemembership;
	
	
	public membership(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickmembership()
	{
		membership.click();
		Actions action=new Actions(driver);
		action.moveToElement(membership).perform();
		
	}
	public void corporatemembership()
	{
		Actions action=new Actions(driver);
		action.moveToElement(corporatemembership).perform();
	}
	
}
