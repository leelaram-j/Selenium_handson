package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calendar_selection
{
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.spicejet.com");
        driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
        WebElement month = driver.findElement(By.cssSelector("[class='ui-datepicker-month']"));
        //sep 23

        //Calendar calendar = Calendar.getInstance().getTime().
        while(!month.getText().equalsIgnoreCase("november"))
        {
            driver.findElement(By.cssSelector("[class='ui-datepicker-next ui-corner-all']")).click();
        }
        List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
        System.out.print("element found");
        int count = driver.findElements(By.className("ui-state-default")).size();
        for(int i=0;i<count;i++)
        {
            String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
           //WebElement currentDate = driver.findElements(By.className(".ui-state-default")).get(i);
            System.out.print(text+"\n");
            if(text.equalsIgnoreCase("16"))
            {
                driver.findElements(By.className("ui-state-default")).get(i).click();
                break;
            }

        }
    }
}
