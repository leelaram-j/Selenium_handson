package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css_selector {

    public static void main(String [] args){

        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.eiseverywhere.com/login.php");
        //driver.findElement(By.cssSelector("input[class='inputUsername input_xxlarge']")).sendKeys("sample@gmail.com");
        driver.findElement(By.cssSelector(".inputUsername.input_xxlarge")).sendKeys("sample@gmail.com");
        //driver.findElement(By.cssSelector("input[class='inputPassword input_xxlarge']")).sendKeys("reset@123");
        driver.findElement(By.cssSelector("[class='inputPassword input_xxlarge']")).sendKeys("reset@123");
        driver.findElement(By.cssSelector("#submitButton")).click();

    }

}
