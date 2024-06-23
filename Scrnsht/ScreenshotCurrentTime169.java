package launch.browsers;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.util.*; 

public class ScreenshotCurrentTime169 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Date date1= new Date();
		Date currentdate= new Date(date1.getTime());
		String dateInString=currentdate.toString();
		String dateWithUnderscore=dateInString.replace(":","_");
		System.out.println(dateWithUnderscore);

		/*LocalDateTime currentDateTime = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss");
	    String formattedDateTime = currentDateTime.format(formatter);*/
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement wb1=	driver.findElement(By.name("q"));
		wb1.sendKeys("India");
		wb1.sendKeys(Keys.ENTER);
		TakesScreenshot a1= driver;
		Thread.sleep(2000);
		File source= a1.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\selenium SS\\ranjit".concat(dateWithUnderscore)+".png");		
		FileHandler.copy(source, destination);
	

	}
	

}
