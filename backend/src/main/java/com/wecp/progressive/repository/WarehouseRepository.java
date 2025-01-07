package com.wecp.progressive.repository;

<<<<<<< HEAD
import java.util.List;

=======
<<<<<<< HEAD
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Warehouse;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer>{
<<<<<<< HEAD

    Warehouse findByWarehouseId(@Param("warehouseId") int warehouseId);

    List<Warehouse> findAllBySupplier_SupplierId(@Param("supplierId") int supplierId);

    @Query("DELETE FROM Warehouse w WHERE w.supplier.supplierId = :supplierId")
    void deleteBySupplierId(@Param("supplierId") int supplierId);

}
=======
=======

public interface WarehouseRepository {
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
}
>>>>>>> d71e91e378b374bf6a007ebd46dd727aeaf424b6
