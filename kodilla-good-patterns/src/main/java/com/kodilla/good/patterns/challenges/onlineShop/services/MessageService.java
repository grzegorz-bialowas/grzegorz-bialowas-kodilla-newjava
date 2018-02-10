package com.kodilla.good.patterns.challenges.onlineShop.services;

public class MessageService implements OrderInformation {
    @Override
    public void inform(OrderRequest orderRequest) {
        String customerEmail = orderRequest.getCustomer().getEmail();
        System.out.println("Sending message to " + customerEmail + " - \"Your order is preparing\"");
    }
}

