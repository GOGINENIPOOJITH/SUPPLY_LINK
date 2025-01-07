package com.wecp.progressive.dao;

<<<<<<< HEAD
=======
import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Warehouse;

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
import com.wecp.progressive.entity.Warehouse;

public class WarehouseDAOImpl implements WarehouseDAO {

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
    public int addWarehouse(Warehouse warehouse) {
        String slq = "INSERT INTO warehouse (supplier_id, warehouse_name, location, capacity) VALUES (?, ?, ?, ?)";
        // try {
        //     PreparedStatement ps = connection.prepareStatement(slq, Statement.RETURN_GENERATED_KEYS);
        //     ps.setInt(1, warehouse.getSupplierId());
        //     ps.setString(2, warehouse.getWarehouseName());
        //     ps.setString(3, warehouse.getLocation());
        //     ps.setInt(4, warehouse.getCapacity());

        //     ps.executeUpdate();
        //     ResultSet rs = ps.getGeneratedKeys();
        //     if(rs.next()){
        //         warehouse.setWarehouseId(rs.getInt(1));
        //         return warehouse.getWarehouseId();
        //     }
        //     return -1;
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
            return -1;
        // }
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) {
        // String slq = "SELECT * FROM warehouse WHERE warehouse_id = ?";
        // try {
        //     PreparedStatement ps = connection.prepareStatement(slq);
        //     ps.setInt(1, warehouseId);
        //     ResultSet rs =  ps.executeQuery();
        //     if(rs.next()){
        //         Warehouse w = new Warehouse();
        //         w.setCapacity(rs.getInt("capacity"));
        //         w.setLocation(rs.getString("location"));
        //         w.setSupplierId(rs.getInt("supplier_id"));
        //         w.setWarehouseName(rs.getString("warehouse_name"));
        //         w.setWarehouseId(rs.getInt("warehouse_id"));

        //         return w;
        //     }
        //     return null;
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
            return null;
<<<<<<< HEAD
        // }
=======
=======
import java.util.ArrayList;
import java.util.List;

public class WarehouseDAOImpl implements WarehouseDAO {

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        int generatedID = -1;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "INSERT INTO warehouse (supplier_id, warehouse_name, location, capacity) VALUES (?, ?, ?, ?)";
            statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1, warehouse.getSupplierId());
            statement.setString(2, warehouse.getWarehouseName());
            statement.setString(3, warehouse.getLocation());
            statement.setDouble(4, warehouse.getCapacity());
            statement.executeUpdate();

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                generatedID = resultSet.getInt(1);
                warehouse.setWarehouseId(generatedID);
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
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "SELECT * FROM warehouse WHERE warehouse_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, warehouseId);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int supplierId = resultSet.getInt("supplier_id");
                String warehouseName = resultSet.getString("warehouse_name");
                String location = resultSet.getString("location");
                int capacity = resultSet.getInt("capacity");
                return new Warehouse(warehouseId, supplierId, warehouseName, location, capacity);
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
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "UPDATE warehouse SET supplier_id =?, warehouse_name =?, location =?, capacity =? WHERE warehouse_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, warehouse.getSupplierId());
            statement.setString(2, warehouse.getWarehouseName());
            statement.setString(3, warehouse.getLocation());
            statement.setInt(4, warehouse.getCapacity());
            statement.setInt(5, warehouse.getWarehouseId());
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
<<<<<<< HEAD
    public void updateWarehouse(Warehouse warehouse) {
        // String sql = "UPDATE warehouse SET supplier_id = ?, warehouse_name = ?, location = ?, capacity = ? WHERE warehouse_id = ?";
        // try {
        //     PreparedStatement ps = connection.prepareStatement(sql);
        //     ps.setInt(1, warehouse.getSupplierId());
        //     ps.setString(2, warehouse.getWarehouseName());
        //     ps.setString(3, warehouse.getLocation());
        //     ps.setInt(4, warehouse.getCapacity());
        //     ps.setInt(5, warehouse.getWarehouseId());
        //     ps.executeUpdate();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }        
    }

    @Override
    public void deleteWarehouse(int warehouseId) {
        String sql = "DELETE FROM warehouse WHERE warehouse_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, warehouseId);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
=======
    public void deleteWarehouse(int warehouseId) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "DELETE FROM warehouse WHERE warehouse_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, warehouseId);
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
<<<<<<< HEAD
    public List<Warehouse> getAllWarehouse() {
        // List<Warehouse> ans= new ArrayList<>();
        // String query=" SELECT * FROM warehouse";
        // try(PreparedStatement ps = connection.prepareStatement(query)){
        //     ResultSet rs= ps.executeQuery();
        //     while(rs.next()){
        //         Warehouse w = new Warehouse();
        //         w.setCapacity(rs.getInt("capacity"));
        //         w.setLocation(rs.getString("location"));
        //         w.setSupplierId(rs.getInt("supplier_id"));
        //         w.setWarehouseName(rs.getString("warehouse_name"));
        //         w.setWarehouseId(rs.getInt("warehouse_id"));

        //         ans.add(w);
        //     }
        //     return ans;
        // }catch(SQLException e){
        //     e.printStackTrace();
        // }
        return null;
    }

=======
    public List<Warehouse> getAllWarehouse() throws SQLException {
        List<Warehouse> warehouses = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConnectionManager.getConnection();
            String sql = "SELECT * FROM warehouse";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int warehouseId = resultSet.getInt("warehouse_id");
                int supplierId = resultSet.getInt("supplier_id");
                String warehouseName = resultSet.getString("warehouse_name");
                String location = resultSet.getString("location");
                int capacity = resultSet.getInt("capacity");
                warehouses.add(new Warehouse(warehouseId, supplierId, warehouseName, location, capacity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Rethrow the exception
        } finally {
            if (connection != null) {
                connection.close();
            }
        }

        return warehouses;
    }
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
}
