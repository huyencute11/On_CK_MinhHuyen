package com.example.ck_demo.service;

import com.example.ck_demo.models.Product;
import com.example.ck_demo.reponsitory.ProductReponsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    @Autowired
    ProductReponsitory productReponsitory;
    public List<Product> getAllProductByCateId(long id){
        System.out.println("id "+ id);
        return productReponsitory.findByCateId(id);
    }
    public void createProduct(Product p){
        productReponsitory.save(p);
    }
    public void deleteProduct(long id){
        productReponsitory.deleteById(id);
    }
//    public void update(long id, Product p){
//        Optional<Product> pro = productReponsitory.findById(id);
//        pro.orElse(null);
//        if(pro !=null){
//            pr
//        }
//    }

}
