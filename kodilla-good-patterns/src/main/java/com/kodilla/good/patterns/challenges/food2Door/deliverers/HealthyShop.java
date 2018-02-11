package com.kodilla.good.patterns.challenges.food2Door.deliverers;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.DelivererProcessor;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements DelivererProcessor {
    private final Deliverer deliverer;
    private final List<Product> productList;
    public HealthyShop(Deliverer deliverer, List<Product> productList) {
        this.deliverer = deliverer;
        this.productList = productList;
    }
    public Deliverer getDeliverer() {
        return deliverer;
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
    @Override
    public void process(Deliverer deliverer) {
    }
}
