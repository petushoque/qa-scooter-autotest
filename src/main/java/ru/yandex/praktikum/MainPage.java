package ru.yandex.praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    // локатор поля ввода email
    @FindBy(how = How.ID,using = "email")
    private SelenideElement emailField;
}
