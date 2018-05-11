package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LogInPage;
import pages.SearchResultsPage;

public class FacebookBaseTest {
	WebDriver driver;
	LogInPage login;
	HomePage home;
	SearchResultsPage searchResults;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		login = new LogInPage();
		home = new HomePage();
		searchResults = new SearchResultsPage();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
