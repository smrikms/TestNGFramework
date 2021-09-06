package practice.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectObjectModelLocators extends BaseClass {

	public ProjectObjectModelLocators() {
		PageFactory.initElements(driver, this);
	}

	// only this getters method will not get the corresponding webelement we must
	// use
	// pagefactory class with constructor(if we use method instead of constructor we
	// must call the method)

	@FindBy(id = "email")
	private WebElement txtUserName;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(xpath = "//*[@name='login']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@data-csa-c-slot-id='nav_cs_4']")
	private WebElement amazonElement;

	@FindBy(xpath = "(//*[@href='#'])[2]")
	private WebElement Academic;

	@FindBy(xpath = "//*[text()='புதிய கணக்கை உருவாக்கு']")
	private WebElement CreateNewAccount;

	@FindBy(xpath = "//*[@placeholder='முதற்பெயர்']")
	private WebElement CreateNewAccountFirstName;

	@FindBy(xpath = "//*[@aria-label='கடைசி பெயர்']")
	private WebElement CreateNewAccountLastName;

	@FindBy(xpath = "//*[@aria-label='மொபைல் எண்/மின்னஞ்சல்']")
	private WebElement CreateNewAccountMobile;

	@FindBy(xpath = "//*[@aria-label='புதிய கடவுச்சொல்']")
	private WebElement CreateNewAccountEmail;

	@FindBy(xpath = "//*[@title='நாள்']")
	private WebElement CreateNewAccountDOBday;

	@FindBy(xpath = "//*[@title='மாதம்']")
	private WebElement CreateNewAccountDOBmonth;

	@FindBy(xpath = "//*[@title='ஆண்டு']")
	private WebElement CreateNewAccountDOByear;

	public WebElement getCreateNewAccountFirstName() {
		return CreateNewAccountFirstName;
	}

	public WebElement getCreateNewAccountLastName() {
		return CreateNewAccountLastName;
	}

	public WebElement getCreateNewAccountMobile() {
		return CreateNewAccountMobile;
	}

	public WebElement getCreateNewAccountEmail() {
		return CreateNewAccountEmail;
	}

	public WebElement getCreateNewAccountDOBday() {
		return CreateNewAccountDOBday;
	}

	public WebElement getCreateNewAccountDOBmonth() {
		return CreateNewAccountDOBmonth;
	}

	public WebElement getCreateNewAccountDOByear() {
		return CreateNewAccountDOByear;
	}

	public WebElement getCreateNewAccount() {
		return CreateNewAccount;
	}

	public WebElement getAcademic() {
		return Academic;
	}

	public WebElement getAmazonElement() {
		return amazonElement;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
