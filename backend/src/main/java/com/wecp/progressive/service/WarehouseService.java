package com.wecp.progressive.service;

import com.wecp.progressive.entity.Warehouse;

import java.sql.SQLException;
import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse) throws SQLException;

    List<Warehouse> getWarehousesSortedByCapacity() throws SQLException;

<<<<<<< HEAD
    default public void emptyArrayList() throws SQLException {
=======
    default public void emptyArrayList() {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
    default void updateWarehouse(Warehouse warehouse) throws SQLException {
    }

    default void deleteWarehouse(int warehouseId) throws SQLException {
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
=======
    default List<Warehouse> getWarehouseBySupplier(int supplierId) {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
        return null;
    }
}
