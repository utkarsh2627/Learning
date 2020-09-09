package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.ActitimeCreateNewCustomerPage;
import pages.ActitimeHomePage;
import pages.ActitimeLoginPage;
import pages.ActitimeTasksPage;

public class CreateCustomeractitime extends BaseTest{
	@Test
	public void login() throws InterruptedException, IOException {
		
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.tasksMethod();
		ActitimeTasksPage taskPage=new ActitimeTasksPage(driver);
		taskPage.addnewMethod();
		taskPage.newcustomerMethod();
		ActitimeCreateNewCustomerPage createCustomer=new ActitimeCreateNewCustomerPage(driver);
		createCustomer.entercustomernameMethod();
		createCustomer.entercustomerdescriptionMethod();
		createCustomer.createcustomerMethod();
	}
}
