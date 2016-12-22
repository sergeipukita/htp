package by.htp.qiuz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage
{
	private final String BASE_URL = "http://www.quizful.net/LoginAction.loginForm";

	@FindBy(name = "loginForm.login")
	private WebElement inputLogin;

	@FindBy(name = "loginForm.password")
	private WebElement inputPassword;

	@FindBy(linkText="Войти")
	private WebElement buttonSubmit;

	@FindBy(linkText = "sergeipukita")
	private WebElement linkLoggedInUser;

	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
//		logger.info("Login page opened");
	}

	public void login(String username, String password)
	{
		inputLogin.sendKeys(username);
		inputPassword.sendKeys(password);
		buttonSubmit.click();
//		logger.info("Login performed");
	}

	public String getLoggedInUserName()
	{
		return linkLoggedInUser.getText();
	}

}