package com.example.ck_demo.reponsitory;

import com.example.ck_demo.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryReponsitory extends JpaRepository<Category, Long> {

}
