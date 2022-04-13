package ru.yandex.praktikum;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestOrderScooter {

    @Test
    public void lalala() {
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        mainPage.clickOnOrderButtonInHeader();
        String pngFileName = screenshot("my_file_name");
    }
}
