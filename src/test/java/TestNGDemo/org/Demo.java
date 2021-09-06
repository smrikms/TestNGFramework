package TestNGDemo.org;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import practice.org.BaseClass;
import practice.org.ProjectObjectModelLocators;

public class Demo extends BaseClass {

	// we are going to check softassert
    
	@Parameters({"browser"})
	@org.testng.annotations.BeforeClass
	private void BeforeClass(String browser) {
		browserLaunch(browser);
		

	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println("Start Time" + d);

	}

	@AfterClass
	private void afterClass() {
		quitBrowser();

	}

	@AfterMethod
	private void EndTime() {
		Date d = new Date();
		System.out.println("End Time" + d);

	}

	// in this test case while validation of the username i have given wrong value
	// to compare then also the test case is passed
	// this is due to soft assert in order to get the proper validation we must use
	// assertALL() method;
	@Test
	private void Testcase1() {
		launchUrl("https://www.facebook.com/");
		currentWindow();
		ProjectObjectModelLocators p = new ProjectObjectModelLocators();
		sendText(p.getTxtUserName(), "Syed123");
		SoftAssert s = new SoftAssert();
		s.assertTrue(p.getTxtUserName().getAttribute("value").equals("1321645"), "Verifying the user name");
		
	}

	// this test case failed due to the use of assertall ,if we use hard asert it
	// will stop execution if the
	// case is not true but here we will be able to proceed with the execution

	@Test
	private void Testcase2() {
		launchUrl("https://www.facebook.com/");
		currentWindow();
		ProjectObjectModelLocators p = new ProjectObjectModelLocators();
		sendText(p.getTxtUserName(), "Syed123");
		SoftAssert s = new SoftAssert();
		s.assertTrue(p.getTxtUserName().getAttribute("value").equals("1321645"), "Verifying the user name");
		s.assertAll();
		
	}

	@Test
	private void Testcase3() {
		launchUrl("https://www.amazon.in/");
		currentWindow();
		SoftAssert s = new SoftAssert();
		s.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		//System.out.println(driver.getTitle());
		s.assertAll();

	}

}
