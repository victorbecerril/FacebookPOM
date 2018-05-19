package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.HomePage;
import pages.LogInPage;
import pages.SearchResultsPage;
import utils.Properties;

public class FacebookBaseTest {
	WebDriver driver;
	LogInPage login;
	HomePage home;
	SearchResultsPage searchResults;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		 
		options.addArguments(Properties.DISABLE_NOTIFICATIONS);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Properties.MEDIUM_WAIT, TimeUnit.SECONDS);
		driver.get(Properties.FB_URL);
		login = new LogInPage(driver);
		home = new HomePage(driver);
		searchResults = new SearchResultsPage(driver);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
