import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {
        private static WebDriver chromeDriver;
        private static WebDriver fireFoxDriver;

        @BeforeClass
        public static void runsBeforeClass() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MorG\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            chromeDriver = new ChromeDriver();
            chromeDriver.manage().window().maximize();
            chromeDriver.get("https://translate.google.com");

            System.setProperty("webdriver.gecko.driver","C:\\Users\\MorG\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
            fireFoxDriver = new FirefoxDriver();
            fireFoxDriver.manage().window().maximize();
            fireFoxDriver.get("https://translate.google.com");
        }

        @Test
        public void opensWalla(){
            chromeDriver.get("https://www.walla.co.il");
        }
        @Test
        public void opens(){
            fireFoxDriver.get("https://www.ynet.co.il");
    }
}
