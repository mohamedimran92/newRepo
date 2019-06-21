package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import util.TestUtil;

public class RegistrationLink extends TestUtil {
	WebDriver driver;
	Actions action;

	public RegistrationLink(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='basicBootstrapForm']/div[1]/div[1]/input")
	WebElement firstName;
	@FindBy(how = How.XPATH, using = ".//*[@id='basicBootstrapForm']/div[1]/div[2]/input")
	WebElement lastName;
	@FindBy(how = How.XPATH, using = ".//*[@id='eid']/input")
	WebElement emailAddress;
	@FindBy(how = How.XPATH, using = ".//*[@id='basicBootstrapForm']/div[4]/div/input")
	WebElement phone;
	@FindBy(how = How.XPATH, using = ".//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input")
	WebElement genderButton;
	@FindBy(how = How.XPATH, using = ".//*[@id='countries']")
	WebElement CountryDropDown;
	@FindBy(how = How.XPATH, using = ".//*[@id='countries']//*[text()='India']")
	WebElement selectingCountry;
	@FindBy(how = How.XPATH, using = ".//*[@id='yearbox']")
	WebElement clickYear;
	@FindBy(how = How.XPATH, using = ".//*[@id='basicBootstrapForm']/div[11]/div[2]/select")
	WebElement clickingMonth;
	@FindBy(how = How.XPATH, using = ".//*[@id='daybox']")
	WebElement clickingDay;
	@FindBy(how = How.XPATH, using = ".//*[@id='firstpassword']")
	WebElement enteringPassword;
	@FindBy(how = How.XPATH, using = ".//*[@id='secondpassword']")
	WebElement confirmPassword;
	@FindBy(how=How.XPATH, using= ".//*[@id='imagesrc']")
	WebElement Browse;
	@FindBy(how = How.XPATH, using = ".//*[@id='submitbtn']")
	WebElement submit;

	public void registrationInfo() throws Exception {
		TestUtil TU = new TestUtil();
		TU.propertiesFileReader();
		String fName = prop.getProperty("LastName");
		String lName = prop.getProperty("FirstName");
		String email = prop.getProperty("Email");
		String phoneNum = prop.getProperty("Phone");
		String country = prop.getProperty("Country");
		String year = prop.getProperty("Year");
		String month = prop.getProperty("Month");
		String day = prop.getProperty("Day");
		String pswd = prop.getProperty("Password");
		String verifyPswd = prop.getProperty("VerifyPassword");
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		emailAddress.sendKeys(email);
		phone.sendKeys(phoneNum);
		genderButton.click();
		Select dropDownCountry = new Select(CountryDropDown);
		dropDownCountry.selectByVisibleText(country);
		Select dropDownYear = new Select(clickYear);
		dropDownYear.selectByVisibleText(year);
		Select dropDownMonth = new Select(clickingMonth);
		dropDownMonth.selectByVisibleText(month);
		Select dropdown = new Select(clickingDay);
		dropdown.selectByVisibleText(day);
		enteringPassword.sendKeys(pswd);
		confirmPassword.sendKeys(verifyPswd);
		Browse.click();
		driver.switchTo().frame(0);
		Runtime.getRuntime().exec("E:\\testing\\eclipse-standard-luna-R-win32\\FileUpload.exe");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		submit.click();
		

	}

}
