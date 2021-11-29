package webdrivertests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Test {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebElement searchBox = driver.findElement(By.name("search"));

        driver.close();
    }
}