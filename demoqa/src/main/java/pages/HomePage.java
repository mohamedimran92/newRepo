package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage{
	WebDriver driver;
	Actions action;
public HomePage(WebDriver driver) {
		this.driver=driver;
	}

@FindBy(how=How.XPATH, using=".//*[@id='sidebar']/aside[1]/ul/li[1]/a") WebElement sortable;
@FindBy(how=How.XPATH, using=".//*[@id='sortable']/li[1]") WebElement item1;
@FindBy(how=How.XPATH, using=".//*[@id='sortable']/li[2]") WebElement item2;
@FindBy(how=How.XPATH, using=".//*[@id='sidebar']/aside[1]/ul/li[2]/a") WebElement selectable;
@FindBy(how=How.XPATH, using=".//*[@id='selectable']/li[3]") WebElement item3;
@FindBy(how=How.XPATH, using=".//*[@id='selectable']/li[4]") WebElement item4;
@FindBy(how=How.XPATH, using=".//*[@id='sidebar']/aside[1]/ul/li[3]/a") WebElement resizable;
@FindBy(how=How.XPATH, using=".//*[@id='resizable']") WebElement resizableTextBox;
@FindBy(how=How.XPATH, using=".//*[@id='content']") WebElement contentBox;
@FindBy(how=How.XPATH, using=".//*[@id='sidebar']/aside[1]/ul/li[4]/a") WebElement droppableClick;
@FindBy(how=How.XPATH, using=".//*[@id='draggable']") WebElement sourceElement;
@FindBy(how=How.XPATH, using=".//*[@id='droppable']") WebElement destinationElement;

	public void getTittleOfThePage(){
	String heading=driver.getTitle();
	System.out.println("The title of the page is: " +heading );
		
	}
	
	public void clickSortable(){
		sortable.click();
		action=new Actions(driver);
		action.clickAndHold(item2).dragAndDrop(item1, item2).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
public void multiSelect(){
	selectable.click();
	action=new Actions(driver);
	action.clickAndHold(item3).build().perform();
	action.clickAndHold(item4).build().perform();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	action.release();
	
}
/*
public void resizable(){
	resizable.click();
	action.clickAndHold(resizableTextBox).moveByOffset(0, 100).build().perform();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	contentBox.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
	*/
	public void droppable(){
		droppableClick.click();
		action.clickAndHold(sourceElement).dragAndDrop(sourceElement, droppableClick).click().perform();
		action.release();
	}
	
}
