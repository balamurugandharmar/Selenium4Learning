package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerifyUniqueTrainNames {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://erail.in/");

        driver.findElement(By.id("txtStationFrom")).clear();
        driver.findElement(By.id("txtStationFrom")).sendKeys("MS");
        driver.findElement(By.xpath("//div[./strong[text()='MS']]/preceding-sibling::div[text()='Chennai Egmore']")).click();

        driver.findElement(By.id("txtStationTo")).clear();
        driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
        driver.findElement(By.xpath("//div[./strong[text()='MDU']]/preceding-sibling::div[text()='Madurai Jn']")).click();

        List<WebElement> trainNameElementsList = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList TrainListHeader')]//tr/td[2]"));
        Set<String> uniqueTrainNamesList = new HashSet<>();

        for (WebElement ele: trainNameElementsList) {
            uniqueTrainNamesList.add(ele.getText());
        }

        if (trainNameElementsList.size() == uniqueTrainNamesList.size()) {
            System.out.println("The train name list contains no duplicates!!");
        } else {
            System.out.println("The train name list contains one or more duplicates");
        }
        driver.quit();
    }
}
