package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box {

    public static void main(String [] args)
    {
     System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver .get("http://echoecho.com/htmlforms09.htm");
        driver.findElement(By.xpath("//input[@name='option1']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@value='Butter']")).isEnabled());
    }

}
