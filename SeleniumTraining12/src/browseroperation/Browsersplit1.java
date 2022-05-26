package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsersplit1 {

	public static void main (String[]args) {
		
		
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		  String cred=driver.findElement(By.tagName("span")).getText();
		  System.out.println(cred);
		  String[] loginbutton=cred.split(" ");
		  
		  driver.findElement(By.id("txtUsername")).sendKeys(loginbutton[3]);
		  driver.findElement(By.id("txtPassword")).sendKeys(loginbutton[7]);
		  driver.findElement(By.id("btnLogin")).click();
		  
		 
		 
	}
}
