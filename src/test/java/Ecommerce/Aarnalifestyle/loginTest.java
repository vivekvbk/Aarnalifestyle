package Ecommerce.Aarnalifestyle;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Ecommerce.pageObjects.loginPageobj;

public class loginTest extends baseClass {

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

	}

}
