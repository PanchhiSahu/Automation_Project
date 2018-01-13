package utils;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logs {
	
	public static void take_logs(String message,String TC01)
	{
		
		DOMConfigurator.configure(".//log4j.xml");
		Logger l=Logger.getLogger(TC01);
		l.info(message);
		l.trace(message);	
	}

}
