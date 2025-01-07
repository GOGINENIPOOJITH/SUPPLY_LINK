package com.wecp.progressive.service.impl;

import java.util.List;

<<<<<<< HEAD
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
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int productId) {
        // TODO Auto-generated method stub
        return productRepository.findById(productId).get();
    }

    @Override
    public int addProduct(Product product) {
        // TODO Auto-generated method stub
        return productRepository.save(product).getProductId();
    }

    @Override
    public void updateProduct(Product product) {
        // TODO Auto-generated method stub
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
        // TODO Auto-generated method stub
        productRepository.deleteById(productId);
        
    }

}