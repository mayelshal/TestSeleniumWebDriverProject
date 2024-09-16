package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");

        WebElement desktop=driver.findElement(By.linkText("Desktops"));
        WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        //create object of actions class,you have to pass a driver
        Actions act = new Actions(driver);
        //Mouse hover action,you must call build and perform methods in any action
        act.moveToElement(desktop).moveToElement(mac).click().build().perform();

        //right click action
        act.contextClick().perform(); //you have to pass the web element in contextclick method this is just the syntax

        //double click action
        act.doubleClick().perform();

        //drag and drop action
        //first spicy the web elements of the source and target elements
        act.dragAndDrop(desktop,mac); //pass the source and the target in the method as web elements
    }
}
