package practice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationForwardandBackward extends BaseClass {

	public static void main(String[] args) throws Exception {

		// to learn how to move forward backward and refresh

		browserLaunch("Chrome");

		launchUrl("https://www.annauniv.edu/#");

		currentWindow();

		WebElement nextpage = driver.findElement(By.xpath("//*[text()='AIC-Anna Incubator']"));
		
		nextpage.click();
		
		Thread.sleep(3000);

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

	}

}
