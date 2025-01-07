package com.wecp.progressive.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    Integer productId;
    Integer warehouseId;
    String productName;
    String productDescription;
    int quantity;
    long price;

    // @OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.ALL)
    Warehouse warehouse;
    
    public Product(int productId, int warehouseId, String productName, String productDescription, int quantity,
            long price) {
=======
    int productId;
    int warehouseId;
    String productName;
    String productDescription;
    int quantity;
    double price;
    
    public Product () {}
    public Product(int productId, int warehouseId, String productName, String productDescription, int quantity,
    double price) {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
        this.productId = productId;
        this.warehouseId = warehouseId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }
<<<<<<< HEAD
    public Product () {}
    public Product(int warehouseId, String productName, String productDescription, int quantity,
    long price) {
        this.warehouseId = warehouseId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }
<<<<<<< HEAD
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }
    public Warehouse getWarehouse() {
        return warehouse;
    }
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
=======
=======
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
<<<<<<< HEAD
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
=======
    public double getPrice() {
        return price;
    }
    public void setPrice(Long price) {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
        this.price = price;
    }
}