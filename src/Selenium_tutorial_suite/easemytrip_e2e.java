package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class easemytrip_e2e
{
    public static void main (String [] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.easemytrip.com/");
        //driver.findElement(By.cssSelector(".click-round.flig-show.bg-color")).click();
        //driver.findElement(By.xpath("//li[@class='click-round flig-show bg-color']")).click();
        driver.findElement(By.xpath("//div[@class='one-rou']/ul/li[2]")).click();
        driver.findElement(By.cssSelector("#FromSector_show")).click();
        driver.findElement(By.cssSelector("#spn12")).click();
        //driver.findElement(By.cssSelector("[class='autoFlll input_city ac_input ui-autocomplete-input'][2]")).click();
        driver.findElement(By.xpath("//input[@id='Editbox13_show']")).click();
        driver.findElement(By.xpath("(//span[@id='spn2'])[2]")).click();
        driver.findElement(By.cssSelector(".input_cld")).click();
        //driver.findElement(By.cssSelector("#frth_0_22/07/2018")).click();
        driver.findElement(By.xpath("//li[@id='frth_0_22/07/2018']")).click();
        driver.findElement(By.cssSelector("#rdate")).click();
        driver.findElement(By.xpath("//li[@id='frth_2_24/07/2018']")).click();
        driver.findElement(By.xpath("//a[@class='dropbtn_n']")).click();
        for(int i=0;i<2;i++)
        {
            driver.findElement(By.xpath("//input[@value='+']")).click();
        }
        //driver.findElement(By.xpath("//div[@class='cont_flt']/label[2]")).click();
        driver.findElement(By.xpath("//input[@value='4']")).click();
        driver.findElement(By.xpath("//a[@class='dn_btn']")).click();
        driver.findElement(By.xpath("//input[@value='Search']")).click();
    }

}
