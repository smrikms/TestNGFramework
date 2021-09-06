package multipleinputdatavalidation.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import practice.org.BaseClass;

public class BaseClassforMultipleData extends BaseClass {

	@Test(dataProvider = "Login")
	private void test(String User, String Pwd) {
		System.out.println(User);
		System.out.println(Pwd);
	}

	@DataProvider(name = "Login")
	private Object[][] getData() {

		Object[][] data = { { "syed", "4564", }, { "rizu", "456546" }, { "affu", "fd5s456f" } };
		return data;
	}
	
	@DataProvider(name = "LoginPage")
	private Object[][] getData1() {

		Object[][] data = { { "syedfd", "4564", }, { "rizufd", "456546" }, { "affufd", "fd5s456f" } };
		return data;
	}

}
