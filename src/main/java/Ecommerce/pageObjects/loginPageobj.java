package Ecommerce.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.Aarnalifestyle.baseClass;

public class loginPageobj extends baseClass {

	public loginPageobj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html[1]/body/app-root/app-navigation/header/div[1]/div[2]/ul/li[3]")
	private WebElement signInBtn;

	@FindBy(xpath = "//input[@placeholder='Mobile Number or EmailID']")
	private WebElement userName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passWord;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='LOGIN']")
	private WebElement loginBtn;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-navigation[1]/div[6]/div[1]/div[1]/div[1]/button[1]/span[1]")
	private WebElement NewsletterClose;
	
	@FindBy(xpath = "/html/body/app-root/app-navigation/div[6]/div/div")
	private WebElement Newsletter;
	
	

	public void login() {
		signInBtn.click();

	}

	public void Username() {
		userName.sendKeys("9082404787");
		passWord.sendKeys("Pratik@9833450318");
		loginBtn.click();
	}

	public WebElement Newsletterdisplay() {
		boolean  popup=Newsletter.isDisplayed();
		return Newsletter;
	
	}
	public void NewsLetterpopup() {
		
		NewsletterClose.click();
	}
	
}
