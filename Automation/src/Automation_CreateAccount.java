import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_CreateAccount {
	
	ChromeDriver driver;
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
	public void CreateAccount()
	{
		driver.findElement(By.name("firstname"));
		driver.findElement(By.name("firstname")).sendKeys("Panchhi");
		driver.findElement(By.name("lastname"));
		driver.findElement(By.name("lastname")).sendKeys("Sahu");	
		driver.findElement(By.cssSelector("input[id='u_0_q']"));
		driver.findElement(By.cssSelector("input[id='u_0_q']")).sendKeys("8766896789");
		
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).click();
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("xyzabcff");
		
		 Select Day = new Select(driver.findElement(By.cssSelector("select._5dba[id='day']")));
		 Select Month = new Select(driver.findElement(By.cssSelector("select._5dba[title='Month']")));
		 Select Year = new Select(driver.findElement(By.cssSelector("select._5dba[name='birthday_year']")));
		 
		  Day.selectByIndex(18);
		 // Month.selectByVisibleText("Dec");
		//  Year.selectByValue("1996");
		  
			List <WebElement> gender_button= driver.findElements(By.name("sex"));
			
			boolean gender_button_value=false;
			gender_button_value = gender_button.get(0).isSelected();
			
			if(gender_button_value==true)
				gender_button.get(1).click();
			else
				gender_button.get(0).click(); 
			
			WebElement create_account=driver.findElement(By.xpath("//button[@name='websubmit']"));
			
			if(create_account.isEnabled())
			{
				System.out.println("Button is enabled");
				driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			}
			else
				System.out.println("Button is disabled");
			
		//System.out.println(create_account.getText()); use to find the inner text value  of web element 
		//System.out.println(create_account.getAttribute("Class")); use to find the any attribute value of the webElement.
	
			
	}
	
	public void closeBrowser()
	{
		//driver.close();
		
	}
	
	
	
	
	 
	
}
