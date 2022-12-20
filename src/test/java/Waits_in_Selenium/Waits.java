package Waits_in_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("primary"))).click();
        //Explicit wait example wait for one element
       // driver.findElement(By.className("primary")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));//wait for this element appear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));//then wait for this element disappear
        driver.findElement(By.className("secondary")).click();//then click on the element
        //Note: don't mix between implicit and explicit use one of them, up to your app your functionality
        //if we have many implicit wait and one element need to use explicit wait here We will have to
        // make all duration in implicit zero and then turn on just the explicit with duration But not recommended

    }
}
