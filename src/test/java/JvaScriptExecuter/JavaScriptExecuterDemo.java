package JvaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecuterDemo {
    public static void main(String args[]) throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com.eg/?hl=ar&safe=active&ssui=on");
        WebElement element = driver.findElement(By.name("q"));
        //JavascriptExecutor js = (JavascriptExecutor)driver; //upcasting as there is no direct relation between webdrive & javaexecutor
        //or you can use directly the chrome driver object as there is a relation
        JavascriptExecutor js =driver;
        //to sendkeys
        js.executeScript("arguments[0].setAttribute('value','john')",element);
        //to click action
        js.executeScript("arguments[0].click()",element);
    }
}
