package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Warehouse;

import java.sql.SQLException;
import java.util.List;

public interface WarehouseDAO {
<<<<<<< HEAD
    int addWarehouse(Warehouse warehouse) throws SQLException;
    Warehouse getWarehouseById(int warehouseId) throws SQLException;
    void updateWarehouse (Warehouse warehouse) throws SQLException;
    void deleteWarehouse (int warehouseId) throws SQLException;
    List<Warehouse> getAllWarehouse() throws SQLException;
=======
    int addWarehouse(Warehouse warehouse)throws SQLException;
    Warehouse getWarehouseById(int warehouseId)throws SQLException;
    void updateWarehouse (Warehouse warehouse)throws SQLException;
    void deleteWarehouse (int warehouseId)throws SQLException;
    List<Warehouse> getAllWarehouse()throws SQLException;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
}