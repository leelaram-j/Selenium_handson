package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class actionsDemo
{
    public static void main (String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']")))
                .build()
                .perform();
        WebDriverWait d = new WebDriverWait(driver,20);
        d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Your Account']")));
        driver.findElement(By.xpath("//*[text()='Your Account']")).click();
        //driver.findElement(By.partialLinkText("Your Account")).click();
    }
}
//*[@id="nav-flyout-yourAccount"]/div[2]/a[1]/span