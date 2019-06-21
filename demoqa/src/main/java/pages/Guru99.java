package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99  {

	WebDriver driver;

	public Guru99(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath=".//*[@id='java_technologies']/li[3]/a") WebElement selenium;
	
	
	public void clickingonSelenium(){
		selenium.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().forward();
	}
	
	
	
	
	
	
	
	
	
}
