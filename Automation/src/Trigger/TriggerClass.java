package Trigger;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.beust.testng.TestNG;

public class TriggerClass {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		
		XmlSuite xs=new XmlSuite();
		xs.setName("Suite1");
		XmlTest xt=new XmlTest(xs);
		File f=new File("E:\\VERY IMP\\Automation Testing\\TestCases.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		int total_row =s.getRows();
		
		
		ArrayList<XmlClass> al1=new ArrayList<XmlClass>();
		
		for(int i=1;i<total_row;i++)
		{
			Cell c=s.getCell(4, i);
			if(c.getContents().equals("Y"))
			{
				Cell pkg=s.getCell(2, i);
				Cell clss=s.getCell(3, i);
				String st=pkg.getContents() + "." + clss.getContents();
				XmlClass xc=new XmlClass(st);
				al1.add(xc);	
			}
		}
		System.out.println(al1.size());
		
		xt.setClasses(al1);
		ArrayList<XmlTest> al2=new ArrayList<XmlTest>();
		al2.add(xt);
		xs.setTests(al2);
		
		ArrayList<XmlSuite> al3=new ArrayList<XmlSuite>();
		al3.add(xs);
		
		TestNG t=new TestNG();
		t.setXmlSuites(al3);
		t.run();
		
		
		
		
		

	}

}
