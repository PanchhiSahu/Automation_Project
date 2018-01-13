package test_scripts;

import utils.Screenshot_Handling;
import utils.logs;

import java.io.IOException;

import org.testng.annotations.Test;

import Base_Package.Base;
import POM.Login;

public class TC01 extends Base{

	@Test
	public void TestCase1() throws IOException{
		
		Login L=new Login(driver,pr);
		L.YouTube_Login(pr.getProperty("user"),pr.getProperty("pass"));
	
		Screenshot_Handling.Take_screenshot("E:\\VERY IMP\\Automation Testing\\TC01\\Screenshot3.png", driver);
		logs.take_logs("Login Script Sucessfully Executed", "TC01");
		
	}	

}
