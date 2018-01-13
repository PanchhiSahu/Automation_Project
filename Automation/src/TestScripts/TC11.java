package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC11 {
	
	ChromeDriver driver;
	@BeforeMethod
	public void Abc()
	{
		
		//System.setProperty("webdriver.chrome.driver","E:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	@Test
	public void Bac()
	{

		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		
		
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB);
		String baseurl="https://accounts.google.com/signin";
	     driver.get(baseurl);
	     
	     WebElement t=driver.findElement(By.id("identifierId"));
	     t.sendKeys("panchhisahu4@gmail.com");
		
	     ac.sendKeys(Keys.ENTER).perform();
	     
	     WebElement t2=driver.findElement(By.cssSelector("div[id='identifierNext']"));
	     t2.sendKeys("");
	     ac.sendKeys(Keys.ENTER);
	     
		
		
	}
	

}