package com.wecp.progressive.service.impl;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class SupplierServiceImplArraylist implements SupplierService {

    private SupplierDAO supplierDAO;

    public SupplierServiceImplArraylist(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }


    private static List<Supplier> supplierList;
    
    public SupplierServiceImplArraylist(){
        supplierList = new ArrayList<>();
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierList;
    }

    @Override
    public int addSupplier(Supplier supplier) {
        supplierList.add(supplier);
        return supplierList.size();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        List<Supplier> sortedSupplier = supplierList;
        sortedSupplier.sort(Comparator.comparing(Supplier::getSupplierName)); 
        return sortedSupplier;
    }


    @Override
    public void emptyArrayList() {
        supplierList = new ArrayList<>();
    }
}