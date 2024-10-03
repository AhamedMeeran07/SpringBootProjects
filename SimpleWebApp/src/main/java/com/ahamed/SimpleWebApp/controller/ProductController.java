package com.ahamed.SimpleWebApp.controller;

import com.ahamed.SimpleWebApp.model.Product;
import com.ahamed.SimpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProduct() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product productById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProductById(@PathVariable("productId") int prodId){  // Check the path varaiable name
        service.deleteProductById(prodId);
    }

}
