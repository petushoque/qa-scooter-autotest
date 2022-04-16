package ru.yandex.praktikum.model;

public class Customer {
    String firstName;
    String lastName;
    String orderAddress;
    String metroStation;
    String phoneNumber;

    Customer(String firstName, String lastName, String orderAddress, String metroStation, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderAddress = orderAddress;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
    }
}
