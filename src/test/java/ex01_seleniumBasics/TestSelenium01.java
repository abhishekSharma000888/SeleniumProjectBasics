package ex01_seleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_openVWOLoginPage(){
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://app.vwo.com");
        firefoxDriver.quit();


    }
}
