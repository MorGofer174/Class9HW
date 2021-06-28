import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {

    private static WebDriver driver;
    private static String webTitle;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MorG\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        webTitle = driver.getTitle();
    }
    @Test (priority = 1)
    public void assertWebTitle() {
        Assert.assertEquals(webTitle, driver.getTitle());
    }
    @Test (priority = 2)
    public void search(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather shoes");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
