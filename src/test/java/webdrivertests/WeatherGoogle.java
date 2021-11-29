package webdrivertests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class WeatherGoogle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//span[contains(.,'сейчас')]")).click();
        driver.findElement(By.xpath("//div[@id='wob_dp']/div[2]")).click();

       /* WebElement temperature = driver.findElement(
                By.xpath("//*[contains(@aria-label, 'Celsius понедельник 12:00')][1]"));
*/
        String dayOfWeek =
                DateTimeFormatter.ofPattern("EEEE")
                        .withLocale(new Locale("ru", "RU"))
                        .format(LocalDate.now().plus(1, ChronoUnit.DAYS));


        WebElement temperature1 = driver.findElement(
                By.xpath(String.format("//*[contains(@aria-label, 'Celsius %s 12:00')][1]", dayOfWeek)));
        String str2 = temperature1.getAttribute("aria-label");

        System.out.println(str2.split(" ")[0]);

        //  driver.close();
    }
}