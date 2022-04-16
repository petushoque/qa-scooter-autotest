package ru.yandex.praktikum;
import org.junit.Test;
import org.openqa.selenium.By;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestQuestionsAccordion {

    @Test
    public void shouldQuestionsCorrespondToAnswers() {
        MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);
        mainPage.questionsAccordion.get(1).scrollIntoView(true).click();
        String test = mainPage.getAnswerText(1);
        System.out.println("Hello,");
        System.out.println(test);
        String pngFileName = screenshot("my_file_name");
    }
}
