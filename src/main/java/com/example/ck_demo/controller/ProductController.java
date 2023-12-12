package com.example.ck_demo.controller;

import com.example.ck_demo.models.Category;
import com.example.ck_demo.models.Product;
import com.example.ck_demo.reponsitory.CategoryReponsitory;
import com.example.ck_demo.service.CategoryService;
import com.example.ck_demo.service.ProductService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryReponsitory categoryReponsitory;
    @GetMapping("/{cateId}")
    public String getAllProduct(@PathVariable("cateId") long cateId, Model model, HttpSession session){
        System.out.println(productService.getAllProductByCateId(cateId));
        session.setAttribute("cateCurrentId", cateId);
        model.addAttribute("products", productService.getAllProductByCateId(cateId));
        return "list";
    }
    @GetMapping("/add-form")
    public String getForm(){
      return "form-add";
    }
    @GetMapping("/all-form")
    public String getFormAll(Model model){
        model.addAttribute("categories", categoryReponsitory.findAll());
        return "form-all";
    }
    @PostMapping("/save")
    public String saveProduct(Product p,  HttpSession session){
        long cateId = (long) session.getAttribute("cateCurrentId");
        Optional<Category> aa =  categoryReponsitory.findById(cateId);
        Product a = new Product();
        a.setName(p.getName());
        a.setPrice(p.getPrice());
        a.setCategory(aa.orElseThrow());
        System.out.println("aaaaaaaa-------"+a);
        productService.createProduct(a);
        session.invalidate();
        return "redirect:/product/"+a.getCategory().getId();
    }
    @PostMapping("/save-all")
    public String saveProductAll(@RequestParam(value ="name") String name,
                                 @RequestParam(value ="price") String price,
                                 @RequestParam(value = "categoryId") String cateId
                                ){
        System.out.println("categoryId="+price);
        double priced = Double.parseDouble(price);
        long id = Long.parseLong(cateId);
        Product p = new Product();
        p.setName(name);
        p.setPrice(priced);
        Optional<Category> aa = categoryReponsitory.findById(id);
        p.setCategory(aa.orElseThrow());
        productService.createProduct(p);
        return "redirect:/";

    }
}
