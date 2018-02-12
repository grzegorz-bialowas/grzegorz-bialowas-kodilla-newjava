package com.kodilla.good.patterns.challenges.food2Door.deliverers;

import com.kodilla.good.patterns.challenges.food2Door.basic.Product;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop {
    private final List<Product> productList;
    public GlutenFreeShop(List<Product> productList) {
        this.productList = productList;
    }
    public List<Product> getProductList() {
        List<Product> glutenFreeShopList = new ArrayList<>();
        glutenFreeShopList.add(new Product("FreshBread", 2, 5));
        glutenFreeShopList.add(new Product("FreshRoll", 2, 3));
        glutenFreeShopList.add(new Product("BioDonut", 3, 1));
        glutenFreeShopList.add(new Product("WindyCookies", 6, 1));
        glutenFreeShopList.add(new Product("DanishFlour", 9, 2));
        return productList;
    }
}
