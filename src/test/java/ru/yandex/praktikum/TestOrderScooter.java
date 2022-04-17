package ru.yandex.praktikum;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.praktikum.model.Customer;
import ru.yandex.praktikum.model.OrderDetails;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;

public class TestOrderScooter {

    Customer firstCustomer = new Customer(
            "Герман",
            "Гессе",
            "Красная площадь, 1",
            "ВДНХ",
            "88005553535"
    );

    Customer secondCustomer = new Customer(
            "Лев",
            "Толстой",
            "Ленина, 111",
            "Сокольники",
            "88888888888"
    );

    OrderDetails firstOrder = new OrderDetails(
            "12.12.1212",
            "сутки",
            true,
            false,
            "Wow, it is automation test"
    );

    OrderDetails secondOrder = new OrderDetails(
            "24.03.2022",
            "двое суток",
            false,
            true,
            "Comment"
    );

    // From header Order button
    @Test
    public void shouldSeePopupWithOrderInformationFromHeader() {
        MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);
        mainPage.clickOnOrderButtonInHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne(firstCustomer.firstName, firstCustomer.lastName, firstCustomer.orderAddress, firstCustomer.metroStation, firstCustomer.phoneNumber);
        orderPage.goToNextStep();
        orderPage.fillOrderFormStepTwo(firstOrder.startDate, firstOrder.duration, firstOrder.isScooterBlack, firstOrder.isScooterGrey, firstOrder.comment);
        orderPage.submitOrderForm();
        orderPage.confirmOrderPopup(true);
        orderPage.goToOrderStatus();
        Assert.assertEquals("Заказ оформлен", orderPage.getPopupTitleText());
    }

    // From header Order button
    @Test
    public void shouldSeePopupWithOrderInformationFromBottom() {
        MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);
        mainPage.clickOnOrderButtonInBottom();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne(secondCustomer.firstName, secondCustomer.lastName, secondCustomer.orderAddress, secondCustomer.metroStation, secondCustomer.phoneNumber);
        orderPage.goToNextStep();
        orderPage.fillOrderFormStepTwo(secondOrder.startDate, secondOrder.duration, secondOrder.isScooterBlack, secondOrder.isScooterGrey, secondOrder.comment);
        orderPage.submitOrderForm();
        orderPage.confirmOrderPopup(true);
        orderPage.goToOrderStatus();
        Assert.assertEquals("Заказ оформлен", orderPage.getPopupTitleText());
    }
}
