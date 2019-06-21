package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	 static XSSFWorkbook ExcelWBook;
	 static XSSFSheet ExcelWSheet;
	 public String path="C:\\Users\\sumi\\workspace\\demoqa\\src\\main\\java\\testdata\\AutomationData.xlsx";
	 public String SheetName="Sheet1";

public ExcelUtility(String path,String SheetName){
	try {
		File excel=new File(path);
		FileInputStream fis=new FileInputStream(excel);
		ExcelWBook= new XSSFWorkbook(fis);
		ExcelWSheet=ExcelWBook.getSheet(SheetName);
	} 
	catch (IOException e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	
}

public int getRowCount(){
	int RowCount = 0;
	try{
	RowCount=ExcelWSheet.getPhysicalNumberOfRows();
	System.out.println("The row count is : " +RowCount);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();	
	}
	return RowCount;
	
}

public int getColCount(){
	int ColCount=0;
	try{
	ColCount=ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("The coloumn count is : " +ColCount);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();	
	}
	return ColCount;
}

public String getCellData(int Rows, int Columns){
	String cellData = null;
	try{
	cellData=ExcelWSheet.getRow(Rows).getCell(Columns).getStringCellValue();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
	}
	
	return cellData;
}
/*
public static void main(String[] args){
	
	ExcelUtility eu=new ExcelUtility("C:\\Users\\sumi\\workspace\\demoqa\\src\\main\\java\\testdata\\AutomationData.xlsx", "Sheet1");
	eu.getRowCount();
	eu.getColCount();
	eu.getCellData(1, 0);
	
}
*/

}