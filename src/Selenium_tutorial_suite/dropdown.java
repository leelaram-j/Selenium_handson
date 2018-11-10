package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String [] args)
    {
            System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("http://www.spicejet.com");
            driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")).click();
            Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//            s.selectByValue("USD");
            s.selectByIndex(2);
//            s.selectByVisibleText("Business");
//            driver.findElement(By.cssSelector(".search-btn")).click();

    }
}
