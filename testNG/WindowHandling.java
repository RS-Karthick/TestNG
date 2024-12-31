package testNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	@Test
	public void windowHandlingConcepts() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://letcode.in/windows");
		
		String mainURL = driver.getCurrentUrl();
		System.out.println("mainURL : "+mainURL);
		
		String windowHandle1 = driver.getWindowHandle();
		System.out.println("windowHandle1 : "+windowHandle1);


		driver.findElement(By.id("home")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println("windowHandles1 : "+windowHandles1);

		List<String> list = new ArrayList<String>(windowHandles1);


		driver.switchTo().window(list.get(0));
		String url1 = driver.getCurrentUrl();
		System.out.println("url1 : "+url1);
		driver.close();

		driver.switchTo().window(list.get(1));
		String url2 = driver.getCurrentUrl();
		System.out.println("url2 : "+url2);
		
		System.out.println("Window Handling...........");
		
		driver.quit();
		
	}
}
