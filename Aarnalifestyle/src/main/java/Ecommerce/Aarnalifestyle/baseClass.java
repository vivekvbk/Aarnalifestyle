package Ecommerce.Aarnalifestyle;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public WebDriver driver;
	Properties prop;

	@BeforeClass
	public WebDriver BrowserSetup() throws IOException {
		prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\EclipseWorkSpace\\Aarnalifestyle\\src\\test\\resources\\resources\\data.properties");
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
				
		//for chrome Browser
		if (BrowserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		else if (BrowserName.equals("Firefox")) {
			
			
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		else if (BrowserName.equals("IE")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;

	}
}
