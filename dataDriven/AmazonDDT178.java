package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDDT178 {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream f1=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Selenium_Basics\\TestData\\Ranjit.xlsx");
			Workbook wb=WorkbookFactory.create(f1);
			String rgstr=wb.getSheet("Register").getRow(0).getCell(0).getStringCellValue();
			String fname=wb.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
			String phn=NumberToTextConverter.toText(wb.getSheet("Register").getRow(2).getCell(0).getNumericCellValue());
			String pass=wb.getSheet("Register").getRow(3).getCell(0).getStringCellValue();
			System.out.println(rgstr);
			System.out.println(fname);
			System.out.println(phn);
			System.out.println(pass);
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(rgstr);
			driver.findElement(By.id("ap_customer_name")).sendKeys(fname);
			driver.findElement(By.id("ap_phone_number")).sendKeys(phn);
			driver.findElement(By.id("ap_password")).sendKeys(pass);

	}

}
