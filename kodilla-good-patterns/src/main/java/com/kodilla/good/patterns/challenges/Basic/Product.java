package com.kodilla.good.patterns.challenges.Basic;

import java.util.Objects;

public final class Product {
    private final String productCategory;
    private final String productName;
    private final int productIdNumber;

    public Product(final String productCategory, final String productName, final int productIdNumber) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productIdNumber = productIdNumber;
    }
    public String getProductName() {
        return productName;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public int getProductIdNumber() {
        return productIdNumber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductIdNumber() == product.getProductIdNumber() &&
                Objects.equals(getProductName(), product.getProductName()) &&
                Objects.equals(getProductCategory(), product.getProductCategory());
    }
    @Override
    public int hashCode() {

        return Objects.hash(getProductName(), getProductCategory(), getProductIdNumber());
    }
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productIdNumber=" + productIdNumber +
                '}';
    }
}
