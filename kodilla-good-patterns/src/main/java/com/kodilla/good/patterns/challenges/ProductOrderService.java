package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.Basic.OrderDto;
import com.kodilla.good.patterns.challenges.Services.OrderInformation;
import com.kodilla.good.patterns.challenges.Services.OrderRepository;
import com.kodilla.good.patterns.challenges.Services.OrderRequest;
import com.kodilla.good.patterns.challenges.Services.OrderService;
public class ProductOrderService {
    private OrderInformation orderInformation;
    private OrderRepository orderRepository;
    private OrderService orderService;
    public ProductOrderService(final OrderInformation orderInformation, final OrderRepository orderRepository, final OrderService orderService) {
        this.orderInformation = orderInformation;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }
    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if(isOrdered) {
            orderInformation.inform(orderRequest);
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
