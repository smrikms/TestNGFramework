package TestNGDemo.org;
import practice.org.BaseClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNGDemoAnnotation extends BaseClass {
	
	//All this annotations are same as we saw in the Junit framework but here soft assert 
	//can be used and priority can be set for each test case and additionally it will generate html report after each execution
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("beforeClass");

	}
	
	@AfterClass
	private void afterclass() {
		System.out.println("afterClass");

	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");

	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("afterMethod");

	}
	
	@Test
	private void testcase1() {
		System.out.println("testcase1");
		
	}
	
	//priority from -minus symbol will be executed first 
	@Test(priority = -1)
	private void testcase3() {
		System.out.println("testcase3");
		
	}
	@Test(priority = 1)
	private void testcase2() {
		System.out.println("testcase2");
		
	}
	
	//this case will be ignored during the execution and not reflect in the report
	@Test(enabled=false)
	private void testcase4() {
		System.out.println("testcase4");
		
	}
	
	//if we want to run a test multiple times we can use this invocationCount
	@Test(invocationCount=3)
	private void testcase5() {
		System.out.println("testcase5");
		
		//skip in the report represents when we a related(TC 2 is related to TC 1) testcase fails it will skip its related test case
		
	}


}
