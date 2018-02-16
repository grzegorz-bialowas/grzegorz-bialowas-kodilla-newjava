package com.kodilla.good.patterns.challenges.food2Door;

import com.kodilla.good.patterns.challenges.food2Door.basic.OrderDto;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.OrderInformation;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.OrderRepository;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.OrderService;
import com.kodilla.good.patterns.challenges.food2Door.services.OrderRequest;

public class ProductOrderService {
    private OrderInformation orderInformation;
    private OrderRepository orderRepository;
    private OrderService orderService;
    public ProductOrderService(OrderInformation orderInformation, OrderRepository orderRepository, OrderService orderService) {
        this.orderInformation = orderInformation;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }
    public OrderDto process (OrderRequest orderRequest) {
        boolean isOrdered = orderService.process(orderRequest.getOrder());
        if (isOrdered) {
            orderInformation.inform(orderRequest.getOrder());
            orderRepository.createOrder(orderRequest.getOrder());
            return new OrderDto(orderRequest.getDeliverer(), true);
        } else {
            return new OrderDto(orderRequest.getDeliverer(),false);
        }
    }
}
