package com.paynet.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//only for reference, i will delete it. 
public class DemoTest {
	
	@DataProvider
	public String[][] validData()
	{
		String[][] main=new String[3][2]; 
		//i --> number of test case 
		//j --> number of arguments in @Test
		main[0][0]="John";
		main[0][1]="John123";
		
		main[1][0]="Peter";
		main[1][1]="Peter123";
		
		main[2][0]="paul";
		main[2][1]="paul123";
		
		return main;
	}
	
	
	@Test(dataProvider = "validData")
	public void validTest(String username,String password)
	{
		System.out.println("hello "+username+password);
	}
	
	

}
