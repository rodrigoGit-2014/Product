package com.example.product.data.gateway.rest;

import com.example.product.business.interfaces.data.gateway.PhotoServiceGateway;
import com.example.product.data.gateway.rest.model.Photo;

import java.util.List;

public class PhotosRest implements PhotoServiceGateway {


    @Override
    public List<Photo> findPhotosByProductID(String productID) {
        return null;//todo make rest GET call to photos services
    }
}
