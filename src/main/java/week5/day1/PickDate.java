package week5.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class PickDate {

    public static void main(String[] args) throws InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("pageLoadTimeOut", Duration.ofMillis(1));
        capabilities.setCapability(CapabilityType.TIMEOUTS, 5);


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadTimeout(Duration.ofMillis(1));
        options.merge(capabilities);
        ChromeDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.hyrtutorials.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}