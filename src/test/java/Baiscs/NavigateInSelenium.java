package Baiscs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.sa/");
        driver.navigate().to("https://qacart.com/");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
    }
}
