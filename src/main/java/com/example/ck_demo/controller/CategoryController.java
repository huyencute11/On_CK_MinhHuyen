package com.example.ck_demo.controller;

import com.example.ck_demo.reponsitory.CategoryReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CategoryController {
    @Autowired
    CategoryReponsitory categoryReponsitory;
    @GetMapping("/")
    public String getAllCate(Model model){
        model.addAttribute("categories", categoryReponsitory.findAll());
        return "/index";
    }
}
