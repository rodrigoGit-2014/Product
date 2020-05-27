package com.example.product.business.service;

import com.example.product.business.interfaces.data.gateway.CommentServiceGateway;
import com.example.product.business.interfaces.data.gateway.PhotoServiceGateway;
import com.example.product.business.interfaces.data.persistance.ProductRepository;
import com.example.product.business.interfaces.usecases.FindAllProductUseCase;
import com.example.product.business.model.Product;
import com.example.product.data.gateway.rest.model.Photo;
import com.example.product.data.gateway.soap.model.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllProductService implements FindAllProductUseCase {

    @Autowired
    private CommentServiceGateway commentServiceGateway;

    @Autowired
    private PhotoServiceGateway photoServiceGateway;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> findAllProducts() {
        List<Product> productList = productRepository.findAllProduct();
        for (Product product : productList) {
            List<Comments> commentsList = commentServiceGateway.findCommentsByProductID(product.getProductID());
            List<Photo> photoList = photoServiceGateway.findPhotosByProductID(product.getProductID());
            product.setCommentsList(commentsList);
            product.setPhotosList(photoList);
        }
        return productList;
    }
}
