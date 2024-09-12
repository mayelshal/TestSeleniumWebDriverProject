package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingFrames {
    public static void main (String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");

        //switch from age to frame
       WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
       driver.switchTo().frame(frame1);
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");

       //return to the page to switch to another frame
        driver.switchTo().defaultContent();
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");

        //inner iframe - part of frame 3
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
    }
}
