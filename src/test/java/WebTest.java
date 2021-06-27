import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTest {
    private static ChromeDriver driver1;
    private static FirefoxDriver driver2;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\MorG\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver1 = new ChromeDriver();
        driver1.get("https://translate.google.com");

        System.setProperty("webdriver.gecko.driver","C:\\Users\\MorG\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        driver2 = new FirefoxDriver();
        driver2.get("https://translate.google.com");


    }
}
