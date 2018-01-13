package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04 {

	WebDriver driver;
	@BeforeMethod
	public void  LoadDriver()
	{  
		  System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	      driver.get("https://www.youtube.com");
	      driver.manage().window().maximize();
	} 
	
	@Test
	public void Subscribe_Channels() throws InterruptedException
	{
		driver.findElement(By.cssSelector("paper-button[id='button']")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[aria-label='Email or phone']"));
		driver.findElement(By.cssSelector("input[aria-label='Email or phone']")).sendKeys("panchhisahu4@gmail.com");
		driver.findElement(By.cssSelector("div[id='identifierNext']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[aria-label='Enter your password']"));
		driver.findElement(By.cssSelector("input[aria-label='Enter your password']")).sendKeys("21@panchhi");
		Thread.sleep(4000);
		driver.findElement(By.className("CwaK9")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list =driver.findElements(By.cssSelector("a[id='video-title']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(list.size());
		System.out.println(list.get(5).getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		list.get(5).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Subscribe']")).click();
		System.out.println("Channel Subscribed sucessfully");
		
		/*List <WebElement> sub_channel=driver.findElements(By.cssSelector("div[id='subscribe-button']"));
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		System.out.println(sub_channel.size());
		System.out.println(sub_channel.get(1).getText());
		sub_channel.get(1);
		System.out.println("Channel Subscribed sucessfully");
		*/

	}
	
	@AfterMethod
	public void Browser_Close()
	{
		//driver.close();
	}
	
}
