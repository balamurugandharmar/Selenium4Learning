package week2.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateFacebookAccount {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        driver.findElement(By.name("firstname")).sendKeys("Balamurugan");
        driver.findElement(By.name("lastname")).sendKeys("D");
        driver.findElement(By.name("reg_email__")).sendKeys("muruganbala609@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("sel-test-pwd");

        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        selectDay.selectByVisibleText("15");

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("May");

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1990");

        driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
    }
}
