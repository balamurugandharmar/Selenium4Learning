package week6.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelRunClass1 {

    @Test
    public void run1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();
    }

    @Test
    public void run2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/en-GB/gmail/about/");
        driver.close();
    }
}
