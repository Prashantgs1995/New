package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglablogin {

	public static void main(String[]args) {
		
		
		String path=".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		
		WebDriver n1=new ChromeDriver();
		
		n1.get("https://www.saucedemo.com/");
		
		n1.findElement(By.id("user-name")).sendKeys("standard_user");
		n1.findElement(By.id("password")).sendKeys("secret_sauce");
		n1.findElement(By.id("login-button")).click();
		//n1.close();
		
	}
}
