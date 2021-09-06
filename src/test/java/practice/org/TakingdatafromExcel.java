package practice.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TakingdatafromExcel extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		File f =new File("./src/test/resources/ExcelData/facebookpractice.xlsx");
		
		FileInputStream fis =new FileInputStream(f);
		
		Workbook wb =new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		Cell cell2 = row.getCell(1);
		
		//Changed the cell value into string and stored in a variable and then passed
		//that variable inside gettxtusername and gettxtpassword
		
		String userName = String.valueOf(cell);
		
		String passWord = String.valueOf(cell2);
		
		
		
		System.out.println(cell);
		
		browserLaunch("Chrome");
		
		
		launchUrl("https://www.facebook.com/");
		
		currentWindow();
		
		ProjectObjectModelLocators p= new ProjectObjectModelLocators();
		
		sendText(p.getTxtUserName(),userName);
		
		sendText(p.getTxtPassword(),passWord);
		
		System.out.println("Done");
	}
}
