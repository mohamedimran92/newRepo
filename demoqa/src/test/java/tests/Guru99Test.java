package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Guru99;

public class Guru99Test extends TestBase {

	@Test
	public void init(){
		Guru99 obj=PageFactory.initElements(driver, Guru99.class);
		obj.clickingonSelenium();
	}
	
}
