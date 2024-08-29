package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
        //1-isDisplayed
        WebElement logo = driver.findElement(By.linkText("Elemental Selenium"));
        System.out.println(logo.isDisplayed());

        //2-isEnabled
        //Boolean status = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/text()[1]")).isEnabled();
        //System.out.println(status);

        //3-isSelected
        Boolean status2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
        System.out.println(status2);


    }
}
