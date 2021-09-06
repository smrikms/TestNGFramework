
package practice.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch(String browser) {

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;

	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;

	}

	public static void sendText(WebElement sendText, String value) {
		sendText.sendKeys(value);

	}

	public static void click(WebElement e) {
		e.click();

	}

	public static void currentWindow() {

		String child = driver.getWindowHandle();

		driver.switchTo().window(child);

	}

	public static void screenshot(String screenShotName) throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;

		File temp = s.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshot/" +screenShotName+ ".png");
		FileUtils.copyFile(temp, perm);

	}

	public static void performaction(WebElement e, String value) {
		Actions a = new Actions(driver);

		if (value.equals("rightClick")) {
			a.contextClick(e).perform();
		}

		else if (value.equals("doubleClick")) {
			a.doubleClick(e).perform();
		}

		else if (value.equals("moveToElement")) {
			a.moveToElement(e).perform();

		}

		// else if (value.equals("dragAndDrop")) {
		// a.dragAndDrop(Source, Target).perform();
		// }

	}

	public static void dropDown(WebElement a, String dropdowntext) {
		Select s = new Select(a);

		s.selectByVisibleText(dropdowntext);

		// s.selectByValue(value);

	}

	public static void fetchSingleDataFromExcel(int row, int column) throws IOException {

		File f = new File("./src/test/resources/ExcelData/JSK FEBRUARY 2017.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Sheet1");

		Row r = sheet.getRow(row);

		Cell c = r.getCell(column);

		System.out.println(c);

	}

	public static void Alert(String value) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		if (value.equals("simpleAlert")) {
			alert.accept();
		}

		else if (value.equals("confirmAlert")) {

			alert.dismiss();

		}

		else if (value.equals("promptAlert")) {

			Alert a = driver.switchTo().alert();

			a.sendKeys("syed");

			System.out.println(a.getText());

			a.accept();

		}

	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static String getTheTitle() {
		return driver.getTitle();

	}

	public String getTheCurrentUrl() {
       return driver.getCurrentUrl();
	}

}
