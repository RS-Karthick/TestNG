package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.DataUtils;

public class DataProvider2 {

	@Test(dataProvider = "login", dataProviderClass = DataUtils.class)
	public void parameters(String userName, String password) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		String title = driver.getTitle();
		System.out.println("title :" +title);
	}
}
