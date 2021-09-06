package SampleSuite.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class samplesuiteB {

	@Test
	private void B1() {
		System.out.println("Test B1");

	}
	
	@Test
	private void B2() {
		System.out.println("Test B2");
		Assert.assertTrue(false);

	}
	
	@Test
	private void B3() {
		System.out.println("Test B3");

	}
}
