package ru.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;

public class OrderPage {

    // title формы заказа самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Header__BZXOb']")
    private SelenideElement orderFormTitle;

    // поле Имя формы заказа самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Имя']")
    private SelenideElement orderFormFirstNameField;

    // поле Фамилия формы заказа самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Фамилия']")
    private SelenideElement orderFormLastNameField;

    // поле Адрес формы заказа самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement orderFormAddressField;

    // селектор Станция метро формы заказа самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Станция метро']")
    private SelenideElement orderFormMetroStationField;

    // поле Телефон формы заказа самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement orderFormPhoneField;

    // кнопка Назад формы заказа самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']/button[text()='Назад']")
    private SelenideElement orderFormBackButton;

    // кнопка Дальше формы заказа самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Order_NextButton__1_rCA']/button")
    private SelenideElement orderFormNextButton;

    // поле Дата начала аренды формы заказа самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement orderFormStartDateField;

    // поле Продолжительность аренды формы заказа самоката
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-control")
    private SelenideElement orderFormDurationField;

    // title цветов самоката формы заказа самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Title__3EKne']")
    private SelenideElement orderFormScooterColorTitle;

    // чекбокс черный самокат формы заказа самоката
    @FindBy(how = How.ID, using = "black")
    private SelenideElement orderFormBlackScooterCheckbox;

    // подпись к чекбоксу черный самокат формы заказа самоката
    @FindBy(how = How.XPATH, using = "//label[@for='black']")
    private SelenideElement orderFormBlackScooterLabel;

    // чекбокс серый самокат формы заказа самоката
    @FindBy(how = How.ID, using = "grey")
    private SelenideElement orderFormGreyScooterCheckbox;

    // подпись к чекбоксу серый самокат формы заказа самоката
    @FindBy(how = How.XPATH, using = "//label[@for='grey']")
    private SelenideElement orderFormGreyScooterLabel;

    // поле Комментарий формы заказа самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Комментарий для курьера']")
    private SelenideElement orderFormCommentField;

    // кнопка завершения оформления заказа "Заказать"
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")
    private SelenideElement orderFormOrderButton;

    public void fillOrderFormStepOne(String firstName, String lastName, String address, String metroStation, String phone) {
        orderFormFirstNameField.setValue(firstName);
        orderFormLastNameField.setValue(lastName);
        orderFormAddressField.setValue(address);
        //orderFormMetroStationField.setValue(metroStation);
        orderFormMetroStationField.click();
        $(By.xpath(String.format("//div[text()='%s']", metroStation))).scrollIntoView(true).click();
        orderFormPhoneField.setValue(phone);
    }

    public void goToNextStep() {
        orderFormNextButton.click();
    }

    public void fillOrderFormStepTwo(String startDate, String duration, boolean black, boolean grey, String comment) {
        orderFormStartDateField.setValue(startDate);
        orderFormTitle.click();
        orderFormDurationField.click();
        $(By.xpath(String.format("//div[@class='Dropdown-menu']/div[text()='%s']", duration))).scrollIntoView(true).click();
        if (black) {
            orderFormBlackScooterCheckbox.click();
        }
        if (grey) {
            orderFormGreyScooterCheckbox.click();
        }
        orderFormCommentField.setValue(comment);
    }
}
