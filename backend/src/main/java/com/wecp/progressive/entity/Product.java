package com.wecp.progressive.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private int productId;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "warehouseId")
    private Warehouse warehouse;
    private String productName;
    private String productDescription;
    private int quantity;
    private Long price;

    public Product() {
    }

    public Product(int productId, int warehouseId, String productName, String productDescription, int quantity, Long price) {
=======
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
>>>>>>> 2f38a3f124578a8e75c8b05819dc2e74b3213244
        this.productId = productId;
        this.warehouse.setWarehouseId(warehouseId);
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }
<<<<<<< HEAD

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
=======
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
>>>>>>> 2f38a3f124578a8e75c8b05819dc2e74b3213244
        this.productId = productId;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
<<<<<<< HEAD

=======
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
>>>>>>> 2f38a3f124578a8e75c8b05819dc2e74b3213244
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
=======
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
>>>>>>> 2f38a3f124578a8e75c8b05819dc2e74b3213244
        this.price = price;
    }
}