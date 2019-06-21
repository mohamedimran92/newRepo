package pages;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import util.ScreenshotUtility;

public class LetsKodeIt {

	WebDriver driver;

	public LetsKodeIt(WebDriver driver) {
		this.driver = driver;
	}
	
	//@FindBy(xpath="//span[text()='Learn Now']") WebElement LearnNow;
	//@FindBy(xpath=".//*[@id='navbar']/div/div/div/ul/li[2]/a") WebElement loginButton;
	@FindBy(id="user_email") WebElement userName;
	@FindBy(id="user_password") WebElement pwd;
	@FindBy(name="commit") WebElement login;
	
	public void loginPage(String username, String password){
		//LearnNow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//loginButton.click();
		userName.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		ScreenshotUtility ss=new ScreenshotUtility();
		ss.getScreenshot(driver);
		userName.clear();
		pwd.clear();
		boolean result= driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div/div[1]/div/div")).isDisplayed();
		assertTrue(result);
		System.out.println("...........Text is displayed correctly......");
	}
	
	
	
}
