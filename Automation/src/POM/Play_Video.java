package POM;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Screenshot_Handling;

public class Play_Video {

	ChromeDriver driver;
	public Play_Video(ChromeDriver driver)
	{
		this.driver=driver;	
	}
	
	public void YouTube_Play_Video() throws IOException
	{
		List<WebElement> list =driver.findElements(By.cssSelector("a[id='video-title']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(list.size());
		System.out.println(list.get(5).getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		list.get(5).click();
		driver.findElement(By.cssSelector("button.style-scope.yt-icon-button")).click();
		Screenshot_Handling.Take_screenshot("E:\\VERY IMP\\Automation Testing\\TC01\\Screenshot1.png", driver);
		System.out.println("Video Clicked Sucessfully");
		
	}
}
