package Selenium_tutorial_suite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class js_alerts
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver .get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector("[value='Confirmation Alert']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
        //driver.switchTo().alert().sendKeys("jdfsdfjdsfjsdjhfdsjfhdsj");
        //driver.switchTo().alert().dismiss(); This is done to dismiss changes or ignore or negative scenario buttons
    }

}
