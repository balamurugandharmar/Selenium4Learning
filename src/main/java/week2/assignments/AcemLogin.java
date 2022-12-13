package week2.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AcemLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://acme-test.uipath.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Enter username and password
        driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
        driver.findElement(By.id("password")).sendKeys("leaf@12");

        //Click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println("Title: " + driver.getTitle());

        //Logout and close
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
        driver.close();
    }
}
