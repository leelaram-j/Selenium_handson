package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class recaptcha_generic_2
{
    public static void main(String[] args)
    {
     System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.coingecko.com/account/sign_up?locale=en");
        driver.findElement(By.className("card-body")).click();
        By abc = By.className("recaptcha-checkbox-checkmark");
        //int captchaFrameId = returnFrameId(driver,By.className("recaptcha-checkbox-checkmark"));
        int captchaFrameId = returnFrameId(driver,abc);
        driver.switchTo().frame(captchaFrameId);
        driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
        System.out.println(2000);
        driver.switchTo().defaultContent();


//        int submitFrameId = returnFrameId(driver,By.id("recaptcha-verify-button"));
//        driver.switchTo().frame(submitFrameId);
//        driver.findElement(By.id("recaptcha-verify-button")).click();

    }

    public static int returnFrameId(WebDriver driver, By by)
    {
        int i;
        int frameCount = driver.findElements(By.tagName("iframe")).size();
        for(i=0;i<frameCount;i++)
        {
            driver.switchTo().frame(i);
            int count = driver.findElements(by).size();
            if(count>0)
            {
                break;
            }
            else
            {
                System.out.println("Continue looping");
            }
        }
        driver.switchTo().defaultContent();
        return i;
    }
}
