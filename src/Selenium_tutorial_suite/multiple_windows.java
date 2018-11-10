package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class multiple_windows
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        WebElement privacy = driver.findElement(By.xpath("//ul[@class='Bgzgmd']/li[2]"));
        privacy.click();
        System.out.println(driver.getTitle());
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> its = ids.iterator();
        String parentId = its.next();
        String childId = its.next();
        driver.switchTo().window(childId);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());
//        driver.get("https://www.facebook.com");
//        Actions a = new Actions(driver);
//        a.moveToElement(driver.findElement(By.xpath("//*[text()='Privacy']"))).keyUp(Keys.CONTROL).click().build().perform();
//        System.out.println(driver.getTitle());
//        Set<String> ids = driver.getWindowHandles();
//        Iterator<String> its = ids.iterator();
//        String parentId = its.next();
//        String childId = its.next();
//        System.out.println(driver.getTitle());
    }
}
