package navigations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllNavigations180 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");//to(url)
		driver.findElement(By.name("q"));
		Thread.sleep(2000);
		driver.navigate().back();//backward
		Thread.sleep(2000);
		driver.navigate().forward();//forward
		Thread.sleep(2000);
		driver.navigate().refresh();//refresh

	}

}
