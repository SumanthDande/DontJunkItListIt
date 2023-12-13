package com.example.DontJunkItListIt.image;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DontJunkItListIt.entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}

