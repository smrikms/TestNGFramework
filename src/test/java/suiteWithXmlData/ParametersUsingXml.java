package suiteWithXmlData;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import practice.org.BaseClass;
import practice.org.ProjectObjectModelLocators;

public class ParametersUsingXml extends BaseClass {
	
	@Test
	private void launchUrl() {
		browserLaunch("Chrome");
		launchUrl("https://www.facebook.com/");
		currentWindow();

	}
	
	@Test
	private void signUp() {
		ProjectObjectModelLocators p= new ProjectObjectModelLocators();
        click(p.getCreateNewAccount());

	}
	
	
	@Parameters({"FirstName","lastName","mobileNo","mail"})
	@Test
	private void fillTheSignUpDetails(@Optional String firstname,String lastname,String mobileno,String mail) throws InterruptedException {
		ProjectObjectModelLocators p= new ProjectObjectModelLocators();
		Thread.sleep(3000);
		
		sendText(p.getCreateNewAccountFirstName(),firstname);
		Thread.sleep(3000);

		sendText(p.getCreateNewAccountLastName(),lastname);
		Thread.sleep(3000);

		sendText(p.getCreateNewAccountMobile(),mobileno);
		Thread.sleep(3000);

		sendText(p.getCreateNewAccountEmail(),mail);
		Thread.sleep(3000);

		

	}

}
