package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDynamicPaginationTable {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/index.php");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");

        //capturing the total no of pages
        String Total_Pages = driver.findElement(By.xpath("")).getText();
        int pages = Integer.parseInt(Total_Pages.substring(Total_Pages.indexOf("(") + 1, Total_Pages.indexOf("Pages") - 1));
        //repeating pages
        for (int i = 1; i <= pages; i++) {
            if (i > 1) //as i equals 1 will always appear as defaullt
            {
                WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + i + "]"));
                activePage.click();
            }
            //reading the data from the page//table
            int NoOfRows = driver.findElements(By.xpath("tr")).size();
            for (int r = 1; r <= NoOfRows; r++) {
                String CustomerName = driver.findElement(By.xpath("//tr[" + r + "]/td[2]")).getText();
                String Email = driver.findElement(By.xpath("//tr[" + r + "]/td[3]")).getText();
                System.out.println(CustomerName+"\t"+Email);
            }


        }

    }
}
