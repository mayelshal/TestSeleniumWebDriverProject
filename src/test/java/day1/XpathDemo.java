package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        //relative xpath with single attribute
        driver.findElement(By.xpath("//*[@name='search']")).sendKeys("Tshirt");
        //relative xpath with multiple xpath
        driver.findElement(By.xpath("//*[@name='search'][@type='text']")).sendKeys("Tshirt"); //stronger


    }
}
