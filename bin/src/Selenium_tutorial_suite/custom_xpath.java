package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class custom_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//lee//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div[1]/div/div/input")).sendKeys("sample@gmail.com");
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div[1]/div[2]/div/div/input")).sendKeys("Google@my.com");
		//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("reset@123");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
//		driver.findElement(By.xpath("//a[@id='reg-link']")).click();

	}

}
