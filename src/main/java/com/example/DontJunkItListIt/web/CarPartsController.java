package com.example.DontJunkItListIt.web;

import com.example.DontJunkItListIt.dto.ProductDetailsRequest;
import com.example.DontJunkItListIt.dto.ProductDto;
import com.example.DontJunkItListIt.entity.CarParts;
import com.example.DontJunkItListIt.service.CarPartsService;

import jakarta.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*") 
public class CarPartsController {

	@Autowired
    private CarPartsService carPartsService;

	@PostMapping("/add")
    public ResponseEntity<String> addProduct(@ModelAttribute ProductDto productDto) {
        try {
        	carPartsService.addProduct(productDto);
            return ResponseEntity.ok().body("{\"message\": \"Product added successfully\"}");
        } catch (IOException e) {
            return ResponseEntity.status(500).body("{\"error\": \"Error adding product: " + e.getMessage() + "\"}");
        }
    }

  
    
    @GetMapping("/list")
    public ResponseEntity<List<CarParts>> getAllCarParts() {
        List<CarParts> carPartsList = carPartsService.getAllCarParts();
        System.out.println("Method Working");
        return new ResponseEntity<>(carPartsList, HttpStatus.OK);
    }
    
    
    @GetMapping("/list/{partId}")
    public ResponseEntity<CarParts> getProductById(@PathVariable int productId) {
        CarParts carPart = carPartsService.getProductById(productId);

        if (carPart != null) {
            return ResponseEntity.ok(carPart);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<CarParts>> getProductsByUserId(@PathVariable String userId) {
        List<CarParts> products = carPartsService.findProductsByUserId(Long.parseLong(userId));
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<?> updateProductDetails(
            @PathVariable Long productId,
            @RequestBody ProductDetailsRequest updatedDetails) {
        try {
        	carPartsService.updateCarPartDetails(productId, updatedDetails);
            return ResponseEntity.ok("Product details updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } 
    }

    
}
