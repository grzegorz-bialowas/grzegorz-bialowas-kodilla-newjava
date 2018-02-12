package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.interfaces.DelivererProcessor;

public class OrderRequestProcessor {
    private DelivererProcessor delivererProcessor;
    public OrderRequestProcessor(DelivererProcessor delivererProcessor) {
        this.delivererProcessor = delivererProcessor;
    }
    public void order(OrderRequest orderRequest){
        if (orderRequest.isOrderConfirmation() == true) {
            delivererProcessor.process(orderRequest.getDeliverer());
            System.out.println("Your order has been accepted.");
        } else {
            System.out.println("Confirm your order, please.");
        }
    }
}
