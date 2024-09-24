package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("");
        Actions act = new Actions(driver);
        WebElement min_slider=driver.findElement(By.xpath(""));
        min_slider.getLocation(); //(45,200) x slider so y will be fixed
        act.dragAndDropBy(min_slider,100,200).perform();
        WebElement max_slider =driver.findElement(By.xpath(""));
        max_slider.getLocation(); //(300,200)
        act.dragAndDropBy(max_slider,-100,200).perform(); //x to be negative to slide to left

    }
}
