package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJpa implements SupplierService  {

    private SupplierDAO supplierDAO;

    public SupplierServiceImplJpa(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }
   
    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public int addSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        return List.of();
    }

}