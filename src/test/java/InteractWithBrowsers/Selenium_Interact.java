package InteractWithBrowsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Interact {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C://Users//User//IdeaProjects//testing_auto//src//test//resources//index.html");
        WebElement dropDowen = driver.findElement(By.id("courses"));//this elemnt should be in select tag
        Select coursesDropDown = new Select(dropDowen);//this way how tochose an option in a dropdown
        coursesDropDown.selectByIndex(2);//there is many way (method)
        coursesDropDown.selectByVisibleText("selenium");
      boolean element=  driver.findElement(By.linkText("Go to About Page")).isDisplayed();//if the element is displayed return true
        //if the element hidden return false, to return false (hidden)
        // means the element exist in the code but the developer make it hidden in this state
        //is displayed: if the element not exsist in the code return error
        //is displayed: to check if element is visible in this state
        boolean element2=  driver.findElement(By.linkText("Go to About Page")).isEnabled();
        //the element displayed in the ui but not allowed to interact with the element
        //return true or false
        boolean chekBox = driver.findElement(By.xpath("//*[@id=\"Banana\"]")).isSelected();
        System.out.println(chekBox);
        String name =driver.findElement(By.xpath("//*[@id=\"Banana\"]")).getAttribute("name");
        System.out.println(name);//bring the value of the attribute in the element
        String tagName =driver.findElement(By.xpath("//*[@id=\"Banana\"]")).getTagName();
        System.out.println(tagName);//bring the tag name for the element
        String elementDesignValue = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).getCssValue("font-weight");
        System.out.println(elementDesignValue+ " is the font-weight");//this method take(getCssValue) the css properity
        // you need to  Get the value you want  تاخذ الخاصية اللي بدك تجيب قيمتها
        Point elementLocation = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).getLocation();
        System.out.println(elementLocation +" this is location");//how far this element x-axis and y-axis
        System.out.println(elementLocation.x +" this is location from x");
        System.out.println(elementLocation.y +" this is location from y");
        Dimension elementSize = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).getSize();
        System.out.println(elementSize + " this is the dimension");//width and height for the element
        System.out.println(elementSize.width + " this is the width");
        System.out.println(elementSize.height + " this is the height");
        Rectangle elemantLocationAndSize = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).getRect();
        System.out.println(elemantLocationAndSize.height);
        System.out.println(elemantLocationAndSize.width);
        System.out.println(elemantLocationAndSize.x);
        System.out.println(elemantLocationAndSize.y);
        //this method for dimension(size) and location(from x and y)
        String elementRole = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).getAriaRole();
        System.out.println(elementRole+" this the role for this HTML element");
        //this method return the role for the element


    }
}
