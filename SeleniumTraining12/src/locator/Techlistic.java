package locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[]args) {
		String path=".\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver n=new ChromeDriver();
		
		n.manage().window().maximize();
		
		
		
		n.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		n.get("https://www.amazon.in/");
		
		//n.manage().window().setSize((100,500);
		
		//n.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(2)")).click();
		n.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(3)")).click();
		
		n.navigate().back();
		
		
	}
}
