package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class ClosingSpecificBrowserWindow {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        for(String winid:windowhandles)
        {
            String title =driver.switchTo().window(winid).getTitle();
            System.out.println(title);
            if(title.equals("OrangeHRM"))
            {
                driver.close();
            }
        }
    }
}
