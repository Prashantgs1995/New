package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openfacebook {

	
	public static void main(String[]args) {
		
		String f="webdriver.chrome.driver";
		String t="C:\\jawaworkplace\\SeleniumTraining12\\executables\\chromedriver.exe";
		
		System.setProperty(f, t);
		
		WebDriver n1 = new ChromeDriver();
		n1.get("https://about.facebook.com/");
		String sourcecode=n1.getPageSource();
		System.out.println("application source code: " +sourcecode);
		System.out.println("source code lenght " +sourcecode.length());
		System.out.println("application url " + n1.getCurrentUrl());
		System.out.println("application title " + n1.getTitle());
		if(n1.getTitle().equals("facebook -login or sign up ")){
			System.out.println("facebook login open succesfully......");
		}
		else{
			System.out.println("either facebook login page not opened or its title got change");
		}
		//n1.close();
		}
	}

