import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube_Automation {
	
	WebDriver driver;
	@BeforeMethod
	public void  LoadDriver()
	{  
		  System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	      driver.get("https://www.youtube.com");	
	} 
	
	
	@Test
	public void YouTube_Home_Page() throws InterruptedException
	{
		List <WebElement> videos=driver.findElements(By.cssSelector("a[id='video-title']"));
		
		videos.get(5).getAttribute("");

		
		driver.findElement(By.linkText("Sign in")).click();
		
		//
		
		// Actions ac= new Actions(driver);
		//ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
		
		/*WebElement play=driver.findElement(By.id("video-title"));
		ac.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL); */
	
		int i=0;
		for (WebElement String : videos)
		{
			i++;
			if(i==5){
				videos.get(5).click();
			}
			
		}
		
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		
		
		
	}
	
	

}
