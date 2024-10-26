package JvaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //1-scroll the page down by pixel numbers
        //js.executeScript("window.scrollBy(0,150)","");
        //System.out.println(js.executeScript("return window.pageYOffset;"));

        //2-scroll the page till the element is visible
        //WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Canon EOS 5D']"));
        //js.executeScript("arguments[0].scrollIntoView();",ele);
        //System.out.println(js.executeScript("return window.pageYOffset;"));

        //3-scroll to the end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //System.out.println(js.executeScript("return window.pageYOffset;"));
        //scroll to the initial point back
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");




    }
}
