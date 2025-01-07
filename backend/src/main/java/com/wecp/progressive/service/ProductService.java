package com.wecp.progressive.service;

import com.wecp.progressive.entity.Product;

<<<<<<< HEAD
=======
import java.sql.SQLDataException;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
import java.sql.SQLException;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws SQLException;

<<<<<<< HEAD
    Product getProductById(int productId) throws SQLException;

    int addProduct(Product product) throws SQLException;

    void updateProduct(Product product) throws SQLException;

    void deleteProduct(int productId) throws SQLException;
=======
    Product getProductById(int productId)throws SQLException;

    int addProduct(Product product)throws SQLException;

    void updateProduct(Product product)throws SQLException;

    void deleteProduct(int productId)throws SQLException;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54

    //Do not implement these methods in ProductServiceImplJdbc.java class
    default List<Product> getAllProductByWarehouse(int warehouseId) {
        return null;
    }
}
