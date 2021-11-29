package webdrivertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://google.com");
        driver.navigate().to("http://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
        driver.quit();
    }
}