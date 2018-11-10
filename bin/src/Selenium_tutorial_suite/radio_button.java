package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://echoecho.com/htmlforms10.htm");
        //driver.findElement(By.cssSelector("[value='Milk']")).click();
        int count = driver.findElements(By.cssSelector("[name='group1']")).size();
//        driver.findElement(By.xpath("//table[2]/tbody/tr/td/table/tbody/tr/td/input[3]")).click();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
            //driver.findElements(By.cssSelector("[name='group1']")).get(i).click();
            String s=driver.findElements(By.cssSelector("[name='group1']")).get(i).getAttribute("value");
            System.out.println(s);
            if(s.equals("Cheese"))
            {
                System.out.println(s);
                driver.findElements(By.cssSelector("[name='group1']")).get(i).click();
                break;
            }
        }

        for(int i:count)
        {

        }
    }
}
