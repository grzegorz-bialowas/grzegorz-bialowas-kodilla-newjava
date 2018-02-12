package com.kodilla.good.patterns.challenges.food2Door.deliverers;

import com.kodilla.good.patterns.challenges.food2Door.basic.Product;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop {
    private final List<Product> productList;
    public HealthyShop(List<Product> productList) {
        this.productList = productList;
    }
    public List<Product> getProductList() {
        List<Product> healthyShopList = new ArrayList<>();
        healthyShopList.add(new Product("FreshBanana", 4, 2));
        healthyShopList.add(new Product("BioExtraButter", 8, 2));
        healthyShopList.add(new Product("OrganicPatato", 7, 2));
        healthyShopList.add(new Product("EasyFish", 9, 2));
        healthyShopList.add(new Product("NaturalTomato", 7, 3));
        return productList;
    }
}
