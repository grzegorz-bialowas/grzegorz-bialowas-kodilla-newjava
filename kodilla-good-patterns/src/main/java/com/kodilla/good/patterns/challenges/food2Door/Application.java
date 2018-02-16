package com.kodilla.good.patterns.challenges.food2Door;

import com.kodilla.good.patterns.challenges.food2Door.services.*;

public class Application {
    public static void main (String[] args){
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrvie();
        ProductOrderService productOrderService = new ProductOrderService(new MessageService(), new BookOrderRepository(), new OrderServiceImpl());
        productOrderService.process(orderRequest);
    }
}
