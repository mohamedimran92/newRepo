package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends TestBase {

	@Test
	public void init(){
		HomePage hp=new HomePage(driver);
		hp.getTittleOfThePage();
		HomePage hp1=PageFactory.initElements(driver, HomePage.class);
		hp1.clickSortable();
		hp1.multiSelect();
		//hp1.resizable();
		hp1.droppable();
	}

	

}
