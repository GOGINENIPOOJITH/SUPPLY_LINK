package com.wecp.progressive.repository;

<<<<<<< HEAD
import java.util.List;

import javax.transaction.Transactional;

=======
<<<<<<< HEAD
>>>>>>> 2f38a3f124578a8e75c8b05819dc2e74b3213244
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
<<<<<<< HEAD

    Product findByProductId(@Param("productId") int productId);

    List<Product>findAllByWarehouse_WarehouseId(@Param("warehouseId") int warehouseId);

    @Modifying
    @Transactional
    @Query("delete from Product p where  p.warehouse.warehouseId = :warehouseId")
    void deleteByWarehouseId(@Param("warehouseId") int warehouseId);

    @Modifying
    @Transactional
    @Query("delete from Product p where  p.warehouse.supplier.supplierId = :supplierId")
    void deleteBySupplierId(@Param("supplierId") int supplierId);

=======
=======

public interface ProductRepository {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
>>>>>>> 2f38a3f124578a8e75c8b05819dc2e74b3213244
}
