package TestCases;

import Base.BaseSettings;
import Pages.HomePage;
import com.thoughtworks.gauge.Step;

public class HomePageTests extends BaseSettings {


    @Step({"Close Cookies"})
    public void closeCookies() throws InterruptedException {
        new HomePage(driver).closeCookies();
    }

    @Step({"Anasayfanın açıldığı kontrol edilir"})
    public void checkHomePage() throws InterruptedException {
        new HomePage(driver).checkMainPage();
    }

    @Step({"Menüden Erkek seçeneğinin üzerinde durulur"})
    public void hoverManButton() throws InterruptedException {
        new HomePage(driver).hoverManButton();
    }

    @Step({"Açılan pencereden Gömlek Seçilir"})
    public void selectShirtButton() throws InterruptedException {
        new HomePage(driver).clickShirtButton();
    }
}
