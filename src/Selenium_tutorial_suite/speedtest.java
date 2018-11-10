package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class speedtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//lee//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://speedtest.net");
		driver.findElement(By.xpath("//*[text()='Go']")).click();
	}

}
