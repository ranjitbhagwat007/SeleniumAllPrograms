package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcel174 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Selenium_Basics\\TestData\\Ranjit.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String un=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);
}
}
