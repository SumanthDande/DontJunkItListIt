package com.example.DontJunkItListIt.image;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.DontJunkItListIt.entity.ImageEntity;

import jakarta.ws.rs.NotFoundException;

import java.io.IOException;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public void saveImage(MultipartFile file) throws IOException {
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setData(file.getBytes());
        imageRepository.save(imageEntity);
    }
    
    public byte[] getImageDataById(Long id) throws IOException {
        java.util.Optional<ImageEntity> optionalImageEntity = imageRepository.findById(id);
        if (optionalImageEntity.isPresent()) {
            return optionalImageEntity.get().getData();
        } else {
            throw new NotFoundException("Image not found with id: " + id);
        }
    }
}
