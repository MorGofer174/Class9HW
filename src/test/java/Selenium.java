import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium {

    private static WebDriver driver;

    @BeforeClass
    public static void runsBeforeClass (){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\MorG\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
    }
    @Test
    public static void textField (){
        System.out.println(driver.findElement(By.name("search")));
        driver.findElement(By.name("search")).sendKeys("selenium");

    }
}
