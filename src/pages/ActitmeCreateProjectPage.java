package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitmeCreateProjectPage {
	WebDriver driver;
	@FindBy(xpath="//div[@class='sectionDetails']//input[@placeholder='Enter Project Name']")
	private WebElement enterrProjectName;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterrProjectDescription;
	@FindBy(xpath="//div[contains(text(),'Create Project')]")
	private WebElement createProjectButton;
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;

public ActitmeCreateProjectPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void enterProjectNameMethod() {
	enterrProjectName.sendKeys("Qspider");
}
public void projectDescriptionMethod() {
	enterrProjectDescription.sendKeys("Qspider is training institutes");
}
public void createProjectButtonMethod() {
	createProjectButton.click();
}
public void cancelButtonMethod() {
	cancelButton.click();
}
}