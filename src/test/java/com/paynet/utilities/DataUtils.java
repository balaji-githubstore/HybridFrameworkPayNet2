package com.paynet.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {

	@DataProvider
	public String[][] invalidCredentialData() throws IOException
	{
		String[][] main=  ExcelUtils.getSheetIntoTwoDimArray("testdata/testdata.xlsx", "invalidCredentialTest");
		return main;
	}
	
	@DataProvider
	public String[][] validCredentialData()
	{
		String[][] main=new String[2][3];
		
		main[0][0]="Admin";
		main[0][1]="admin123";
		main[0][2]="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		main[1][0]="Admin";
		main[1][1]="admin123";
		main[1][2]="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		return main;
	}
}
