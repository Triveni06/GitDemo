package testcases;

import org.testng.annotations.Test;

public class Searchphone {
	@Test(priority=1)
	public void search() {
		System.out.println("searching phone");
		System.out.println("searching Second phone");
	}
	@Test(priority=2)
	public void selectphone() {
		System.out.println("select phone");
	}
	@Test (priority=3)
	public void checkout() {
		System.out.println("check out phone");
	}

}
