package Selenium_tutorial_suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample_test_intellij {

public static void main(String [] args)
{
    System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.google.com");
    driver.close();

}

}
