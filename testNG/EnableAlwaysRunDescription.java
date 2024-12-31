package testNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class EnableAlwaysRunDescription {

	@Test(description = "Hi Hello")
	public void desp() {
		System.out.println(" desp asttribute ");	
	}

	@Test( enabled = false, alwaysRun =true  )
	public void signup() {
		System.out.println("signup");
	}
	@Test
	public void login() {
		System.out.println("login");
		throw new NoSuchElementException();
	}
	@Test(dependsOnMethods ="testNG.EnableAlwaysRunDescription.login", alwaysRun = true )
	public void searchProduct() {
		System.out.println("searchProduct");
	}
}
