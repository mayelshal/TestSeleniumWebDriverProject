package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitCommands {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //3-explicit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //1-thread sleep
        //Thread.sleep(5000);

        //2-implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    }
}
