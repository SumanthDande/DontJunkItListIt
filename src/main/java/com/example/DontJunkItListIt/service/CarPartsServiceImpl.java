package com.example.DontJunkItListIt.service;

import com.example.DontJunkItListIt.dto.ProductDetailsRequest;
import com.example.DontJunkItListIt.dto.ProductDto;
import com.example.DontJunkItListIt.entity.CarParts;

import jakarta.transaction.Transactional;

import com.example.DontJunkItListIt.dao.CarPartsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class CarPartsServiceImpl implements CarPartsService {

	@Autowired
    private CarPartsRepository productRepository;

//    public CarPartsServiceImpl(ProductRepository carPartsRepository) {
//        this.carPartsRepository = carPartsRepository;
//    }

	@Override
    @Transactional
    public void addProduct(ProductDto productDto) throws IOException {
        CarParts productEntity = new CarParts();
        productEntity.setPartName(productDto.getName());
        productEntity.setDescription(productDto.getDescription());
        productEntity.setColor(productDto.getColor());
        productEntity.setManufacturer(productDto.getManufacturer());
        productEntity.setYear(productDto.getYearOfManufacture());
        productEntity.setCondition(productDto.getCondition());

        // Handle image uploads
        List<MultipartFile> images = productDto.getImages();
        if (images != null && images.size() <= 5) {
            for (int i = 0; i < images.size(); i++) {
                switch (i) {
                    case 0:
                        productEntity.setImage1(images.get(i).getBytes());
                        break;
                    case 1:
                        productEntity.setImage2(images.get(i).getBytes());
                        break;
                    case 2:
                        productEntity.setImage3(images.get(i).getBytes());
                        break;
                    case 3:
                        productEntity.setImage4(images.get(i).getBytes());
                        break;
                    case 4:
                        productEntity.setImage5(images.get(i).getBytes());
                        break;
                }
            }
        }

        productRepository.save(productEntity);
    }

    @Override
    public List<CarParts> getAllCarParts() {
        
			return productRepository.findAll();
		
			
    	//return null;
    }

	@Override
	public CarParts getProductById(int productId) {
		Long id = Long.valueOf(productId);
		
		 Optional<CarParts> optionalCarParts = productRepository.findById(id);
		 return optionalCarParts.orElse(null);
		//return null;
	}

	@Override
	public List<CarParts> findProductsByUserId(Long userId) {
        return productRepository.findByUser_userID(userId);
	}

	@Override
	public void updateCarPartDetails(Long carPartId, ProductDetailsRequest updatedDetails) throws Exception {
		
        Optional<CarParts> optionalCarParts = productRepository.findById(carPartId);

        if (optionalCarParts.isPresent()) {
            CarParts existingCarParts = optionalCarParts.get();

            // Update the car part details
            if (updatedDetails.getPartName() != null) {
                existingCarParts.setPartName(updatedDetails.getPartName());
            }
            if (updatedDetails.getPrice() != null) {
                existingCarParts.setPrice(updatedDetails.getPrice());
            }
            if (updatedDetails.getColor() != null) {
                existingCarParts.setColor(updatedDetails.getColor());
            }
            if (updatedDetails.getDescription() != null) {
                existingCarParts.setDescription(updatedDetails.getDescription());
            }

            // Save the updated car part
            productRepository.save(existingCarParts);
        } else {
            throw new Exception("Car part not found");
        }
    }

}
