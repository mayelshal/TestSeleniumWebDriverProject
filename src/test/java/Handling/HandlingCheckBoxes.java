package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingCheckBoxes {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type=\"checkbox\" and @class=\"form-check-input\"]"));

        for (WebElement checkbox : CheckBoxes) {
            checkbox.click();
        }

        //normal for loop to select all check boxes
        for (int i = 0; i < CheckBoxes.size(); i++) {
            CheckBoxes.get(i).click();

        }


        //for loop to select las 2 element, i = total -2=7-2=5=starting index
        for (int i = 5; i < CheckBoxes.size(); i++) {
            CheckBoxes.get(i).click();

        }
    }
}
