package practice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutionForActions extends BaseClass {

	public static void main(String[] args) {
		
		browserLaunch("Chrome");
		
		launchUrl("https://www.unom.ac.in/");
		
		currentWindow();
		
		//using normal element
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Close']"));
		
		element.click();
		
		
		//Using Page Object Model
		

		ProjectObjectModelLocators p= new ProjectObjectModelLocators();
		
		performaction(p.getAcademic(),"moveToElement");
		
		//performaction(p.getAmazonElement(),"doubleClick");

	}

}
