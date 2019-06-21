package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.google.common.collect.Table.Cell;

public class TestUtil {
	protected static Properties prop;
	
	public void propertiesFileReader() throws Exception{
		prop=new Properties();
	FileReader reader = new FileReader("C:\\Users\\sumi\\workspace\\demoqa\\src\\main\\java\\config\\datafile.properties");
			prop.load(reader);
}
	
}

/*
 * Utility Class (AKA Functions Class): Utility class (TestUtil.java) stores and
 * handles the functions (The code which is repetitive in nature such as waits,
 * actions, capturing screenshots, accessing excels, sending email etc.,) which
 * can be commonly used across the entire framework. The reason behind creating
 * utility class is to achieve reusability. This class extends the TestBase
 * class to inherit the properties of TestBase in TestUtil.
 */
