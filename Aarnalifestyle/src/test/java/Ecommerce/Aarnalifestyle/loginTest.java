package Ecommerce.Aarnalifestyle;

import java.io.IOException;

import org.testng.annotations.Test;

public class loginTest extends baseClass {
	
	@Test
	public void login() throws IOException {
		
		driver=BrowserSetup();
		driver.get("http://rooponline.esmartretailer.com");
		
	}

}
