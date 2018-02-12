package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;

import java.util.ArrayList;
import java.util.List;

public class DelivererRepository {
    private Deliverer deliverer;
    private List<Deliverer> delivererList;
    public DelivererRepository(Deliverer deliverer, List<Deliverer> delivererList) {
        this.deliverer = deliverer;
        this.delivererList = delivererList;
    }
    public Deliverer getDeliverer() {
        return deliverer;
    }
    public List<Deliverer> getDelivererList() {
        List<Deliverer> delivererList = new ArrayList<>();
        delivererList.add(new Deliverer("ExtraFoodShop", "Warsaw", 123, "aaaaa@aaa.pl"));
        delivererList.add(new Deliverer("GlutenFreeShop", "Krakow", 456, "zzz@zz.pl"));
        delivererList.add(new Deliverer("HealthyShop", "Wroclaw", 789, "xxx@xxx.pl"));
        return delivererList;
    }
}
