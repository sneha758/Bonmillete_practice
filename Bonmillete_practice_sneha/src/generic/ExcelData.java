package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData implements Auto_constant
{
     public String getData(String sheetName, int rowNumber, int cellNumber)
     {
    	 String value=null;
    	 
    	  try {
    	 //go to excel sheet
    	 FileInputStream fis=new FileInputStream(pathOfExcel);
    	
    	 Workbook wb=WorkbookFactory.create(fis);
    	 
    	value= wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
    	  }
    	  catch(Exception ex)
    	  {
    		  ex.printStackTrace();
    	  }
    	  return value;
    	 
     }
}
