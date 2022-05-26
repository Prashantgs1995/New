package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	
	public static void main(String[]args) {
		
		
		String path1=".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path1);
		
		
		
		WebDriver n2=new ChromeDriver();
		n2.get("http://vtiger-demo.it-solutions4you.com/");
		
		n2.findElement(By.id("username")).sendKeys("standarduser");
		
		n2.findElement(By.id("password")).sendKeys("standarduser");
		n2.findElement(By.className("button buttonBlue"));
		
		
	}
}
