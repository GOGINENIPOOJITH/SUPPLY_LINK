package com.wecp.progressive.entity;

public class Product {
    private int product_id;
    private int warehouse_id;
    private String product_name;
    private String product_description;
    private int quantity;
    private double price;
    public Product(int product_id, int warehouse_id, String product_name, String product_description, int quantity,
            double price) {
        this.product_id = product_id;
        this.warehouse_id = warehouse_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.quantity = quantity;
        this.price = price;
    }
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public int getWarehouse_id() {
        return warehouse_id;
    }
    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getProduct_description() {
        return product_description;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    

}