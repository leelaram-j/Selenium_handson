package Selenium_tutorial_suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class https_certificates_handling
{
    public static void main(String [] args)
    {
//        FirefoxProfile fp = new FirefoxProfile();
//        fp.setAcceptUntrustedCertificates(true);
//        fp.setAssumeUntrustedCertificateIssuer(false);
        DesiredCapabilities cap = new DesiredCapabilities().merge(DesiredCapabilities.firefox());
        cap.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver(cap);
        driver.get("https://expired.badssl.com/");

        DesiredCapabilities cap1 = new DesiredCapabilities().merge(DesiredCapabilities.chrome());
        cap1.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver1 = new ChromeDriver(cap1);
        driver1.get("https://expired.badssl.com/");

    }
}
