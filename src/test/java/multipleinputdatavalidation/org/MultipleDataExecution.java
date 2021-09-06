package multipleinputdatavalidation.org;

import java.util.Date;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practice.org.BaseClass;
import practice.org.ProjectObjectModelLocators;

public class MultipleDataExecution extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
  browserLaunch("Chrome");
  
	}


	@AfterClass
	private void afterclass() {
  quitBrowser();

	}



	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("Start Time:" + d);

	}

	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("End Time:" + d);

	}

	@Test(dataProvider = "LoginPage", dataProviderClass= BaseClassforMultipleData.class)
	private void testcase1(String User,String Pwd) {
		launchUrl("https://www.facebook.com/");
		currentWindow();
		
		ProjectObjectModelLocators p= new ProjectObjectModelLocators();
		sendText(p.getTxtUserName(),User);
		sendText(p.getTxtPassword(),Pwd);
	}

}
