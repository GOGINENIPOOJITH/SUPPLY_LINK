package com.wecp.progressive.service;


import com.wecp.progressive.entity.Supplier;

import java.sql.SQLException;
import java.util.List;

public interface SupplierService {
    List<Supplier> getAllSuppliers() throws SQLException;

    int addSupplier(Supplier supplier) throws SQLException;

    List<Supplier> getAllSuppliersSortedByName() throws SQLException;

    default public void emptyArrayList() {
    }

    //Do not implement these methods in SupplierServiceImplArraylist.java class
    default void updateSupplier(Supplier supplier) throws SQLException {
    }

    default void deleteSupplier(int supplierId) throws SQLException {
    }

    default Supplier getSupplierById(int supplierId) throws SQLException {
        return null;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
