import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {
        private static WebDriver chromeDriver;
        private static WebDriver fireFoxDriver;
        private static String websiteName;
        private static String websiteURL;

        @BeforeClass
        public static void runsBeforeClass() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MorG\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
            chromeDriver = new ChromeDriver();
            chromeDriver.manage().window().maximize();
            chromeDriver.get("https://www.walla.co.il");

            System.setProperty("webdriver.gecko.driver","C:\\Users\\MorG\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
            fireFoxDriver = new FirefoxDriver();
            fireFoxDriver.manage().window().maximize();
            fireFoxDriver.get("https://www.ynet.co.il");
       }

        @Test (priority=1)
        public void opensWalla() {
            websiteName = chromeDriver.getTitle();
            websiteURL = chromeDriver.getCurrentUrl();
            System.out.println(websiteName); // just to see what comes back
            chromeDriver.navigate().refresh();
        }

        @Test (priority=2)
        public void verifyWebName() {
            Assert.assertEquals(websiteName,chromeDriver.getTitle());
        }

        @Test (priority=3)
        public void verifyWebURL() {
            Assert.assertEquals(websiteURL, chromeDriver.getCurrentUrl());
        }
    }
