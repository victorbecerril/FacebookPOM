package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;
import utils.Properties;

import static org.junit.Assert.*;

public class LogInPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LogInPage(WebDriver parentDriver) {
		driver = parentDriver;
		wait = new WebDriverWait(driver, Properties.LONG_WAIT);
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = Locators.LOGO_XPATH)
	WebElement logoFbImg;
	@FindBy(how = How.XPATH, using = Locators.EMAIL_LBL_XPATH)
	WebElement mailLbl;
	@FindBy(how = How.ID, using = Locators.MAIL_TXT_ID)
	WebElement mailTxt;
	@FindBy(how = How.XPATH, using = Locators.PWD_LBL_XPATH)
	WebElement passLbl;
	@FindBy(how = How.ID, using = Locators.PWD_TXT_ID)
	WebElement passTxt;
	@FindBy(how = How.XPATH, using = Locators.LOG_IN_BTN_XPATH)
	WebElement logInBtn;
	
	public boolean isAt() {
		return this.logoFbImg.isDisplayed() && this.mailLbl.isDisplayed() &&
				this.mailTxt.isDisplayed() && this.passLbl.isDisplayed() &&
				this.passTxt.isDisplayed();		
	}
	
	public void validLogIn(String user, String password) {
		login(user, password);
		
	}
	
	private void login(String user, String password) {
		mailTxt.clear();
		mailTxt.sendKeys(user);
		passTxt.clear();
		passTxt.sendKeys(password);
		logInBtn.click();
		
	}

	public void invalidLogIn(String wrongUser, String wrongPassword) {
		login(wrongUser, wrongPassword);
		WebElement errorMessage = wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));
		System.out.println(errorMessage.getText());
		assertNotNull(errorMessage);
		
	}
	
	public void createAccount() {
		
	}
	
	public void recoverPassword() {
		
	}
	

}
