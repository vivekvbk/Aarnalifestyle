package Ecommerce.pageObjects;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.Aarnalifestyle.Action;
import Ecommerce.Aarnalifestyle.baseClass;

public class loginPageobj extends baseClass {
	
	
	Action action=new Action();
	public loginPageobj(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	@FindBy(xpath="/html[1]/body/app-root/app-navigation/header/div[1]/div[2]/ul/li[3]")
   private WebElement signInBtn;
	
	@FindBy (xpath="//input[@placeholder='Mobile Number or EmailID']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@placeholder='Password']")
	private WebElement passWord;
	
	@FindBy (xpath="//button[@type='button'][normalize-space()='LOGIN']")
	private WebElement loginBtn;
	

	
	public void login(String uname, String password)
	{
		action.click(driver, signInBtn);
		
	}
	
	public void Username(String uname, String password)
	{
		
		action.type(driver, passWord);
		action.type(driver, passWord);
		action.click(driver, loginBtn);
		
	}
	}
	



