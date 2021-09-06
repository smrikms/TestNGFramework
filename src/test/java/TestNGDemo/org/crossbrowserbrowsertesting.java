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

public class crossbrowserbrowsertesting extends BaseClass {

	@Parameters({ "browser" })
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

	@Test
	private void Testcase1() {
		launchUrl("https://www.facebook.com/");
		currentWindow();
		ProjectObjectModelLocators p = new ProjectObjectModelLocators();
		sendText(p.getTxtUserName(), "Syed123");
		SoftAssert s = new SoftAssert();
		s.assertTrue(p.getTxtUserName().getAttribute("value").equals("1321645"), "Verifying the user name");

	}

}
