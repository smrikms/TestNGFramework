package practice.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelForMultipleDataHandling {

	public static void main(String[] args) throws Exception {

		File f = new File("./src/test/resources/ExcelData/JSK FEBRUARY 2017.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		//to find the number of rows and columns
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		System.out.println(physicalNumberOfRows);
		
		Row row = sheet.getRow(0);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		System.out.println(physicalNumberOfCells);
		
		//to print all the data in the excel
		
		for(int i=0;i<=physicalNumberOfRows;i++)
		{
			Row r = sheet.getRow(i);
			
			
			
			for(int j=0;j<=physicalNumberOfCells;j++)
			{
				Cell c1 = r.getCell(j);
				
			    int cellType = c1.getCellType();
			    
			    System.out.println(cellType);
				
			}
		}
		
		

	}

}
