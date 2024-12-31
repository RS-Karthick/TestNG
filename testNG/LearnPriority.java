package testNG;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test (priority=-1)
	public void signUp() {
		System.out.println("Signup");
	}
	@Test
	public void logIn() {
		System.out.println("logIn");
	}
	@Test
	public void searchProduct() {
		System.out.println("searchProduct");
	}
	@Test(priority=4)
	public void addToCart() {
		System.out.println("addToCart");
	}
	@Test(priority=-5)
	public void signOut() {
		System.out.println("signOut");
		throw new RuntimeException();
	}
}
