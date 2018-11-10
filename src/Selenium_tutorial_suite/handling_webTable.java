package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class handling_webTable
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.espncricinfo.com/series/18745/scorecard/1150080/australia-a-vs-south-africa-a-7th-match-india-a-team-quadrangular-series-2018");
        WebElement table = driver.findElement(By.xpath("//*[@class='scorecard-section bowling']/table"));
        List<WebElement> no_of_rows = table.findElements(By.tagName("tr"));
        System.out.println("no of rows is "+no_of_rows.size());
        for(WebElement arc1:no_of_rows)
        {
            List<WebElement> no_of_columns = arc1.findElements(By.tagName("td"));
            System.out.println("No of columns is "+no_of_columns.size());
            for(WebElement text:no_of_columns)
            {
                System.out.println(text.getText());
            }
        }

    }
}
