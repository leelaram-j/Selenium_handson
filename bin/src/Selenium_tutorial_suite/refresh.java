package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class refresh
{
    public static void main (String args[])
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.jetairways.com");
        driver.findElement(By.xpath("//*[@id='OneWay']")).click();
        driver.findElement(By.xpath(("//*[@id='ObeFlights1_autoOriginHome_AutoText']"))).click();
        driver.findElement(By.xpath(("//*[@id='ObeFlights1_autoOriginHome_AutoText']"))).clear();
        driver.findElement(By.xpath("//a[@id='ObeFlights1_allCitiesOnFrom']")).click();
        driver.findElement(By.xpath("//*[text()='Chennai (MAA)']")).click();
        //driver.findElement(By.xpath("//[@id='ObeFlights1_autoDestinationHome_AutoText']")).click();
        driver.findElement(By.xpath("//a[@id='ObeFlights1_allCitiesOnTO']")).click();
        driver.findElement(By.xpath("//*[text()='Delhi (DEL)']")).click();
        driver.findElement(By.xpath("//*[@id='txtStartDate']")).click();
        driver.findElement(By.xpath("//*[text()='31']")).click();
        Select s = new Select(driver.findElement(By.xpath("//*[@id='ddlAdult']")));
        s.selectByIndex(2);
        driver.findElement(By.xpath("//*[@id='ObeFlights1_btnBookOnline']")).click();
    }
}
