package com.kodilla.good.patterns.challenges.food2Door.deliverers;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop {
    private final Deliverer deliverer;
    private final List<Product> productList;
    public ExtraFoodShop(Deliverer deliverer, List<Product> productList) {
        this.deliverer = deliverer;
        this.productList = productList;
    }
    public Deliverer process() {
        return deliverer;
    }
    public List<Product> getProductList() {
        List<Product> extraFoodShopList = new ArrayList<>();
        extraFoodShopList.add(new Product("TunaFish", 5,2));
        extraFoodShopList.add(new Product("BioSugar",3,2));
        extraFoodShopList.add(new Product("NaturalOil", 2, 3));
        extraFoodShopList.add(new Product("BalticCocos", 2, 7));
        extraFoodShopList.add(new Product("FreshSalad", 3, 1));
        return productList;
    }
}
