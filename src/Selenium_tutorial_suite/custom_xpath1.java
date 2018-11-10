package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class custom_xpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//lee//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pizza");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
