package com.wecp.progressive.service.impl;

import java.util.List;

<<<<<<< HEAD
import javax.transaction.Transactional;

=======
<<<<<<< HEAD
>>>>>>> 2f38a3f124578a8e75c8b05819dc2e74b3213244
import org.springframework.stereotype.Service;

=======
<<<<<<< HEAD
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.service.ProductService;

@Service
public class ProductServiceImplJpa implements ProductService  {

    private ProductRepository productRepository;

    public ProductServiceImplJpa (ProductRepository productRepository) {
        this.productRepository = productRepository;
=======
import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

@Service
public class ProductServiceImplJpa implements ProductService  {

    private ProductDAO productDAO;

    public ProductServiceImplJpa (ProductDAO productDAO) {
        this.productDAO = productDAO;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    }
   
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public int addProduct(Product product) {
        return productRepository.save(product).getProductId();
    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    @Transactional
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
        
    }

    public List<Product> getAllProductByWarehouse(int warehouseId) {
        return productRepository.findAllByWarehouse_WarehouseId(warehouseId);
    }

}