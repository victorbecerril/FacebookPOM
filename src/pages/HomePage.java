package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    WebElement faceBookImg;
    WebElement searchTxt;
    WebElement searchBtn;
    
    public boolean isAt() {
    	faceBookImg = driver.findElement(By.id("idFaceBookImg"));
    	searchTxt = driver.findElement(By.id("idsearchtext"));
    	searchBtn = driver.findElement(By.id("idsearchbtn"));
    	if (faceBookImg.isDisplayed()
    			&& searchTxt.isDisplayed()
    			&& searchBtn.isDisplayed()) {
    		return true;
    	}else return false;
    }
    
    public void searchFriend(String friendName, String information) {
    	searchTxt.clear();
    	searchTxt.sendKeys(friendName);
    	searchBtn.click();
    }
    
    public void logout(){
    	
    }

}

