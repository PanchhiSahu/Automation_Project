package test_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Base_Package.Base;
import POM.Login;
import POM.Play_Video;

public class TC02 extends Base {

	@Test
	public void TestCase2() throws IOException
	{
		Login L=new Login(driver,pr);
		L.YouTube_Login(pr.getProperty("user"),pr.getProperty("pass"));
		Play_Video pv=new Play_Video(driver);
		pv.YouTube_Play_Video();
	}
}
