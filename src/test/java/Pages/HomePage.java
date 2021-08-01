package Pages;

import Base.BaseMethods;
import com.thoughtworks.gauge.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class HomePage extends BaseMethods {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void closeCookies() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickXpath("//*[@class='closeBtn']");

    }

    public void checkMainPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        checkPage("https://www.lcwaikiki.com/tr-TR/TR", "Anasayfa");
    }

    public void hoverManButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        hoverElement("//*[@data-tracking-label='ERKEK']");
        Logger.info("Erkek sekmesinin uzerine gelindi...");

    }

    public void clickShirtButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        WebElement subMenu = driver.findElement(By.xpath("//*[@href='/tr-TR/TR/kategori/erkek/gomlek']"));
        actions.moveToElement(subMenu);
        actions.click().build().perform();
        Logger.info("Gomlek elementine tiklandi...");

    }

}
