package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElements {
	@Test
public void findElementsConcpets() {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://letcode.in/edit");
	
	List<WebElement> elements = driver.findElements(By.tagName("label"));
	for (WebElement webElement : elements) {
		System.out.println(webElement.getText());
	}
	int size = elements.size();
	System.out.println("Elements size : "+size);
	
	if(size == 6) {
		System.out.println("Pass");
	}
	else
		System.out.println("Fail");
	
	System.out.println("----------------");
	
	WebElement webElement = elements.get(elements.size()-1);
	System.out.println("Last Element Name is :"+webElement.getText());
	
	System.out.println("FindElements......");
	
	driver.quit();
}
}
