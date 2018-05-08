package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	private WebDriver driver;
	
	WebElement logoFbImg;
	WebElement mailLbl;
	WebElement mailTxt;
	WebElement passLbl;
	WebElement passTxt;
	WebElement forgotPassLnk;
	WebElement logInBtn;
	WebElement nameTxt;
	WebElement lastNameTxt;
	
	public boolean isAt() {
		logoFbImg = driver.findElement(By.id("idLogo"));
		mailLbl = driver.findElement(By.xpath("xpathLbl"));
		if(logoFbImg.isDisplayed() && mailLbl.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void validLogIn(String user, String password) {
		mailTxt.clear();
		mailTxt.sendKeys(user);
		passTxt.clear();
		passTxt.sendKeys(password);
		logInBtn.click();
		
	}
	
	public void invalidLogIn(String wrongUser, String wrongPassword) {
		mailTxt.clear();
		mailTxt.sendKeys(wrongUser);
		passTxt.clear();
		passTxt.sendKeys(wrongPassword);
		logInBtn.click();
	}
	
	public void createAccount() {
		
	}
	
	public void recoverPassword() {
		
	}
	

}
