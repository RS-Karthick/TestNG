package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedException {
	
// cheating get fake paased result
	
	@Test(expectedExceptions = {InvalidSelectorException.class})
	public void findElements() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.google.co.in/");
		WebElement activeElement = driver.switchTo().activeElement();

		activeElement.sendKeys("cricket", Keys.ENTER);

		List<WebElement> elements = driver.findElements(By.xpath("//*[(text(),'cricket') or contains(text(),'Cricket')]"));

		int size = elements.size();
		System.out.println(" Total words : "+size);

		driver.quit();
	}
}
