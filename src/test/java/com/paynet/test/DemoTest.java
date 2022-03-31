package com.paynet.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoTest {

	public static void main(String[] args) throws IOException {

		
		FileInputStream file=new FileInputStream("testdata/TestData.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("invalidCredentialTest");
	
		String[][] main=new String[2][3]; 
		
		for(int r=1;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				String value=sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(value);
				main[r-1][c]=value;
			}
		}
		

		System.out.println();
	}

}








