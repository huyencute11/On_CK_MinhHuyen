package com.example.ck_demo.service;

import com.example.ck_demo.models.Category;
import com.example.ck_demo.models.Product;
import com.example.ck_demo.reponsitory.CategoryReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryReponsitory categoryReponsitory;
    public List<Category> findAllByCategory(long cateId){
        return categoryReponsitory.findAll();
    }
}
