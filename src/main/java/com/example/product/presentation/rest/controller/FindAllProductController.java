package com.example.product.presentation.rest.controller;

import com.example.product.business.interfaces.usecases.FindAllProductUseCase;
import com.example.product.business.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindAllProductController {
    @Autowired
    public FindAllProductUseCase findAllProductService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAllProducts() {
        List<Product> products = findAllProductService.findAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);

    }
}
