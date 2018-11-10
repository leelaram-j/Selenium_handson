package Selenium_tutorial_suite;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class synchronization
{
    public static void main (String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        //Implicit Wait usage
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
        driver.findElement(By.id("H-destination")).sendKeys("nyc");
        driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
        driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
        driver.findElement(By.name("InDate")).sendKeys(Keys.ENTER);
//        //Explicit Wait usage
        WebDriverWait d = new WebDriverWait(driver,20);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]/div[2]/div/a")));
        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='resultsContai  ner']/section/article[1]/div[2]/div/a")));
        driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]/div[2]/div/a")).click();
//        //Fluent Wait usage
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//
//                .withTimeout(30, TimeUnit.SECONDS)
//
//                .pollingEvery(1, TimeUnit.SECONDS)
//
//                .ignoring(NoSuchElementException.class);
//        WebElement element = wait.until(new Function<WebDriver, WebElement>()
//        {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]/div[2]/div/a"));
//            }
//        });
        driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]/div[2]/div/a")).click();

    }
}
