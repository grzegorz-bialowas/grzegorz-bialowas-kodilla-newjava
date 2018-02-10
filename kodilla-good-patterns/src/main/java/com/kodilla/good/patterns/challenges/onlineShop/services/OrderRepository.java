package com.kodilla.good.patterns.challenges.onlineShop.services;

public interface OrderRepository {
    boolean createOrder (OrderRequest orderRequest);
}
