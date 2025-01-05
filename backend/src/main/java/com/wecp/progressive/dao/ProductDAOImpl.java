package com.wecp.progressive.dao;

<<<<<<< HEAD
=======
import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Product;

>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< HEAD
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Product;

public class ProductDAOImpl implements ProductDAO {

    private static Connection connection;

    static {
        try {
            connection = DatabaseConnectionManager.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public int addProduct(Product product) throws SQLException {
        String slq = "INSERT INTO product (warehouse_id, product_name, product_description, quantity, price) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(slq, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, product.getWarehouseId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getProductDescription());
            ps.setInt(4, product.getQuantity());
            ps.setLong(5, product.getPrice());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                product.setProductId(rs.getInt(1));
                return product.getProductId();
            }
            return -1;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return -1;
        }

=======
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public int addProduct(Product product) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        int generatedID = -1;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "INSERT INTO product (warehouse_id, product_name, product_description, quantity, price) VALUES (?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, product.getWarehouseId());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getProductDescription());
            statement.setInt(4, product.getQuantity());
            statement.setDouble(5, product.getPrice());
            statement.executeUpdate();

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                generatedID = resultSet.getInt(1);
                product.setProductId(generatedID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            // Close resources in the reverse order of opening
            if (statement != null) {
                statement.close();
            }
        }
        return generatedID;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    }

    @Override
    public Product getProductById(int productId) throws SQLException {
<<<<<<< HEAD
        String slq = "SELECT * FROM product WHERE product_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(slq);
            ps.setInt(1, productId);
            ResultSet rs =  ps.executeQuery();
            if(rs.next()){
               Product p = new Product();
               p.setPrice(rs.getLong("price"));
               p.setProductDescription(rs.getString("product_description"));
               p.setProductId(rs.getInt("product_id"));
               p.setProductName(rs.getString("product_name"));
               p.setQuantity(rs.getInt("quantity"));
               p.setWarehouseId(rs.getInt("warehouse_id"));

               return p;
            }
            return null;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
        
=======
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "SELECT * FROM product WHERE product_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, productId);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int warehouseId = resultSet.getInt("warehouse_id");
                String productName = resultSet.getString("product_name");
                String productDescription = resultSet.getString("product_description");
                int quantity = resultSet.getInt("quantity");
                Long price = (long) resultSet.getDouble("price");
                return new Product(productId, warehouseId, productName, productDescription, quantity, price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return null;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
<<<<<<< HEAD
        String sql = "UPDATE product SET  warehouse_id = ?, product_name = ?, product_description = ?, quantity = ?, price = ? WHERE product_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, product.getWarehouseId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getProductDescription());
            ps.setInt(4, product.getQuantity());
            ps.setLong(5, product.getPrice());
            ps.setInt(6, product.getProductId());

            ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }        
=======
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "UPDATE product SET warehouse_id = ?, product_name = ?, product_description = ?, quantity =?, price =? WHERE product_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, product.getWarehouseId());
            statement.setString(2, product.getProductName());
            statement.setString(3, product.getProductDescription());
            statement.setInt(4, product.getQuantity());
            statement.setDouble(5, product.getPrice());
            statement.setInt(6, product.getProductId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
<<<<<<< HEAD
        String sql = "DELETE FROM product WHERE product_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, productId);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
=======
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "DELETE FROM product WHERE product_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, productId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            if (connection != null) {
                connection.close();
            }
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
        }
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
<<<<<<< HEAD
        List<Product> ans= new ArrayList<>();
        String query=" SELECT * FROM product";
        try(PreparedStatement ps = connection.prepareStatement(query)){
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setPrice(rs.getLong("price"));
                p.setProductDescription(rs.getString("product_description"));
                p.setProductId(rs.getInt("product_id"));
                p.setProductName(rs.getString("product_name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setWarehouseId(rs.getInt("warehouse_id"));
                
                ans.add(p);
            }
            return ans;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void close () {
        try {
            if(connection != null)
                connection.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
=======
        List<Product> products = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "SELECT * FROM product";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                int warehouseId = resultSet.getInt("warehouse_id");
                String productName = resultSet.getString("product_name");
                String productDescription = resultSet.getString("product_description");
                int quantity = resultSet.getInt("quantity");
                Long price = (long) resultSet.getDouble("price");
                products.add(new Product(productId, warehouseId, productName, productDescription, quantity, price));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            if (connection != null) {
                connection.close();
            }
        }

        return products;
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
    }
}
