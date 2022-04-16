package ru.yandex.praktikum;
import org.junit.Assert;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;


public class TestQuestionsAccordion {

    @Test
    public void shouldQuestionsWillBeCorrect() {
        MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);
        for(int i = 0; i < mainPage.ANSWERS.length; i++){
            mainPage.clickOnQuestion(i);
            Assert.assertEquals(mainPage.getAnswerText(i), mainPage.ANSWERS[i]);
        }
    }
}
