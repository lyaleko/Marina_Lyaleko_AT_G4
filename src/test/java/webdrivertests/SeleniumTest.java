package webdrivertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.get("http://selenium.dev");
    }
}