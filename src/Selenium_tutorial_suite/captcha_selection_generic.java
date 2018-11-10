package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class captcha_selection_generic
{
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.wykop.pl/rejestracja/");
        int number = findFrameId(driver, By.className("recaptcha-checkbox-checkmark"));
        driver.switchTo().frame(number);
        driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
        driver.switchTo().defaultContent();
        sleep(2000);

        int verify = findFrameId(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
        driver.switchTo().frame(verify);
        driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
    }

    public static int findFrameId(WebDriver driver, By by)
    {
        int frameCount = driver.findElements(By.tagName("iframe")).size();
        int i;
        for(i=0;i<frameCount;i++)
        {
            driver.switchTo().frame(i);
            int elementCount = driver.findElements(by).size();
            if (elementCount > 0)
            {
                //driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
                break;
            }
            else
            {
                System.out.print("Continue looping");
            }
        }
        driver.switchTo().defaultContent();
        return i;
    }
}
