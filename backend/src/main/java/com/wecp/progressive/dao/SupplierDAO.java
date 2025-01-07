package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

public interface SupplierDAO {
    int addSupplier(Supplier supplier) throws SQLException;
<<<<<<< HEAD
    Supplier getSupplierById(int supplierId) throws SQLException;
    void updateSupplier(Supplier supplier) throws SQLException;
    void deleteSupplier(int supplierId) throws SQLException ;
    List<Supplier> getAllSuppliers()  throws SQLException;
=======
    Supplier getSupplierById(int supplierId)throws SQLException;
    void updateSupplier(Supplier supplier)throws SQLException;
    void deleteSupplier(int supplierId) throws SQLException;
    List<Supplier> getAllSuppliers()throws SQLException;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
}
