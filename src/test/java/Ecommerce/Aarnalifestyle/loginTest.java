package Ecommerce.Aarnalifestyle;

import java.io.IOException;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Ecommerce.pageObjects.loginPageobj;
import resources.baseClass;


public class loginTest extends baseClass {
	
	public static Logger log=LogManager.getLogger(loginTest.class.getName());
	
	@Test
	public void login() throws IOException {
		
		
		loginPageobj lp = new loginPageobj(driver);
		lp.login();
		lp.Username();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement newslater = lp.Newsletterdisplay();
		wait.until(ExpectedConditions.visibilityOf(newslater));
		lp.Newsletterdisplay();
		lp.NewsLetterpopup();
		log.error("this is error");
		log.info("This is info");
		log.fatal("This is Fatal");
		log.warn("This is Warning");
		log.fatal("This is Fatal2");
	}

}
