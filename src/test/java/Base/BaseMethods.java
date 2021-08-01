package Base;

import com.thoughtworks.gauge.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BaseMethods {
    public static WebDriver driver;

    public BaseMethods(WebDriver driver) {
        this.driver = driver;

    }

    public void checkPage(String url, String page) {
        assertEquals(page + " Bu sayfada degilsiniz", driver.getCurrentUrl(), url);
        Logger.info(page + " sayfasindasiniz..");
    }


    public void clickId(String idclick) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id(idclick)).click();

    }


    public void clickXpath(String yolls) {

        driver.findElement(By.xpath(yolls)).click();
        Logger.info(yolls + " elemente tıklandı");
    }

    public void hoverElement(String element) throws InterruptedException {
        Thread.sleep(1000);
        WebElement mainPage = driver.findElement(By.xpath(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainPage).perform();
        Logger.info(element + "inin üzerinde duruluyor");

    }

    public void clickOverHover(String xpath1, String xpath2) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement mainPage = driver.findElement(By.xpath(xpath1));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainPage).click().build().perform();
        Thread.sleep(100);
        WebElement shirtPage = driver.findElement(By.xpath(xpath2));
        actions.moveToElement(shirtPage);
        actions.click().build().perform();

    }

    public void priceSort(String element) throws InterruptedException {
        List<WebElement> priceCheck = driver.findElements(By.xpath(element));

        Thread.sleep(1000);
        if (Integer.parseInt(priceCheck.get(0).getText().substring(0, 3)) >
                Integer.parseInt(priceCheck.
                        get(0 + 1).getText().substring(0, 3))) {
        }


    }

    public void checkBoxControl(String cssSelector) throws InterruptedException {
        Thread.sleep(1000);
        String x = driver.findElement(By.cssSelector(cssSelector)).getText();
        String y = "Favori Ürününüz Yok";
        Assert.assertEquals("Mesajlar uyusmamaktadir", y, x);
        Logger.info("Favori urununuz yok yazisi bulunuyor...");
    }


    public void ClickListXTimes(String xpath, int x) throws InterruptedException {
        List<WebElement> li = driver.findElements(By.xpath(xpath));
        for (int i = 0; i < x; i++) {
            li.get(i).click();
            Thread.sleep(500);
        }

    }

    public void controlProducts(String xpath, int x) {

        List<WebElement> li = driver.findElements(By.xpath(xpath));
        if (li.size() == x) {
            Logger.info("Favoriye eklenen 3 urun var");
        }


    }

    public void listCheckControl(String xpath) {

        List<WebElement> li = driver.findElements(By.xpath(xpath));
        int x = 3;
        if (li.size() == x) {
            Logger.info("Favorilere eklenen 3 urun secilmis");

        }

    }
}
