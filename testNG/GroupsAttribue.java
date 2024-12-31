package testNG;

import org.testng.annotations.Test;

public class GroupsAttribue {

	@Test(groups = {"smoke"})
	public void signUp() {
		System.out.println("Signup");
	}
	@Test(groups = {"reg"} )
	public void logIn() {
		System.out.println("logIn");
	}
	@Test(groups = {"sanity"} )
	public void searchProduct() {
		System.out.println("searchProduct");
	}
	@Test(groups = {"sanity"} )
	public void addToCart() {
		System.out.println("addToCart");
	}
	@Test(groups = {"smoke"} )
	public void signOut() {
		System.out.println("signOut");

	}
}

