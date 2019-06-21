=ackage util

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
DateFormat currentDate;
	public void getScreenshot(WebDriver driver){
		File captureScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
			FileHandler.copy(captureScreenshot, new File("./Screenshots/Login"+currentDate+".png" ));
		}
		catch(IOException e){
			System.out.println("Unable to take screenshot:" +e.getMessage());
		}
	}
	
	public void getCurrentDateTime(){
		
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		customFormat.format(currentDate);
		System.out.println(currentDate);
	}

	

}
