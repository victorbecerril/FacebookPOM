package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class FacebookTest extends FacebookBaseTest {
	
	@Test
	@FileParameters("./data/fbData.csv")
	public void searchFriend(String userName, String password, 
			String friendName, String friendInfo) {
		assertTrue("The login page did not load.", login.isAt());
		login.validLogIn(userName, password);
		assertTrue("The home page did not load.",home.isAt());
		home.searchFriend(friendName, friendInfo);
		assertTrue("The search results page did not load.", searchResults.isAt());
		searchResults.addFriend(friendName, friendInfo);	
	}

}
