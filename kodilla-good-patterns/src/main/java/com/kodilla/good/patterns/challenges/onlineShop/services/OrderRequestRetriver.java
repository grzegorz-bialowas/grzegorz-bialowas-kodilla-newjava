package com.kodilla.good.patterns.challenges.onlineShop.services;

import com.kodilla.good.patterns.challenges.onlineShop.basic.Customer;
import com.kodilla.good.patterns.challenges.onlineShop.basic.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        Customer customer = new Customer("Greg", "Poland", 001, "g.poland@poland.pl", "java street, Warsaw");
        Product product = new Product("Sport", "t-shirt", 0010);
        LocalDateTime orderDate = LocalDateTime.of(2018, 02, 02, 12, 10, 20);
        LocalDate deliveryDate = LocalDate.of(2018, 02, 05);
        return new OrderRequest(customer, product, orderDate, deliveryDate);
    }
}
