package practice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends BaseClass {

	public static void main(String[] args) throws Exception {

		browserLaunch("Chrome");

		launchUrl("http://demo.automationtesting.in/Alerts.html");

		currentWindow();
		// simple alert using normal main class
		WebElement simpleAlert = driver.findElement(By.xpath("//*[@onclick='alertbox()']"));

		simpleAlert.click();

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		driver.quit();

		// confirmALert using Baseclass

		browserLaunch("Chrome");

		launchUrl("http://demo.automationtesting.in/Alerts.html");

		currentWindow();

		WebElement navigationToConfirmALert = driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']"));

		navigationToConfirmALert.click();

		WebElement confirmalert = driver.findElement(By.xpath("//*[@onclick='confirmbox()']"));

		confirmalert.click();

		Alert("confirmAlert");

		Thread.sleep(3000);

		driver.quit();
		
		//promptalert using the baseclass

		browserLaunch("Chrome");

		launchUrl("http://demo.automationtesting.in/Alerts.html");

		currentWindow();

		WebElement navigationTopromptALert = driver.findElement(By.xpath("//*[text()='Alert with Textbox ']"));

		navigationTopromptALert.click();

		WebElement promptalert = driver.findElement(By.xpath("//*[@onclick='promptbox()']"));
		
		promptalert.click();
		
		Alert("promptAlert");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
