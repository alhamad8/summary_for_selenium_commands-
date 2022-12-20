package Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Selenium {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://hatem-hatamleh.github.io/Selenium-html/frames.html");
      /*  driver.switchTo().frame("qacart")
      driver.findElement(By.className("actions-button")).click();
     we have other window in the parent window so to interact with any element in this frame
     we need to switch to the frame(reach the frame) by name or id attribute inside iframe tag

      */
       /*    WebElement myFrame = driver.findElement(By.id("qacart"));
       driver.switchTo().frame(myFrame);
       driver.findElement(By.className("actions-button")).click();
       driver.switchTo().parentFrame();// go back to main window in the browser
       switch to the frame by webelement
       */

      //overlapping frames اطارات متداخلة
     /*  driver.switchTo().frame("menu");
        driver.switchTo().frame("links");
        driver.findElement(By.className("locators")).click();
         driver.switchTo().parentFrame();
          driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
        this example for locating elment inside frame and the frame iside another frame inside main frame
        in this case we need to go back twice for the main frame this case called nested frames
*/
    }
}
