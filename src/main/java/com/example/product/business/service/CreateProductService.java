package com.example.product.business.service;

import com.example.product.business.interfaces.data.persistance.ProductRepository;
import com.example.product.business.interfaces.usecases.CreateProductUseCase;
import com.example.product.business.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService implements CreateProductUseCase {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }
}
