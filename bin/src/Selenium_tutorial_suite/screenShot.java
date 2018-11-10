package Selenium_tutorial_suite;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class screenShot
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.gecko.driver", "//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        takescreenshot(driver, "//Users//lee//Downloads//test.png"); ;

    }

    public static void takescreenshot(WebDriver driver,String filepath) throws Exception
    {
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(filepath);
        FileUtils.copyFile(SrcFile,DestFile);
    }
}
