package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class speedtest_css {

    public static void main(String [] args){

    System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
    WebDriver driver = new FirefoxDriver();
        driver.get("https://www.speedtest.net");
        driver.findElement(By.cssSelector(".start-text")).click();
    }
}