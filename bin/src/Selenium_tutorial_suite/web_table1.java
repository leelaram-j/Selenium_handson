package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class web_table1
{
    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html");
        WebElement table = driver.findElement(By.xpath("//*[@id='wb-auto-1']"));
        List<WebElement> no_of_rows = table.findElements(By.tagName("tr"));
        System.out.println("No of rows in the table is "+no_of_rows.size());
        for(WebElement each_row:no_of_rows)
        {
            int i=0;
            i++;
            List<WebElement> no_of_columns = each_row.findElements(By.tagName("td"));
            System.out.println("no of columns in row "+i+" is "+no_of_columns.size());
            for(WebElement text:no_of_columns)
            {
                System.out.println(text.getText());
            }
        }


    }
}
