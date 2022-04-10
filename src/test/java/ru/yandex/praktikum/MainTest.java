package ru.yandex.praktikum;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

import ru.yandex.praktikum.MainPage;

public class MainTest {

    @Test
    public void lalala() {
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        //mainPage.yandexLogo.click();
        mainPage.orderButtonHeader.click();
        mainPage.nameFieldInOrderForm.setValue("Test");
        String pngFileName = screenshot("my_file_name");
    }
}
