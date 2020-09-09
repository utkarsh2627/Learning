package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public WebDriver driver;
	public void selectByVisible(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectByValue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void selectByIndex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void actionClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.click(element).perform();
	}
	public void actionContextClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void actionDoubleClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void actionDragAndDrop(WebDriver driver,WebElement source,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}public void actionMoveToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void robotEnter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void alertConcept() {
		//driver.switchTo().alert().accept();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
}
