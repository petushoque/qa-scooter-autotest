package ru.yandex.praktikum;
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

    OrderDetails firstOrder = new OrderDetails(
            "12.12.1212",
            "сутки",
            true,
            false,
            "Wow, it is automation test"
    );

    @Test
    public void shouldSeePageWithOrderInformation() {
        MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);
        mainPage.clickOnOrderButtonInHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne(firstCustomer.firstName, firstCustomer.lastName, firstCustomer.orderAddress, firstCustomer.metroStation, firstCustomer.phoneNumber);
        orderPage.goToNextStep();
        orderPage.fillOrderFormStepTwo(firstOrder.startDate, firstOrder.duration, firstOrder.isScooterBlack, firstOrder.isScooterGrey, firstOrder.comment);
        orderPage.submitOrderForm();
        orderPage.confirmOrderPopup(true);

        String orderNumber = orderPage.getOrderNumber();

        orderPage.goToOrderStatus();

        String pngFileName = screenshot("my_file_name");
    }
}
