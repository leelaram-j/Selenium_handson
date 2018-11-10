package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ajax_interactions_mouse
{
    public static void  main(String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("http://spicejet.com/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']"))).build().perform();
        WebDriverWait d = new WebDriverWait(driver,20);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='add-ons-tab']/li[1]/a")));
        driver.findElement(By.xpath("//ul[@class='add-ons-tab']/li[1]/a")).click();
    }
}
