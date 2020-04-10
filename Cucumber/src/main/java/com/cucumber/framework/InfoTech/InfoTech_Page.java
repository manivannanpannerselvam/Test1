package com.cucumber.framework.InfoTech;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;


public class InfoTech_Page 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(InfoTech_Page.class);
	WaitHelper waitHelper;
	
	
	@FindBy(xpath=".//input[@name='txtLogin' or @id='txtLogin']")
	WebElement username;
	
	@FindBy(xpath=".//input[@name='txtPassword' or @id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath=".//input[@name='txtLogin' or @id='txtLogin']")
	WebElement successMsgObject;
	
	@FindBy(xpath=".//a[@class='dropdown-toggle' and @title='Change Apps']")
	WebElement successwelcomeobject;
	
	@FindBy(xpath=".//input[@name='btnLogin' or @value='LOGIN']")
	WebElement loginbutton;
	
	@FindBy(xpath=".//img[@id='UserImage' and @class='user-image']")
	WebElement userimage;
	
	
	@FindBy(xpath=".//input[@type='submit' and @value='Sign out']")
	WebElement signout;
	
	@FindBy(xpath=".//a[@title='Change Customer']")
	WebElement suportlogin;
	
	@FindBy(xpath=".//a[contains(text(),'Attendance') and @class='link']")
	WebElement Attendance;
	
	
	@FindBy(xpath=".//span[contains(text(),'My Leave')]")
	WebElement Employeelogin;
	
	@FindBy(xpath=".//span[contains(text(),'Administration')]")
	WebElement Administrations;
	
	@FindBy(xpath=".//a[@menu-caption='Email & 2FA Settings']")
	WebElement Email2fasetting;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabSysParam_tabEmail_chksendwelcomemail' and @type='checkbox']")
	WebElement Employeecheckbox;
	
	@FindBy(xpath=".//input[@id='chkMobileNoAccess' and @type='checkbox']")
	WebElement Mobilecheckbox;
	
	
	public InfoTech_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public void enternamefield(String username)
	{
		log.info("entering firstName.." + username);
		this.username.sendKeys(username);
		
	}
	public void enterpasswordfield(String password)
	{
		log.info("entering password.." + password);
		this.password.sendKeys(password);
	}
	
	public void loginButton() throws InterruptedException
	{
		loginbutton.click();
	}
	
	public boolean verifySuccessLoginMsg()
	{
		return new GenericHelper().isDisplayed(successMsgObject);
	}
	public boolean verifySuccesswelcomeMsg()
	{
		return new GenericHelper().isDisplayed(successwelcomeobject);
	}
	
	public void userimage() throws InterruptedException
	{
		userimage.click();
	}
	public void signout() throws InterruptedException
	{
		signout.click();
	}
	public boolean verifySuccesswelcomeMsg_Employee_id()
	{
		return new GenericHelper().isDisplayed(Employeelogin);
	}
	public boolean verifySuccessSupportlogin()
	{
		return new GenericHelper().isDisplayed(suportlogin);
	}
	public void Attendance(String Attendance) 
	{
		List<WebElement> days = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<days.size();i++)
		{
			System.out.println(days.get(i).getText());
			
			if(days.get(i).getText().equals(Attendance))
			{
				
			}
		}
	}
	
	public void Administrations() throws InterruptedException
	{
		Thread.sleep(7000);
		Administrations.click();
	}
	public void Email2fasetting() throws InterruptedException
	{
		Thread.sleep(4000);
		Email2fasetting.click();
	}
	public boolean Employeecheckbox() throws InterruptedException
	{
		if(Employeecheckbox.isSelected())
		{
			
			driver.get("http://daf5f63fa41d40aba3a56e3ecf36ee6d.cloudapp.net/Login.aspx");
			
			driver.findElement(By.xpath(".//input[@name='txtLogin' or @id='txtLogin']")).sendKeys("test444@1.com");
			
			Thread.sleep(7000);
			
			driver.findElement(By.xpath(".//input[@name='txtPassword' or @id='txtPassword']")).sendKeys("1");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//input[@name='btnLogin' or @value='LOGIN']")).click();
			return new GenericHelper().isDisplayed(Employeelogin);
		
		}
		else
		{
            driver.get("http://daf5f63fa41d40aba3a56e3ecf36ee6d.cloudapp.net/Login.aspx");
			
			driver.findElement(By.xpath(".//input[@name='txtLogin' or @id='txtLogin']")).sendKeys("test444@1.com");
			
			Thread.sleep(7000);
			
			driver.findElement(By.xpath(".//input[@name='txtPassword' or @id='txtPassword']")).sendKeys("1");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//input[@name='btnLogin' or @value='LOGIN']")).click();
			return new GenericHelper().isDisplayed(successMsgObject);
		}
	}
	
	public boolean Mobilecheckbox() throws InterruptedException
	{
		if(Mobilecheckbox.isSelected())
		{
			
			driver.get("http://daf5f63fa41d40aba3a56e3ecf36ee6d.cloudapp.net/Login.aspx");
			
			driver.findElement(By.xpath(".//input[@name='txtLogin' or @id='txtLogin']")).sendKeys("98678313");
			Thread.sleep(8000);
			driver.findElement(By.xpath(".//input[@name='txtPassword' or @id='txtPassword']")).sendKeys("1");
			Thread.sleep(4000);
			driver.findElement(By.xpath(".//input[@name='btnLogin' or @value='LOGIN']")).click();
			return new GenericHelper().isDisplayed(Employeelogin);
		
		}
		else
		{
            driver.get("http://daf5f63fa41d40aba3a56e3ecf36ee6d.cloudapp.net/Login.aspx");
			
			driver.findElement(By.xpath(".//input[@name='txtLogin' or @id='txtLogin']")).sendKeys("98678313");
			Thread.sleep(8000);
			driver.findElement(By.xpath(".//input[@name='txtPassword' or @id='txtPassword']")).sendKeys("1");
			Thread.sleep(4000);
			driver.findElement(By.xpath(".//input[@name='btnLogin' or @value='LOGIN']")).click();
			return new GenericHelper().isDisplayed(successMsgObject);
		}
	}
	

}
