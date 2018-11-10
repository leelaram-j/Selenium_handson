package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class captcha_selection
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.wykop.pl/rejestracja/");
        System.out.print(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);
        driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
        driver.switchTo().frame("*");
        driver.findElement(By.id("recaptcha-verify-button")).click();
        System.out.print(driver.findElements(By.tagName("iframe")).size());
    }
}
