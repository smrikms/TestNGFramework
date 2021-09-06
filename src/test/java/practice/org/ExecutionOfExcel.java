package practice.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecutionOfExcel extends BaseClass{
	
	//Normal method
	
public static void main (String[] args) throws Exception {
		File f =new File("./src/test/resources/ExcelData/JSK FEBRUARY 2017.xlsx");
		
		FileInputStream fis =new FileInputStream(f);
		
		Workbook wb =new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row = sheet.getRow(5);
		
		Cell cell = row.getCell(0);
		
		System.out.println(cell);
	}
	//Using Base class
	
//public static void main(String[] args) throws IOException {
//	
//	fetchSingleDataFromExcel(5,0);
//}
}
