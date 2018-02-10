package com.kodilla.good.patterns.challenges.onlineShop;

import com.kodilla.good.patterns.challenges.onlineShop.services.*;

public class Application {
    public static void main (String[] args){
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();
        ProductOrderService productOrderService = new ProductOrderService(new MessageService(), new BookOrderRepository(), new BookOrderService());
        productOrderService.process(orderRequest);
    }
}
