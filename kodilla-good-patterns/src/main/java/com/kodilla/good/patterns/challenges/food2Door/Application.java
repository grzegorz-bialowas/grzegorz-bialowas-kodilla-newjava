package com.kodilla.good.patterns.challenges.food2Door;
import com.kodilla.good.patterns.challenges.food2Door.basic.Customer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;
import com.kodilla.good.patterns.challenges.food2Door.services.OrderRequest;
import com.kodilla.good.patterns.challenges.food2Door.services.OrderRequestProcessor;

import java.util.ArrayList;
import java.util.List;
public class Application {
    public static void main (String[] args){
        Deliverer deliverer = new Deliverer("GlutenFreeShop", "new street", 1111, "aaa@aaa.bb");
        Customer customer = new Customer("gre", "asas00", "sasa", "asasa");
            List<Product> glutenFreeShopList = new ArrayList<>();
            glutenFreeShopList.add(new Product("FreshBread", 2, 5));
            glutenFreeShopList.add(new Product("FreshRoll", 2, 3));
            glutenFreeShopList.add(new Product("BioDonut", 3, 1));
            glutenFreeShopList.add(new Product("WindyCookies", 6, 1));
            glutenFreeShopList.add(new Product("DanishFlour", 9, 2));
        List<Deliverer> delivererList = new ArrayList<>();
        delivererList.add(new Deliverer("ExtraFoodShop", "Warsaw", 123, "aaaaa@aaa.pl"));
        delivererList.add(new Deliverer("GlutenFreeShop", "Krakow", 456, "zzz@zz.pl"));
        delivererList.add(new Deliverer("HealthyShop", "Wroclaw", 789, "xxx@xxx.pl"));
        OrderRequest orderRequest = new OrderRequest(deliverer,customer, glutenFreeShopList, 2, true);
        OrderRequestProcessor orderRequestProcessor = new OrderRequestProcessor(n -> deliverer);
        orderRequestProcessor.order(orderRequest);
    }
}
