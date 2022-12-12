package com.ictak.pages;

import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

      public class Courses {
	
	   WebDriver driver;

       @FindBy(xpath="//*[@class=\"nav-link text-white\" and @href=\"/adminpage/courses\"]")
       private WebElement courses;
       
     public  WebElement getCourse()
       {
    	   return courses;
       }
	   
//	   @FindBy(linkText="courses")
//	   private WebElement courses;
	   
	   @FindBy(xpath = "//a[@class=\"btn bg-gradient-primary btn-sm mb-0\" and @href=\"/adminpage/addcourses\"]")
	   private WebElement newCourse;
	   
	   public  WebElement getnewourse()
       {
    	   return newCourse;
       }
	   
//	   @FindBy(css="input[formcontrolname='title'][class='form-control ng-pristine ng-invalid ng-touched']")
//			   
//	   private WebElement coursetitle;
	   @FindBy(css="input[formcontrolname^='title']")
	   private WebElement coursetitle;
	   public  WebElement getcoursetitle()
       {
    	   return coursetitle;
       }
	   
	   @FindBy(id="richtexteditor_2023600528_0_rte-edit-view")
	   private WebElement shortdescription;
	   
	   public  WebElement getshortdescription()
       {
    	   return shortdescription;
       }
	   
	   
	   
	   
	   @FindBy(css="input[formcontrolname^='name']")
	   private WebElement courseShortname;
	   public  WebElement getcourseShortname()
       {
    	   return courseShortname;
       }
	   
	   @FindBy(css="input[formcontrolname^='type']")
	   private WebElement coursetype;
	   
	   
	   public  WebElement getcoursetype()
       {
    	   return coursetype;
       }
	   
	 //  Select se=new Select(driver.findElement(By.xpath("//select[@class='form-select ng-pristine ng-valid ng-touched']")));
	   
	   
	   
	   
//	   
       @FindBy(xpath="//select[@name='reg']")
	   private WebElement registrationstatus;
       
       public  WebElement getregistrationstatus()
       {
    	   return registrationstatus;
       }
	   
	   @FindBy(xpath="//select[@name='cat']")
	   private WebElement coursecategory;
	   
	   public  WebElement getcoursecategory()
       {
    	   return coursecategory;
       }
	   
	   @FindBy(id="richtexteditor_2023600528_1_rte-edit-view")
	   private WebElement aboutcourse;
	   
	   public  WebElement getaboutcourse()
       {
    	   return aboutcourse;
       }
	   
	   @FindBy(css="input[formcontrolname^='entrance']")
	   private WebElement entranceexamdate;
	   
	   public  WebElement getentranceexamdate()
       {
    	   return entranceexamdate;
       }
	   
	   @FindBy(css="input[formcontrolname^='commencement']")
	   private WebElement commencement;
	   
	   public  WebElement getcommencement()
       {
    	   return commencement;
       }
	   
	   @FindBy(css="input[formcontrolname^='orientation']")
	   private WebElement orientation;
	   
	   public  WebElement getorientation()
       {
    	   return newCourse;
       }
	   
	   @FindBy(css="input[formcontrolname^='sdate']")
	   private WebElement lastdate;
	   
	   public  WebElement getlastdat()
       {
    	   return lastdate;
       }
	   
	   @FindBy(css="input[formcontrolname^='fee']")
	   private WebElement coursefee;
	   
	   public  WebElement getcoursefee()
       {
    	   return coursefee;
       }
	   
	   @FindBy(css="input[formcontrolname^='regfee']")
	   private WebElement regfee;
	   public  WebElement getregfee()
       {
    	   return  regfee;
       }
	   
	   @FindBy(css="input[formcontrolname^='duration']")
	   private WebElement duration;
	   public  WebElement getduratio()
       {
    	   return duration;
       }
	   
	   @FindBy(css="div[id='richtexteditor_2023600528_2_rte-edit-view']")
	   private WebElement objectives;
	   public  WebElement getobjectives()
       {
    	   return objectives;
       }
	   @FindBy(css="input[formcontrolname^='sample']")
	   private WebElement sample;
	   public  WebElement getsample()
       {
    	   return sample;
       }
	   @FindBy(css="input[formcontrolname^='placement']")
	   private WebElement placement;
	   public  WebElement getplacement()
       {
    	   return placement;
       }
	   @FindBy(css="input[formcontrolname^='intern']")
	   private WebElement internship;
	   public  WebElement getinternship()
       {
    	   return internship;
       }
	   @FindBy(css="input[formcontrolname^='img']")
	   private WebElement fileupload;
	   public  WebElement getfileupload()
       {
    	   return fileupload;
       }
	   @FindBy(css="input[id='flexSwitchCheckDefault']")
	   private WebElement active;
	   public  WebElement getactive()
       {
    	   return active;
       }
	   @FindBy(xpath="//button[@class='btn bg-gradient-primary w-100 my-4 mb-2']")
	   private WebElement addcourse;
	   public  WebElement getaddcourse()
       {
    	   return addcourse;
       }
	   @FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	   private WebElement ok;
	   public  WebElement getok()
       {
    	   return ok;
       }
		public Courses(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);	
		}

	public void clickCourses()
	   {
		   courses.click();
	   }
	   
//	   public void clicknewCourse()
//       {
//		   newCourse.click();
//	   }
//	   
//
//	
	   public void setcoursetitle()
	   {
		coursetitle.sendKeys("coursetitle") ;
	   }
	   
	   public void setcourseshortname()
       {
		   courseShortname.sendKeys("qa");
       }

	public void clicknewCourse() {
		// TODO Auto-generated method stub
		newCourse.click();
	}
	public void coursetype()
	{
		coursetype.sendKeys("cs");
	}
	public void shortdescription()
	{
		shortdescription.sendKeys("zxcvbnmasdfghjklqwertyuiop");
	}
	
	public void registrationstatus()
	{
		registrationstatus.click();
		Select dropdown=new Select(registrationstatus);
		dropdown.getOptions().get(1).click();
	}
	public void coursecategory()
	{
		coursecategory.click();
		Select dropdown=new Select(coursecategory);
		dropdown.getOptions().get(1).click();
	}
	public void aboutcourse()
	{
		aboutcourse.sendKeys("software testing course ");
	}
	
	public void entranceexamdate()
	{
		entranceexamdate.click();		
		entranceexamdate.sendKeys("25122022");
	}
	public void commencement()
	{
		commencement.click();
		commencement.sendKeys("26122022");
	}
	public void orientation()
	{
		orientation.click();
		orientation.sendKeys("27122022");
	}
	public void lastdate()
	{
		lastdate.click();
		lastdate.sendKeys("28122022");
	}
	public void coursefee()
	{
		coursefee.sendKeys("20000");
	}
	public void regfee()
	{
		regfee.sendKeys("250");
	}
	public void duration()
	{
		duration.sendKeys("6 months");
	}
	public void objectives()
	{
		objectives.sendKeys("asdffffffffffffffffffff");
	}
	public void sample()
	{
		sample.sendKeys("what is stlc");
	}
	
	public void placement()
	{
		placement.sendKeys("qwertyuiopp");
	}
	public void internship()
	{
		internship.sendKeys("sdsdsdsd");
	}
	public void fileupload()
	{
		fileupload.sendKeys("C:\\Users\\hp\\Desktop\\NITHIN\\Software-Testing-1280x720.jpg");
	}
	
	public void active()
	{
		active.click();
	}
	public void addcourse()
	{
		addcourse.click();
	}
	public void clickok()
	{
		ok.click();
		
	}
	
	
	
}  
