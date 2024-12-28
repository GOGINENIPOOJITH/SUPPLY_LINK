package com.wecp.progressive.entity;

public class Warehouse {
    private int warehouse_id;
    private int supplier_id;
    private String warehouse_name;
    private String location;
    private int capacity;
    
    public Warehouse(int warehouse_id, int supplier_id, String warehouse_name, String location, int capacity) {
        this.warehouse_id = warehouse_id;
        this.supplier_id = supplier_id;
        this.warehouse_name = warehouse_name;
        this.location = location;
        this.capacity = capacity;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    

    

}