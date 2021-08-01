package Base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSettings {

    public static WebDriver driver;

    @BeforeScenario
    public void Prepare() {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterScenario
    public void AfterTesting() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();

    }
}
