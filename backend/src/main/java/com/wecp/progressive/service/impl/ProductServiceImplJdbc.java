package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

=======
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

<<<<<<< HEAD
public class ProductServiceImplJdbc implements ProductService  {

    private ProductDAO productDAO;

    public ProductServiceImplJdbc (ProductDAO productDAO) {
=======
import java.sql.SQLException;
import java.util.List;

public class ProductServiceImplJdbc implements ProductService {

    private ProductDAO productDAO;

    public ProductServiceImplJdbc(ProductDAO productDAO) {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        return productDAO.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
        return productDAO.getProductById(productId);
    }

    @Override
    public int addProduct(Product product) throws SQLException {
        return productDAO.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        productDAO.updateProduct(product);
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
<<<<<<< HEAD
       productDAO.deleteProduct(productId);
    }


=======
        productDAO.deleteProduct(productId);
    }
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
}