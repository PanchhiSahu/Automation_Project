package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Handling {

	public static void Take_screenshot(String path,ChromeDriver driver) throws IOException
	{
		File f=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File (path));
	}
	
}
