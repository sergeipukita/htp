package by.htp.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("Hi");
//		System.setProperty("webdriver.gecko.driver", "c:\\Users\\user\\Downloads\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("https://mail.ru/");
//		
//		WebElement emailelement = driver.findElement(By.id("mailbox__login"));
//		emailelement.sendKeys("TATHTP@mail.ru");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement passelement = driver.findElement(By.id("mailbox__password"));
//		passelement.sendKeys("Klopik123");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement signinelement = driver.findElement(By.id("mailbox__auth__button"));
//		signinelement.submit();
//		
//		driver.quit();

	
//		System.setProperty("webdriver.gecko.driver", "c:\\Users\\user\\Downloads\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("https://google.com/");
//		
//		WebElement searchbarelement = driver.findElement(By.id("lst-ib"));
//		searchbarelement.sendKeys("Java");
//		searchbarelement.submit();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		 System.out.println("Page title is: " + driver.getTitle());
//	        
//	        // Google's search is rendered dynamically with JavaScript.
//	        // Wait for the page to load, timeout after 10 seconds
//	        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//	            public Boolean apply(WebDriver d) {
//	                return d.getTitle().toLowerCase().startsWith("Java");
//	            }
//	        });
//
//	        // Should see: "Java - Google Search"
//	        System.out.println("Page title is: " + driver.getTitle());
//	        
//					
//		driver.quit();
		
		System.setProperty("webdriver.gecko.driver", "c:\\Users\\user\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://quizful.net/");
		
		WebElement registryelement = driver.findElement(By.linkText("зарегистрироваться"));
		registryelement.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement loginelement = driver.findElement(By.id("login"));
		loginelement.sendKeys("sergeipukita");
		
		WebElement passwordelement = driver.findElement(By.name("registrationForm.password"));
		passwordelement.sendKeys("Fuffuffuf1234");

		WebElement repasswordelement = driver.findElement(By.name("registrationForm.repassword"));
		repasswordelement.sendKeys("Fuffuffuf1234");

		WebElement emailelement = driver.findElement(By.name("registrationForm.email"));
		emailelement.sendKeys("sergei.pukita@gmail.com");

		WebElement corporatecheckbox = driver.findElement(By.id("corporate"));
		corporatecheckbox.click();
				            
//		WebElement capchaelement = driver.findElement(By.name("registrationForm.capcha"));
//		capchaelement.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement submitelement = driver.findElement(By.name("ok"));
		submitelement.click();
		
        
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		 System.out.println("Page title is: " + driver.getTitle());
//	        
//	        // Google's search is rendered dynamically with JavaScript.
//	        // Wait for the page to load, timeout after 10 seconds
//	        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//	            public Boolean apply(WebDriver d) {
//	                return d.getTitle().toLowerCase().startsWith("Java");
//	            }
//	        });
//
//	        // Should see: "Java - Google Search"
//	        System.out.println("Page title is: " + driver.getTitle());
	        
					
//		driver.quit();

		
	}

}
