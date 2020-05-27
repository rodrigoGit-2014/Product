package com.example.product.presentation.rest.controller;

import com.example.product.business.interfaces.usecases.CreateProductUseCase;
import com.example.product.business.model.Product;
import com.example.product.presentation.rest.mapper.ProductRequestMapper;
import com.example.product.presentation.rest.model.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateProductController {

    @Autowired
    private CreateProductUseCase createProductService;

    @PostMapping("/product")
    public void createProduct(@RequestBody ProductRequest request) {
        Product product = ProductRequestMapper.mapProductToProductBussinessModel(request);
        createProductService.createProduct(product);
    }
}
