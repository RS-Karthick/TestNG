package testNG;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void signUp() {
		System.out.println("Signup");
	}
	@Test(dependsOnMethods = "signUp", priority = -1)
	public void logIn() {
		System.out.println("logIn");
	}
	@Test(dependsOnMethods = "logIn")
	public void searchProduct() {
		System.out.println("searchProduct");
	}
	@Test(dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("addToCart");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "addToCart", alwaysRun =true )
	public void signOut() {
		System.out.println("signOut");
	}
}
