package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selector_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//lee//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[2]")).click();
		
	}

}
