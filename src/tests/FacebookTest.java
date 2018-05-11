package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LogInPage;
import pages.SearchResultsPage;

public class FacebookTest extends FacebookBaseTest {
	
	@Test
	public void searchFriend() {
		login.isAt();
		login.validLogIn("joecool2546@mail.com", "abcde012@F");
		home.isAt();
		home.searchFriend("Raul Reza", "information");
		searchResults.isAt();
		searchResults.addFriend("nombre", "information");
		
		
		
	}

}
