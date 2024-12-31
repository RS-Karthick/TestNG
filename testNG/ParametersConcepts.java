package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcepts {
@Parameters({"emailName" ,"password"})
	@Test
	public void parameters(String mail, String pass) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		String title = driver.getTitle();
		System.out.println("title :" +title);
	}
}
