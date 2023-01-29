package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParametersTest {

    @Test
    @Parameters({"username", "password"})
    public void createLead(String username, String password) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
        driver.findElement(By.name("submitButton")).click();
        driver.close();
    }

}
