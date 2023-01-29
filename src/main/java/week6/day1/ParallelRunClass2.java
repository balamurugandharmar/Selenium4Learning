package week6.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelRunClass2 {

    @Test
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.microsoft.com/en-in");
        driver.close();
    }
}
