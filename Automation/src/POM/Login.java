package POM;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

import Assertion.MyAssesrtion;
import junit.framework.Assert;
import utils.Screenshot_Handling;

public class Login  {
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}	
	@SuppressWarnings("deprecation")
	public void YouTube_Login(String user, String pass) throws IOException
	{
		WebElement Signin= driver.findElement(By.cssSelector(pr.getProperty("SignIn")));
		Signin.click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement Email=driver.findElement(By.cssSelector(pr.getProperty("Email")));
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Email.sendKeys(user);
		Screenshot_Handling.Take_screenshot("E:\\VERY IMP\\Automation Testing\\TC01\\Screenshot1.png", driver);
		WebElement EmailNext=driver.findElement(By.cssSelector(pr.getProperty("NextButton1")));
		EmailNext.click();
		WebElement Pswd=driver.findElement(By.cssSelector(pr.getProperty("Password")));
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Pswd.sendKeys(pass);
		Screenshot_Handling.Take_screenshot("E:\\VERY IMP\\Automation Testing\\TC01\\Screenshot2.png", driver);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement PassNext=driver.findElement(By.xpath(pr.getProperty("NextButton2")));
		PassNext.click();
		System.out.println("Login Sucessfully");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement Profile=driver.findElement(By.xpath(pr.getProperty("Click_Profile")));
		Profile.click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement actualEmail=driver.findElement(By.xpath(pr.getProperty("Check_Email")));
		String actual=actualEmail.getText();
		//Assert.assertEquals(user, actual);
		//System.out.println("Email matched");	
		
		MyAssesrtion.Verify_Profile(actual, user);
		
	}
	
	
	
	
}
