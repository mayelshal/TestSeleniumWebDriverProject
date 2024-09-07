package Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingAlerts_Popups {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Aler']")).click();
        Thread.sleep(5000);
        Alert myAlert =driver.switchTo().alert();
        System.out.println(myAlert.getText());
        myAlert.accept();

        //handling alert using explicit wait
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
        myalert.accept();

    }
}
