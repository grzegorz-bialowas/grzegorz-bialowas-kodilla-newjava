package com.kodilla.good.patterns.challenges.onlineShop;

import com.kodilla.good.patterns.challenges.onlineShop.basic.OrderDto;
import com.kodilla.good.patterns.challenges.onlineShop.services.OrderInformation;
import com.kodilla.good.patterns.challenges.onlineShop.services.OrderRepository;
import com.kodilla.good.patterns.challenges.onlineShop.services.OrderRequest;
import com.kodilla.good.patterns.challenges.onlineShop.services.OrderService;
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
