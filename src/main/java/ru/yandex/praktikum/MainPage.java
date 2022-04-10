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

    // гланый title страницы, 1 строка
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX']/text()[1]")
    public SelenideElement titleFirstLine;

    // главный title страницы, 2 строка
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX']/text()[2]")
    public SelenideElement titleSecondLine;

    //НАЙТИ СУБХЭДЕРЫ
    // первый subheader, 1 строка
    //@FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E']/text()[1]")
    //public SelenideElement titleSecondLine;

    // картинка, схематическое изображение самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_BluePrint__TGX2n']/img[@alt='Scooter blueprint']")
    public SelenideElement scooterBlueprintImage;

    // картинка, фотография самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Scooter__3YdJy']/img[@alt='Scooter blueprint']")
    public SelenideElement scooterPhotoImage;

    // subheader 3, "Как это работает"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_ThirdPart__LSTEE']/div[@class='Home_SubHeader__zwi_E']/text()")
    public SelenideElement subheaderHowItWorks;

    // "Как это работает", шаг 1, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[1]/div[@class='Home_StatusCircle__3_aTp']")
    public SelenideElement numberOfFirstStep;


    @FindBy(how = How.XPATH,using = "//div/div[2]/div[2]/div[1]/input")
    public SelenideElement nameFieldInOrderForm;
}
