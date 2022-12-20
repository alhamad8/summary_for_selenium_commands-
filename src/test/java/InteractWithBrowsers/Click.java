package InteractWithBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class Click {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C://Users//User//IdeaProjects//testing_auto//src//test//resources//index.html");
        Actions action = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.cssSelector("input.btn:nth-child(9)"));
      // action.doubleClick(doubleClick).perform();
       // action.contextClick().perform(); //this is right click
        WebElement Button = driver.findElement(By.xpath("/html/body/div[7]/input[3]"));//moving the mouse on this element
        action.moveToElement(Button).perform();
        //WebElement source = driver.findElement();
      //  WebElement destenation = driver.findElement();
       // action.dragAndDrop(source,destenation); //moving element to another element from place to another place
   // action.clickAndHold(source).moveToElement(destenation).release().build().perform(); sereis of actions
        //if we use more than one action we use .build() before .perform()

    }
}
