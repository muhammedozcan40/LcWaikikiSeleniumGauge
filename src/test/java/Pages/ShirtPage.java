package Pages;

import Base.BaseMethods;
import com.thoughtworks.gauge.Logger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ShirtPage extends BaseMethods {

    public ShirtPage(WebDriver driver) {
        super(driver);
    }

    public void checkShirtPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(100);
        checkPage("https://www.lcwaikiki.com/tr-TR/TR/kategori/erkek/gomlek", "erkek gomlek");
    }

    public void clickSortAsDesc() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickOverHover("//*[@id='dropdownMenu1']", "//*[@data-tracking-label='FiyatAzalan']");
        Logger.info("Siralama menusunden en yüksek fiyattan secenegine tiklandi...");
    }

    public void sortMySelectedProducts() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
        priceSort("//*[@class='raw-price ']");
        Logger.info("Dogru sekilde siralanmistir...");
        Thread.sleep(3000);

    }

    public void clickProductsToFavouriteXTimes() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ClickListXTimes("//*[@class='emi-item fav']", 3);
        Thread.sleep(1000);
        Logger.info("ilk 3 urun favorilere eklendi...");
    }
}


