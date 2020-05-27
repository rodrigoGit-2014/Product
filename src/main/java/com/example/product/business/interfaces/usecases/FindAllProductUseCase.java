package com.example.product.business.interfaces.usecases;

import com.example.product.business.model.Product;

import java.util.List;

public interface FindAllProductUseCase {

    List<Product> findAllProducts();
}
