package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String args[]) {
        //1-launch the browser
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        //2-open the url
        driver.get("https://demo.opencart.com/");
        //3-validate Title of the page
        String act_Title = driver.getTitle();
        if (act_Title.equals("Your Store"))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }

        //4-close the browser
        driver.quit();
    }}
