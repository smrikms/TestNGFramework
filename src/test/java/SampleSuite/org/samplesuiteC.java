package SampleSuite.org;

import org.testng.annotations.Test;

public class samplesuiteC {
	@Test
	private void C1() {
		System.out.println("Test C1");

	}
	
	@Test(enabled = false)
	private void C2() {
		System.out.println("Test C2");

	}
	
	@Test
	private void C3() {
		System.out.println("Test C3");

	}
}
