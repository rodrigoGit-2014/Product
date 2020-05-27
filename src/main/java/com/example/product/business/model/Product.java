package com.example.product.business.model;

import com.example.product.data.gateway.rest.model.Photo;
import com.example.product.data.gateway.soap.model.Comments;

import java.util.List;


public class Product {

    private String productID;

    private List<Comments> commentsList;

    private List<Photo> photosList;

    public String getProductID() {
        return productID;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }

    public void setPhotosList(List<Photo> photosList) {
        this.photosList = photosList;
    }
}
