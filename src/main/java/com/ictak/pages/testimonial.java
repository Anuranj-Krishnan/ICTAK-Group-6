package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testimonial {
	
	WebDriver driver;
	
	@FindBy(css="a[href=\"/adminpage/testimony\"]")
	private WebElement testimonial;
	
	 public  WebElement gettestimonial()
     {
  	   return testimonial;
     }
	
	@FindBy(xpath ="//a[@class=\"btn bg-gradient-primary btn-sm mb-0 text-white ng-star-inserted\"] and contains(text(),'')")
	private WebElement NewTestimony;
	

	 public  WebElement getNewTestimony()
    {
 	   return NewTestimony;
    }
	
	
	@FindBy(css="input[formcontrolname^=\"name\"]")
	private WebElement name;
	
	

	 public  WebElement getname()
    {
 	   return name;
    }
	
	@FindBy(css="input[formcontrolname^=\"Org\"]")
	private WebElement org;
	
	

	 public  WebElement getorg()
    {
 	   return org;
    }
	
	@FindBy(css="textarea[formcontrolname^=\"testi\"]")
	private WebElement testimonial1;
	

	 public  WebElement gettestimonial1()
    {
 	   return testimonial1;
    }
	
	@FindBy(css="select[formcontrolname='title']")
	private WebElement coursetitle;
	

	 public  WebElement getcoursetitle()
    {
 	   return coursetitle;
    }
	
	
	@FindBy(css="input[formcontrolname='img']")
	private WebElement image;
	

	 public  WebElement getimage()
    {
 	   return image;
    }
	
	@FindBy(css="button[type=\"submit\"]")
	private WebElement submit;
	
	

	 public  WebElement getsubmit()
    {
 	   return submit;
    }
	
	
//	a[href^='/adminpage/testimony']
	
	public testimonial(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	public void clicktestimonial()
	{
		testimonial.click();
	}
	public void Newtestimony()
	{
		NewTestimony.click();
	}
    public void Newtestimonydetails()
    {
    	name.sendKeys("nithin");
    	org.sendKeys("asd");
    	testimonial1.sendKeys("sdsdsdsd");
    	coursetitle.sendKeys("java");
    	image.sendKeys("C:\\Users\\hp\\Desktop\\NITHIN\\download.png");
    	submit.click();
    }
}
