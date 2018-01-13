package Assertion;

public class MyAssesrtion {

	public static void Verify_Profile(String actual, String expected)
	{
		if(actual.equals(expected))
			System.out.println("Email Matched");
		else
			System.out.println("Email not matched");
	}	
	
}
