package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

=======
=======
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

<<<<<<< HEAD
public class SupplierServiceImplJdbc implements SupplierService  {
=======
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

public class SupplierServiceImplJdbc implements SupplierService {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54

    private SupplierDAO supplierDAO;

    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
        return supplierDAO.getAllSuppliers();
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        return supplierDAO.addSupplier(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException {
        List<Supplier> sortedSuppliers = supplierDAO.getAllSuppliers();
        if (sortedSuppliers != null) {
            sortedSuppliers.sort(Comparator.comparing(Supplier::getSupplierName)); // Sort by supplier name
        }
        return sortedSuppliers;
    }

    @Override
    public void updateSupplier(Supplier supplier) throws SQLException {
        supplierDAO.updateSupplier(supplier);
    }

    @Override
    public void deleteSupplier(int supplierId) throws SQLException {
        supplierDAO.deleteSupplier(supplierId);
    }

    @Override
    public Supplier getSupplierById(int supplierId) throws SQLException {
        return supplierDAO.getSupplierById(supplierId);
    }
<<<<<<< HEAD
    
}

=======
}
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
