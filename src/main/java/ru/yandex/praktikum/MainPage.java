package ru.yandex.praktikum;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    public static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru";
    public static final String [] ANSWERS = {
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    };

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

    // кнопка "Заказать" в конце страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']")
    public SelenideElement orderButtonBottom;

    // кнопка "Статус заказа" в шапке страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Header_Nav__AGCXC']/button[text()='Статус заказа']")
    public SelenideElement orderStatusButtonHeader;

    // строка поиска заказа
    @FindBy(how = How.XPATH, using = "//div[@class='Header_SearchInput__3YRIQ']/div/input")
    public SelenideElement searchOrderField;

    // кнопка начала поиска Go!
    @FindBy(how = How.XPATH, using = "//div[@class='Header_SearchInput__3YRIQ']/button")
    public SelenideElement searchOrderButton;

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

    // "Как это работает", шаг 1, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[1]/div[2]/div[@class='Home_Status__YkfmH']")
    public SelenideElement firstStepTitle;

    // "Как это работает", шаг 1, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[1]/div[2]/div[@class='Home_StatusDescription__3WGl5']")
    public SelenideElement firstStepDescription;

    // "Как это работает", шаг 2, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[2]/div[@class='Home_StatusCircle__3_aTp']")
    public SelenideElement numberOfSecondStep;

    // "Как это работает", шаг 2, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[2]/div[2]/div[@class='Home_Status__YkfmH']")
    public SelenideElement secondStepTitle;

    // "Как это работает", шаг 2, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[2]/div[2]/div[@class='Home_StatusDescription__3WGl5']")
    public SelenideElement secondStepDescription;

    // "Как это работает", шаг 3, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[3]/div[@class='Home_StatusCircle__3_aTp']")
    public SelenideElement numberOfThirdStep;

    // "Как это работает", шаг 3, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[3]/div[2]/div[@class='Home_Status__YkfmH']")
    public SelenideElement thirdStepTitle;

    // "Как это работает", шаг 3, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[3]/div[2]/div[@class='Home_StatusDescription__3WGl5']")
    public SelenideElement thirdStepDescription;

    // "Как это работает", шаг 4, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[4]/div[1]")
    public SelenideElement numberOfFourthStep;

    // "Как это работает", шаг 4, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[4]/div[2]/div[1]")
    public SelenideElement fourthStepTitle;

    // "Как это работает", шаг 4, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[4]/div[2]/div[2]")
    public SelenideElement fourthStepDescription;

    // секция "Вопросы о важном"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FourPart__1uthg']")
    public SelenideElement questionsSection;

    // Вопрос 1 - Сколько это стоит и как оплатить?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-8']")
    public SelenideElement questionOne;

    // Ответ 1
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-8']")
    public SelenideElement answerOne;

    // Вопрос 2 - Хочу сразу несколько самокатов! Так можно?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-9']")
    public SelenideElement questionTwo;

    // Ответ 2
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-9']")
    public SelenideElement answerTwo;

    // Вопрос 3 - Как рассчитывается время аренды?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-10']")
    public SelenideElement questionThree;

    // Ответ 3
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-10']")
    public SelenideElement answerThree;

    // Вопрос 4 - Можно ли заказать самокат прямо на сегодня?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-11']")
    public SelenideElement questionFour;

    // Ответ 4
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-11']")
    public SelenideElement answerFour;

    // Вопрос 5 - Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-12']")
    public SelenideElement questionFive;

    // Ответ 5
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-12']")
    public SelenideElement answerFive;

    // Вопрос 6 - Вы привозите зарядку вместе с самокатом?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-13']")
    public SelenideElement questionSix;

    // Ответ 6
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-13']")
    public SelenideElement answerSix;

    // Вопрос 7 - Можно ли отменить заказ?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-14']")
    public SelenideElement questionSeven;

    // Ответ 7
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-14']")
    public SelenideElement answerSeven;

    // Вопрос 8 - Можно ли отменить заказ?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-15']")
    public SelenideElement questionEight;

    // Ответ 8
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-15']")
    public SelenideElement answerEight;

    //@FindBy(how = How.XPATH,using = "//div/div[2]/div[2]/div[1]/input")
    //public SelenideElement nameFieldInOrderForm;

    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemHeading']")
    public ElementsCollection questionsAccordion;

    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemPanel']")
    public ElementsCollection answersAccordion;

    public void clickOnOrderButtonInHeader() {
        orderButtonHeader.click();
    }

    public void clickOnQuestion(int questionNumber) {
        questionsAccordion.get(questionNumber).scrollIntoView(true).click();
    }

    public String getAnswerText(int answerNumber) {
        return answersAccordion.get(answerNumber).text();
    }

}
