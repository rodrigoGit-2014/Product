package com.example.product.business.interfaces.data.gateway;

import com.example.product.data.gateway.rest.model.Photo;

import java.util.List;

public interface PhotoServiceGateway {


    List<Photo> findPhotosByProductID(String productID);



}
