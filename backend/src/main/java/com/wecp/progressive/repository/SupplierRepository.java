package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    void deleteBySupplierId(@Param("supplierId") int supplierId);

    Supplier findBySupplierId(@Param("supplierId") int supplierId);

    Supplier findByUsername(String username);

    Supplier findByEmail(String email);
}
=======

public interface SupplierRepository {
}
>>>>>>> ca6d60b2c41f6dc569a88e6496ae140de6aeba54
