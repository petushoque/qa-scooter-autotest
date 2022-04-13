package ru.yandex.praktikum;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestOrderScooter {

    @Test
    public void shouldSeePageWithOrderInformation() {
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        mainPage.clickOnOrderButtonInHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne("Герман", "Гессе", "Красная площадь, 1",
                "ВДНХ", "88005553535");
        orderPage.goToNextStep();
        orderPage.fillOrderFormStepTwo("12.12.1212", "сутки", true, false,
                "Wow, it is automation test");
        String pngFileName = screenshot("my_file_name");
    }
}
