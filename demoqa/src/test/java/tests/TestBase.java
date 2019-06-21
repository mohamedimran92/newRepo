package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import util.ExcelUtility;

public class TestBase 	{
	public static WebDriver driver=null;
	
	
	@BeforeSuite
	public void initialization(){
		driver=new FirefoxDriver();
	
		//System.setProperty("webdriver.chrome.driver", "E:\\testing\\eclipse-standard-luna-R-win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://learn.letskodeit.com/"); // For registration page
		//driver.get("https://demoqa.com/");//For HomePage
		//driver.get("http://demo.automationtesting.in/Register.html"); //Registration page
		driver.get("https://www.guru99.com/");
		
	}
	/*
	@BeforeTest
	public void loginButtonClick(){
		driver.findElement(By.xpath(".//*[@id='navbar']/div/div/div/ul/li[2]/a")).click();
	}
	*/
	@AfterSuite
	public void TeardownTest(){
		//TestBase.driver.quit();
	}
	

}


//for loading configurations from properties files
//initializing webdriver
//including implicit waits
//extent reports
//create an object for FileInputStream to read data
