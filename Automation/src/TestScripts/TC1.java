package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC1 {
	
	WebDriver driver;
	@BeforeSuite
	public void  LoadDriver()
	{  
		  System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	      driver.get("https://www.youtube.com");	
	      driver.manage().window().maximize();
	} 
	
	@Test
	public void Click_Subscriptios() throws InterruptedException
	{
		driver.findElement(By.cssSelector("paper-button[id='button']")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[aria-label='Email or phone']"));
		driver.findElement(By.cssSelector("input[aria-label='Email or phone']")).sendKeys("panchhisahu4@gmail.com");
		driver.findElement(By.cssSelector("div[id='identifierNext']")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[aria-label='Enter your password']"));
		driver.findElement(By.cssSelector("input[aria-label='Enter your password']")).sendKeys("21@panchhi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.className("CwaK9")).click();
	   // driver.findElement(By.cssSelector("div[id='identifierNext']")).click();
	    driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	   // driver.findElement(By.linkText("Subscriptions"));
	    driver.findElement(By.linkText("Subscriptions")).click();
	
	}

	@AfterSuite
	public void Browser_Close()
	{
		//driver.close();
	}

}
