package Selenium_tutorial_suite;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class cookiesHandling
{
    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Set<Cookie> abc = driver.manage().getCookies();
        System.out.println(abc.size());
        System.out.println(abc);
        driver.manage().deleteAllCookies();
        Set<Cookie> abcd = driver.manage().getCookies();
        System.out.println(abcd.size());
        System.out.println(abcd);

    }
}
