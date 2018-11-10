package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionsDemo1
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        Actions a = new Actions(driver);
        WebElement textbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        a.moveToElement(textbox).click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .doubleClick()
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
        WebElement e1 = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"));
        a.moveToElement(e1).contextClick().build().perform();


    }
}
