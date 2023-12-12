package com.example.ck_demo.reponsitory;

import com.example.ck_demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductReponsitory extends JpaRepository<Product, Long> {
    @Query(value = "select p from Product p where p.category.id = ?1 ")
    List<Product> findByCateId(long id);

}
