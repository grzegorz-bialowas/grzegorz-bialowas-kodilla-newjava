package com.kodilla.good.patterns.challenges.food2Door.services;
import com.kodilla.good.patterns.challenges.food2Door.basic.Customer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;
import com.kodilla.good.patterns.challenges.food2Door.deliverers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.DelivererProcessor;
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
        DelivererProcessor delivererProcessor = new GlutenFreeShop(deliverer, glutenFreeShopList);
        delivererProcessor.process(deliverer);
        OrderRequest orderRequest = new OrderRequest(customer, glutenFreeShopList.get(2), 2, true);
        OrderRequestProcessor orderRequestProcessor = new OrderRequestProcessor(delivererProcessor,deliverer);
        orderRequestProcessor.order(orderRequest);
    }
}
