package TestCases;

import Base.BaseSettings;
import Pages.FavouritePage;
import com.thoughtworks.gauge.Step;

public class FavouritePageTests extends BaseSettings {

    @Step({"Sag üstteki favorilerim butonuna tıklanır"})
    public void clickFavouriteButton() throws InterruptedException {
        new FavouritePage(driver).ClickFavButton();
    }

    @Step({"Favorilerim sayfasının açıldığı dogrulanır"})
    public void checkFavouritesPage() throws InterruptedException {
        new FavouritePage(driver).checkFavouritesPage();
    }

    @Step({"Favori olarak seçilen 3 ürünün orada oldugu kontrol edilir"})
    public void checkFavouriteProductsCount() throws InterruptedException {
        new FavouritePage(driver).controlProductsNumber();
    }

    @Step({"Tümünü seç butonuna tıklanır"})
    public void clickToSelectAllButton() throws InterruptedException {
        new FavouritePage(driver).clickSelectAll();
    }

    @Step({"Tümünün seçildigi kontrol edilir"})
    public void checkSelectAllCount() throws InterruptedException {
        new FavouritePage(driver).checkSelectAll();
    }

    @Step({"Seçilenleri sil butonuna tıklanır"})
    public void deleteSelectedProductsFromFavourites() throws InterruptedException {
        new FavouritePage(driver).deleteSelectedProducts();
    }

    @Step({"”Favori Ürününüz Yok” metni sayfada gözlemlenir"})
    public void noFavouriteProductTextControl() throws InterruptedException {
        new FavouritePage(driver).checkBoxTextControl();
    }
}
