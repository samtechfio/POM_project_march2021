package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD;
	// @FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement
	// PHONE_FIELD;
	// @FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement
	// ADDRESS_FIELD;
	// @FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement
	// CITY_FIELD;
	// @FindBy(how = How.XPATH, using = "//input[@id='state']") WebElement
	// STATE_FIELD;

	public void enterFullName(String fullName) {

		FULL_NAME_FIELD.sendKeys(fullName + generateNumber(999));
	}

	public void enterCompany(String company) {

		selectDropdown(COMPANY_FIELD, company);

	}

	public void enterEmail(String email) {

		EMAIL_FIELD.sendKeys(generateNumber(999) + email);

	}

}
