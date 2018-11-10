package Selenium_tutorial_suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class Sauce_labs_testing
{
    @BeforeTest
    public static void setup() throws Exception
    {
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("version","5");
        dc.setCapability("platform","Linux");
        WebDriver driver = new RemoteWebDriver(new URL("http://uniformtangofoxtrot:96abb7b5-f73d-4bc8-b396-47586662fe45@ondemand.saucelabs.com:80/wd/hub")
                ,dc);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) throws Exception {
        setup();
    }
}
