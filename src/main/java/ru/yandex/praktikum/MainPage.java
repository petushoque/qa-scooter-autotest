package ru.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    // логотип Яндекса в шапке страницы
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
    public SelenideElement yandexLogo;

    // логотип Самоката в шапке страницы
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoScooter__3lsAR")
    public SelenideElement scooterLogo;

    // дисклеймер "учебный тренажер" в шапке страницы
    @FindBy(how = How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
    public SelenideElement headerDisclaimer;

    // кнопка "Заказать" в шапке страницы
    @FindBy(how = How.XPATH,using = "//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']")
    public SelenideElement orderButtonHeader;

    // кнопка "Статус заказа" в шапке страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Header_Nav__AGCXC']/button[text()='Статус заказа']")
    public SelenideElement orderStatusButtonHeader;

    // гланый title страницы
    @FindBy(how = How)

    @FindBy(how = How.XPATH,using = "//div/div[2]/div[2]/div[1]/input")
    public SelenideElement nameFieldInOrderForm;
}
