package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class dynamic_Drop_Down
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","//Users//lee//Downloads//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("http://www.spicejet.com");
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='GOI']")).click();
        driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
        driver.findElement(By.xpath("//*[text()='31']")).click();
        driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
        driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
        driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
        Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("USD");
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        driver.get("https://www.jetairways.com");
//        driver.findElement(By.cssSelector("#ObeFlights1_autoOriginHome_AutoText")).click();
//        driver.findElement(By.cssSelector("#ObeFlights1_allCitiesOnFrom")).click();
//        driver.findElement(By.linkText("Chennai (MAA)")).click();
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        driver.findElement(By.cssSelector("#ObeFlights1_autoDestinationHome_AutoText")).click();
//        driver.findElement(By.cssSelector("#ObeFlights1_allCitiesOnTO")).click();
//        driver.findElement(By.linkText("Delhi (DEL)")).click();


    }

}
