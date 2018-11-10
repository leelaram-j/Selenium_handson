package Selenium_tutorial_suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample_extarct {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.ethnoherbalist.com/natural-stimulants-brain-boost/");
        System.out.println(driver.getPageSource());

    }

}
