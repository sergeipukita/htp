package by.htp.qiuz.steps;

import java.util.concurrent.TimeUnit;




//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import by.htp.qiuz.driver.DriverSingleton;
import by.htp.qiuz.pages.LoginPage;
import by.htp.qiuz.pages.MainPage;


public class Steps
{
	private WebDriver driver;

//	private final Logger logger = LogManager.getRootLogger();

	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver()
	{
		driver.quit();
	}

	public void loginGithub(String username, String password)
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login(username, password);
	}

	public boolean isLoggedIn(String username)
	{
		LoginPage loginPage = new LoginPage(driver);
		return (loginPage.getLoggedInUserName().trim().toLowerCase().equals(username));
	}

//	public boolean createNewRepository(String repositoryName, String repositoryDescription)
//	{
//		MainPage mainPage = new MainPage(driver);
//		mainPage.clickOnEnterButton();
//		CreateNewRepositoryPage createNewRepositoryPage = new CreateNewRepositoryPage(driver);
//		String expectedRepoName = createNewRepositoryPage.createNewRepository(repositoryName, repositoryDescription);
//		return expectedRepoName.equals(createNewRepositoryPage.getCurrentRepositoryName());
//	}

//	public boolean currentRepositoryIsEmpty()
//	{
//		CreateNewRepositoryPage createNewRepositoryPage = new CreateNewRepositoryPage(driver);
//		return createNewRepositoryPage.isCurrentRepositoryEmpty();
//	}

}