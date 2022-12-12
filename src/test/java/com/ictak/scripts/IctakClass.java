package com.ictak.scripts;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Constants;
import com.ictak.pages.AcademicMembr;
import com.ictak.pages.AdminLogin;
import com.ictak.pages.AdminLogout;
import com.ictak.pages.CorpMember;
import com.ictak.pages.CourseReg;
import com.ictak.pages.Courses;
import com.ictak.pages.membership;
import com.ictak.pages.testimonial;
import com.ictak.utilities.Excelutilitiesict;
import com.ictak.pages.Partnership;


public class IctakClass extends IctakTestBase {
	
	
	WebDriverWait wait;

	@Test(priority=1)
     
	public void verifysignin() throws IOException {
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("verifysignin");
		AdminLogin objAdmin=new AdminLogin(driver);
	 
	//objAdmin.clickgetstarted();
	objAdmin.clicklogin();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
	String username=Excelutilitiesict.getCellData(0, 0);
	String password=Excelutilitiesict.getCellData(0, 1);
	objAdmin.setUserName(username);
	objAdmin.setPassword(password);
	System.out.println("Username :"+username+"||Password :"+password);
    objAdmin.clicksignin();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
    
    
   
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//    String expectedTitle =Constants.HOMEPAGETITLE;
//    String actualTitle =driver.getTitle();
//    Assert.assertEquals(expectedTitle,actualTitle);
    
  
	}
//	public void testAssertFunctions()
//	{
//		System.setProperty("WebDriver", "H:\\\\Eclipse workspace\\\\ICTAK\\\\drivers\\\\chromedriver.exe\"");
//		WebDriver driver=new ChromeDriver();
//		driver.navigate().to("http://64.227.132.109/LandingPage");
//		String ActualTitle=driver.getTitle();
//		String ExpectedTitle="ICT Academy of kerala";
//		Assert.assertEquals(ExpectedTitle, ActualTitle);
//		
//	}
	
	
	Courses objCourse;
	
//	
	@Test(priority=2)
//	
	public void courseTask() throws InterruptedException
	{
		System.out.println("Course Task");
		
		Courses objCourse=new Courses(driver);
		wait.until(ExpectedConditions.visibilityOf(objCourse.getCourse()));
		  System.out.println("Course Task wait completed");
		  objCourse.clickCourses();   
		  wait.until(ExpectedConditions.visibilityOf(objCourse.getnewourse())); 
		  objCourse.clicknewCourse();
		  wait.until(ExpectedConditions.visibilityOfAllElements(new WebElement[] {  
				  objCourse.getcoursetitle(),objCourse.getcourseShortname(),
				 objCourse.getcoursetype(),objCourse.getregistrationstatus(),
				 objCourse.getcoursecategory(),objCourse.getcommencement(),
				  objCourse.getlastdat(),objCourse.getactive(),
			})); 
		  
		  objCourse.setcoursetitle();
		 
		  objCourse.setcourseshortname();
     	
     	 objCourse.coursetype();
     	 objCourse.shortdescription();
     	
     	 objCourse.registrationstatus();
     	
     	objCourse.coursecategory();
     	 objCourse.entranceexamdate();
     	 objCourse.aboutcourse();
     
         objCourse.commencement();
         objCourse.orientation();
       
         objCourse.lastdate();
         objCourse.coursefee();
         objCourse.regfee();
         objCourse.duration();
         objCourse.objectives();
         objCourse.sample();
         objCourse.placement();
         objCourse.internship();
         objCourse.fileupload();
   
         objCourse.active();
         objCourse.addcourse();
wait.until(ExpectedConditions.visibilityOf(objCourse.getok()));
         objCourse.clickok();
         
         
	}
	




   testimonial objtesti;
    
	@Test (priority=8)
	public void testimonialtask() throws InterruptedException
	{
		
		testimonial objtesti=new testimonial(driver);
		wait.until(ExpectedConditions.visibilityOf(objtesti.gettestimonial()));
		objtesti.clicktestimonial();
		wait.until(ExpectedConditions.visibilityOf(objtesti.getNewTestimony()));
		objtesti.Newtestimony();
	
	}
//	@Test(priority=)
//	
//	public void membershiptask() throws InterruptedException
//	{
//		membership objmember=new membership(driver);
//		Thread.sleep(Duration.ofSeconds(20));
//		objmember.clickmembership();
//		Thread.sleep(Duration.ofSeconds(20));
//		objmember.corporatemembership();
//	}
	
	
	
	
	@Test(priority=4)
	
	public void coursereg()
	{
         System.out.println("Coursereg");
		
         CourseReg objcoursereg=new CourseReg(driver);
		
		objcoursereg.Coursereg();
	wait.until(ExpectedConditions.visibilityOf(objcoursereg.getDownload()));
		objcoursereg.download();
		 
		}
	
	AcademicMembr objAcademicmemb;
	@Test(priority=5)
	
	public void AcademicMembr()
	{
		objAcademicmemb=new AcademicMembr(driver);
		objAcademicmemb.academicmember();
		objAcademicmemb.clickdownload();
		
	}
	
	CorpMember objCorp;
	@Test(priority=6)
	
	public void CorpMember()
	
	{
		objCorp=new CorpMember(driver);
		objCorp.corpmember();
		objCorp.download();
		
	}
	Partnership  objPartnership;
	@Test(priority=7)
	
	public void Partnership()
	
	{
		objPartnership =new Partnership(driver);
		objPartnership.partnership();
		
		
	}
	
	AdminLogout  objadminlogout;
	@Test(priority=9)
	
	public void Adminlogout()
	
	{
		objadminlogout =new AdminLogout(driver);
		objadminlogout.Logout();
		
		
	}
	
	
	
	}

 
	 
 


