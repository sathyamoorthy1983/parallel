package Utils;

import org.testng.Assert;

import Test.BaseTest;



public class TestUtils implements Excel 
{
	


public  Object[][] readTestData(String TestCase) {
		
		int rows = reader.getRowCount(TestCase);
		int cols = reader.getColumnCount(TestCase);
		
		Object data[][] = new Object[rows-1][cols];
		
		// reading the data from excel
		// loop through the rows
		for(int i=2;i<=rows;i++) {
			// loop through the columns
			for(int j=0;j<cols;j++) {
				data[i-2][j] = reader.getCellData(TestCase, j, i);
			}
		}
		
		return data;
	}

public boolean IsSkipped(String testcase) {
	
	int rowNum=reader.getCellRowNum("Suite1", "TestCase", testcase);
	String skipField = reader.getCellData("Suite1", "Skip", rowNum);
	
	if(skipField.equals("Y")) {
		return true;
	}		
	return false;
}



}
