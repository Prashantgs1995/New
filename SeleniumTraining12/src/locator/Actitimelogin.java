package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin {

public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		/**
		 * In order to identify any object/element from the application UI we use findElement(By)
		 * this method returns WebElement
		 * 
		 * By is predefined class in selenium and all its method are static which are also known as "locator"
		 * Selenium support following locator:
		 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
		 * 
		 * Action: all the below actions will be performed on the webelement
		 * 			if you want to type any input on the field use--> sendKeys("");
		 * 		   if you want to click on any element use---> click();
		 * 		   clearing existing value from the field ---> clear();
		 */
		
		
		WebElement usernameinputfield=driver.findElement(By.id("username"));
		
		usernameinputfield.sendKeys("admin123");
		
		usernameinputfield.clear();
		usernameinputfield.sendKeys("admin");	
		
		
	WebElement passwordinputfield=driver.findElement(By.name("pwd"));
	passwordinputfield.sendKeys("manager");
	
	WebElement loginButton=driver.findElement(By.id("loginButton"));
	loginButton.click();
	
	//driver.close();
}
	
		
		
}
