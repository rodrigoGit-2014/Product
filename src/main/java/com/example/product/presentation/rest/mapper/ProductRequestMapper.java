package com.example.product.presentation.rest.mapper;

import com.example.product.business.model.Product;
import com.example.product.presentation.rest.model.ProductRequest;

public class ProductRequestMapper {

    public static Product mapProductToProductBussinessModel(ProductRequest productRequest){
        return new Product();
    }
}
