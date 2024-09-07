package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        List<String> Windowlist = new ArrayList<>(windowhandles);
        String ParentId=Windowlist.get(0);
        String ChildId=Windowlist.get(1);


        driver.switchTo().window(ChildId);
        System.out.println(driver.getTitle());

        driver.switchTo().window(ParentId);
        System.out.println(driver.getTitle());



    }
}
