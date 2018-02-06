package com.kodilla.good.patterns.challenges.Basic;

public class OrderDto {
    private Customer customer;
    private boolean isOrdered;
    public OrderDto(final Customer customer, final boolean isOrdered) {
        this.customer = customer;
        this.isOrdered = isOrdered;
    }
    public Customer getCustomer() {
        return customer;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
}
