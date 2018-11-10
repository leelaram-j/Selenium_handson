package Selenium_tutorial_suite;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class visibility_test
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://spicejet.com");
        System.out.println("Before selecting multi city");
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isDisplayed());
        //Asserts.check(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isDisplayed());
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_2']")).click();
        driver.findElement(By.cssSelector("a[id='MultiCityModelAlert']")).click();
        System.out.println("After selecting multi city");
        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date6']")).isEnabled());
        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date6']")).isDisplayed());
        //int count = driver.findElements(By.cssSelector("input[id='ctl00_mainContent_view")).size();
        int count = driver.findElements(By.cssSelector("input[id='ctl00_mainContent_view_date6")).size();
        if(count == 0)
        {
            System.out.println("Element not available");
        }
        driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());

    }
}
