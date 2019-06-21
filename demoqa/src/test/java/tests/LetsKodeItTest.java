package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LetsKodeIt;
import util.ExcelUtility;
import util.TestUtil;

public class LetsKodeItTest extends TestBase{
	public String path="C:\\Users\\sumi\\workspace\\demoqa\\src\\main\\java\\testdata\\AutomationData.xlsx";
	 public String SheetName="Sheet1";
	
	public Object[][] testData(String path,String SheetName){
		ExcelUtility eu=new ExcelUtility(path, SheetName);	
		 
		int RowsCount=eu.getRowCount();
		int ColumnsCount=eu.getColCount();
		Object data[][] =new Object [RowsCount-1][ColumnsCount];
		for(int i=1;i<RowsCount;i++){
			
			for(int j=0;j<ColumnsCount;j++){
				
				String cellValue=eu.getCellData(i, j);
				data[i-1][j]=cellValue;
			}
			System.out.println();			
		}
				
		return data;
		
	}
	
	
	@DataProvider(name="loginData")
	public Object[][] getData(){
		Object[][] dataFromExcel=testData("C:\\Users\\sumi\\workspace\\demoqa\\src\\main\\java\\testdata\\AutomationData.xlsx","Sheet1");
		return dataFromExcel;
	}
	
	
	@Test(dataProvider="loginData")
	public void init(String username, String password) {
	//System.out.println(username +"|"+ password);
	LetsKodeIt LKI=PageFactory.initElements(driver, LetsKodeIt.class);
	LKI.loginPage(username, password);
		
	} 
	
	
}
