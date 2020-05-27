package com.example.product.data.gateway.soap;

import com.example.product.business.interfaces.data.gateway.CommentServiceGateway;
import com.example.product.data.gateway.soap.model.Comments;

import java.util.List;

public class CommentsRest implements CommentServiceGateway {

    @Override
    public List<Comments> findCommentsByProductID(String productID) {
        return null;//make Soap call to comments service;
    }
}
