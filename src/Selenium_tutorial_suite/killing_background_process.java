package Selenium_tutorial_suite;

import org.openqa.selenium.os.WindowsUtils;

public class killing_background_process
{
    public static void main(String [] args)
    {
        WindowsUtils.killByName("TextMate");
    }

}
