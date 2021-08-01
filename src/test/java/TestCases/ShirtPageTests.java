package TestCases;

import Base.BaseSettings;
import Pages.ShirtPage;
import com.thoughtworks.gauge.Step;

public class ShirtPageTests extends BaseSettings {

    @Step({"Erkek Gömlek sayfası açıldığı kontrol edilir"})
    public void checkMyShirtPage() throws InterruptedException {
        new ShirtPage(driver).checkShirtPage();
    }

    @Step({"Sırala Menüsünden “En yüksek fiyattan” seçenegi seçilir"})
    public void clickDescSort() throws InterruptedException {
        new ShirtPage(driver).clickSortAsDesc();
    }

    @Step({"Seçimin “En yüksek fiyattan” olduğu kontrol edilir"})
    public void checkPriceSort() throws InterruptedException {
        new ShirtPage(driver).sortMySelectedProducts();
    }

    @Step({"ilk 3 ürün favorilere eklenir"})
    public void addFirst3Product() throws InterruptedException {
        new ShirtPage(driver).clickProductsToFavouriteXTimes();
    }

}
