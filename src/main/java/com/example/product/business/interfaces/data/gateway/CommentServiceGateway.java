package com.example.product.business.interfaces.data.gateway;

import com.example.product.data.gateway.soap.model.Comments;

import java.util.List;

public interface CommentServiceGateway {

    List<Comments> findCommentsByProductID(String productID);
}
