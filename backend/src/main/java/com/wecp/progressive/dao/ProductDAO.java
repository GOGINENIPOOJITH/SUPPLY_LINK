package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
    int addProduct(Product product) throws SQLException;
    Product getProductById(int productId) throws SQLException;
<<<<<<< HEAD
    void updateProduct(Product product) throws SQLException;
    void deleteProduct(int productId) throws SQLException;
    List<Product> getAllProducts() throws SQLException;
=======
    void updateProduct(Product product)throws SQLException;
    void deleteProduct(int productId)throws SQLException;
    List<Product> getAllProducts()throws SQLException;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
}