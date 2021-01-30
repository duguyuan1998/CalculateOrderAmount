package com.duguyuan;

import java.util.Map;

public class Order {

    private Map<String, Item> items;

    public Order(Map<String, Item> items) {
        this.items = items;
    }

    public double getOrderAmount(String itemCode, int itemCount) {
        double price = items.get(itemCode).getUnitPrice();
        return price * itemCount;
    }

}
