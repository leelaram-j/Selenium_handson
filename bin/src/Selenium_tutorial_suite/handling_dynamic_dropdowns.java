package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handling_dynamic_dropdowns
{
    public static void main (String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.jetairways.com");
        driver.findElement(By.id("ObeFlights1_autoOriginHome_AutoText")).clear();
        driver.findElement(By.id("ObeFlights1_autoOriginHome_AutoText")).sendKeys("che");
        WebDriverWait wd = new WebDriverWait(driver,3);
        wd.until(ExpectedConditions.elementToBeClickable(By.className("results")));
        driver.findElement(By.xpath("//*[@class='airport-list']/li[4]")).click();

    }
}
