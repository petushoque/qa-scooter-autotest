package ru.yandex.praktikum;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class TestOrderScooter {

    @Test
    public void shouldSeePageWithOrderInformation() {
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        mainPage.clickOnOrderButtonInHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne("Герман", "Гессе", "Красная площадь, 1",
                "ВДНХ", "88005553535");
        orderPage.goToNextStep();
        String pngFileName = screenshot("my_file_name");
    }
}
