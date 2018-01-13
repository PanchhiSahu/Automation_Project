package Base_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	protected static ChromeDriver driver;
	protected Properties pr;
	@BeforeMethod
	public void Load_Browser() throws IOException
	{
		  System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.youtube.com");	
	      driver.manage().window().maximize();	      
		  File f=new File("E:\\Selenium\\My_Workspace\\Automation\\test-output\\OR.properties");
		  FileInputStream fi=new FileInputStream(f);
		  pr=new Properties();
		  pr.load(fi);
	     
	}
	
	@AfterMethod
	public void CLose_Browser()
	{
		
		//driver.close();
	}
	
}
