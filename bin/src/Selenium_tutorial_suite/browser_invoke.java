package Selenium_tutorial_suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browser_invoke {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		driver.close();
		
		System.setProperty("webdriver.safari.driver","//usr//bin//safaridriver");
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
		
		
		
		
//		System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("https://www.bankbazaar.com");
		
		
		
	}

}
