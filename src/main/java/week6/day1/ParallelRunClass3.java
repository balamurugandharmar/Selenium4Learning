package week6.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelRunClass3 {

    @Test
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.close();
    }
}
