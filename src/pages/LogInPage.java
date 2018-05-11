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
		logoFbImg = driver.findElement(By.xpath("//u[text() = 'Facebook']"));
		mailLbl = driver.findElement(By.xpath("xpathLbl"));
		mailTxt = driver.findElement(By.id("idmailtext"));
		passLbl = driver.findElement(By.id("idpasslabel"));
		passTxt = driver.findElement(By.id("idpasstextbox"));
		forgotPassLnk = driver.findElement(By.id("idforgotpasslink"));
		logInBtn = driver.findElement(By.id("idloginbtn"));
		nameTxt = driver.findElement(By.id("idnametextbox"));
		lastNameTxt = driver.findElement(By.id("idlastnametextbox"));
		if(logoFbImg.isDisplayed() 
				&& mailLbl.isDisplayed()
				&& mailTxt.isDisplayed()
				&& passLbl.isDisplayed()
				&& passTxt.isDisplayed()
				&& forgotPassLnk.isDisplayed()
				&& logInBtn.isDisplayed()
				&& nameTxt.isDisplayed()
				&& lastNameTxt.isDisplayed()) {
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
