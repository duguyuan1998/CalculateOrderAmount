package com.duguyuan;

public class Item {

    private String ItemCode;
    private String ItemName;
    private double UnitPrice;

    public Item() {}

    public Item(String itemCode, String itemName, double unitPrice) {
        ItemCode = itemCode;
        ItemName = itemName;
        UnitPrice = unitPrice;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        ItemCode = itemCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }
}
