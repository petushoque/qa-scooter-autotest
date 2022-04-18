package ru.yandex.praktikum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;


public class TestQuestionsAccordion {

    //@Test
    //public void shouldQuestionsWillBeCorrect() {
    //    MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);
    //    for(int i = 0; i < mainPage.ANSWERS.length; i++){
    //        mainPage.clickOnQuestion(i);
    //        Assert.assertEquals(mainPage.getAnswerText(i), mainPage.ANSWERS[i]);
    //    }

    // вынести общий код из тестов и перенести в MainPage
    public void checkQuestion() {

    }

    @Before
    MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);

    @Test
    public void shouldQuestionOneWillBeCorrect() {
        mainPage.clickOnQuestion(0);
        Assert.assertEquals(mainPage.getAnswerText(0), mainPage.ANSWERS[0]);
    }
}
