package com.example.DontJunkItListIt.service;

import com.example.DontJunkItListIt.dto.ProductDetailsRequest;
import com.example.DontJunkItListIt.dto.ProductDto;
import com.example.DontJunkItListIt.entity.CarParts;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface CarPartsService {

     //CarParts addProduct(ProductDto carPartsDto) throws IOException ;

    void addProduct(ProductDto carPartsDto) throws IOException ;

    List<CarParts> getAllCarParts();

	CarParts getProductById(int productId);

	List<CarParts> findProductsByUserId(Long userId);

	void updateCarPartDetails(Long productId, ProductDetailsRequest updatedDetails) throws Exception;

}
