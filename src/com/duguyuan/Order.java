package com.duguyuan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {

    private Map<String, Item> items;

    public Order(Map<String, Item> items) {
        this.items = items;
    }

    public double getOrderAmount(String itemCode, int itemCount) {
        double price = items.get(itemCode).getUnitPrice();
        return price * itemCount;
    }

    public static void main(String[] args) {
        Item huaWei = new Item("C_101", "HUAWEI Mate30 Pro", 5000.00);
        Item xiaoMi = new Item("C_102", "XIAOMI 10 Pro", 4699.00);
        Map<String, Item> items = new HashMap<String, Item>();
        items.put(huaWei.getItemCode(), huaWei);
        items.put(xiaoMi.getItemCode(), xiaoMi);
        Order order = new Order(items);
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] datas = input.split(",");
        double orderAmount = order.getOrderAmount(datas[0], Integer.parseInt(datas[1]));
        System.out.println(orderAmount);
    }

}
