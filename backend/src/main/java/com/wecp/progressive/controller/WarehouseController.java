package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.exception.NoWarehouseFoundForSupplierException;
import com.wecp.progressive.service.impl.WarehouseServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
=======
<<<<<<< HEAD
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
import org.springframework.web.bind.annotation.RestController;
=======
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    WarehouseServiceImplJpa warehouseServiceImplJpa;

        @GetMapping
    public ResponseEntity<List<Warehouse>> getAllWarehouses() throws SQLException {
        List<Warehouse> warehouses = warehouseServiceImplJpa.getAllWarehouses();
        return new ResponseEntity<>(warehouses, HttpStatus.OK);
    }

    @GetMapping("/{warehouseId}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable int warehouseId) {
        try {
            Warehouse warehouse = warehouseServiceImplJpa.getWarehouseById(warehouseId);
            if (warehouse != null) {
                return new ResponseEntity<>(warehouse, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Integer> addWarehouse(@RequestBody Warehouse warehouse) {
        try {
            int warehouseId = warehouseServiceImplJpa.addWarehouse(warehouse);
            return new ResponseEntity<>(warehouseId, HttpStatus.CREATED);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{warehouseId}")
    public ResponseEntity<Void> updateWarehouse(@PathVariable int warehouseId, @RequestBody Warehouse warehouse) {
        try {
            warehouse.setWarehouseId(warehouseId);
            warehouseServiceImplJpa.updateWarehouse(warehouse);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{warehouseId}")
    public ResponseEntity<Void> deleteWarehouse(@PathVariable int warehouseId) {
        try {
            warehouseServiceImplJpa.deleteWarehouse(warehouseId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/supplier/{supplierId}")
    public ResponseEntity<?> getWarehousesBySupplier(@PathVariable int supplierId) throws SQLException {
        try {
            List<Warehouse> warehouses = warehouseServiceImplJpa.getWarehouseBySupplier(supplierId);
            return new ResponseEntity<>(warehouses, HttpStatus.OK);
        } catch (NoWarehouseFoundForSupplierException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            // Return a generic error message for any other exceptions
            return new ResponseEntity<>("An unexpected error occurred: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
