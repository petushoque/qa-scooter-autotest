package ru.yandex.praktikum;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestOrderScooter {

    private static final String FIRST_NAME = "Герман";
    private static final String LAST_NAME = "Гессе";
    private static final String ADDRESS = "Красная площадь, 1";
    private static final String METRO_STATION = "ВДНХ";
    private static final String PHONE_NUMBER = "88005553535";
    private static final String START_DATE = "12.12.1212";
    private static final String DURATION = "сутки";
    private static final boolean BLACK_SCOOTER = true;
    private static final boolean GREY_SCOOTER = false;
    private static final String COMMENT = "Wow, it is automation test";

    @Test
    public void shouldSeePageWithOrderInformation() {
        MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);
        mainPage.clickOnOrderButtonInHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne(FIRST_NAME, LAST_NAME, ADDRESS,METRO_STATION, PHONE_NUMBER);
        orderPage.goToNextStep();
        orderPage.fillOrderFormStepTwo(START_DATE, DURATION, BLACK_SCOOTER, GREY_SCOOTER, COMMENT);
        orderPage.submitOrderForm();
        orderPage.confirmOrderPopup(true);

        String orderNumber = orderPage.getOrderNumber();

        orderPage.goToOrderStatus();

        String pngFileName = screenshot("my_file_name");
    }
}
