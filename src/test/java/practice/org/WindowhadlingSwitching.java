package practice.org;

import java.util.ArrayList;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowhadlingSwitching extends BaseClass {

	public static void main(String[] args) throws Exception {

		browserLaunch("Chrome");

		launchUrl("http://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();

		currentWindow();

		WebElement openNewTab = driver.findElement(By.xpath("//*[text()='Open New Seperate Windows']"));

		openNewTab.click();

		// this will print only parent title child title will not be printed so we are
		// going to window handling

		System.out.println(driver.getTitle());

		WebElement clickToOpenNewTab = driver.findElement(By.xpath("//*[text()='click']"));

		clickToOpenNewTab.click();

		// strring windowHandle will always print session ID for one we can use this but
		// if we want the
		// session id for all parents and child we need to use enhanced for

		String windowHandle = driver.getWindowHandle();

		System.out.println(windowHandle);

		// using enhanced for to get all session id

		System.out.println("going to print session id for all the windows");

		Set<String> allWindows = driver.getWindowHandles();

		for (String x : allWindows) {
			System.out.println(x);
		}

		// always import this package to avoid errors import java.util.*;

		// to go to a new tab or new window we have to use only this option because with
		// url and title it is not possible
		// selenium will be able to read url and title only if we stay in that page so
		// we must user this method only

		List<String> l = new ArrayList<String>();

		l.addAll(allWindows);

		driver.switchTo().window(l.get(2));

		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		driver.quit();

		// way without list
		browserLaunch("Chrome");

		launchUrl("http://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();

		currentWindow();

		WebElement openNewTab1 = driver.findElement(By.xpath("//*[text()='Open New Seperate Windows']"));

		openNewTab1.click();

		System.out.println(driver.getTitle());

		WebElement clickToOpenNewTab1 = driver.findElement(By.xpath("//*[text()='click']"));

		clickToOpenNewTab1.click();

		String windowHandle1 = driver.getWindowHandle();

		System.out.println(windowHandle1);

		System.out.println("going to print session withoutlist");

		Set<String> allWindows1 = driver.getWindowHandles();

		int count = 1;
		for (String x : allWindows1) {
			if (count == 1) {
				driver.switchTo().window(x);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();

			}
			count++;
		}

	}

}
