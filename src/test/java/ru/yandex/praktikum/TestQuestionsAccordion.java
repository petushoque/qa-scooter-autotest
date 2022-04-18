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

    MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);

    @Test
    public void shouldQuestionOneWillBeCorrect() {
        mainPage.clickOnQuestion(0);
        Assert.assertEquals(mainPage.getAnswerText(0), mainPage.ANSWERS[0]);
    }

    @Test
    public void shouldQuestionTwoWillBeCorrect() {
        mainPage.clickOnQuestion(1);
        Assert.assertEquals(mainPage.getAnswerText(1), mainPage.ANSWERS[1]);
    }

    @Test
    public void shouldQuestionThreeWillBeCorrect() {
        mainPage.clickOnQuestion(2);
        Assert.assertEquals(mainPage.getAnswerText(2), mainPage.ANSWERS[2]);
    }

    @Test
    public void shouldQuestionFourWillBeCorrect() {
        mainPage.clickOnQuestion(3);
        Assert.assertEquals(mainPage.getAnswerText(3), mainPage.ANSWERS[3]);
    }

    @Test
    public void shouldQuestionFiveWillBeCorrect() {
        mainPage.clickOnQuestion(4);
        Assert.assertEquals(mainPage.getAnswerText(4), mainPage.ANSWERS[4]);
    }

    @Test
    public void shouldQuestionSixWillBeCorrect() {
        mainPage.clickOnQuestion(5);
        Assert.assertEquals(mainPage.getAnswerText(5), mainPage.ANSWERS[5]);
    }

    @Test
    public void shouldQuestionSevenWillBeCorrect() {
        mainPage.clickOnQuestion(6);
        Assert.assertEquals(mainPage.getAnswerText(6), mainPage.ANSWERS[6]);
    }

    @Test
    public void shouldQuestionEightWillBeCorrect() {
        mainPage.clickOnQuestion(7);
        Assert.assertEquals(mainPage.getAnswerText(7), mainPage.ANSWERS[7]);
    }
}
