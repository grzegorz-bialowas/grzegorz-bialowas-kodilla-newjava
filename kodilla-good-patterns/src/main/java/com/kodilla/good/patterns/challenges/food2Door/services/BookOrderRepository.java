package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Order;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.OrderRepository;

public class BookOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(Order order) {
        return false;
    }
}
