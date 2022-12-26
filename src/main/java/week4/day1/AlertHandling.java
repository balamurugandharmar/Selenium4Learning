package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertHandling {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/alert.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Simple dialog
        WebElement showSimpleDialog = driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button//span[text()='Show']"));
        showSimpleDialog.click();
        Thread.sleep(5000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();



        driver.quit();
    }
}
