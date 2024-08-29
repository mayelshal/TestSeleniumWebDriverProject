package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        String Title = driver.getTitle();
        System.out.println(Title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        //String pageSource = driver.getPageSource();
        // System.out.println(pageSource);  //not important

        // String id = driver.getWindowHandle();
        //System.out.println(id); //this id is dynamic changes with every launch or run

        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open another browser window so we will get the id's
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds);
    }
}
