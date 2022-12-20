package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAllWays {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C://Users//User//IdeaProjects//testing_auto//src//test//resources//index.html");
       String myElement= driver.findElement(By.id("welcome")).getText();
        System.out.println(myElement);
        String Element= driver.findElement(By.className("about")).getText();
        System.out.println(Element);
        String Element2= driver.findElement(By.className("list1")).getText();//when the class name contain of two
        // words or more (space between the words) called compound class name so in this case we find the element by one word
        System.out.println(Element2);
        String element3 = driver.findElement(By.linkText("Go to About Page")).getText();//link text locating:
        // if the element is a link (elemnt in a tag) we can locate the element with the text
        System.out.println(element3);
        String element4 = driver.findElement(By.partialLinkText("Go to About")).getText();//نفس lin;Text
        //لكن نجد العنصر باستخدام جزء من النص   By using this text we can find any link element contain this text
        System.out.println(element4+" is element 4");
        //xpath = //*[@attribute='value'] ,,,this formula called relative x path
        String element5 = driver.findElement(By.cssSelector("body > ul.course-list > li.list4.web.mobile")).getText();
        System.out.println(element5+" this is 5");
        By welcomeHeader = By.id("welcome");//class called By from selenium + declare a variable By type
        driver.findElements(welcomeHeader);//another way for locating
        //declare the locater in a variable in the By type
        WebElement welcomeHead = driver.findElement(By.id("welcome"));//declare a variable as a web element
        welcomeHead.getText();// make a code more reuseble
        String text =driver.findElements(By.cssSelector(".course-list li")).get(7).getText();//css=.+class name +
        // tag name for all elements because we need to reach all elements and reach every element by the index
        System.out.println(text);

    }
}
