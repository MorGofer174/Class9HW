import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class youTube {
    private static WebDriver driver;

    @BeforeClass
    public static void runsBeforeClass () {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\MorG\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
    }
    @Test (priority = 1)
    public static void youTubeButton (){
        System.out.println(driver.findElement(By.id("logo-icon")));
    }
    }
    @Test
    public static void findSong (){
        driver.findElement(By.cssSelector("input[placeholder=Search]")).sendKeys("live aid queen");
    }

}
