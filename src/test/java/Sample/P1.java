package Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class P1 {
	private static Date String;

	//Palindrome
//	public static void main(String[] args) {
//		int a=121, temp=a, rev=0;
//		while(temp>0)
//		{
//			int i=temp%10;
//			temp=temp/10;
//			rev=rev*10+i;
//		}
//		if(rev==a)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
//	}
	
	//Armstrong
//	public static void main(String[] args) {
//		int a=153, temp=a, rev=0;
//		while(temp>0)
//		{
//			int i=temp%10;
//			temp=temp/10;
//			rev=rev+(i*i*i);
//			
//		}
//		if(rev==a)
//		{
//			System.out.println("Armstrong");
//		}
//		else
//		{
//			System.out.println("Not Armstrong");
//		}
//	}
	
	//Reverse String
//	public static void main(String[] args) {
//		String a="Rushikesh";
//		String rev = new StringBuilder(a).reverse().toString();
//		System.out.println(rev);
		
		
//		String a="Rushikesh";
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			System.out.print(a.charAt(i));
//		}
//	}
	
	
	//Remove Duplicate character from string
//	public static void main(String[] args) {
//		String a="Rushikesh";
//		LinkedHashSet<Character>set = new LinkedHashSet();
//		for(int i=0;i<a.length();i++)
//		{
//			set.add(a.charAt(i));
//		}
//		System.out.println(set);
//	}
	
	
	//prime number
//	public static void main(String[] args) {
//		int a=2;
//		boolean flag=true;
//		for(int i=2;i<a/2;i++)
//		{
//			if(a%i==0)
//			{
//				flag=false;
//			}
//		}
//		if(flag)
//		{
//			System.out.println("Prime");
//			
//		}
//		else
//		{
//			System.out.println("Not Prime");
//		}
//	}
	
	//window switch
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		String parent = driver.getWindowHandle();
//		Set<String> allHandles = driver.getWindowHandles();
//		for(String ch:allHandles)
//		{
//			if(!parent.endsWith(ch))
//			{
//				driver.switchTo().window(ch);
//			}
//		}
//	}
	
	
	//Screenshot
//	public static void main(String[] args) throws Throwable {
//		ChromeDriver driver = new ChromeDriver();
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("./Screenshots/sc1.jpg");
//		Files.copy(src, dest);
//		
//	}
	
	//Read data from excel
//	public static void main(String[] args, String ExcelpAth, String Sheetname, int rownum, int cellnum) throws Throwable {
//		FileInputStream fis = new FileInputStream(ExcelpAth);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(Sheetname);
//		Row row = sh.getRow(rownum);
//		Cell cell = row.getCell(cellnum);
//		String value = cell.getStringCellValue();
//	}
	
	//create data in excel
//	public static void main(String[] args, String excelpath, String sheetname, int rownum, int cennnum, int value) throws Throwable {
//		FileInputStream fis = new FileInputStream(excelpath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetname);
//		Row row = sh.getRow(rownum);
//		Cell cell = row.createCell(value);
//		cell.setCellValue(String);
//		FileOutputStream out = new FileOutputStream(excelpath);
//		wb.write(out);
//		
//	}
	
	//get last row num
//	public static int main(String[] args, java.lang.String excelpath, java.lang.String sheet) throws Throwable {
//		FileInputStream fis = new FileInputStream(excelpath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheet);
//		int num = sh.getLastRowNum();
//		return num;
//	}
	

}
