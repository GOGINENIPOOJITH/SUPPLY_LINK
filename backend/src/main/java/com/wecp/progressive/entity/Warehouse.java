package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.*;
=======
<<<<<<< HEAD
=======
import javax.persistence.CascadeType;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD

>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6

@Entity
public class Warehouse implements Comparable<Warehouse> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouseId;
    
<<<<<<< HEAD
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "supplierId")
    private Supplier supplier;
=======
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
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
    private String warehouseName;
    private String location;
    private int capacity;

<<<<<<< HEAD
    public Warehouse() {
    }
=======
    public Warehouse() {}

<<<<<<< HEAD
    // Warehouse(int,int,java.lang.String,java.lang.String,int)
    
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6

=======
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    public Warehouse(int warehouseId, int supplierId, String warehouseName, String location, int capacity) {
        this.warehouseId = warehouseId;
<<<<<<< HEAD
        this.supplier.setSupplierId(supplierId);
=======
        this.supplierId = supplierId;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }

<<<<<<< HEAD
    public Warehouse(int supplierId, String warehouseName, String location, int capacity) {
        this.supplierId = supplierId;
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
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
        // Implement comparison logic based on warehouse capacity
        return Double.compare(otherWarehouse.getCapacity(), this.getCapacity());
    }
}