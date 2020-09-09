package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest implements AutoConstant {
	public WebDriver driver;
	@BeforeTest
	public void openBroser() {
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		}
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
