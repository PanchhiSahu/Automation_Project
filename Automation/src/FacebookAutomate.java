import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookAutomate {

	WebDriver driver;
	@Before
public void  LoadDriver()
{  
  try{
	  System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
	  driver=new ChromeDriver();
      driver.get("http://www.facebook.com");	
		}catch(NoClassDefFoundError ex)
		{
			ex.printStackTrace();
		}
}

@Test
public void SignupActivity()
{
    driver.findElement(By.id("email")).click();
	driver.findElement(By.id("email")).sendKeys("panchhisahu4@gmail.com");
	driver.findElement(By.name("pass")).click();
	driver.findElement(By.name("pass")).sendKeys("xxxxxxx");
	
}

@After
public  void Login()
{
	driver=new ChromeDriver();
	driver.findElement(By.id("u_0_2")).click();
	//driver.close();
	
}





}