package com.example.product.business.interfaces.data.persistance;

import com.example.product.business.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAllProduct();

    void createProduct(Product product);
}
