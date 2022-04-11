package Ecommerce.Aarnalifestyle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public WebDriver driver;
	Properties prop;

	@BeforeClass
	public WebDriver BrowserSetup() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\user\\Downloads\\Aarnalifestyle-master\\Aarnalifestyle-master\\Aarnalifestyle\\src\\test\\resources\\resources\\data.properties");
		// System.getProperty("user.dir") + "\\Configuration\\config.properties");

		
	
		prop.load(new FileInputStream("C:\\Users\\user\\Downloads\\Aarnalifestyle-master\\Aarnalifestyle-master\\Aarnalifestyle\\src\\main\\java\\Ecommerce\\Aarnalifestyle\\log4j2.xml"));
		prop.setProperty("log4j.appender.File.File", "C:\\Users\\user\\Downloads\\Aarnalifestyle-master\\Aarnalifestyle-master\\Aarnalifestyle\\logs"+ "logs.log");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		String url = prop.getProperty("url");

		// for chrome Browser
		if (BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		else if (BrowserName.equals("Firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		else if (BrowserName.equals("IE")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
	  @AfterClass public void browserClose() {
	  System.out.println("TestCases Completed"); driver.quit(); }
	 

}