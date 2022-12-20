package Baiscs;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Set_size_of_browser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file://C://Users//User//IdeaProjects//testing_auto//src//test//resources//index.html");
        Dimension Samsung = new Dimension(400,800);
        driver.manage().window().setSize(Samsung);

    }
}
