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
import org.openqa.selenium.support.ui.Select;

public class AutomateGTM179 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Selenium_Basics\\TestData\\Ranjit.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String rgstr=wb.getSheet("GTM").getRow(0).getCell(0).getStringCellValue();
		String fname=wb.getSheet("GTM").getRow(1).getCell(0).getStringCellValue();
		String lname=wb.getSheet("GTM").getRow(2).getCell(0).getStringCellValue();
		String mail=wb.getSheet("GTM").getRow(3).getCell(0).getStringCellValue();
		String adhr=NumberToTextConverter.toText(wb.getSheet("GTM").getRow(7).getCell(1).getNumericCellValue());
		String phn =NumberToTextConverter.toText(wb.getSheet("GTM").getRow(4).getCell(0).getNumericCellValue());
		String pan=wb.getSheet("GTM").getRow(8).getCell(0).getStringCellValue();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(rgstr);
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.id("phone")).sendKeys(phn);
		WebElement gndr=driver.findElement(By.id("gender")); 
		 Select s1=new Select(gndr); 
		 s1.selectByVisibleText("Male");
		WebElement state=driver.findElement(By.id("state")); 
		 Select s2=new Select(state);
		 s2.selectByVisibleText("Maharashtra");
		driver.findElement(By.id("aadhaar")).sendKeys(adhr);
		driver.findElement(By.id("pan")).sendKeys(pan);
		driver.findElement(By.id("terms")).click(); 
	    driver.findElement(By.name("Submit")).click();
		
	}

}
