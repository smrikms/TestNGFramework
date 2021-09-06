package practice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutionClassForPOM extends BaseClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("Chrome");

		launchUrl("https://www.facebook.com/");
		
		//using POM
		
		ProjectObjectModelLocators p= new ProjectObjectModelLocators();
		
		
		sendText(p.getTxtUserName(),"Rizwan");
		
		currentWindow();
		
		//Normal method
		
		WebElement password = driver.findElement(By.id("pass"));
		
		sendText(password,"rizu");
		
		//POM for click
		
		p.getLoginButton().click();
	}
}
