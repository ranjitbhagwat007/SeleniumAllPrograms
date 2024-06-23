package launch.browsers;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEx {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement wb1=	driver.findElement(By.name("q"));
		wb1.sendKeys("India");
		wb1.sendKeys(Keys.ENTER);
		TakesScreenshot a1= driver;
		Thread.sleep(2000);
		File source= a1.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\selenium SS\\ram" +Math.random()+".png");
		FileHandler.copy(source, destination);

	}

}
