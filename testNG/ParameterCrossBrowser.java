package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterCrossBrowser {

	RemoteWebDriver driver;

	@Parameters({"browser","password","emailName"})
	@Test
	public void parameters(String browser, String pass,String mail) {

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge" :
			driver = new EdgeDriver();
			break;
		default:
			System.out.println(" Please check browser name is right");
			break;
		}

		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		String title = driver.getTitle();
		System.out.println("title :" +title);
	}
}
