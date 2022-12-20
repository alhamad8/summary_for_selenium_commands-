package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_in_Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/alert.html");
       /* driver.findElement(By.className("alert")).click();
        Thread.sleep(3000);
        String alertText=  driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().accept();
        this example for alert
        */
        driver.findElement(By.className("prompt")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Ahmad");
        driver.switchTo().alert().accept();

    }
}
