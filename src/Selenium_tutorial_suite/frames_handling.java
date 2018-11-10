package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frames_handling
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.jqueryui.com/droppable/");
        // The below method can be used if we pass the frame name.
//        WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
//        driver.switchTo().frame(frame);
        // The below method if we pass frame number; first find the frame number and then pass it.
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);
        Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.cssSelector("#draggable"));
        WebElement target = driver.findElement(By.cssSelector("#droppable"));
        act.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@class='demo-list']/ul/li[2]")).click();
    }
}
