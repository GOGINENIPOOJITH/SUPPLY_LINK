package com.wecp.progressive.controller;
 
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
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliers();
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addSupplierToArrayList(@RequestBody Supplier supplier) {
        int listSize=supplierServiceImplArraylist.addSupplier(supplier);
        return new ResponseEntity<>(listSize, HttpStatus.CREATED);
    }
    @GetMapping("/fromArrayList/all")
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() {
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliersSortedByName();
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}