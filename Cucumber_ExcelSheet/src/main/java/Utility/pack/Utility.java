package Utility.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	private WebDriver driver;

	public static void screen( WebDriver driver, int testId) throws IOException
	{
	
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File dst = new File ("C:\\Users\\Om Sai\\eclipse-workspace\\Cucumber_ExcelSheet\\target\\MyReports\\screen"+ testId+"  "+ timeStamp +".jpg");
		FileHandler.copy(scr, dst);
	}
	
	public static String excelsheet(int Row, int coloumn ) throws EncryptedDocumentException, IOException
	{
		String excel2 = null;
		String path = "E:\\New Details\\Test_Data.xlsx";
		FileInputStream k = new FileInputStream(path);
		try
		{
			excel2 = WorkbookFactory.create(k).getSheet("Login").getRow(Row).getCell(coloumn).getStringCellValue();
		}
		catch (ArithmeticException e)
		{
			double  val = WorkbookFactory.create(k).getSheet("Login").getRow(Row).getCell(coloumn).getNumericCellValue();
			 excel2 = String.valueOf(val);  
			 
		}
		catch (NullPointerException e)
		{
			System.out.println("null pointer");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(excel2);
		return excel2;
		
		
	}

}
