package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasicLocatorsDemo {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();  // to maximize the page
        driver.findElement(By.name("search")).sendKeys("Mac");
        Boolean display = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(display);

        //linktext& partiallinktext to locate links <a represent a link href
        //link text is not an attribute
        //driver.findElement(By.linkText("Tablets")).click();
        //driver.findElement(By.partialLinkText("Tab")).click(); //not recommended

        //try to capture multiple elements
        //classname
        List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
        System.out.println(headerlinks.size());

       List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        driver.quit();
    }
}
