package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

public class DatePickerDemo2 {
    //This is just the syntax

    //we need to know the current month and the required month to know which forward or backward button we will select
    //so we cant compare months as strings ,so we will convert them first into objects by using hashmap to convert them all
    static Month convertMonth(String month) {
        HashMap<String, Month> monthmap = new HashMap<String, Month>();
        monthmap.put("January", Month.JANUARY);
        monthmap.put("February", Month.FEBRUARY);
        monthmap.put("March", Month.MARCH);
        ///continue the whole  months


        Month vmonth = monthmap.get(month);
        if (vmonth == null) {
            System.out.println("invalid");
        }
        return vmonth;


    }

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("");
        //first we need to switch to the frame
        driver.switchTo().frame("frame name");

        //input
        String requiredDay = "9";
        String requiredMonth = "April";
        String requiredYear = "2027";

        //select the year from the dropdown
        WebElement year = driver.findElement(By.xpath(""));
        Select ReqYear = new Select(year);
        ReqYear.selectByVisibleText(requiredYear);

        //select the month after
        String displayMonth = driver.findElement(By.xpath("")).getText();
        //converting current and required month to object
        Month exepectedMonth = convertMonth(requiredMonth);
        Month currentMonth = convertMonth(displayMonth);
        //compare
        int result = exepectedMonth.compareTo(currentMonth);
        //0 months are equal
        //>0 future month
        //<0 past month
        while (true) {
            if (result < 0) {
                //past month
                //weblement of backward button
            } else if (result > 0) {
                //future month
                //weblement of forward button
            } else {
                //equal
                break;
            }


        }
    }
}
