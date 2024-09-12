package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class GoogleSearch_AutosuggestDropdown {
    public static void main (String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com.eg/?hl=ar&safe=active&ssui=on");
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(5000);
        List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
        for (WebElement op:options)
        {
            //System.out.println(op.getText());
            if (op.getText().equals("selenium"))
            {
                op.click();
                //break;
            }

        }
}}
