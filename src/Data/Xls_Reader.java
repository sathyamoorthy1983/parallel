package Data;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	
	public Xls_Reader(String path) {
		
		this.path=path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
		
	// returns the row count in a sheet
	public int getRowCount(String sheetName){
			int index = workbook.getSheetIndex(sheetName);
			sheet = workbook.getSheetAt(index);
			int number=sheet.getLastRowNum()+1;
			return number;
			}
			
	//returns number of columns in a sheet	
	public int getColumnCount(String sheetName){
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(0);
		return row.getLastCellNum();
	}
	
	
	// returns the data from a cell
	public String getCellData(String sheetName,int colNum,int rowNum){
		try{
				int index = workbook.getSheetIndex(sheetName);
				sheet = workbook.getSheetAt(index);
				row = sheet.getRow(rowNum-1);
				cell = row.getCell(colNum);
							
				if(cell.getCellType()==Cell.CELL_TYPE_STRING)
				  return cell.getStringCellValue();
				else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
				  return String.valueOf(cell.getNumericCellValue());
				}else 
				  return String.valueOf(cell.getBooleanCellValue());
			}
			catch(Exception e){
				return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
			}
		}
	
	public int getCellRowNum(String sheetName,String colName,String cellValue){
		for(int i=2;i<=getRowCount(sheetName);i++){
	    	if(getCellData(sheetName,colName,i).equalsIgnoreCase(cellValue)){
	    		return i;
	    	}
	    }
		return -1;
	}
	
	
	
	// returns the data from a cell
	public String getCellData(String sheetName,String colName,int rowNum){
		try{
			int index = workbook.getSheetIndex(sheetName);
			int col_Num=-1;
			sheet = workbook.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num=i;
			}
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			cell = row.getCell(col_Num);
			
			if(cell.getCellType()==Cell.CELL_TYPE_STRING)
				  return cell.getStringCellValue();
			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
				  String cellText  = String.valueOf(cell.getNumericCellValue());
				   return cellText;
			  }
			  else 
				  return String.valueOf(cell.getBooleanCellValue());
		}catch(Exception e){
				e.printStackTrace();
				return "row "+rowNum+" or column "+colName +" does not exist in xls";
			}
		}
		
}
