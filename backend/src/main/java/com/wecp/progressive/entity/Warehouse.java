package com.wecp.progressive.entity;

<<<<<<< HEAD
=======
import javax.persistence.CascadeType;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD


@Entity
public class Warehouse implements Comparable<Warehouse> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer warehouseId;
    
    private Integer supplierId;
=======
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Warehouse implements Comparable<Warehouse> {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouseId;
    
    //@ManyToOne(cascade = CascadeType.MERGE)
    //@JoinColumn(name = "supplierId")
    private int supplierId;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    private String warehouseName;
    private String location;
    private int capacity;

    public Warehouse() {}

<<<<<<< HEAD
    // Warehouse(int,int,java.lang.String,java.lang.String,int)
    

=======
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouseId;
        this.supplierId = supplierId;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }

<<<<<<< HEAD
    public Warehouse(int supplierId, String warehouseName, String location, int capacity) {
        this.supplierId = supplierId;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }

=======
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplier) {
        this.supplierId = supplier;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
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

    @Override
    public int compareTo(Warehouse otherWarehouse) {
        return otherWarehouse.getCapacity() - this.getCapacity();
    }
}