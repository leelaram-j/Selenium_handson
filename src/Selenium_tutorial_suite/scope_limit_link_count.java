package Selenium_tutorial_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.exit;

public class scope_limit_link_count
{
    public static void main(String [] args) throws Exception
    {
        System.setProperty("webdriver.safari.driver","//usr//bin//safaridriver");
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com.sg");
        System.out.println("Total links in page ");
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println("Total links in footer section is ");
        WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
        System.out.println(footer.findElements(By.tagName("a")).size());
        //driver.close();
        //driver.quit();
        System.out.println("links in a particular column is ");
        WebElement foot1 = driver.findElement(By.xpath("//*[@class='gf-t']/tbody/tr/td[3]"));
        System.out.println(foot1.findElements(By.tagName("a")).size());
        System.out.print("Before redirection title \n");
        String title1 = driver.getTitle();
        System.out.print(title1);
        for(int i =0;i<foot1.findElements(By.tagName("a")).size();i++)
        {
            System.out.println("\n"+foot1.findElements(By.tagName("a")).get(i).getText());
//            System.out.println(foot1.findElements(By.tagName("a")).get(i).getAttribute("href"));
            if((foot1.findElements(By.tagName("a")).get(i).getText()).contains("StubHub"))
            {
                foot1.findElements(By.tagName("a")).get(i).click();
                break;
            }
        }
        System.out.print("After redirection \n");
        Thread.sleep(1000);
        String title2 = driver.getTitle();
        System.out.print(title2);
        if(title1.equals(title2))
        {
            System.out.println("\n redirection did not happen");
            exit(1);
        }

    }
}
