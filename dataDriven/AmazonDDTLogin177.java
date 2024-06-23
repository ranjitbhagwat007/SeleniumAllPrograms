package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDDTLogin177 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Selenium_Basics\\TestData\\Ranjit.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String amzn=wb.getSheet("Amazon").getRow(0).getCell(0).getStringCellValue();
		System.out.println(amzn);
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(amzn);
		
	}

}
