package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.DataUtils2;

public class DataProviderParallel3 {

	
	@Test(dataProvider = "getData", dataProviderClass = DataUtils2.class)
	public void login(String data[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data[1]);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		String title = driver.getTitle();
		System.out.println("title :" +title);
	}
}
