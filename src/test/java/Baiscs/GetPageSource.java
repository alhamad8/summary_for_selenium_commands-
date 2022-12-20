package Baiscs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacart.com/");
        String pageSource =driver.getPageSource();
        System.out.println(pageSource);
       // driver.quit();//close all the windows and tabs
      //  driver.close();//close one winndow
    }
}
