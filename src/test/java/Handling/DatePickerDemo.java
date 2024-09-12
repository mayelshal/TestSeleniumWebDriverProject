package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {
    //we will make it as a user defined method and calling it in the main method
    //select month & year& day with one method to use it through the whole App in different places
    //Select future date
    static void selectFutureDate(WebDriver driver,String month,String year,String day)
    {
        while (true) {
            String Currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String CurrentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (Currentmonth.equals(month) && (CurrentYear.equals(year))) {
                break;

            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button to handel the month and year

        }
        List<WebElement> alldays= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td//a"));
        for(WebElement dt:alldays)
        {
            if(dt.getText().equals(day))
            {
                dt.click();
                break;
            }
        }

    }

    //Select past date
    static void selectPastDate(WebDriver driver,String month,String year,String day)
    {
        while (true) {
            String Currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String CurrentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if (Currentmonth.equals(month) && (CurrentYear.equals(year))) {
                break;

            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //next button to handel the month and year

        }
        List<WebElement> alldays= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td//a"));
        for(WebElement dt:alldays)
        {
            if(dt.getText().equals(day))
            {
                dt.click();
                break;
            }
        }

    }


    //select the day

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        //first we need to switch to the frame
        driver.switchTo().frame(0); //we use index as we have only one frame
        //first method by using sendkeys
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/11/2024");


        //second method using date picker method
        String year = "2027";
        String month = "April";
        String day = "20";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //this will open date picker /calendar
        selectFutureDate(driver,year,month,day);





    }
}
