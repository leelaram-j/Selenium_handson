package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class selector_id {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//lee//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("sample@gmail.com");
		driver.findElement(By.id("pass")).sendKeys(("reset@123"));
		System.out.println("Pressing login");
		// facebook changes it submit button id value dynamically in order to avoid automation. thats why script might fail.
		driver.findElement(By.id("u_0_8")).click();
		System.out.println("Logging in,,will press sign up button");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		System.out.println("Pressed signup button");

	}

}
