package com.ictak.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {
	
	WebDriver driver;
	
	@FindBy(css="button[class='btn btn-white mt-4']")
	private WebElement getstarted;
	
	@FindBy(css="a[class='btn btn-sm bg-gradient-info mb-0 me-1 mt-2 mt-md-0']")
	private WebElement login;
	
	@FindBy(css="input[name='email']")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(css="div[class='text-center']")
	private WebElement signin;
	
	
	
	public AdminLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public void clickgetstarted()
	{
		getstarted.click();
		
	}
	public void clicklogin()
	{
		login.click();
	}
	
	public void clickUsername()
	{
		username.click();
	}

	public void setUserName(String strUserName)
	{
	
		username.sendKeys(strUserName);
		
	}
    public void setPassword(String intpassword)
    {
    	password.sendKeys(intpassword);
    }
	public void clicksignin()
	{
		signin.click();
	}
    
   
    
    
}
