package com.wecp.progressive.controller;
<<<<<<< HEAD

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.impl.SupplierServiceImplArraylist;
import com.wecp.progressive.service.impl.SupplierServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;


@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierServiceImplArraylist supplierServiceImplArraylist;

    @Autowired
    SupplierServiceImplJpa supplierServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() throws SQLException {
        try {
            return new ResponseEntity<>(supplierServiceImplJpa.getAllSuppliers(), HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }   
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/{supplierId}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable int supplierId) throws SQLException {
        try {
            return new ResponseEntity<>(supplierServiceImplJpa.getSupplierById(supplierId), HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping
    public ResponseEntity<Integer> addSupplier(@RequestBody Supplier supplier)  {
        try {
            return new ResponseEntity<>(supplierServiceImplJpa.addSupplier(supplier), HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PutMapping("/{supplierId}")
    // @Transactional
    public ResponseEntity<Void> updateSupplier( @PathVariable int supplierId, @RequestBody Supplier supplier) throws SQLException {
        try {
            Supplier s = supplierServiceImplJpa.getSupplierById(supplierId);
            if(s == null) 
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            supplier.setSupplierId(s.getSupplierId());
            supplierServiceImplJpa.updateSupplier(supplier);
            return new ResponseEntity<>( HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/{supplierId}")
    public ResponseEntity<?> deleteSupplier(@PathVariable int supplierId) throws SQLException {
        try {
            supplierServiceImplJpa.deleteSupplier(supplierId);
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Supplier>> getAllSupplierFromArrayList()throws SQLException{
=======
 
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.impl.SupplierServiceImplArraylist;
import com.wecp.progressive.service.impl.SupplierServiceImplJpa;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.List;
@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierServiceImplArraylist supplierServiceImplArraylist;
    @Autowired
    private SupplierServiceImplJpa supplierServiceImplJpa;
 
    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        return new ResponseEntity<>(supplierServiceImplJpa.getAllSuppliers(), HttpStatus.OK);
    }
    @GetMapping("/{supplierID}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable int supplierId) {
        // try{
        //     return new ResponseEntity<>(supplierServiceImplJpa.getSupplierById(supplierId), HttpStatus.OK);
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
        return null;
    }
 
    @PostMapping
    public ResponseEntity<Integer> addSupplier(@RequestBody Supplier supplier) {
        //return new ResponseEntity<>(supplierServiceImplJpa.addSupplier(supplier),HttpStatus.OK);
        return null;
    }
 
    public ResponseEntity<Void> updateSupplier(Supplier supplier) {
        return null;
    }
 
    public ResponseEntity<Void> deleteSupplier(int supplierId) {
        return null;
    }
 
 
    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Supplier>> getAllSupplierFromArrayList(){
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliers();
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
    @PostMapping("/toArrayList")
<<<<<<< HEAD
    public ResponseEntity<Integer> addSupplierToArrayList(@RequestBody Supplier supplier) throws SQLException{
        int listSize=supplierServiceImplArraylist.addSupplier(supplier);
        return new ResponseEntity<>(listSize, HttpStatus.CREATED);
        
    }
    @GetMapping("/fromArrayList/all")
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() throws SQLException{
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliersSortedByName();
        return new ResponseEntity<>(s, HttpStatus.OK);
       
    }

=======
    public ResponseEntity<Integer> addSupplierToArrayList(@RequestBody Supplier supplier) {
        int listSize=supplierServiceImplArraylist.addSupplier(supplier);
        return new ResponseEntity<>(listSize, HttpStatus.CREATED);
    }
    @GetMapping("/fromArrayList/all")
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() {
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliersSortedByName();
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
}