package tests;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.RegistrationLink;

public class RegistrationPageTest extends TestBase {
	
@Test
public void init() throws Exception{
	
	RegistrationLink registration=PageFactory.initElements(driver, RegistrationLink.class);
	registration.registrationInfo();
}


}
