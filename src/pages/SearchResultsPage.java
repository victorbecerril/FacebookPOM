package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class SearchResultsPage {
	private WebDriver driver;
	public SearchResultsPage(WebDriver parentDriver) {
		driver = parentDriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//span[text() = 'People']")
	WebElement personasLbl;

	public boolean isAt() {
		return personasLbl.isDisplayed();
		
	}

	public void addFriend(String name, String information) {
		List<WebElement> peopleList = driver.findElements(By.xpath("//*[contains(@class, '_2yer')]"));
		WebElement correctContainer = null;
		for(WebElement elem: peopleList) {
			if(elem.getText().contains(information)) {
				correctContainer = elem;
				break;
			}
		}
	
		if(correctContainer != null) {
			try {
				WebElement addButton = correctContainer.findElement(By.xpath(".//*[@aria-label='Add Friend']"));
				if(addButton.getAttribute("class").contains("FriendRequestAdd")) {
					addButton.click();
				}
			} catch (Exception e) {
				System.out.println("This person does not have add button");
				assertTrue("This person does not have an add button.", false);
				//e.printStackTrace();
			}
		}
		
	}

}
