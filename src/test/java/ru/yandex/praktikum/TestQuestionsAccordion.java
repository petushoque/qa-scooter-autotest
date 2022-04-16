package ru.yandex.praktikum;
import org.junit.Assert;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestQuestionsAccordion {

    @Test
    public void shouldQuestionsCorrespondToAnswers() {
        MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);

        for(int i = 0; i < 8; i++){
            mainPage.clickOnQuestion(i);
            Assert.assertEquals(mainPage.getAnswerText(i), mainPage.ANSWERS[i]);
        }

        String pngFileName = screenshot("my_file_name");
    }
}
