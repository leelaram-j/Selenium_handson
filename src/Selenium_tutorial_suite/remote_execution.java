package Selenium_tutorial_suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class remote_execution
{
    public static void main(String [] args) throws Exception
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver;
        String nodeURL;
        String hubURL;
        nodeURL = "http://192.168.0.106:5566/wd/hub";
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability(FirefoxDriver.BINARY,new File("//Users//lee//Downloads//firefox.app").getAbsolutePath());
        capabilities.setJavascriptEnabled(true);
        //capabilities.setCapability(FirefoxDriver.PROFILE,profile);
        driver = new RemoteWebDriver(capabilities);
        driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}
