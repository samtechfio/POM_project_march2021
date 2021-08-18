package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
public LoginPage(WebDriver driver) {
	this.driver = driver;
		
}
	//Element library
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]") WebElement SIGNIN_FIELD;
	
	//Interactive Methods
	//Technique individual methods
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
		
	}
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
		
	}
	public void ClicksigninButton() {
	    SIGNIN_FIELD.click();
		
	}
	//Technique combined methods
	public void testLogin(String userName,String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
		SIGNIN_FIELD.click();
		
	}
	

}
