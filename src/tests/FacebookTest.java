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
		login.validLogIn("usuario", "password");
		home.isAt();
		home.searchFriend("nombre", "information");
		searchResults.isAt();
		searchResults.addFriend("nombre", "informatin");
		
		
		
	}

}
