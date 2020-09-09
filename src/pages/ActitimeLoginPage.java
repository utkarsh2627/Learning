package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.AutoConstant;
import generic.ExcelLibrary;

public class ActitimeLoginPage implements AutoConstant
{
	//declaration
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	private WebElement forgotyourpassworLink;
	
	@FindBy(xpath="//a[contains(text(),'actiTIME')]")
	private WebElement actitimeincLink;
	
	/*@FindBy(id="logoContainer")
	private WebElement actitimelogoImage;*/
	
	//initialization
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet, 1, 1));
		keepmeloggedinCheckbox.click();
		loginButton.click();
	}
	
	public void forgotyourpasswordMethod()
	{
		forgotyourpassworLink.click();	
	}
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}
}