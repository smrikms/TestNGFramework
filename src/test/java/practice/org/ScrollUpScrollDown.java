package practice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ScrollUpScrollDown extends BaseClass {

	public static void main(String[] args) {
		
		
		  

		browserLaunch("Chrome");

		launchUrl("https://www.amazon.in/");
		
		currentWindow();
		
		//using pagedown
/*
		WebElement ScrollDownTo = driver.findElement(By.xpath("//*[text()='Facebook']"));

		ScrollDownTo.sendKeys(Keys.PAGE_DOWN);*/

	}

}
