package Pages;

import Base.BaseMethods;
import com.thoughtworks.gauge.Logger;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FavouritePage extends BaseMethods {


    public FavouritePage(WebDriver driver) {
        super(driver);
    }

    public void ClickFavButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        clickXpath("//*[@class='header-favorite-icon bndl-like bndl-like-dims']");
        Logger.info("Favorilerim elementine tiklandi...");
    }

    public void checkFavouritesPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        checkPage("https://www.lcwaikiki.com/tr-TR/TR/favorilistem", "Favorilerim");
    }

    public void controlProductsNumber() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        controlProducts("//*[@class='picture-box']", 3);
    }

    public void clickSelectAll() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        clickId("selectAll");
    }

    public void checkSelectAll() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        listCheckControl("//*[@checked='checked']");
    }

    public void deleteSelectedProducts() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        clickId("removeSelected");
    }

    public void checkBoxTextControl() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);
        checkBoxControl("p[class='text-center bold favoriteNoItemHeaderColor']");
    }

}
