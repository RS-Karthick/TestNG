package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Data provider Annotation & Attribute
public class DataProvider1 {
	@DataProvider(name= "login")
	public String[][] getData( ) {
		String data[][] = new String[2][2];
		data[0][0] = "koushik350@gmail.com";
		data[0][1] ="Pass123$";
		data[1][0] ="koushik1@letcode.in";
		data[1][1] = "Pass123$";
		return data;
	}

	@Test(dataProvider = "login" )
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
