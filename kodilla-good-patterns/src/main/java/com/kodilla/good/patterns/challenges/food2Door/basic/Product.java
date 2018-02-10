package com.kodilla.good.patterns.challenges.food2Door.basic;

import java.util.Objects;

public class Product {
    private final String productName;
    private final int productPrice;
    private final int productSize;
    public Product(String productName, int productPrice, int productSize) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productSize = productSize;
    }
    public String getProductName() {
        return productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public int getProductSize() {
        return productSize;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductPrice() == product.getProductPrice() &&
                getProductSize() == product.getProductSize() &&
                Objects.equals(getProductName(), product.getProductName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getProductPrice(), getProductSize());
    }
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productSize=" + productSize +
                '}';
    }
}
