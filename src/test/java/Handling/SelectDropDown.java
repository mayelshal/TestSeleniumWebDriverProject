package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dropdown");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
        Select dropdown1 = new Select(dropdown);
        dropdown1.selectByVisibleText("Afghanistan");
        // we can also use select by value or select by index
        List<WebElement> options = dropdown1.getOptions(); //capture the options from the dropdown
        System.out.println(options.size());

        //printing the options
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
}
