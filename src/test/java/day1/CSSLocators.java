package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        driver.manage().window().maximize();
        //1-tag#id
        //driver.findElement(By.cssSelector("input#searchBar")).sendKeys("Agile Testing"); //tag is optional we can write #id only

        //2-tag and classname  tag.classname
       // driver.findElement(By.cssSelector("input.ui-focus")).sendKeys("Agile"); //tag is optional

        //3-tag attribute
        //driver.findElement(By.cssSelector("input[placeholder='Filter books..']")).sendKeys("Agile"); //tag is optional also to write we can only write the attribute and value

        //4-tag.classname[attribute='value']
        driver.findElement(By.cssSelector("input.ui-focus[placeholder='Filter books..']")).sendKeys("Agile"); //tag name is optional


        //driver.quit();
    }
}
