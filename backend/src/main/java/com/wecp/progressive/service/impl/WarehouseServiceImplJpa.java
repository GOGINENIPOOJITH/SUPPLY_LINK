<<<<<<< HEAD
=======
package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6

package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.exception.NoWarehouseFoundForSupplierException;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.repository.WarehouseRepository;
=======
import java.util.List;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
import com.wecp.progressive.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

@Service
public class WarehouseServiceImplJpa implements WarehouseService {

<<<<<<< HEAD
=======
<<<<<<< HEAD
    
    // private WarehouseDAO warehouseDAO;
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
    private WarehouseRepository warehouseRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    public WarehouseServiceImplJpa(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
        return warehouseRepository.findAll();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
        return warehouseRepository.save(warehouse).getWarehouseId();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
        List<Warehouse> sortedWarehouses = warehouseRepository.findAll();
        Collections.sort(sortedWarehouses);
        return sortedWarehouses;
    }

    @Override
    @Transactional
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
        warehouseRepository.save(warehouse);
    }

    @Override
    @Transactional
    public void deleteWarehouse(int warehouseId) throws SQLException {
        productRepository.deleteByWarehouseId(warehouseId);
        warehouseRepository.deleteById(warehouseId);
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return warehouseRepository.findByWarehouseId(warehouseId);
    }

<<<<<<< HEAD
    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) throws NoWarehouseFoundForSupplierException {
        List<Warehouse> warehouseList = warehouseRepository.findAllBySupplier_SupplierId(supplierId);
        return warehouseList;
    }
}
=======
    // @Override
    // public List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
    //     return warehouseRepository.findBy
    // }
=======

    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplJpa (WarehouseDAOImpl warehouseDAO)  {
        this.warehouseDAO = warehouseDAO;
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        // TODO Auto-generated method stub
        return List.of();
    }
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    
}
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
