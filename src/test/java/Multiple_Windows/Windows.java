package Multiple_Windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
     String parentWindow= driver.getWindowHandle();//bring the id for the tab
        driver.findElement(By.className("youtube")).click();
        Set<String> allWindows= driver.getWindowHandles();
      //  System.out.println(parentWindow);
       // System.out.println(driver.getWindowHandles());//output wiil be the id for the two windows opened,
        //output id in array
        for (String myWindow : allWindows ){
            if (!myWindow.equalsIgnoreCase(parentWindow)){
                driver.switchTo().window(myWindow);
                System.out.println(driver.getTitle());
              //  driver.switchTo().window(parentWindow);
             //   System.out.println(driver.getTitle());
                //difference between quit and close
                driver.close();//Closes the current window (tab)
               // driver.quit();//closes all tabs all windows quit from the browser
            }
        }
        //if we finish with onother window we must go back to parent window, even we put driver.close
        driver.switchTo().window(parentWindow);
        driver.findElement(By.className("website")).click();
    }
}
