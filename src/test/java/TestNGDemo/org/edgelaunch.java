package TestNGDemo.org;

import java.util.Date;

import org.testng.annotations.Test;

import practice.org.BaseClass;

public class edgelaunch extends BaseClass {
	

	@Test
	private void test1() {
		browserLaunch("Chrome");
		launchUrl("https://www.facebook.com/");

	}

}
