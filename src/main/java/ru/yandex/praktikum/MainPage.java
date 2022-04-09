package ru.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    // логотип Яндекса
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
    public SelenideElement yandexLogo;

    // логотип Самоката
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoScooter__3lsAR")
    public SelenideElement samokatLogo;

    // нопка "Заказать" в шапке страницы
    @FindBy(how = How.XPATH,using = "//div/div[1]/div[2]/button[1]")
    public SelenideElement orderButtonHeader;
}
