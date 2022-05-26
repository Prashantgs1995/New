package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {

	public static void main(String[]args) {
		
		String path=".\\executables\\chromedriver.exe";
		
	System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement usernamefield=driver.findElement(By.id("username"));
	
	usernamefield.isDisplayed();
	usernamefield.isEnabled();
	usernamefield.sendKeys("admin");
	
	WebElement pwdfiled=driver.findElement(By.name("pwd"));
	pwdfiled.isDisplayed();
	pwdfiled.isEnabled();
	pwdfiled.sendKeys("manager");
	
	WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
	checkbox.isDisplayed();
	checkbox.isEnabled();
	checkbox.click();
	checkbox.isSelected();
	
	WebElement loginButton=driver.findElement(By.id("loginButton"));
	
	System.out.println("Tag name for login button : "+loginButton.getTagName());
	
	System.out.println("Login button visibility status is : "+loginButton.isDisplayed());
	System.out.println("Login button clickable status is : "+loginButton.isEnabled());
	String actaulButtonName=loginButton.getText();
	System.out.println("Login button name validation: "+actaulButtonName.equals("Login"));
	//perform appropriate action the identified element
	loginButton.click();	
	
	
  //driver.close();
	
	
	
	
	
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	System.out.println(pagesource.length());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	if(driver.getTitle().equals("Google")) {
		System.out.println("Google search page opened successfully...");
	}else {
		System.out.println("Either google search page not opened or its title got changed");
	}
	}
}