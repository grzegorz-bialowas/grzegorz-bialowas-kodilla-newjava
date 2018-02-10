package com.kodilla.good.patterns.challenges.food2Door.basic;

public class Order {
    private final Product product;
    private final int productQuantity;

    public Order(final Product product, final int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
    }
    public Product getProduct() {
        return product;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
