package Utils;

import java.util.Iterator;

import Data.Xls_Reader;

public interface Excel {
	
	public abstract Object[][] readTestData(String TestCase);
	public abstract boolean IsSkipped(String testcase);
	
	public static final Xls_Reader reader = new Xls_Reader("C:\\Program Files\\Java\\Pageobject\\Suite1.xlsx");
}
