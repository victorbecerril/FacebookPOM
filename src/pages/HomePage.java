package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;
import utils.Properties;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    
    public HomePage(WebDriver parentDriver) {
    	driver = parentDriver;
    	 wait = new WebDriverWait(driver, Properties.LONG_WAIT);
    	PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH, using = Locators.FB_LOGO_XPATH)
    WebElement faceBookImg;
    @FindBy(how = How.NAME, using = Locators.SEARCH_TXT_NAME)
    WebElement searchTxt;
    @FindBy(how = How.XPATH, using = Locators.SEARCH_BTN_XPATH)
    WebElement searchBtn;
    
	public boolean isAt() {
		wait.until(ExpectedConditions.elementToBeClickable(faceBookImg));
		wait.until(ExpectedConditions.elementToBeClickable(searchTxt));
		//wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		
    	return this.faceBookImg.isDisplayed() && this.searchTxt.isDisplayed() &&
    			this.searchBtn.isDisplayed();
    }
    public void searchFriend(String friendName, String information) {
    	this.searchTxt.clear();
    	this.searchTxt.sendKeys(friendName);
    	this.searchBtn.click();
    }
    public void logout(){
    	
    }

}

