package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheetReading 
{
	public static void main(String args[]) throws IOException
	{
		//WebDriver driver=new ChromeDriver();
		//Reading Data From Excel File-->FileInputStream
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\LoginExcel.xlsx");
		
		//Extract Particular Workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//Extract Particular Sheet
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Count Total Number of rows
		//row start from--->0
		int totalrow=sheet.getLastRowNum();
		System.out.println(totalrow);
		
		//Total Columns
		//column start from---1
		int totalcol=sheet.getRow(1).getLastCellNum();
		System.out.println(totalcol);
		
		//reading data from table
		for(int row=0;row<=totalrow;row++)
		{
			XSSFRow currentrow=sheet.getRow(row);
			for(int col=0;col<totalcol;col++)
			{
				XSSFCell cell=currentrow.getCell(col);
				System.out.print("   "+cell.toString());
				
				
			}
			System.out.println("");
			
		}
		
		workbook.close();
		file.close();
		
	}
}
