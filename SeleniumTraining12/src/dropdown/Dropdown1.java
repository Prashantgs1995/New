package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dropdown1 {

	public static void main(String[]args) {
		
	
	
	String path1=".\\executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver",path1);
	
	WebDriver n1=new ChromeDriver();
	
n1.manage().window().maximize();
n1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
n1.get("https://thompsonsj.com/bootstrap-select-dropdown/");
	
WebDriverWait wait=new WebDriverWait	(n1, 20);
WebElement dropdown=n1.findElement(By.id("bsd1-button"));
wait.until(ExpectedConditions.elementToBeClickable(dropdown));
//identify dropdown list and click on it
dropdown.click();
//identify all the options and store them into List<WebElement>
List<WebElement> options=n1.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
//use size() to get option count
System.out.println("option count: "+options.size());
//use for loop to print one by one option
for(int i=0;i<options.size();i++) {
	System.out.println(options.get(i).getText());
}
options.get(2).click();


	
}
}